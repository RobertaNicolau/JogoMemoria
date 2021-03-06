
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.control;

import java.sql.Timestamp;
import java.util.Random;
import jogomemoria.model.PecaTabuleiro;

/**
 *
 * @author Roberta e Natanael
 */
public class JogoMemoriaCtrl {

    public static final int FACIL = 0;  //Referencia ao nível Fácil 
    public static final int INTERMEDIARIO = 1; //Referencia ao nível Intermediário 
    public static final int DIFICIL = 2; //Referencia ao nível Difícil    
    public static final int OURO = 0;   //Referência à coluna de pontuações Ouro
    public static final int PRATA = 1;  //Referência a coluna de pontuações prata
    public static final int BRONZE = 2; //Referência a coluna de prontuações Bronze   
    public static final int INDEFINIDO = -1; //Referência a valor que representa algo indefinido em determinado momento e que  
    public static final int JOGADA_CERTA = 0; //Referência a valor que representa jogada válida e certa que marca ponto.
    public static final int JOGADA_ERRADA = 1; //Referência a valor que representa jogada válida e errada, não marcadno ponto.
    public static final int JOGADA_INVALIDA = 2; //Referência a valor que representa jogada inválida. Ou seja, com pelo menos uma posição já ocupada.

    public static final int MAX_IMAGENS_PARTIDA = 18; //Máx. de imagens usadas nas partidas
    public static final int QTDE_IMAGENS_DISPONIVEIS = 19; //Quantidade de imagens disponíveis para o jogo (Sempre maior do que MAX_PECAS_PARTIDA)

    public static final int QTDE_IMGS_FACIL = 8; //Referência para a qtde de imagens do tabuleiro para do nível Fácil
    public static final int QTDE_PECAS_TAB_FACIL = 16; //Referência para a qtde de peças do tabuleiro para o nível Fácil
    public static final int MAX_COL_FACIL = 4;  //Qtde de colunas no tabuleiro para o nível Fácil
    public static final int MAX_LIN_FACIL = 4;  //Qtde de linhas no tabuleiro para o nível Fácil      

    public static final int QTDE_IMGS_INTERMEDIARIO = 18; //Referência para a qtde de imagens do tabuleiro para do nível intermediario
    public static final int QTDE_PECAS_TAB_INTERMEDIARIO = 36; //Referência para a qtde de peças do tabuleiro para o nível Intermediário
    public static final int MAX_COL_INTERMEDIARIO = 6; //Qtde de colunas no tabuleiro para o nível Intermediário
    public static final int MAX_LIN_INTERMEDIARIO = 6; //Qtde de linhas no tabuleiro para o nível Intermediário    

    public static final int QTDE_IMGS_DIFICIL = 18; //Referência para a qtde de imagens do tabuleiro para do nível dificil   
    public static final int QTDE_PECAS_TAB_DIFICIL = 54; //Referência para a qtde de peças do tabuleiro para o nível Difícil
    public static final int MAX_COL_DIFICIL = 9; //Qtde de colunas no tabuleiro para o nível Difícil
    public static final int MAX_LIN_DIFICIL = 6; //Qtde de linhas no tabuleiro para o nível Difícil

