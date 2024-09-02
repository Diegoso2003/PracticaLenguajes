/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.practical1.frontend;

import com.mycompany.practical1.backend.CreadorDeImagen;
import com.mycompany.practical1.backend.Lector;
import com.mycompany.practical1.backend.Menu;
import java.awt.GridLayout;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael-cayax
 */
public class MenuEditor extends javax.swing.JFrame {
    private Menu menu2;

    /**
     * Creates new form MenuEditor
     */
    public MenuEditor(Menu menu2) {
        this.menu2 = menu2;
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        editor = new javax.swing.JTextArea();
        panelCuadricula = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        nuevo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        archivo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        image = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        reporte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setResizable(false);

        jSplitPane1.setDividerLocation(500);

        jPanel3.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton2.setText("Formar Imagen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jButton2)
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(35, 35, 35))
        );

        jPanel3.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        editor.setColumns(20);
        editor.setRows(5);
        jScrollPane1.setViewportView(editor);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jSplitPane1.setLeftComponent(jPanel3);

        panelCuadricula.setMaximumSize(new java.awt.Dimension(500, 500));
        panelCuadricula.setMinimumSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout panelCuadriculaLayout = new javax.swing.GroupLayout(panelCuadricula);
        panelCuadricula.setLayout(panelCuadriculaLayout);
        panelCuadriculaLayout.setHorizontalGroup(
            panelCuadriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        panelCuadriculaLayout.setVerticalGroup(
            panelCuadriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(panelCuadricula);

        jMenu1.setText("Nuevo");

        nuevo.setText("Nuevo Editor");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        jMenu1.add(nuevo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Archivo");

        archivo.setText("Abrir Archivo");
        archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoActionPerformed(evt);
            }
        });
        jMenu2.add(archivo);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Exportar Imagen");

        image.setText("Guardar Imagen");
        image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageActionPerformed(evt);
            }
        });
        jMenu3.add(image);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Reporte");

        reporte.setText("Generar Reporte");
        reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteActionPerformed(evt);
            }
        });
        jMenu4.add(reporte);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String texto = editor.getText();
        menu2.iniciarAnalisis(texto);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        MenuPrincipal menu3 = new MenuPrincipal();
        menu3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nuevoActionPerformed

    private void archivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                Lector lector = new Lector(this, selectedFile);
                lector.leer();
            }
    }//GEN-LAST:event_archivoActionPerformed

    private void reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteActionPerformed
        menu2.escribirReporte();
    }//GEN-LAST:event_reporteActionPerformed

    private void imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageActionPerformed
        JFileChooser filechooser = new JFileChooser();
        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int ok = filechooser.showOpenDialog(null);
        if (ok == JFileChooser.APPROVE_OPTION) {
            CreadorDeImagen image = new CreadorDeImagen(panelCuadricula, this);
            image.guardarImagen(filechooser.getSelectedFile());
        }
    }//GEN-LAST:event_imageActionPerformed

    public void definirCuadricula(int fila, int columna){
        panelCuadricula.setLayout(new GridLayout(fila, columna));
    }
    
    public void llenarCuadricula(CeldaFrontend[][] celdas){
        for (int i = 0; i < celdas.length; i++) {
            CeldaFrontend[] celda = celdas[i];
            for (int j = 0; j < celda.length; j++) {
                CeldaFrontend celdaFrontend = celda[j];
                panelCuadricula.add(celdaFrontend);
            }
        }
    }
    
    public void mostrarResultado(String texto, String titulo){
        JOptionPane.showMessageDialog(this, texto, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void escribir(String texto){
        editor.append(texto + "\n");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem archivo;
    private javax.swing.JTextArea editor;
    private javax.swing.JMenuItem image;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JMenuItem nuevo;
    private javax.swing.JPanel panelCuadricula;
    private javax.swing.JMenuItem reporte;
    // End of variables declaration//GEN-END:variables
}
