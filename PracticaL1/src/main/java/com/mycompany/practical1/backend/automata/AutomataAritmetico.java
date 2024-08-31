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
public class AutomataAritmetico extends Automata3{

    @Override
    public boolean evaluarCadena(List<Character> lexemas) {
        estado = "A";
        boolean a = false;
        for(Character c: lexemas){
            switch(estado){
                case "A":
                    switch(c){
                        case '+':
                            color = "#FF33FF";
                            a = true;
                            break;
                        case '-':
                            color = "#C19A6B";
                            a = true;
                            break;
                        case '/':
                            color = "#B4D941";
                            a = true;
                            break;
                        case '*':
                            color = "#D80073";
                            a = true;
                            break;
                        case '^':
                            color = "#FCD0B4";
                            a = true;
                            break;
                        case 'M':
                            break;
                        default:
                            return false;                        
                    }
                    estado = "B";
                    break;
                case "B":
                    switch(c){
                        case 'o':
                            break;
                        case 'd':
                            color = "#D9AB41";
                            a = true;
                            break;
                        default:
                            return false;
                    }
            }
        }
        return a;
    }
    
}
