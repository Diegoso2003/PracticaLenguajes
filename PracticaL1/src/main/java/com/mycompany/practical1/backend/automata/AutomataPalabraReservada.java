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
public class AutomataPalabraReservada extends Automata{

    @Override
    public boolean evaluarCadena(List<Character> lexemas) {
        String cadena = "";
        for(Character l: lexemas){
            cadena += l;
        }
        
        switch(cadena){
            case "Module":
            case "End":
            case "Sub":
            case "Main":
            case "Dim":
            case "As":
            case "Integer":
            case "String":
            case "Boolean":
            case "Double":
            case "Char":
            case "Console.WriteLine":
            case "Console.ReadLine":
            case "If":
            case "ElseIf":
            case "Else":
            case "Then":
            case "While":
            case "Do":
            case "Loop":
            case "For":
            case "To":
            case "Next":
            case "Function":
            case "Return":
            case "Const":
                color = "#60A917";
                break;
            default:
                return false;
        }
        return true;
    }
    
}
