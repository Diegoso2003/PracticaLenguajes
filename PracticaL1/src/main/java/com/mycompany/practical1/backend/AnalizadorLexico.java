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

    public void analizar(String texto) {
        columna = 1;
        fila = 1;
        char[] lexemas = texto.toCharArray();
        List<Character> token = new ArrayList<>();
        for (int i = 0; i < lexemas.length; i++) {
            Character lexema = Character.valueOf(lexemas[i]);
            if (esSaltoDeLinea(lexema)) {
                fila++;
                if (token.size() > 0) {
                    columna++;
                    evaluarToken(token);
                    token = new ArrayList<>();
                }
            } else if (!esEspacio(lexema) && !esTabulacion(lexema)) {
                token.add(lexema);
            } else if (token.size() > 0) {
                columna++;
                evaluarToken(token);
                token = new ArrayList<>();
            }
        }
        
        if (token.size() > 0) {
            columna++;
            evaluarToken(token);
            System.out.println(token);
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
            System.out.println("palabra Reservada");
        } else if (tokenEs(automata = new AutomataLogico(), token)) {
            System.out.println("logico");
        } else if (tokenEs(automata = new AutomataAritmetico(), token)) {
            System.out.println("aritmetico");
        } else if (tokenEs(automata = new AutomataBooleano(), token)) {
            System.out.println("booleano");
        } else if (tokenEs(automata = new AutomataIdentificador(), token)) {
            System.out.println("identificador");
        } else if (tokenEs(automata = new AutomataNumeroEntero(), token)) {
            System.out.println("numero");
        } else if (tokenEs(automata = new AutomataDecimal(), token)) {
            System.out.println("decimal");
        } else if (tokenEs(automata = new AutomataCadena(), token)) {
            System.out.println("cadena");
        } else if (tokenEs(automata = new AutomataCaracter(), token)) {
            System.out.println("caracter");
        } else if (tokenEs(automata = new AutomataRelacional(), token)) {
            System.out.println("relacional");
        } else if (tokenEs(automata = new AutomataAsignacion(), token)) {
            System.out.println("asignacion");
        } else {
            System.out.println("no es valido");
        }
    }

    private boolean tokenEs(Automata tipoAutomata, List<Character> token) {
        return tipoAutomata.evaluarCadena(token);
    }

}
