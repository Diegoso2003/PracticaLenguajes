/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.practical1.frontend;

import com.mycompany.practical1.backend.Celda;
import com.mycompany.practical1.frontend.paneles_tabla.PanelCuadro;
import com.mycompany.practical1.frontend.paneles_tabla.PanelInformacion;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.List;

/**
 *
 * @author rafael-cayax
 */
public class ReportesFrontend extends javax.swing.JFrame {

    private int fila = 1;

    /**
     * Creates new form ReportesFrontend
     */
    public ReportesFrontend() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        panelTabla = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reportes");

        panelTabla.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 40));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Token");
        jPanel2.add(jLabel1, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panelTabla.add(jPanel2, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 40));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Lexema");
        jPanel3.add(jLabel2, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        panelTabla.add(jPanel3, gridBagConstraints);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setMinimumSize(new java.awt.Dimension(150, 100));
        jPanel4.setPreferredSize(new java.awt.Dimension(150, 40));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("Linea");
        jPanel4.add(jLabel3, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        panelTabla.add(jPanel4, gridBagConstraints);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setPreferredSize(new java.awt.Dimension(150, 40));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jLabel4.setText("Columna");
        jPanel5.add(jLabel4, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        panelTabla.add(jPanel5, gridBagConstraints);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setMinimumSize(new java.awt.Dimension(250, 40));
        jPanel6.setPreferredSize(new java.awt.Dimension(250, 40));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel5.setText("Cuadro");
        jPanel6.add(jLabel5, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 20);
        panelTabla.add(jPanel6, gridBagConstraints);

        jScrollPane1.setViewportView(panelTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReportesFrontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportesFrontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportesFrontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportesFrontend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportesFrontend().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelTabla;
    // End of variables declaration//GEN-END:variables

    public void mostrar(Celda[][] celdas) {
        for (int i = 0; i < celdas.length; i++) {
            Celda[] celda = celdas[i];
            for (int j = 0; j < celda.length; j++) {
                Celda celda1 = celda[j];
                if (celda1.getToken() != null) {
                    agregarCelda(celda1);
                }
            }
        }
    }

    private void agregarCelda(Celda celda1) {
        int columna = 0;
        String token = celda1.getToken().getToken().name();
        List<Character> lexema = celda1.getToken().getLexema();
        String lexemas = "";
        for (Character c : lexema) {
            lexemas += c;
        }
        String linea = celda1.getToken().getFila() + "";
        String columa = celda1.getToken().getColumna() + "";
        String lineaCuadro = celda1.getToken().getFilaCuadro() + "";
        String columnaCuadro = celda1.getToken().getColumnaCuadro() + "";
        String color = celda1.getToken().getToken().color();

        agregarPanel(token, columna, 250, 100, true);
        columna++;
        agregarPanel(lexemas, columna, 250, 100, false);
        columna++;
        agregarPanel(linea, columna, 150, 100, false);
        columna++;
        agregarPanel(columa, columna, 150, 100, false);
        columna++;
        agregarCuadro(lineaCuadro, columnaCuadro, color, columna);
        fila++;
    }

    private void agregarPanel(String texto, int columna, int par, int par1,boolean inicio) {
        PanelInformacion panel = new PanelInformacion();
        panel.setPreferredSize(new Dimension(par, par1));
        panel.informar(texto);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = columna;
        gbc.gridy = fila;
        if (inicio) {
            gbc.insets = new Insets(0,20,0,0);
        }
        panelTabla.add(panel, gbc);
    }

    private void agregarCuadro(String lineaCuadro, String columnaCuadro, String color, int columna) {
        PanelCuadro panel = new PanelCuadro();
        panel.informacionCuadro(lineaCuadro, columnaCuadro, color);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = columna;
        gbc.gridy = fila;
        gbc.insets = new Insets(0,0,0,20);
        panelTabla.add(panel, gbc);
    }
}
