/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomemoria.gui;

import javax.swing.JPanel;

/**
 *
 * @author Aluno
 */
public class JPanelTabuleiro extends javax.swing.JPanel {

    /**
     * Creates new form JPanelTabuleiro
     */
    public JPanelTabuleiro() {
        initComponents();
    }
    
    public void setTabuleiroNivel(JPanel pnl) {
        sppTabuleiro.setRightComponent(pnl);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sppTabuleiro = new javax.swing.JSplitPane();
        jPanelInfos1 = new jogomemoria.gui.JPanelInfos();

        setLayout(new java.awt.BorderLayout());

        sppTabuleiro.setLeftComponent(jPanelInfos1);

        add(sppTabuleiro, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jogomemoria.gui.JPanelInfos jPanelInfos1;
    private javax.swing.JSplitPane sppTabuleiro;
    // End of variables declaration//GEN-END:variables
}
