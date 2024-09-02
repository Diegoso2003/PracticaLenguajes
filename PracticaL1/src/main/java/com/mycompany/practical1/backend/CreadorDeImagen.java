/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1.backend;

import com.mycompany.practical1.frontend.MenuEditor;
import java.awt.AWTException;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author rafael-cayax
 */
public class CreadorDeImagen {
    private String archivo;
    private JPanel panel;
    private MenuEditor menu;

    public CreadorDeImagen(JPanel panel, MenuEditor menu) {
        this.panel = panel;
        this.menu = menu;
    }
    
    public void guardarImagen(File carpeta){
        String path = carpeta.getAbsolutePath();
        buscarNombreDisponible(path);
    }

    private void buscarNombreDisponible(String path) {
        int numero = 1;
        File file = null;
        do {
            archivo = "imagen_lienzo" + numero + ".jpg";
            file = new File(path + "/" + archivo);
            numero++;
        } while (file.exists());
        crearImagen(file);
    }

    private void crearImagen(File file) {
        try {
            BufferedImage imagen = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = imagen.createGraphics();
            panel.paint(g2d);
            g2d.dispose();
            ImageIO.write(imagen, "png", file);
            menu.mostrarResultado("La imagen se ha guardado en la carpeta seleccionada con el nombre de: " + archivo,"Imagen");
        } catch (IOException e) {
            e.printStackTrace();
            menu.mostrarResultado("Hubo un error al intentar guardar la imagen intente nuevamente", "ERROR");
        }
    }
}
