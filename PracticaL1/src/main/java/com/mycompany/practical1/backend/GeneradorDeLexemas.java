/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1.backend;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import javax.imageio.ImageIO;

/**
 *
 * @author rafael-cayax
 */
public class GeneradorDeLexemas {
    private BufferedImage imagenLexema;

    public GeneradorDeLexemas(List<Character> lexemas) {
        String lex = "";
        for(Character c : lexemas){
            lex += c;
        }
        generarImagen(lex);
    }

    private void generarImagen(String lex) {

        StringBuilder graphConstructor = new StringBuilder();
        String lexema = lex.replace("\"", "'");
        System.out.println(lexema);
        graphConstructor.append("digraph G {\n");
        graphConstructor.append("rankdir=LR;\n");
        graphConstructor.append("node [shape = circle];\n");
        for (int i = 0; i < lexema.length(); i++) {
            char caracter = lexema.charAt(i);
            String nodo = "node" + i;

            if (i == lexema.length() - 1) {
                graphConstructor.append(nodo + " [label=\"" + caracter + "\", shape=doublecircle];\n");
            } else {
                graphConstructor.append(nodo + " [label=\"" + caracter + "\"];\n");
            }

            if (i > 0) {
                String nodoPrevio = "node" + (i - 1);
                graphConstructor.append(nodoPrevio + " -> " + nodo + ";\n");
            }
        }
        graphConstructor.append("}");

        crearConexionGraphViz(graphConstructor.toString());
    }

    private void crearConexionGraphViz(String graphConstructor) {

        try {
            ProcessBuilder pb = new ProcessBuilder("dot", "-Tpng");
            Process process = pb.start();

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()));
            writer.write(graphConstructor);
            writer.flush();
            writer.close();

            InputStream inputStream = process.getInputStream();
            imagenLexema = ImageIO.read(inputStream);
            process.waitFor();

        } catch (IOException | InterruptedException e) {
        }
    }

    public BufferedImage getImagenLexema() {
        return imagenLexema;
    }

    
}
