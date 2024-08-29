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
        estado = "S0";
        for(Character c : lexemas){
            switch(estado){
                case "S0" -> {
                    switch(c){
                        case 'A' -> estado = "S1";
                        case 'B' -> estado = "S2";
                        case 'C' -> estado = "S8";
                        case 'D' -> estado = "S29";
                        case 'E' -> estado = "S34";
                        case 'F' -> estado = "S40";
                        case 'I' -> estado = "S46";
                        case 'L' -> estado = "S51";
                        case 'M' -> estado = "S54";
                        case 'N' -> estado = "S58";
                        case 'R' -> estado = "S61";
                        case 'S' -> estado = "S65";
                        case 'T' -> estado = "S71";
                        case 'W' -> estado = "S73";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S1" -> {
                    switch(c){
                        case 's' -> estado = "F";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S2" -> {
                    switch(c){
                        case 'o' -> estado = "S3";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S3" -> {
                    switch(c){
                        case 'o' -> estado = "S4";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S4" -> {
                    switch(c){
                        case 'l' -> estado = "S5";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S5" -> {
                    switch(c){
                        case 'e' -> estado = "S6";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S6" -> {
                    switch(c){
                        case 'a' -> estado = "S7";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S7" -> {
                    switch(c){
                        case 'n' -> estado = "F";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S8" -> {
                    switch(c){
                        case 'h' -> estado = "S9";
                        case 'o' -> estado = "S10";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S9" -> {
                    switch(c){
                        case 'a' -> estado = "S11";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S10" -> {
                    switch(c){
                        case 'n' -> estado = "S12";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S11" -> {
                    switch(c){
                        case 'r' -> estado = "F";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S12" -> {
                    switch(c){
                        case 's' -> estado = "S13";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S13" -> {
                    switch(c){
                        case 'o' -> estado = "S14";
                        case 't' -> estado = "F";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S14" -> {
                    switch(c){
                        case 'l' -> estado = "S15";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S15" -> {
                    switch(c){
                        case 'e' -> estado = "S16";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S16" -> {
                    switch(c){
                        case '.' -> estado = "S17";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S17" -> {
                    switch(c){
                        case 'R' -> estado = "S18";
                        case 'W' -> estado = "S19";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S18" -> {
                    switch(c){
                        case 'e' -> estado = "S20";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S19" -> {
                    switch(c){
                        case 'r' -> estado = "S21";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S20" -> {
                    switch(c){
                        case 'a' -> estado = "S22";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S21" -> {
                    switch(c){
                        case 'i' -> estado = "S23";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S22" -> {
                    switch(c){
                        case 'd' -> estado = "S25";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S23" -> {
                    switch(c){
                        case 't' -> estado = "S24";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S24" -> {
                    switch(c){
                        case 'e' -> estado = "S25";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S25" -> {
                    switch(c){
                        case 'L' -> estado = "S26";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S26" -> {
                    switch(c){
                        case 'i' -> estado = "S27";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S27" -> {
                    switch(c){
                        case'n' -> estado = "S28";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S28" -> {
                    switch(c){
                        case 'e' -> estado = "F";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S29" -> {
                    switch(c){
                        case 'i' -> estado = "S30";
                        case 'o' -> estado = "S31";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S30" -> {
                    switch(c){
                        case 'm' -> estado = "F";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S31" -> {
                    switch(c){
                        case 'u' -> estado = "S32";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S32" -> {
                    switch(c){
                        case 'b' -> estado = "S33";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S33" -> {
                    switch(c){
                        case 'l' -> estado = "S28";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S34" -> {
                    switch(c){
                        case 'n' -> estado = "S35";
                        case 'l' -> estado = "S36";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S35" -> {
                    switch(c){
                        case 'd' -> estado = "F";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S36" -> {
                    switch(c){
                        case 's' -> estado = "S37";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S37" -> {
                    switch(c){
                        case 'e' -> estado = "S38";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S38" -> {
                    switch(c){
                        case 'I' -> estado = "S39";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S39" -> {
                    switch(c){
                        case 'f' -> estado = "F";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S40" -> {
                    switch(c){
                        case 'o' -> estado = "S11";
                        case 'u' -> estado = "S41";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S41" -> {
                    switch(c){
                        case 'n' -> estado = "S42";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S42" -> {
                    switch(c){
                        case 'c' -> estado = "S43";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S43" -> {
                    switch(c){
                        case 't' -> estado = "S44";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S44" -> {
                    switch(c){
                        case 'i' -> estado = "S45";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S45" -> {
                    switch(c){
                        case 'o' -> estado = "S7";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S46" -> {
                    switch(c){
                        case 'f' -> estado = "F";
                        case 'n' -> estado = "S47";
                    }
                }
                case "S47" -> {
                    switch(c){
                        case 't' -> estado = "S48";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S48" -> {
                    switch(c){
                        case 'e' -> estado = "S49";
                        default -> { 
                            return false;
                    }
                    }
                }
                case "S49" -> {
                    switch(c){
                        case 'g' -> estado = "S50";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S50" -> {
                    switch(c){
                        case 'e' -> estado = "S11";
                        default -> {
                            return false;
                    }
                    }
                }
                case "S51" -> {
                    switch(c){
                        case 'o' -> estado = "S52";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S52" -> {
                    switch(c){
                        case 'o' -> estado = "S53";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S53" -> {
                    switch(c){
                        case 'p' -> estado = "F";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S54" -> {
                    switch(c){
                        case 'a' -> estado = "S55";
                        case 'o' -> estado = "S56";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S55" -> {
                    switch(c){
                        case 'i' -> estado = "S7";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S56" -> {
                    switch(c){
                        case 'd' -> estado = "S57";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S57" -> {
                    switch(c){
                        case 'u' -> estado = "S33";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S58" -> {
                    switch(c){
                        case 'e' -> estado = "S59";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S59" -> {
                    switch(c){
                        case 'x' -> estado = "S60";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S60" -> {
                    switch(c){
                        case 't' -> estado = "F";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S61" -> {
                    switch(c){
                        case 'e' -> estado = "S62";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S62" -> {
                    switch(c){
                        case 't' -> estado = "S63";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S63" -> {
                    switch(c){
                        case 'u' -> estado = "S64";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S64" -> {
                    switch(c){
                        case 'r' -> estado = "S7";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S65" -> {
                    switch(c){
                        case 'u' -> estado = "S66";
                        case 't' -> estado = "S67";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S66" -> {
                    switch(c){
                        case 'b' -> estado = "F";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S67" -> {
                    switch(c){
                        case 'r' -> estado = "S68";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S68" -> {
                    switch(c){
                        case 'i' -> estado = "S69";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S69" -> {
                    switch(c){
                        case 'n' -> estado = "S70";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S70" -> {
                    switch(c){
                        case 'g' -> estado = "F";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S71" -> {
                    switch(c){
                        case 'o' -> estado = "F";
                        case 'h' -> estado = "S72";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S72" -> {
                    switch(c){
                        case 'e' -> estado = "S7";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S73" -> {
                    switch(c){
                        case 'h' -> estado = "S74";
                        default -> {
                            return false;
                        }
                    }
                }
                case "S74" -> {
                    switch(c){
                        case 'i' -> estado = "S33";
                        default -> {
                            return false;
                        }
                    }
                }
            }
        }
        return estado.equals("F") || estado.equals("S31") || estado.equals("S38");
    }
    
}
