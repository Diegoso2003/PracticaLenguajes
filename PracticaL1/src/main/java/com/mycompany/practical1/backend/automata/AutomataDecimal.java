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
public class AutomataDecimal extends Automata3 {

    @Override
    public boolean evaluarCadena(List<Character> lexemas) {
        estado = "S0";
        for (Character c : lexemas) {
            switch (estado) {
                case "S0":
                    switch (c) {
                        case '0':
                            estado = "S1";
                            break;
                        case '-':
                        case '+':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            estado = "S2";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S1":
                    switch (c) {
                        case '.':
                            estado = "S3";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S2":
                    switch (c) {
                        case '.':
                            estado = "S3";
                            break;
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S3":
                    switch (c) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            break;
                        default:
                            return false;
                    }

            }
        }
        return estado.equals("S3");
    }

}