    /* ----------------------- ATRIBUTOS -----------------------*/
    private boolean jogoIniciado; //Booleano que indica se a partida foi iniciada ou não.
    private Timestamp inicioPartida; //Registra o momento do início da partida. Para contagem de tempo.
    private int tempoLimite;      //Tempo limite para a partida em segundos (minutos * 60)
    private int pontuacaoAtual;   //Pontuação da partida atual
    private int nivelAtual;       //Nível da partida atual
    private int linhaMax;
    private int colunaMax;
    private int qtdPecasPorImg = INDEFINIDO;
    private int tabRecordes[][] = {{0, 0, 0}, //Quadro de melhores pontuações por nível (Recordes)
    {0, 0, 0}, //Linha = Nível e Coluna = Ouro, prata ou bronze.
    {0, 0, 0}};
    private int acertosPartida;   //Quantidade de acertos na partida
    private int[] imgsPartida = new int[MAX_IMAGENS_PARTIDA];//Vetor de imagens sorteadas para a partida atual. Considera o tamanho suficiente para o nível difícil
    private int qtdImgsPartida; //Quantidade de imgens usadas na partida. Controla o uso de células do vetor imgsPartida conforme o nível da partida atual.           
    private PecaTabuleiro tabuleiro[][] = new PecaTabuleiro[MAX_LIN_DIFICIL][MAX_COL_DIFICIL]; //Matriz que implementa o tabuleiro do jogo onde as imagens estão distribuidas. Considera o tamanho máximo possível de ser usado que é para o nível difícil. Cada célula contém um número referente à imagem que ocupará a posição.
    private int tabControle[][] = new int[MAX_LIN_DIFICIL][MAX_COL_DIFICIL]; //Será usada em conjunto com a matriz tabuleiro[][]. Implementa um controle das jogadas já realizadas e acertadas. Ajuda a atulizar a tela indicando que imagem estará virada (Valor 0 na célula) e que imagem estará aberta (Valor 1). Considera o tamanho máximo possível de ser usado que é para o nível difícil.

    /* ----------------------- MÉTODOS -----------------------*/
    /**
     * Construtor para a classe
     */
    public JogoMemoriaCtrl() {

        jogoIniciado = false;
        tempoLimite = INDEFINIDO;
        acertosPartida = INDEFINIDO;
        nivelAtual = INDEFINIDO;
        qtdImgsPartida = INDEFINIDO;

        /*ATIVIDADE #1 - Implementar um construtor para esta classe. Ele deve
         iniciar todos os atributos pertinentes, da seguinte forma:
         - O jogo deve ser sinalizado como não iniciado;
         - O tempo limite em segundos deverá ser INDEFINIDO;
         - A quantidade de acertos da partida deve ser INDEFINIDO
         - O nível da partida atualdeve ser INDEFINIDO
         - A quantidade de peças usadas na partida deve ser INDEFINIDO pois aindanão se sabe o nível.
         */
    }

    /**
     * Inicia uma partida do jogo conforme um nível e um tempo limite em
     * minutos.
     *
     * @param nivel - Nível da partida FACIL, INTERMEDIARIO, DIFICIL
     * @param tempoLimMinutos - Tempo limite em MINUTOS para a partida. Isto
     * pois na tela projetamos que o usuário só consegue determinar o tempo em
     * minutos. Contudo, o temporizador será em segundos.
     */
    public void iniciarPartida(int nivel, int tempoLimMinutos) {

        setJogoIniciado(true);

        tempoLimite = tempoLimMinutos * 60;

        setAcertosPartida(0);

        if (nivel == FACIL) {
            setNivelAtual(FACIL);
            qtdImgsPartida = QTDE_IMGS_FACIL;
            linhaMax = MAX_LIN_FACIL - 1;
            colunaMax = MAX_COL_FACIL - 1;
            qtdPecasPorImg = 2;
        }
        if (nivel == INTERMEDIARIO) {
            setNivelAtual(INTERMEDIARIO);
            qtdImgsPartida = QTDE_IMGS_INTERMEDIARIO;
            linhaMax = MAX_LIN_INTERMEDIARIO - 1;
            colunaMax = MAX_COL_INTERMEDIARIO - 1;
            qtdPecasPorImg = 2;
        }

        if (nivel == DIFICIL) {
            setNivelAtual(DIFICIL);
            qtdImgsPartida = QTDE_IMGS_DIFICIL;
            linhaMax = MAX_LIN_DIFICIL - 1;
            colunaMax = MAX_COL_DIFICIL - 1;
            qtdPecasPorImg = 3;

        }

        sortearImagensPartida();
        
        mostrarImgsSorteadas();
            
        preencherTabuleiro(nivel);
        
        mostrarTabuleiro();
    }

