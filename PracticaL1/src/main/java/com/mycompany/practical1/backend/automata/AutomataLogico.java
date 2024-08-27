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
public class AutomataLogico extends Automata {

    @Override
    public boolean evaluarCadena(List<Character> lexemas) {
        String palabra = "";
        for (Character c : lexemas) {
            palabra += c;
        }

        switch (palabra) {
            case"And":
                color = "#414ED9";
                break;
            case "Or":
                color = "#41D95D";
                break;
            case "Not":
                color = "#A741D9";
                break;
            default:
                return false;
        }
        return true;
    }

}
