/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.gui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import jogomemoria.control.JogoMemoriaCtrl;
import jogomemoria.model.PecaTabuleiro;

/**
 *
 * @author Aluno
 */
public class JPanelDificil extends javax.swing.JPanel {

    private JogoMemoriaCtrl controle;

    PecaTabuleiro ptSel1;
    PecaTabuleiro ptSel2;
    PecaTabuleiro ptSel3;
    int pecasSelecionadas = 0;

    /**
     * Creates new form JPanelDificil
     */
    public JPanelDificil(JogoMemoriaCtrl ctrl) {
        initComponents();
        controle = ctrl;
    }

    public void mostrar(boolean inicioJogo) {
        PecaTabuleiro pctb[][] = controle.getTabuleiro();
        int idImg;

        ImageIcon imgDuvida = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"));
        
        if (inicioJogo || pctb[0][0].isVirado()) {
            idImg = pctb[0][0].getIdImagem();
            ImageIcon img00 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg00()).setIcon(img00);
        } else {
            (getLblImg00()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[0][1].isVirado()) {
            idImg = pctb[0][1].getIdImagem();
            ImageIcon img01 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg01()).setIcon(img01);
        } else {
            (getLblImg01()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[0][2].isVirado()) {
            idImg = pctb[0][2].getIdImagem();
            ImageIcon img02 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg02()).setIcon(img02);
        } else {
            (getLblImg02()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[0][3].isVirado()) {
            idImg = pctb[0][3].getIdImagem();
            ImageIcon img03 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg03()).setIcon(img03);
        } else {
            (getLblImg03()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[0][4].isVirado()) {
            idImg = pctb[0][4].getIdImagem();
            ImageIcon img04 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg04()).setIcon(img04);
        } else {
            (getLblImg04()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[0][5].isVirado()) {
            idImg = pctb[0][5].getIdImagem();
            ImageIcon img05 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg05()).setIcon(img05);
        } else {
            (getLblImg05()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[0][6].isVirado()) {
            idImg = pctb[0][6].getIdImagem();
            ImageIcon img06 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg06()).setIcon(img06);
        } else {
            (getLblImg06()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[0][7].isVirado()) {
            idImg = pctb[0][7].getIdImagem();
            ImageIcon img07 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg07()).setIcon(img07);
        } else {
            (getLblImg07()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[0][8].isVirado()) {
            idImg = pctb[0][8].getIdImagem();
            ImageIcon img08 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg08()).setIcon(img08);
        } else {
            (getLblImg08()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[1][0].isVirado()) {
            idImg = pctb[1][0].getIdImagem();
            ImageIcon img10 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg10()).setIcon(img10);
        } else {
            (getLblImg10()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[1][1].isVirado()) {
            idImg = pctb[1][1].getIdImagem();
            ImageIcon img11 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg11()).setIcon(img11);
        } else {
            (getLblImg11()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[1][2].isVirado()) {
            idImg = pctb[1][2].getIdImagem();
            ImageIcon img12 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg12()).setIcon(img12);
        } else {
            (getLblImg12()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[1][3].isVirado()) {
            idImg = pctb[1][3].getIdImagem();
            ImageIcon img13 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg13()).setIcon(img13);
        } else {
            (getLblImg13()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[1][4].isVirado()) {
            idImg = pctb[1][4].getIdImagem();
            ImageIcon img14 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg14()).setIcon(img14);
        } else {
            (getLblImg14()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[1][5].isVirado()) {
            idImg = pctb[1][5].getIdImagem();
            ImageIcon img15 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg15()).setIcon(img15);
        } else {
            (getLblImg15()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[1][6].isVirado()) {
            idImg = pctb[1][6].getIdImagem();
            ImageIcon img16 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg16()).setIcon(img16);
        } else {
            (getLblImg16()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[1][7].isVirado()) {
            idImg = pctb[1][7].getIdImagem();
            ImageIcon img17 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg17()).setIcon(img17);
        } else {
            (getLblImg17()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[1][8].isVirado()) {
            idImg = pctb[1][8].getIdImagem();
            ImageIcon img18 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg18()).setIcon(img18);
        } else {
            (getLblImg18()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][0].isVirado()) {
            idImg = pctb[2][0].getIdImagem();
            ImageIcon img20 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg20()).setIcon(img20);
        } else {
            (getLblImg20()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][1].isVirado()) {
            idImg = pctb[2][1].getIdImagem();
            ImageIcon img21 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg21()).setIcon(img21);
        } else {
            (getLblImg21()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][2].isVirado()) {
            idImg = pctb[2][2].getIdImagem();
            ImageIcon img22 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg22()).setIcon(img22);
        } else {
            (getLblImg22()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][3].isVirado()) {
            idImg = pctb[2][3].getIdImagem();
            ImageIcon img23 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg23()).setIcon(img23);
        } else {
            (getLblImg23()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][4].isVirado()) {
            idImg = pctb[2][4].getIdImagem();
            ImageIcon img24 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg24()).setIcon(img24);
        } else {
            (getLblImg24()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[2][5].isVirado()) {
            idImg = pctb[2][5].getIdImagem();
            ImageIcon img25 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg25()).setIcon(img25);
        } else {
            (getLblImg25()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[2][6].isVirado()) {
            idImg = pctb[2][6].getIdImagem();
            ImageIcon img26 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg26()).setIcon(img26);
        } else {
            (getLblImg26()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[2][7].isVirado()) {
            idImg = pctb[2][7].getIdImagem();
            ImageIcon img27 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg27()).setIcon(img27);
        } else {
            (getLblImg27()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[2][8].isVirado()) {
            idImg = pctb[2][8].getIdImagem();
            ImageIcon img28 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg28()).setIcon(img28);
        } else {
            (getLblImg28()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][0].isVirado()) {
            idImg = pctb[3][0].getIdImagem();
            ImageIcon img30 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg30()).setIcon(img30);
        } else {
            (getLblImg30()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[3][1].isVirado()) {
            idImg = pctb[3][1].getIdImagem();
            ImageIcon img31 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg31()).setIcon(img31);
        } else {
            (getLblImg31()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[3][2].isVirado()) {
            idImg = pctb[3][2].getIdImagem();
            ImageIcon img32 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg32()).setIcon(img32);
        } else {
            (getLblImg32()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[3][3].isVirado()) {
            idImg = pctb[3][3].getIdImagem();
            ImageIcon img33 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg33()).setIcon(img33);
        } else {
            (getLblImg33()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[3][4].isVirado()) {
            idImg = pctb[3][4].getIdImagem();
            ImageIcon img34 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg34()).setIcon(img34);
        } else {
            (getLblImg34()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[3][5].isVirado()) {
            idImg = pctb[3][5].getIdImagem();
            ImageIcon img35 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg35()).setIcon(img35);
        } else {
            (getLblImg35()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[3][6].isVirado()) {
            idImg = pctb[3][6].getIdImagem();
            ImageIcon img36 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg36()).setIcon(img36);
        } else {
            (getLblImg36()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[3][7].isVirado()) {
            idImg = pctb[3][7].getIdImagem();
            ImageIcon img37 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg37()).setIcon(img37);
        } else {
            (getLblImg37()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[3][8].isVirado()) {
            idImg = pctb[3][8].getIdImagem();
            ImageIcon img38 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg38()).setIcon(img38);
        } else {
            (getLblImg38()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[4][0].isVirado()) {
            idImg = pctb[4][0].getIdImagem();
            ImageIcon img40 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg40()).setIcon(img40);
        } else {
            (getLblImg40()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[4][1].isVirado()) {
            idImg = pctb[4][1].getIdImagem();
            ImageIcon img41 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg41()).setIcon(img41);
        } else {
            (getLblImg41()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[4][2].isVirado()) {
            idImg = pctb[4][2].getIdImagem();
            ImageIcon img42 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg42()).setIcon(img42);
        } else {
            (getLblImg42()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[4][3].isVirado()) {
            idImg = pctb[4][3].getIdImagem();
            ImageIcon img43 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg43()).setIcon(img43);
        } else {
            (getLblImg43()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[4][4].isVirado()) {
            idImg = pctb[4][4].getIdImagem();
            ImageIcon img44 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg44()).setIcon(img44);
        } else {
            (getLblImg44()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[4][5].isVirado()) {
            idImg = pctb[4][5].getIdImagem();
            ImageIcon img45 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg45()).setIcon(img45);
        } else {
            (getLblImg45()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[4][6].isVirado()) {
            idImg = pctb[4][6].getIdImagem();
            ImageIcon img46 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg46()).setIcon(img46);
        } else {
            (getLblImg46()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[4][7].isVirado()) {
            idImg = pctb[4][5].getIdImagem();
            ImageIcon img47 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg47()).setIcon(img47);
        } else {
            (getLblImg47()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[4][8].isVirado()) {
            idImg = pctb[4][8].getIdImagem();
            ImageIcon img48 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg48()).setIcon(img48);
        } else {
            (getLblImg48()).setIcon(imgDuvida);
        }

        if (inicioJogo || pctb[5][0].isVirado()) {
            idImg = pctb[5][0].getIdImagem();
            ImageIcon img50 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg50()).setIcon(img50);
        } else {
            (getLblImg50()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[5][1].isVirado()) {
            idImg = pctb[5][1].getIdImagem();
            ImageIcon img51 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg51()).setIcon(img51);
        } else {
            (getLblImg51()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[5][2].isVirado()) {
            idImg = pctb[5][2].getIdImagem();
            ImageIcon img52 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg52()).setIcon(img52);
        } else {
            (getLblImg52()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[5][3].isVirado()) {
            idImg = pctb[5][3].getIdImagem();
            ImageIcon img53 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg53()).setIcon(img53);
        } else {
            (getLblImg53()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[5][4].isVirado()) {
            idImg = pctb[5][4].getIdImagem();
            ImageIcon img54 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg54()).setIcon(img54);
        } else {
            (getLblImg54()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[5][5].isVirado()) {
            idImg = pctb[5][5].getIdImagem();
            ImageIcon img55 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg55()).setIcon(img55);
        } else {
            (getLblImg55()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[5][6].isVirado()) {
            idImg = pctb[5][6].getIdImagem();
            ImageIcon img56 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg56()).setIcon(img56);
        } else {
            (getLblImg56()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[5][7].isVirado()) {
            idImg = pctb[5][7].getIdImagem();
            ImageIcon img57 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg57()).setIcon(img57);
        } else {
            (getLblImg57()).setIcon(imgDuvida);
        }
        if (inicioJogo || pctb[5][8].isVirado()) {
            idImg = pctb[5][8].getIdImagem();
            ImageIcon img58 = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
            (getLblImg58()).setIcon(img58);
        } else {
            (getLblImg58()).setIcon(imgDuvida);
        }

    }

    private void tentarJogada(int linha, int coluna, JLabel rotuloImagem) {
        PecaTabuleiro pt[][] = controle.getTabuleiro();

        int idImg = pt[linha][coluna].getIdImagem();

        ImageIcon img = new ImageIcon(getClass().getResource("/jogomemoria/gui/img/wd" + idImg + ".jpg"));
        rotuloImagem.setIcon(img);

        if (pecasSelecionadas == 0) {
            ptSel1 = pt[linha][coluna];
            pecasSelecionadas++;
        } else if (pecasSelecionadas == 1) {
            ptSel2 = pt[linha][coluna];
            pecasSelecionadas++;
        } else if (pecasSelecionadas == 2) {
            ptSel3 = pt[linha][coluna];
            int result = controle.realizarJogada(ptSel1, ptSel2, ptSel3);
            if (result == controle.JOGADA_CERTA) {
                JOptionPane.showMessageDialog(this, "Muito bem!!!", "Resultado da jogada", JOptionPane.INFORMATION_MESSAGE);
            } else if (result == controle.JOGADA_ERRADA) {
                JOptionPane.showMessageDialog(this, "Puts não deu. tente de novo!!!", "Resultado da jogada", JOptionPane.INFORMATION_MESSAGE);
            } else if (result == controle.JOGADA_INVALIDA) {
                JOptionPane.showMessageDialog(this, "Ô meu, se liga!!!", "Resultado da jogada", JOptionPane.ERROR_MESSAGE);
            }
            pecasSelecionadas = 0;
            mostrar(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImg00 = new javax.swing.JLabel();
        lblImg01 = new javax.swing.JLabel();
        lblImg02 = new javax.swing.JLabel();
        lblImg03 = new javax.swing.JLabel();
        lblImg04 = new javax.swing.JLabel();
        lblImg05 = new javax.swing.JLabel();
        lblImg06 = new javax.swing.JLabel();
        lblImg07 = new javax.swing.JLabel();
        lblImg10 = new javax.swing.JLabel();
        lblImg11 = new javax.swing.JLabel();
        lblImg12 = new javax.swing.JLabel();
        lblImg13 = new javax.swing.JLabel();
        lblImg14 = new javax.swing.JLabel();
        lblImg15 = new javax.swing.JLabel();
        lblImg16 = new javax.swing.JLabel();
        lblImg17 = new javax.swing.JLabel();
        lblImg20 = new javax.swing.JLabel();
        lblImg21 = new javax.swing.JLabel();
        lblImg22 = new javax.swing.JLabel();
        lblImg23 = new javax.swing.JLabel();
        lblImg24 = new javax.swing.JLabel();
        lblImg25 = new javax.swing.JLabel();
        lblImg26 = new javax.swing.JLabel();
        lblImg27 = new javax.swing.JLabel();
        lblImg30 = new javax.swing.JLabel();
        lblImg31 = new javax.swing.JLabel();
        lblImg32 = new javax.swing.JLabel();
        lblImg33 = new javax.swing.JLabel();
        lblImg34 = new javax.swing.JLabel();
        lblImg35 = new javax.swing.JLabel();
        lblImg36 = new javax.swing.JLabel();
        lblImg37 = new javax.swing.JLabel();
        lblImg40 = new javax.swing.JLabel();
        lblImg41 = new javax.swing.JLabel();
        lblImg42 = new javax.swing.JLabel();
        lblImg43 = new javax.swing.JLabel();
        lblImg44 = new javax.swing.JLabel();
        lblImg45 = new javax.swing.JLabel();
        lblImg46 = new javax.swing.JLabel();
        lblImg50 = new javax.swing.JLabel();
        lblImg51 = new javax.swing.JLabel();
        lblImg52 = new javax.swing.JLabel();
        lblImg53 = new javax.swing.JLabel();
        lblImg54 = new javax.swing.JLabel();
        lblImg55 = new javax.swing.JLabel();
        lblImg56 = new javax.swing.JLabel();
        lblImg47 = new javax.swing.JLabel();
        lblImg57 = new javax.swing.JLabel();
        lblImg08 = new javax.swing.JLabel();
        lblImg18 = new javax.swing.JLabel();
        lblImg28 = new javax.swing.JLabel();
        lblImg38 = new javax.swing.JLabel();
        lblImg48 = new javax.swing.JLabel();
        lblImg58 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblImg00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg00MouseClicked(evt);
            }
        });

        lblImg01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg01MouseClicked(evt);
            }
        });

        lblImg02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg02MouseClicked(evt);
            }
        });

        lblImg03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg03MouseClicked(evt);
            }
        });

        lblImg04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg04MouseClicked(evt);
            }
        });

        lblImg05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg05MouseClicked(evt);
            }
        });

        lblImg06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg06MouseClicked(evt);
            }
        });

        lblImg07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg07MouseClicked(evt);
            }
        });

        lblImg10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg10MouseClicked(evt);
            }
        });

        lblImg11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg11MouseClicked(evt);
            }
        });

        lblImg12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg12MouseClicked(evt);
            }
        });

        lblImg13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg13MouseClicked(evt);
            }
        });

        lblImg14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg14MouseClicked(evt);
            }
        });

        lblImg15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg15MouseClicked(evt);
            }
        });

        lblImg16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg16MouseClicked(evt);
            }
        });

        lblImg17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg17MouseClicked(evt);
            }
        });

        lblImg20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg20MouseClicked(evt);
            }
        });

        lblImg21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg21MouseClicked(evt);
            }
        });

        lblImg22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg22MouseClicked(evt);
            }
        });

        lblImg23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg23MouseClicked(evt);
            }
        });

        lblImg24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg24MouseClicked(evt);
            }
        });

        lblImg25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg25MouseClicked(evt);
            }
        });

        lblImg26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg26MouseClicked(evt);
            }
        });

        lblImg27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg27MouseClicked(evt);
            }
        });

        lblImg30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg30MouseClicked(evt);
            }
        });

        lblImg31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg31MouseClicked(evt);
            }
        });

        lblImg32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg32MouseClicked(evt);
            }
        });

        lblImg33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg33MouseClicked(evt);
            }
        });

        lblImg34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg34MouseClicked(evt);
            }
        });

        lblImg35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg35MouseClicked(evt);
            }
        });

        lblImg36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg36MouseClicked(evt);
            }
        });

        lblImg37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg37MouseClicked(evt);
            }
        });

        lblImg40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg40MouseClicked(evt);
            }
        });

        lblImg41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg41MouseClicked(evt);
            }
        });

        lblImg42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg42MouseClicked(evt);
            }
        });

        lblImg43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg43MouseClicked(evt);
            }
        });

        lblImg44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg44MouseClicked(evt);
            }
        });

        lblImg45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg45MouseClicked(evt);
            }
        });

        lblImg46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg46MouseClicked(evt);
            }
        });

        lblImg50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg50MouseClicked(evt);
            }
        });

        lblImg51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg51MouseClicked(evt);
            }
        });

        lblImg52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg52MouseClicked(evt);
            }
        });

        lblImg53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg53MouseClicked(evt);
            }
        });

        lblImg54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg54MouseClicked(evt);
            }
        });

        lblImg55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg55MouseClicked(evt);
            }
        });

        lblImg56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg56MouseClicked(evt);
            }
        });

        lblImg47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg47MouseClicked(evt);
            }
        });

        lblImg57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg57MouseClicked(evt);
            }
        });

        lblImg08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg08MouseClicked(evt);
            }
        });

        lblImg18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg18MouseClicked(evt);
            }
        });

        lblImg28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg28MouseClicked(evt);
            }
        });

        lblImg38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg38MouseClicked(evt);
            }
        });

        lblImg48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg48MouseClicked(evt);
            }
        });

        lblImg58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogomemoria/gui/img/cartaVirada.jpg"))); // NOI18N
        lblImg58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImg58MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImg30)
                        .addGap(18, 18, 18)
                        .addComponent(lblImg31)
                        .addGap(18, 18, 18)
                        .addComponent(lblImg32)
                        .addGap(18, 18, 18)
                        .addComponent(lblImg33)
                        .addGap(18, 18, 18)
                        .addComponent(lblImg34)
                        .addGap(18, 18, 18)
                        .addComponent(lblImg35)
                        .addGap(18, 18, 18)
                        .addComponent(lblImg36)
                        .addGap(18, 18, 18)
                        .addComponent(lblImg37)
                        .addGap(18, 18, 18)
                        .addComponent(lblImg38))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblImg50)
                            .addGap(18, 18, 18)
                            .addComponent(lblImg51)
                            .addGap(18, 18, 18)
                            .addComponent(lblImg52)
                            .addGap(18, 18, 18)
                            .addComponent(lblImg53)
                            .addGap(18, 18, 18)
                            .addComponent(lblImg54)
                            .addGap(18, 18, 18)
                            .addComponent(lblImg55)
                            .addGap(18, 18, 18)
                            .addComponent(lblImg56)
                            .addGap(18, 18, 18)
                            .addComponent(lblImg57)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblImg58))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblImg40)
                            .addGap(18, 18, 18)
                            .addComponent(lblImg41)
                            .addGap(18, 18, 18)
                            .addComponent(lblImg42)
                            .addGap(18, 18, 18)
                            .addComponent(lblImg43)
                            .addGap(18, 18, 18)
                            .addComponent(lblImg44)
                            .addGap(18, 18, 18)
                            .addComponent(lblImg45)
                            .addGap(18, 18, 18)
                            .addComponent(lblImg46)
                            .addGap(18, 18, 18)
                            .addComponent(lblImg47)
                            .addGap(18, 18, 18)
                            .addComponent(lblImg48)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblImg20)
                                .addGap(18, 18, 18)
                                .addComponent(lblImg21)
                                .addGap(18, 18, 18)
                                .addComponent(lblImg22)
                                .addGap(18, 18, 18)
                                .addComponent(lblImg23)
                                .addGap(18, 18, 18)
                                .addComponent(lblImg24)
                                .addGap(18, 18, 18)
                                .addComponent(lblImg25)
                                .addGap(18, 18, 18)
                                .addComponent(lblImg26)
                                .addGap(18, 18, 18)
                                .addComponent(lblImg27))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblImg10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblImg00, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblImg01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblImg02))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblImg11)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblImg12)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblImg13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblImg03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblImg04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblImg14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblImg15)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblImg16)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblImg17))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblImg05)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblImg06)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblImg07)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImg18)
                            .addComponent(lblImg28)
                            .addComponent(lblImg08))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImg06)
                    .addComponent(lblImg05)
                    .addComponent(lblImg07)
                    .addComponent(lblImg04)
                    .addComponent(lblImg01)
                    .addComponent(lblImg00)
                    .addComponent(lblImg03)
                    .addComponent(lblImg02)
                    .addComponent(lblImg08))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImg11)
                            .addComponent(lblImg10)
                            .addComponent(lblImg12)
                            .addComponent(lblImg13)
                            .addComponent(lblImg14)
                            .addComponent(lblImg15)
                            .addComponent(lblImg16)
                            .addComponent(lblImg17)
                            .addComponent(lblImg18))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblImg21)
                            .addComponent(lblImg20)
                            .addComponent(lblImg22)
                            .addComponent(lblImg23)
                            .addComponent(lblImg24)
                            .addComponent(lblImg25)
                            .addComponent(lblImg26)
                            .addComponent(lblImg27)))
                    .addComponent(lblImg28, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImg31)
                    .addComponent(lblImg30)
                    .addComponent(lblImg32)
                    .addComponent(lblImg33)
                    .addComponent(lblImg34)
                    .addComponent(lblImg35)
                    .addComponent(lblImg36)
                    .addComponent(lblImg37)
                    .addComponent(lblImg38))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblImg45)
                        .addComponent(lblImg46)
                        .addComponent(lblImg44, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblImg43, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImg41)
                            .addComponent(lblImg40)
                            .addComponent(lblImg42)))
                    .addComponent(lblImg47)
                    .addComponent(lblImg48))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblImg56)
                        .addComponent(lblImg55, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblImg54, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblImg53, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblImg50, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblImg51, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblImg52, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lblImg57)
                    .addComponent(lblImg58))
                .addContainerGap(167, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblImg00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg00MouseClicked
        // TODO add your handling code here:
        tentarJogada(0, 0, getLblImg00());
    }//GEN-LAST:event_lblImg00MouseClicked

    private void lblImg01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg01MouseClicked
        // TODO add your handling code here:
        tentarJogada(0, 1, getLblImg01());
    }//GEN-LAST:event_lblImg01MouseClicked

    private void lblImg02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg02MouseClicked
        // TODO add your handling code here:
        tentarJogada(0, 2, getLblImg02());
    }//GEN-LAST:event_lblImg02MouseClicked

    private void lblImg03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg03MouseClicked

        tentarJogada(0, 3, getLblImg03());// TODO add your handling code here:
    }//GEN-LAST:event_lblImg03MouseClicked

    private void lblImg04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg04MouseClicked

        tentarJogada(0, 4, getLblImg04());// TODO add your handling code here:
    }//GEN-LAST:event_lblImg04MouseClicked

    private void lblImg05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg05MouseClicked
        // TODO add your handling code here:
        tentarJogada(0, 5, getLblImg05());
    }//GEN-LAST:event_lblImg05MouseClicked

    private void lblImg06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg06MouseClicked
        // TODO add your handling code here:
        tentarJogada(0, 6, getLblImg06());
    }//GEN-LAST:event_lblImg06MouseClicked

    private void lblImg07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg07MouseClicked
        // TODO add your handling code here:
        tentarJogada(0, 7, getLblImg07());
    }//GEN-LAST:event_lblImg07MouseClicked

    private void lblImg08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg08MouseClicked
        // TODO add your handling code here:
        tentarJogada(0, 8, getLblImg08());
    }//GEN-LAST:event_lblImg08MouseClicked

    private void lblImg10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg10MouseClicked
        // TODO add your handling code here:
        tentarJogada(1, 0, getLblImg10());
    }//GEN-LAST:event_lblImg10MouseClicked

    private void lblImg11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg11MouseClicked
        // TODO add your handling code here:
        tentarJogada(1, 1, getLblImg11());
    }//GEN-LAST:event_lblImg11MouseClicked

    private void lblImg12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg12MouseClicked
        // TODO add your handling code here:
        tentarJogada(1, 2, getLblImg12());
    }//GEN-LAST:event_lblImg12MouseClicked

    private void lblImg13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg13MouseClicked
        // TODO add your handling code here:
        tentarJogada(1, 3, getLblImg13());
    }//GEN-LAST:event_lblImg13MouseClicked

    private void lblImg14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg14MouseClicked
        // TODO add your handling code here:
        tentarJogada(1, 4, getLblImg14());
    }//GEN-LAST:event_lblImg14MouseClicked

    private void lblImg15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg15MouseClicked
        // TODO add your handling code here:
        tentarJogada(1, 5, getLblImg15());
    }//GEN-LAST:event_lblImg15MouseClicked

    private void lblImg16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg16MouseClicked
        // TODO add your handling code here:
        tentarJogada(1, 6, getLblImg16());
    }//GEN-LAST:event_lblImg16MouseClicked

    private void lblImg17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg17MouseClicked
        // TODO add your handling code here:
        tentarJogada(1, 7, getLblImg17());
    }//GEN-LAST:event_lblImg17MouseClicked

    private void lblImg18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg18MouseClicked
        // TODO add your handling code here:
        tentarJogada(1, 8, getLblImg18());
    }//GEN-LAST:event_lblImg18MouseClicked

    private void lblImg20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg20MouseClicked
        // TODO add your handling code here:
        tentarJogada(2, 0, getLblImg20());
    }//GEN-LAST:event_lblImg20MouseClicked

    private void lblImg21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg21MouseClicked
        // TODO add your handling code here:
        tentarJogada(2, 1, getLblImg21());
    }//GEN-LAST:event_lblImg21MouseClicked

    private void lblImg22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg22MouseClicked
        // TODO add your handling code here:
        tentarJogada(2, 2, getLblImg22());
    }//GEN-LAST:event_lblImg22MouseClicked

    private void lblImg23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg23MouseClicked
        // TODO add your handling code here:
        tentarJogada(2, 3, getLblImg23());
    }//GEN-LAST:event_lblImg23MouseClicked

    private void lblImg24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg24MouseClicked
        // TODO add your handling code here:
        tentarJogada(2, 4, getLblImg24());
    }//GEN-LAST:event_lblImg24MouseClicked

    private void lblImg25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg25MouseClicked
        // TODO add your handling code here:
        tentarJogada(2, 5, getLblImg25());
    }//GEN-LAST:event_lblImg25MouseClicked

    private void lblImg26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg26MouseClicked
        // TODO add your handling code here:
        tentarJogada(2, 6, getLblImg26());
    }//GEN-LAST:event_lblImg26MouseClicked

    private void lblImg27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg27MouseClicked
        // TODO add your handling code here:
        tentarJogada(2, 7, getLblImg27());
    }//GEN-LAST:event_lblImg27MouseClicked

    private void lblImg28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg28MouseClicked
        // TODO add your handling code here:
        tentarJogada(2, 8, getLblImg28());
    }//GEN-LAST:event_lblImg28MouseClicked

    private void lblImg30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg30MouseClicked
        // TODO add your handling code here:
        tentarJogada(3, 0, getLblImg30());
    }//GEN-LAST:event_lblImg30MouseClicked

    private void lblImg31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg31MouseClicked
        // TODO add your handling code here:
        tentarJogada(3, 1, getLblImg31());
    }//GEN-LAST:event_lblImg31MouseClicked

    private void lblImg32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg32MouseClicked
        // TODO add your handling code here:
        tentarJogada(3, 2, getLblImg32());
    }//GEN-LAST:event_lblImg32MouseClicked

    private void lblImg33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg33MouseClicked
        // TODO add your handling code here:
        tentarJogada(3, 3, getLblImg33());
    }//GEN-LAST:event_lblImg33MouseClicked

    private void lblImg34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg34MouseClicked
        // TODO add your handling code here:
        tentarJogada(3, 4, getLblImg34());
    }//GEN-LAST:event_lblImg34MouseClicked

    private void lblImg35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg35MouseClicked
        // TODO add your handling code here:
        tentarJogada(3, 5, getLblImg35());
    }//GEN-LAST:event_lblImg35MouseClicked

    private void lblImg36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg36MouseClicked
        // TODO add your handling code here:
        tentarJogada(3, 6, getLblImg36());
    }//GEN-LAST:event_lblImg36MouseClicked

    private void lblImg37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg37MouseClicked
        // TODO add your handling code here:
        tentarJogada(3, 7, getLblImg37());
    }//GEN-LAST:event_lblImg37MouseClicked

    private void lblImg38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg38MouseClicked
        // TODO add your handling code here:
        tentarJogada(3, 8, getLblImg38());
    }//GEN-LAST:event_lblImg38MouseClicked

    private void lblImg40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg40MouseClicked
        // TODO add your handling code here:
        tentarJogada(4, 0, getLblImg40());
    }//GEN-LAST:event_lblImg40MouseClicked

    private void lblImg41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg41MouseClicked
        // TODO add your handling code here:
        tentarJogada(4, 1, getLblImg41());
    }//GEN-LAST:event_lblImg41MouseClicked

    private void lblImg42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg42MouseClicked
        // TODO add your handling code here:
        tentarJogada(4, 2, getLblImg42());
    }//GEN-LAST:event_lblImg42MouseClicked

    private void lblImg43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg43MouseClicked
        // TODO add your handling code here:
        tentarJogada(4, 3, getLblImg43());
    }//GEN-LAST:event_lblImg43MouseClicked

    private void lblImg44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg44MouseClicked
        // TODO add your handling code here:
        tentarJogada(4, 4, getLblImg44());
    }//GEN-LAST:event_lblImg44MouseClicked

    private void lblImg45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg45MouseClicked
        // TODO add your handling code here:
        tentarJogada(4, 5, getLblImg45());
    }//GEN-LAST:event_lblImg45MouseClicked

    private void lblImg46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg46MouseClicked
        // TODO add your handling code here:
        tentarJogada(4, 6, getLblImg46());
    }//GEN-LAST:event_lblImg46MouseClicked

    private void lblImg47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg47MouseClicked
        // TODO add your handling code here:
        tentarJogada(4, 7, getLblImg47());
    }//GEN-LAST:event_lblImg47MouseClicked

    private void lblImg48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg48MouseClicked
        // TODO add your handling code here:
        tentarJogada(4, 8, getLblImg48());
    }//GEN-LAST:event_lblImg48MouseClicked

    private void lblImg50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg50MouseClicked
        // TODO add your handling code here:
        tentarJogada(5, 0, getLblImg50());
    }//GEN-LAST:event_lblImg50MouseClicked

    private void lblImg51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg51MouseClicked
        // TODO add your handling code here:
        tentarJogada(5, 1, getLblImg51());
    }//GEN-LAST:event_lblImg51MouseClicked

    private void lblImg52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg52MouseClicked
        // TODO add your handling code here:
        tentarJogada(5, 2, getLblImg52());
    }//GEN-LAST:event_lblImg52MouseClicked

    private void lblImg53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg53MouseClicked
        // TODO add your handling code here:
        tentarJogada(5, 3, getLblImg53());
    }//GEN-LAST:event_lblImg53MouseClicked

    private void lblImg54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg54MouseClicked
        // TODO add your handling code here:
        tentarJogada(5, 4, getLblImg54());
    }//GEN-LAST:event_lblImg54MouseClicked

    private void lblImg55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg55MouseClicked
        // TODO add your handling code here:
        tentarJogada(5, 5, getLblImg55());
    }//GEN-LAST:event_lblImg55MouseClicked

    private void lblImg56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg56MouseClicked
        // TODO add your handling code here:
        tentarJogada(5, 6, getLblImg56());
    }//GEN-LAST:event_lblImg56MouseClicked

    private void lblImg57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg57MouseClicked
        // TODO add your handling code here:
        tentarJogada(5, 7, getLblImg57());
    }//GEN-LAST:event_lblImg57MouseClicked

    private void lblImg58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImg58MouseClicked
        // TODO add your handling code here:
        tentarJogada(5, 8, getLblImg58());
    }//GEN-LAST:event_lblImg58MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblImg00;
    private javax.swing.JLabel lblImg01;
    private javax.swing.JLabel lblImg02;
    private javax.swing.JLabel lblImg03;
    private javax.swing.JLabel lblImg04;
    private javax.swing.JLabel lblImg05;
    private javax.swing.JLabel lblImg06;
    private javax.swing.JLabel lblImg07;
    private javax.swing.JLabel lblImg08;
    private javax.swing.JLabel lblImg10;
    private javax.swing.JLabel lblImg11;
    private javax.swing.JLabel lblImg12;
    private javax.swing.JLabel lblImg13;
    private javax.swing.JLabel lblImg14;
    private javax.swing.JLabel lblImg15;
    private javax.swing.JLabel lblImg16;
    private javax.swing.JLabel lblImg17;
    private javax.swing.JLabel lblImg18;
    private javax.swing.JLabel lblImg20;
    private javax.swing.JLabel lblImg21;
    private javax.swing.JLabel lblImg22;
    private javax.swing.JLabel lblImg23;
    private javax.swing.JLabel lblImg24;
    private javax.swing.JLabel lblImg25;
    private javax.swing.JLabel lblImg26;
    private javax.swing.JLabel lblImg27;
    private javax.swing.JLabel lblImg28;
    private javax.swing.JLabel lblImg30;
    private javax.swing.JLabel lblImg31;
    private javax.swing.JLabel lblImg32;
    private javax.swing.JLabel lblImg33;
    private javax.swing.JLabel lblImg34;
    private javax.swing.JLabel lblImg35;
    private javax.swing.JLabel lblImg36;
    private javax.swing.JLabel lblImg37;
    private javax.swing.JLabel lblImg38;
    private javax.swing.JLabel lblImg40;
    private javax.swing.JLabel lblImg41;
    private javax.swing.JLabel lblImg42;
    private javax.swing.JLabel lblImg43;
    private javax.swing.JLabel lblImg44;
    private javax.swing.JLabel lblImg45;
    private javax.swing.JLabel lblImg46;
    private javax.swing.JLabel lblImg47;
    private javax.swing.JLabel lblImg48;
    private javax.swing.JLabel lblImg50;
    private javax.swing.JLabel lblImg51;
    private javax.swing.JLabel lblImg52;
    private javax.swing.JLabel lblImg53;
    private javax.swing.JLabel lblImg54;
    private javax.swing.JLabel lblImg55;
    private javax.swing.JLabel lblImg56;
    private javax.swing.JLabel lblImg57;
    private javax.swing.JLabel lblImg58;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the lblImg00
     */
    public javax.swing.JLabel getLblImg00() {
        return lblImg00;
    }

    /**
     * @param lblImg00 the lblImg00 to set
     */
    public void setLblImg00(javax.swing.JLabel lblImg00) {
        this.lblImg00 = lblImg00;
    }

    /**
     * @return the lblImg01
     */
    public javax.swing.JLabel getLblImg01() {
        return lblImg01;
    }

    /**
     * @param lblImg01 the lblImg01 to set
     */
    public void setLblImg01(javax.swing.JLabel lblImg01) {
        this.lblImg01 = lblImg01;
    }

    /**
     * @return the lblImg02
     */
    public javax.swing.JLabel getLblImg02() {
        return lblImg02;
    }

    /**
     * @param lblImg02 the lblImg02 to set
     */
    public void setLblImg02(javax.swing.JLabel lblImg02) {
        this.lblImg02 = lblImg02;
    }

    /**
     * @return the lblImg03
     */
    public javax.swing.JLabel getLblImg03() {
        return lblImg03;
    }

    /**
     * @param lblImg03 the lblImg03 to set
     */
    public void setLblImg03(javax.swing.JLabel lblImg03) {
        this.lblImg03 = lblImg03;
    }

    /**
     * @return the lblImg04
     */
    public javax.swing.JLabel getLblImg04() {
        return lblImg04;
    }

    /**
     * @param lblImg04 the lblImg04 to set
     */
    public void setLblImg04(javax.swing.JLabel lblImg04) {
        this.lblImg04 = lblImg04;
    }

    /**
     * @return the lblImg05
     */
    public javax.swing.JLabel getLblImg05() {
        return lblImg05;
    }

    /**
     * @param lblImg05 the lblImg05 to set
     */
    public void setLblImg05(javax.swing.JLabel lblImg05) {
        this.lblImg05 = lblImg05;
    }

    /**
     * @return the lblImg06
     */
    public javax.swing.JLabel getLblImg06() {
        return lblImg06;
    }

    /**
     * @param lblImg06 the lblImg06 to set
     */
    public void setLblImg06(javax.swing.JLabel lblImg06) {
        this.lblImg06 = lblImg06;
    }

    /**
     * @return the lblImg07
     */
    public javax.swing.JLabel getLblImg07() {
        return lblImg07;
    }

    /**
     * @param lblImg07 the lblImg07 to set
     */
    public void setLblImg07(javax.swing.JLabel lblImg07) {
        this.lblImg07 = lblImg07;
    }

    /**
     * @return the lblImg08
     */
    public javax.swing.JLabel getLblImg08() {
        return lblImg08;
    }

    /**
     * @param lblImg08 the lblImg08 to set
     */
    public void setLblImg08(javax.swing.JLabel lblImg08) {
        this.lblImg08 = lblImg08;
    }

    /**
     * @return the lblImg10
     */
    public javax.swing.JLabel getLblImg10() {
        return lblImg10;
    }

    /**
     * @param lblImg10 the lblImg10 to set
     */
    public void setLblImg10(javax.swing.JLabel lblImg10) {
        this.lblImg10 = lblImg10;
    }

    /**
     * @return the lblImg11
     */
    public javax.swing.JLabel getLblImg11() {
        return lblImg11;
    }

    /**
     * @param lblImg11 the lblImg11 to set
     */
    public void setLblImg11(javax.swing.JLabel lblImg11) {
        this.lblImg11 = lblImg11;
    }

    /**
     * @return the lblImg12
     */
    public javax.swing.JLabel getLblImg12() {
        return lblImg12;
    }

    /**
     * @param lblImg12 the lblImg12 to set
     */
    public void setLblImg12(javax.swing.JLabel lblImg12) {
        this.lblImg12 = lblImg12;
    }

    /**
     * @return the lblImg13
     */
    public javax.swing.JLabel getLblImg13() {
        return lblImg13;
    }

    /**
     * @param lblImg13 the lblImg13 to set
     */
    public void setLblImg13(javax.swing.JLabel lblImg13) {
        this.lblImg13 = lblImg13;
    }

    /**
     * @return the lblImg14
     */
    public javax.swing.JLabel getLblImg14() {
        return lblImg14;
    }

    /**
     * @param lblImg14 the lblImg14 to set
     */
    public void setLblImg14(javax.swing.JLabel lblImg14) {
        this.lblImg14 = lblImg14;
    }

    /**
     * @return the lblImg15
     */
    public javax.swing.JLabel getLblImg15() {
        return lblImg15;
    }

    /**
     * @param lblImg15 the lblImg15 to set
     */
    public void setLblImg15(javax.swing.JLabel lblImg15) {
        this.lblImg15 = lblImg15;
    }

    /**
     * @return the lblImg16
     */
    public javax.swing.JLabel getLblImg16() {
        return lblImg16;
    }

    /**
     * @param lblImg16 the lblImg16 to set
     */
    public void setLblImg16(javax.swing.JLabel lblImg16) {
        this.lblImg16 = lblImg16;
    }

    /**
     * @return the lblImg17
     */
    public javax.swing.JLabel getLblImg17() {
        return lblImg17;
    }

    /**
     * @param lblImg17 the lblImg17 to set
     */
    public void setLblImg17(javax.swing.JLabel lblImg17) {
        this.lblImg17 = lblImg17;
    }

    /**
     * @return the lblImg18
     */
    public javax.swing.JLabel getLblImg18() {
        return lblImg18;
    }

    /**
     * @param lblImg18 the lblImg18 to set
     */
    public void setLblImg18(javax.swing.JLabel lblImg18) {
        this.lblImg18 = lblImg18;
    }

    /**
     * @return the lblImg20
     */
    public javax.swing.JLabel getLblImg20() {
        return lblImg20;
    }

    /**
     * @param lblImg20 the lblImg20 to set
     */
    public void setLblImg20(javax.swing.JLabel lblImg20) {
        this.lblImg20 = lblImg20;
    }

    /**
     * @return the lblImg21
     */
    public javax.swing.JLabel getLblImg21() {
        return lblImg21;
    }

    /**
     * @param lblImg21 the lblImg21 to set
     */
    public void setLblImg21(javax.swing.JLabel lblImg21) {
        this.lblImg21 = lblImg21;
    }

    /**
     * @return the lblImg22
     */
    public javax.swing.JLabel getLblImg22() {
        return lblImg22;
    }

    /**
     * @param lblImg22 the lblImg22 to set
     */
    public void setLblImg22(javax.swing.JLabel lblImg22) {
        this.lblImg22 = lblImg22;
    }

    /**
     * @return the lblImg23
     */
    public javax.swing.JLabel getLblImg23() {
        return lblImg23;
    }

    /**
     * @param lblImg23 the lblImg23 to set
     */
    public void setLblImg23(javax.swing.JLabel lblImg23) {
        this.lblImg23 = lblImg23;
    }

    /**
     * @return the lblImg24
     */
    public javax.swing.JLabel getLblImg24() {
        return lblImg24;
    }

    /**
     * @param lblImg24 the lblImg24 to set
     */
    public void setLblImg24(javax.swing.JLabel lblImg24) {
        this.lblImg24 = lblImg24;
    }

    /**
     * @return the lblImg25
     */
    public javax.swing.JLabel getLblImg25() {
        return lblImg25;
    }

    /**
     * @param lblImg25 the lblImg25 to set
     */
    public void setLblImg25(javax.swing.JLabel lblImg25) {
        this.lblImg25 = lblImg25;
    }

    /**
     * @return the lblImg26
     */
    public javax.swing.JLabel getLblImg26() {
        return lblImg26;
    }

    /**
     * @param lblImg26 the lblImg26 to set
     */
    public void setLblImg26(javax.swing.JLabel lblImg26) {
        this.lblImg26 = lblImg26;
    }

    /**
     * @return the lblImg27
     */
    public javax.swing.JLabel getLblImg27() {
        return lblImg27;
    }

    /**
     * @param lblImg27 the lblImg27 to set
     */
    public void setLblImg27(javax.swing.JLabel lblImg27) {
        this.lblImg27 = lblImg27;
    }

    /**
     * @return the lblImg28
     */
    public javax.swing.JLabel getLblImg28() {
        return lblImg28;
    }

    /**
     * @param lblImg28 the lblImg28 to set
     */
    public void setLblImg28(javax.swing.JLabel lblImg28) {
        this.lblImg28 = lblImg28;
    }

    /**
     * @return the lblImg30
     */
    public javax.swing.JLabel getLblImg30() {
        return lblImg30;
    }

    /**
     * @param lblImg30 the lblImg30 to set
     */
    public void setLblImg30(javax.swing.JLabel lblImg30) {
        this.lblImg30 = lblImg30;
    }

    /**
     * @return the lblImg31
     */
    public javax.swing.JLabel getLblImg31() {
        return lblImg31;
    }

    /**
     * @param lblImg31 the lblImg31 to set
     */
    public void setLblImg31(javax.swing.JLabel lblImg31) {
        this.lblImg31 = lblImg31;
    }

    /**
     * @return the lblImg32
     */
    public javax.swing.JLabel getLblImg32() {
        return lblImg32;
    }

    /**
     * @param lblImg32 the lblImg32 to set
     */
    public void setLblImg32(javax.swing.JLabel lblImg32) {
        this.lblImg32 = lblImg32;
    }

    /**
     * @return the lblImg33
     */
    public javax.swing.JLabel getLblImg33() {
        return lblImg33;
    }

    /**
     * @param lblImg33 the lblImg33 to set
     */
    public void setLblImg33(javax.swing.JLabel lblImg33) {
        this.lblImg33 = lblImg33;
    }

    /**
     * @return the lblImg34
     */
    public javax.swing.JLabel getLblImg34() {
        return lblImg34;
    }

    /**
     * @param lblImg34 the lblImg34 to set
     */
    public void setLblImg34(javax.swing.JLabel lblImg34) {
        this.lblImg34 = lblImg34;
    }

    /**
     * @return the lblImg35
     */
    public javax.swing.JLabel getLblImg35() {
        return lblImg35;
    }

    /**
     * @param lblImg35 the lblImg35 to set
     */
    public void setLblImg35(javax.swing.JLabel lblImg35) {
        this.lblImg35 = lblImg35;
    }

    /**
     * @return the lblImg36
     */
    public javax.swing.JLabel getLblImg36() {
        return lblImg36;
    }

    /**
     * @param lblImg36 the lblImg36 to set
     */
    public void setLblImg36(javax.swing.JLabel lblImg36) {
        this.lblImg36 = lblImg36;
    }

    /**
     * @return the lblImg37
     */
    public javax.swing.JLabel getLblImg37() {
        return lblImg37;
    }

    /**
     * @param lblImg37 the lblImg37 to set
     */
    public void setLblImg37(javax.swing.JLabel lblImg37) {
        this.lblImg37 = lblImg37;
    }

    /**
     * @return the lblImg38
     */
    public javax.swing.JLabel getLblImg38() {
        return lblImg38;
    }

    /**
     * @param lblImg38 the lblImg38 to set
     */
    public void setLblImg38(javax.swing.JLabel lblImg38) {
        this.lblImg38 = lblImg38;
    }

    /**
     * @return the lblImg40
     */
    public javax.swing.JLabel getLblImg40() {
        return lblImg40;
    }

    /**
     * @param lblImg40 the lblImg40 to set
     */
    public void setLblImg40(javax.swing.JLabel lblImg40) {
        this.lblImg40 = lblImg40;
    }

    /**
     * @return the lblImg41
     */
    public javax.swing.JLabel getLblImg41() {
        return lblImg41;
    }

    /**
     * @param lblImg41 the lblImg41 to set
     */
    public void setLblImg41(javax.swing.JLabel lblImg41) {
        this.lblImg41 = lblImg41;
    }

    /**
     * @return the lblImg42
     */
    public javax.swing.JLabel getLblImg42() {
        return lblImg42;
    }

    /**
     * @param lblImg42 the lblImg42 to set
     */
    public void setLblImg42(javax.swing.JLabel lblImg42) {
        this.lblImg42 = lblImg42;
    }

    /**
     * @return the lblImg43
     */
    public javax.swing.JLabel getLblImg43() {
        return lblImg43;
    }

    /**
     * @param lblImg43 the lblImg43 to set
     */
    public void setLblImg43(javax.swing.JLabel lblImg43) {
        this.lblImg43 = lblImg43;
    }

    /**
     * @return the lblImg44
     */
    public javax.swing.JLabel getLblImg44() {
        return lblImg44;
    }

    /**
     * @param lblImg44 the lblImg44 to set
     */
    public void setLblImg44(javax.swing.JLabel lblImg44) {
        this.lblImg44 = lblImg44;
    }

    /**
     * @return the lblImg45
     */
    public javax.swing.JLabel getLblImg45() {
        return lblImg45;
    }

    /**
     * @param lblImg45 the lblImg45 to set
     */
    public void setLblImg45(javax.swing.JLabel lblImg45) {
        this.lblImg45 = lblImg45;
    }

    /**
     * @return the lblImg46
     */
    public javax.swing.JLabel getLblImg46() {
        return lblImg46;
    }

    /**
     * @param lblImg46 the lblImg46 to set
     */
    public void setLblImg46(javax.swing.JLabel lblImg46) {
        this.lblImg46 = lblImg46;
    }

    /**
     * @return the lblImg47
     */
    public javax.swing.JLabel getLblImg47() {
        return lblImg47;
    }

    /**
     * @param lblImg47 the lblImg47 to set
     */
    public void setLblImg47(javax.swing.JLabel lblImg47) {
        this.lblImg47 = lblImg47;
    }

    /**
     * @return the lblImg48
     */
    public javax.swing.JLabel getLblImg48() {
        return lblImg48;
    }

    /**
     * @param lblImg48 the lblImg48 to set
     */
    public void setLblImg48(javax.swing.JLabel lblImg48) {
        this.lblImg48 = lblImg48;
    }

    /**
     * @return the lblImg50
     */
    public javax.swing.JLabel getLblImg50() {
        return lblImg50;
    }

    /**
     * @param lblImg50 the lblImg50 to set
     */
    public void setLblImg50(javax.swing.JLabel lblImg50) {
        this.lblImg50 = lblImg50;
    }

    /**
     * @return the lblImg51
     */
    public javax.swing.JLabel getLblImg51() {
        return lblImg51;
    }

    /**
     * @param lblImg51 the lblImg51 to set
     */
    public void setLblImg51(javax.swing.JLabel lblImg51) {
        this.lblImg51 = lblImg51;
    }

    /**
     * @return the lblImg52
     */
    public javax.swing.JLabel getLblImg52() {
        return lblImg52;
    }

    /**
     * @param lblImg52 the lblImg52 to set
     */
    public void setLblImg52(javax.swing.JLabel lblImg52) {
        this.lblImg52 = lblImg52;
    }

    /**
     * @return the lblImg53
     */
    public javax.swing.JLabel getLblImg53() {
        return lblImg53;
    }

    /**
     * @param lblImg53 the lblImg53 to set
     */
    public void setLblImg53(javax.swing.JLabel lblImg53) {
        this.lblImg53 = lblImg53;
    }

    /**
     * @return the lblImg54
     */
    public javax.swing.JLabel getLblImg54() {
        return lblImg54;
    }

    /**
     * @param lblImg54 the lblImg54 to set
     */
    public void setLblImg54(javax.swing.JLabel lblImg54) {
        this.lblImg54 = lblImg54;
    }

    /**
     * @return the lblImg55
     */
    public javax.swing.JLabel getLblImg55() {
        return lblImg55;
    }

    /**
     * @param lblImg55 the lblImg55 to set
     */
    public void setLblImg55(javax.swing.JLabel lblImg55) {
        this.lblImg55 = lblImg55;
    }

    /**
     * @return the lblImg56
     */
    public javax.swing.JLabel getLblImg56() {
        return lblImg56;
    }

    /**
     * @param lblImg56 the lblImg56 to set
     */
    public void setLblImg56(javax.swing.JLabel lblImg56) {
        this.lblImg56 = lblImg56;
    }

    /**
     * @return the lblImg57
     */
    public javax.swing.JLabel getLblImg57() {
        return lblImg57;
    }

    /**
     * @param lblImg57 the lblImg57 to set
     */
    public void setLblImg57(javax.swing.JLabel lblImg57) {
        this.lblImg57 = lblImg57;
    }

    /**
     * @return the lblImg58
     */
    public javax.swing.JLabel getLblImg58() {
        return lblImg58;
    }

    /**
     * @param lblImg58 the lblImg58 to set
     */
    public void setLblImg58(javax.swing.JLabel lblImg58) {
        this.lblImg58 = lblImg58;
    }

}
