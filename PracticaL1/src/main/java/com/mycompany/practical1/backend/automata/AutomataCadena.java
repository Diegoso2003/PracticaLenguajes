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
public class AutomataCadena extends Automata3{

    @Override
    public boolean evaluarCadena(List<Character> lexemas) {
        estado = "S0";
        for(Character c: lexemas){
            switch(estado){
                case "S0":
                    switch(c){
                        case '"':
                            estado = "S1";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S1":
                    switch(c){
                        case '"':
                            estado = "S2";
                            break;
                        default:
                            break;
                    }
                    break;
                case "S2":
                    return false;
            }
        }
        return estado.equals("S2");
    }
    
}