    /*ATIVIDADE #2 - Implementar a iniciação de uma partida. Pense nas variáveis
     que precisam ter seus valores ajustados no ínício de cada partida:
     - O jogo deve ser sinalizado como iniciado.
     - O tempo limite em segundos deverá ser definido com base na conversão do parãmetro tempoLimMinutos. 
     - A quantidade de acertos da partida deve ser iniciado. 
     - O nível da partida atual (nivelAtual) deve ser definido conforme o parâmetro "nivel".
     - A quantidade de peças usadas na partida deve ser definida com base na interpretação do nível.
     - Sortear imagens para a partida.
     - Distribuir imagens da partida no tabuleiro conforme o nível (preencher o tabuleiro).
     - Zerar todo o tabuleiro de controle.
     */
    //obtem um nº sorteado e valido no espaço de inicio ate o fim
    private int obterNumSorteado(int inicio, int fim) {

        int n = INDEFINIDO;

        if (fim >= inicio && inicio >= 0) {
            n = inicio + (int) (Math.random() * ((fim - inicio) + 1));

        }

        return n;
    }

    /**
     * Realiza o sorteio de imagens para a partida, conforme índices de 1 até
     * MAX_PECAS_DISPONIVEIS. Se MAX_PECAS_DISPONIVEIS = 100 então sorteia o
     * identificador de cada imagem até obter a quantidade de imagens
     * necessárias para a partida (qtdImgsPartida)
     */
    private void sortearImagensPartida() {
        /*
         ATIVIDADE #3.
         - Limpe o vetor de imagens da partida pois ele pode conter imagens de
         partidas anteriores.
         - Defina uma variável para controlar quantas imagens foram sorteadas 
         e registradas  (qtdeImgsDefinidas) no vetor imgsPartida. Ela começa com 0
         e é incrementeada a cada imagem que é escolhida para a partida, indo até
         o valor (qtdImsPartida-1).
         - Para sortear uma imagem detre as disponíveis, utilize a geração de 
         números aleatórios (randômicos) considerando a faixa de 1 a 
         MAX_PECAS_DISPONIVEIS. Isto implementa uma espécie de sorteio do número 
         da imagem que vai participar da partida.
         Nesta faixa, 1 se refere ao arquivo JM1.jpg e MAX_PECAS_DISPONIVEIS 
         se refere a JM20.jpg, pois esta constante está com valor 20.
         Armazene o número sorteado em uma variável x, por exemplo, e a cada número
         sorteado (x), verifique se este está presente no vetor
         imgsPartida[] (Você tem que varrer o vetor e comparar item por item 
         testando cada item com o valor de X. Se não estiver ainda, insira-o neste vetor e vá
         preenchendo ele. Se X já estiver presente você deve sortear outro número e o proessose repete.

         */

        limparImgsPartida();

        int qtdeSorteadas = 0;
        boolean achou = false;

        while (qtdeSorteadas < qtdImgsPartida) {
            int i = obterNumSorteado(1, QTDE_IMAGENS_DISPONIVEIS);
            achou = false;
            for (int k = 0; k < qtdeSorteadas; k++) {
                if (imgsPartida[k] == i) {
                    achou = true;
                    break;
                }
            }
            if (!achou) {
                imgsPartida[qtdeSorteadas] = i;
                qtdeSorteadas++;
            }
        }
    }

    public void mostrarImgsSorteadas() {
        System.out.println(">>>> Imagens da partida: ");
        for (int i = 0; i < qtdImgsPartida; i++) {
            System.out.print((imgsPartida[i])+ " ");
        }
    }
    
    /**
     * Limpa o vetor de imagens usadas na partida (imgspartida) colocando 0
     * (ZERO) em cada célula e indicando que está vazia. É usado como parte da
     * iniciação de cada partida.
     */
    private void limparImgsPartida() {
        //ATIVIDADE #3.1 implementar laço para percorrer as células do vetor 
        //imgsPartida[] e atribuir o valor 0 (ZERO)  a cada célula.  

        for (int i = 0; i < MAX_IMAGENS_PARTIDA; i++) {
            imgsPartida[i] = 0;
        }
    }

