/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1.backend;

import com.mycompany.practical1.backend.automata.*;
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
            if (esSaltoDeLinea(lexema)) {
                fila++;
            } else if (!esEspacio(lexema) && !esTabulacion(lexema)) {
                token.add(lexema);
            } else if(token.size() > 0){
                columna++;
                evaluarToken(token);
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

    private void evaluarToken(List<Character> token) {
        Automata automata = null;
        if (tokenEs(automata = new AutomataPalabraReservada(), token)) {
            
        } else if (tokenEs(automata = new AutomataIdentificador(), token)) {
            
        }
    }

    private boolean tokenEs(Automata tipoAutomata, List<Character> token) {
        return tipoAutomata.evaluarCadena(token);
    }
    
    
}
