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
public class AutomataRelacional extends Automata3{

    @Override
    public boolean evaluarCadena(List<Character> lexemas) {
        estado = "S0";
        for(Character c: lexemas){
            switch(estado){
                case "S0":
                    switch(c){
                        case '=':
                            estado = "S1";
                            break;
                        case '<':
                            estado = "S2";
                            color = "#D94A41";
                            break;
                        case '>':
                            estado = "S3";
                            color = "#D9D441";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S1":
                    switch(c){
                        case '=':
                            estado = "F";
                            color = "#6A00FF";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S2":
                    switch(c){
                        case '>':
                            color = "#3F2212";
                            estado = "F";
                            break;
                        case '=':
                            color = "#F0A30A";
                            estado = "F";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S3":
                    switch(c){
                        case '=':
                            color = "#E3C800";
                            estado = "F";
                            break;
                        default:
                            return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return estado.equals("F") || estado.equals("S2") || estado.equals("S3");
    }
    
}