    /**
     * Preenche o tabuleiro com duplas ou trios das imagens sorteadas,
     * dependendo do nível definido para a partida.
     */
    private void preencherTabuleiro(int nivel) {

        int num = 0;

        limparTabuleiro();

        for (int i = 0; i < qtdImgsPartida; i++) {
            for (int j = 0; j < qtdPecasPorImg; j++) {
                PecaTabuleiro p = new PecaTabuleiro();
                num++;
                p.setNumero(num);
                p.setIdImagem(imgsPartida[i]);
                p.setVirado(false);

                boolean sucesso = false;
                int l;
                int c;

                while (!sucesso) {
                    l = obterNumSorteado(0, linhaMax);
                    c = obterNumSorteado(0, colunaMax);
                    if (getTabuleiro()[l][c] == null) {
                        p.setLinha(l);
                        p.setColuna(c);
                        getTabuleiro()[l][c] = p;
                        sucesso = true;
                    }
                }
            }
        }
    }

        
    public void mostrarTabuleiro() {
        System.out.println("\n>>>> Tabuleiro ");
        for (int l=0; l<=linhaMax; l++) {
            for (int c = 0; c <= colunaMax; c++) {
                System.out.print((tabuleiro[l][c]).getIdImagem()+ " ");
            }
            System.out.println();
        }
    }
        
        /*
         ATIVIDADE #4.
         - Limpe o tabuleiro da partida pois ele pode conter dados de
         partidas anteriores.
         - Para cada imagem sorteada para a partida e registrada em imgsPartida 
         tente inserir duplas ou trios, conforme o nível de partida atual (FÁCIL, 
         INTERM. ou DIFÍCIL).
         - Sendo assim, Para cada item do vetor imgsPartida[] sorteie uma posição (linha e coluna) 
         dentro do limite de tamanho do tabuleiro[], conforme o nível da partida.
         - Verifique se a posição sorteada tem valor 0 no tabuleiro. Se tiver, atribua o identificador
         da imagem nesta posição. Caso o valor da célula seja diferente de 0 sorteie
         novamente até encontrar uma célula com valor 0.
         - Você deve controlar, usando uma variável, qual elemento do vetor imgsPartida[]
         você está processando. Ou seja você deve processa do primeiro até o último elemento.
 
         */
    

    /**
     * Limpa os tabuleiros (Tabuleiro de imagens e o de controle) colocando 0
     * (ZERO) em cada célula, indicando que está vazia. É usado como parte da
     * iniciação de cada partida.
     */
    private void limparTabuleiro() {
        //ATIVIDADE #4.1.
        //implementar laços para percorrer as células das matrizes 
        //tabuleiro[][] e tabControle[][], atribuindo o valor 0 (ZERO)  a cada célula.

        for (int l = 0; l < MAX_LIN_DIFICIL; l++) {
            for (int c = 0; c < MAX_COL_DIFICIL; c++) {
                getTabuleiro()[l][c] = null;
                // tabControle[l][c] = 0;
            }
        }

    }

