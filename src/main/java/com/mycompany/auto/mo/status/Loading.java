/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.auto.mo.status;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lcarl
 */
public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form Loading
     */
    public Loading() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        ticTacToe1 = new com.mycompany.auto.mo.status.TicTacToe();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setPreferredSize(new java.awt.Dimension(1400, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 970, 30));

        jLabel1.setText("Loading");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 250, 30));
        getContentPane().add(ticTacToe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 590, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String args[]) {
        Loading load = new Loading();
        load.setVisible(true);
        try {
           
            for (int i = 0; i <= 100; i++){
                Thread.sleep(15000);
                load.jProgressBar1.setValue(i);
            }
            
            Login log = new Login();
            load.setVisible(false);
            log.setVisible(true);
        } catch (InterruptedException ex) {
            Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private com.mycompany.auto.mo.status.TicTacToe ticTacToe1;
    // End of variables declaration//GEN-END:variables
}
