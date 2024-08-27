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
public class AutomataIdentificador extends Automata{

    @Override
    public boolean evaluarCadena(List<Character> lexemas) {
        estado = "A";
        for(Character c : lexemas){
            switch(estado){
                case "A":
                    if (Character.isLetter(c)) {
                        estado = "B";
                    } else{
                        return false;
                    }
                    break;
                case "B":
                    if (Character.isLetterOrDigit(c)) {
                        estado = "B";
                    } else if(c.equals('_')){
                        estado = "B";
                    } else{
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        color = "#FFD300";
        return true;
    }
    
}