    /**
     * Tenta realizar uma jogada, envolvendo duas peças de tabuleiro. Os objetos
     * PecaTabuleiro possuem atributos que representam uma posição (célula) da
     * matriz referente ao tabuleiro. Estes atributos são Linha e coluna
     * referentes à posição da peça no tabuleiro. A classe PecaTabuleiro do
     * pacote jogomemoria.model representa o tipo dos parâmetros.
     *
     * @param pt1 Primeira peça de tabuleiro (PecaTabuleiro) selecionada.
     * @param pt2 Segunda peça de tabuleiro (PecaTabuleiro) selecionada.
     * @return int Inteiro representando o resultado da tentativa de jogada.
     * Refere-se a JOGADA_CERTA, JOGADA_ERRADA ou JOGADA_INVALIDA.
     */
    public int realizarJogada(PecaTabuleiro pt1, PecaTabuleiro pt2) {
        int resultado = JOGADA_ERRADA;  //O resultado inicia pessimista. Estratégia definida pelo professor.
        if (pt1.getIdImagem() == pt2.getIdImagem()) {
            if ((pt1.getLinha() <= linhaMax) && (pt1.getColuna() <= colunaMax)
                    && (pt2.getLinha() <= linhaMax) && (pt2.getColuna() <= colunaMax)) {
                // int vrControle1 = tabControle[pt1.getLinha()][pt1.getColuna()];
                // int vrControle2 = tabControle[pt2.getLinha()][pt2.getColuna()];
                if ((!pt1.isVirado()) && (!pt2.isVirado())
                        && (pt1.getIdImagem() == pt2.getIdImagem()
                        && (pt1.getLinha()) != pt2.getLinha() || pt1.getColuna() != pt2.getColuna())) {
                    resultado = JOGADA_CERTA;
                    setPontuacaoAtual(getPontuacaoAtual() + 1);
                    pt1.setVirado(true);
                    pt2.setVirado(true);

                    // tabControle[pt1.getLinha()][pt1.getColuna()] = 1;
                    // tabControle[pt2.getLinha()][pt2.getColuna()] = 1;
                } else {
                    resultado = JOGADA_INVALIDA;
                }
            }
        }
        return resultado;
        /*
         ATIVIDADE #5. Implemente este método de forma que ele realizar uma jogada
         com base nas duas peças de tabuleiro recebidas como parâmetro.
         - Verifique se as peças pt1 e pt2 possuem linha e coluna dentro dos 
         limites do tabuleiro. Por exemplo: linha 1000 não existe pois está além 
         de MAX_LIN_DIFICIL.
         Logo, só teste outras condições se os valores de linha e coluna estiverem
         dentro dos limites.
         - Depois verifique se as posições de pt1 (linha, coluna) e pt2, na matriz 
         tabControle[][] possuem ambas valor 0. Se uma delas tiver valor 1 quer dizer
         que a posição já foi marcada (peça virada e acertada em jogada anterior).
         - Se ambas as posições tiverem valor 0 em tabControle[][], defina o valor de
         resultado para JOGADA_ERRADA e em seguida verifique se o idetificador das
         imagens nas posições pt1 e pt2 da matriz tabuleiro[][] são iguais. Se sim:
         a) altere o valor da variável resultado para JOGADA_CERTA;
         b) some um ponto na pontuação atual;
         c) atualize a tabControle[][], marcando as duas peças (pt1 e pt2) como viradas ou abertas (valor 1)
         d) verifique se o jogo finalizou (acertou tudo ou terminou ot empo)
       
         */
        // se JOGADA_CERTA, JOGADA_ERRADA ou JOGADA_INVALIDA.
        //Na tela teremos condições de fazer ela se comportar 
        //em função do valor que este método retornar. 

    }

    /**
     * Tenta realizar uma jogada, envolvendo TRÊS peças de tabuleiro em moldes
     * semelhantes ao outro método para duas peças.
     *
     * @param pt1 Primeira peça de tabuleiro (PecaTabuleiro) selecionada.
     * @param pt2 Segunda peça de tabuleiro (PecaTabuleiro) selecionada.
     * @param pt3 Terceira peça de tabuleiro (PecaTabuleiro) selecionada.
     * @return int Inteiro representando o resultado da tentativa de jogada.
     * Refere-se a JOGADA_CERTA, JOGADA_ERRADA ou JOGADA_INVALIDA.
     *
     */
    public int realizarJogada(PecaTabuleiro pt1, PecaTabuleiro pt2, PecaTabuleiro pt3) {
        int resultado = JOGADA_ERRADA;  //O resultado inicia pessimista. Estratégia definida pelo professor.

        if (pt1.getIdImagem() == pt2.getIdImagem()) {
            if (pt1.getIdImagem() == pt3.getIdImagem()) {
                if ((pt1.getLinha() <= linhaMax) && (pt1.getColuna() <= colunaMax)
                        && (pt2.getLinha() <= linhaMax) && (pt2.getColuna() <= colunaMax)
                        && (pt3.getLinha() <= linhaMax) && (pt3.getColuna() <= colunaMax)) {
                    // int vrControle1 = tabControle[pt1.getLinha()][pt1.getColuna()];
                    // int vrControle2 = tabControle[pt2.getLinha()][pt2.getColuna()];
                    if ((!pt1.isVirado()) && (!pt2.isVirado()) && (!pt3.isVirado())) {
                        resultado = JOGADA_CERTA;
                        setPontuacaoAtual(getPontuacaoAtual() + 1);
                        pt1.setVirado(true);
                        pt2.setVirado(true);
                        pt3.setVirado(true);

                        // tabControle[pt1.getLinha()][pt1.getColuna()] = 1;
                        // tabControle[pt2.getLinha()][pt2.getColuna()] = 1;
                    } else {
                        resultado = JOGADA_INVALIDA;
                    }
                }
            }
        }


        /*
         ATIVIDADE #6. Implemente este método de forma semelhante ao da 
         atividade nº 5 mas para o caso de 3 peças.
         */
        return resultado;
    }

