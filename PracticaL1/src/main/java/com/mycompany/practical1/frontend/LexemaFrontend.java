/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.practical1.frontend;

import com.mycompany.practical1.backend.GeneradorDeLexemas;
import com.mycompany.practical1.backend.Token;
import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author rafael-cayax
 */
public class LexemaFrontend extends javax.swing.JFrame {

    public LexemaFrontend() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        tokenTipo = new javax.swing.JLabel();
        informacion = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        tokenTipo.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        tokenTipo.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        jPanel1.add(tokenTipo, gridBagConstraints);

        informacion.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(informacion, gridBagConstraints);

        imagen.setText("jLabel1");
        imagen.setMaximumSize(new java.awt.Dimension(900, 50));
        imagen.setMinimumSize(new java.awt.Dimension(900, 50));
        imagen.setPreferredSize(new java.awt.Dimension(900, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        jPanel1.add(imagen, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarLexema(Token token){
        tokenTipo.setText(token.getToken().name());
        informacion.setText("Fila :" + token.getFila() + ", " + "Columna: " + token.getColumna() + " --> "
         + "Cuadro [" + token.getFilaCuadro() + ", " + token.getColumnaCuadro() + "]");
        GeneradorDeLexemas l = new GeneradorDeLexemas(token.getLexema());
        ImageIcon lexema = new ImageIcon(l.getImagenLexema());
        imagen.setText("");
        imagen.setSize(new Dimension(lexema.getIconWidth(), lexema.getIconHeight()));
        imagen.setIcon(lexema);
        imagen.revalidate();
        imagen.repaint();
        this.revalidate();
        this.repaint();
        this.pack();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel informacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tokenTipo;
    // End of variables declaration//GEN-END:variables
}
