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
public class AutomataBooleano extends Automata{

    @Override
    public boolean evaluarCadena(List<Character> lexemas) {
        estado = "S0";
        for(Character c: lexemas){
            switch(estado){
                case "S0":
                    switch(c){
                        case 'T':
                            estado = "S1";
                            break;
                        case 'F':
                            estado = "S2";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S1":
                    switch(c){
                        case 'r':
                            estado = "S3";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S2":
                    switch(c){
                        case 'a':
                            estado = "S4";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S3":
                    switch(c){
                        case 'u':
                            estado = "S5";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S4":
                    switch(c){
                        case 'l':
                            estado = "S6";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S5":
                    switch(c){
                        case 'e':
                            estado = "F";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S6":
                    switch(c){
                        case 's':
                            estado = "S5";
                            break;
                        default:
                            return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        color = "#FA6800";
        return estado.equals("F");
    }
    
}