    /**
     * @return the qtdPecasPorImg
     */
    public int getQtdPecasPorImg() {
        return qtdPecasPorImg;
    }

    /**
     * @param qtdPecasPorImg the qtdPecasPorImg to set
     */
    public void setQtdPecasPorImg(int qtdPecasPorImg) {
        this.qtdPecasPorImg = qtdPecasPorImg;
    }

    /**
     * @return the jogoIniciado
     */
    public boolean isJogoIniciado() {
        return jogoIniciado;
    }

    /**
     * @param jogoIniciado the jogoIniciado to set
     */
    public void setJogoIniciado(boolean jogoIniciado) {
        this.jogoIniciado = jogoIniciado;
    }

    /**
     * @return the pontuacaoAtual
     */
    public int getPontuacaoAtual() {
        return pontuacaoAtual;
    }

    /**
     * @param pontuacaoAtual the pontuacaoAtual to set
     */
    public void setPontuacaoAtual(int pontuacaoAtual) {
        this.pontuacaoAtual = pontuacaoAtual;
//        tabRecordes[getNivelAtual() - 1][OURO] = pontuacaoAtual;
    }

    private void inserirRecordes() {
        int records[][] = {{0, 0, 0},
        {0, 0, 0},
        {0, 0, 0},};

        records = getTabRecordes();
        int pontuacao = 0;
        pontuacao = getPontuacaoAtual();
        int nivelAtual = getNivelAtual();

        if (records[nivelAtual][OURO] > pontuacao) {
            records[nivelAtual][OURO] = pontuacao;
        } else {
            if (records[nivelAtual][PRATA] > pontuacao) {
                records[nivelAtual][PRATA] = pontuacao;
            } else {
                if (records[nivelAtual][BRONZE] > pontuacao) {
                    records[nivelAtual][BRONZE] = pontuacao;
                }
            }
        }
    }
    
    private void limpaRecords (){
        for (int c = 0; c <= 3; c++){
            for (int l = 0; l <=3; l++){
            tabRecordes[c][l] = 0;
        }
        }
    }

    /**
     * @return the nivelAtual
     */
    public int getNivelAtual() {
        return nivelAtual;
    }

    /**
     * @param nivelAtual the nivelAtual to set
     */
    public void setNivelAtual(int nivelAtual) {
        this.nivelAtual = nivelAtual;
    }

    /**
     * @return the tabRecordes
     */
    public int[][] getTabRecordes() {
        return tabRecordes;
    }

    /**
     * @param tabRecordes the tabRecordes to set
     */
    public void setTabRecordes(int[][] tabRecordes) {
        this.tabRecordes = tabRecordes;
    }

    /**
     * @return the acertosPartida
     */
    public int getAcertosPartida() {
        return acertosPartida;
    }

    /**
     * @param acertosPartida the acertosPartida to set
     */
    public void setAcertosPartida(int acertosPartida) {
        this.acertosPartida = acertosPartida;
    }

    /**
     * @return the tabuleiro
     */
    public PecaTabuleiro[][] getTabuleiro() {
        return tabuleiro;
    }

    /**
     * @param tabuleiro the tabuleiro to set
     */
    public void setTabuleiro(PecaTabuleiro[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

}
