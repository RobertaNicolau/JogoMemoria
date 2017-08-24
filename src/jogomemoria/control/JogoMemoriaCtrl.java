/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.control;

import java.sql.Timestamp;
import jogomemoria.gui.JPanelDificil;
import jogomemoria.gui.JPanelFacil;
import jogomemoria.gui.JPanelIntermediario;
import jogomemoria.gui.JPanelTabuleiro;

/**
 *
 * @author Roberta e Natanael
 */
public class JogoMemoriaCtrl {

    public static final int NIVEL_FACIL = 1;
    public static final int NIVEL_INTERMEDIARIO = 2;
    public static final int NIVEL_DIFICIL = 3;
    public static final int MAX_PECAS_PARTIDA = 18;
    public static final int MAX_PECAS_DISPONIVEIS= 20;
    public static final int QTDE_PECAS_FACIL = 16;
    public static final int QTDE_PECAS_INTERMEDIARIO = 36;
    public static final int QTDE_PECAS_DIFICIL = 54;
    
    private boolean jogoIniciado; //
    private Timestamp inicioJogo;
    private int tempoLimite;
    private int tabRecordes[][] = {{0, 0, 0},
                                   {0, 0, 0},
                                   {0, 0, 0}};
    private int pontuacaoAtual;
    private int nivelAtual;
    private int acertosPartida; // qutd de acertos na partida
    private int [] pecasPartida; //{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; vetor de peças sporteadas para a partida atual
    private int [] pecasDisponiveis; // vetor de todas as peças disponiveis para o jogo
    private int qtdPecasNivel;
    
    public int tempoConsumido() {
        return 0;
    }
    
    public void iniciarJogo(int nivel){
        
    }
    
    public void sortearPecaJogo(){
        
    }
}
