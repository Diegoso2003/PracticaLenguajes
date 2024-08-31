/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1.backend.automata;

import java.util.List;

/**
 *
 * @author rafael-cayax
 */
public class AutomataNumeroEntero extends Automata3 {

    @Override
    public boolean evaluarCadena(List<Character> lexemas) {
        estado = "A";
        for (Character c : lexemas) {
            switch (estado) {
                case "A":
                    switch (c) {
                        case '+':
                        case '-':
                            estado = "B";
                            break;
                        case '0':
                            estado = "C";
                            break;
                        default:
                            if (Character.isDigit(c)) {
                                estado = "B";
                            } else {
                                return false;
                            }
                    }
                    break;
                case "B":
                    if (!Character.isDigit(c) || c.equals('0')) {
                        return false;
                    }
                    estado = "D";
                    break;
                case "C":
                    return false;
                case "D":
                    if (!Character.isDigit(c)) {
                        return false;
                    }
                    break;
            }
        }
        return estado.equals("D") || estado.equals("C");
    }

}
