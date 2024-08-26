/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1.backend;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafael-cayax
 */
public class AnalizadorLexico {
    private int columna = 1;
    private int fila = 1;
    
    public void analizar(String texto){
        char[] lexemas = texto.toCharArray();
        List<Character> token = new ArrayList<>();
        for (int i = 0; i < lexemas.length; i++) {
            Character lexema = Character.valueOf(lexemas[i]);
            if (esSaltoDeLinea(lexema) && fila > 1) {
                fila++;
            } else if (!esEspacio(lexema) && !esTabulacion(lexema) && token.size() > 0) {
                token.add(lexema);
                columna++;
                token = new ArrayList<>();
            }
        }
    }

    private boolean esSaltoDeLinea(Character lexema) {
        return lexema.equals('\n');
    }

    private boolean esEspacio(Character lexema) {
        return lexema.equals(' ');
    }

    private boolean esTabulacion(Character lexema) {
        return lexema.equals('\t');
    }
    
    
}
