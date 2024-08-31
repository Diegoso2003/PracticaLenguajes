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
        Automata automata = new Automata(texto);
        List<Token> l = automata.getTokens();
        for(Token k : l){
            k.imprimir();
        }
    }

}
