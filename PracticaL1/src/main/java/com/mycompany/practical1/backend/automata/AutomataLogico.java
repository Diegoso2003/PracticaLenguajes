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
public class AutomataLogico extends Automata3 {

    @Override
    public boolean evaluarCadena(List<Character> lexemas) {
        estado = "S0";
        for(Character c: lexemas){
            switch(estado){
                case "S0":
                    switch(c){
                        case 'A':
                            estado = "S1";
                            break;
                        case 'O':
                            estado = "S2";
                            break;
                        case 'N':
                            estado = "S3";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S1":
                    switch(c){
                        case 'n':
                            estado = "S4";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S2":
                    switch(c){
                        case 'r':
                            estado = "F";
                            color = "#41D95D";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S3":
                    switch(c){
                        case 'o':
                            estado = "S5";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S4":
                    switch(c){
                        case 'd':
                            estado = "F";
                            color = "#414ED9";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S5":
                    switch(c){
                        case 't':
                            estado = "F";
                            color = "#A741D9";
                            break;
                        default:
                            return false;
                    }
                    break;
                default:
                    return false;
            }
        }

        return estado.equals("F");
    }

}
