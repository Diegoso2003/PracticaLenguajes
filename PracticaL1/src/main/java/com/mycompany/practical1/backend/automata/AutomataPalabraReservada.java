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
        boolean fin = false;
        for(Character c : lexemas){
            switch(estado){
                case "S0":
                    switch(c){
                        case 'A':
                            estado = "S1";
                            break;
                        case 'B':
                            estado = "S2";
                            break;
                        case 'C':
                            estado = "S8";
                            break;
                        case 'D':
                            estado = "S29";
                            break;
                        case 'E':
                            estado = "S34";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S1":
                    switch(c){
                        case 's':
                            estado = "F";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S2":
                    switch(c){
                        case 'o':
                            estado = "S3";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S3":
                    switch(c){
                        case 'o':
                            estado = "S4";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S4":
                    switch(c){
                        case 'l':
                            estado = "S5";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S5":
                    switch(c){
                        case 'e':
                            estado = "S6";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S6":
                    switch(c){
                        case 'a':
                            estado = "S7";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S7":
                    switch(c){
                        case 'n':
                            estado = "F";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S8":
                    switch(c){
                        case 'h':
                            estado = "S9";
                            break;
                        case 'o':
                            estado = "S10";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S9":
                    switch(c){
                        case 'a':
                            estado = "S11";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S10":
                    switch(c){
                        case 'n':
                            estado = "S12";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S11":
                    switch(c){
                        case 'r':
                            estado = "F";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S12":
                    switch(c){
                        case 's':
                            estado = "S13";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S13":
                    switch(c){
                        case 'o':
                            estado = "S14";
                            break;
                        case 't':
                            estado = "F";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S14":
                    switch(c){
                        case 'l':
                            estado = "S15";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S15":
                    switch(c){
                        case 'e':
                            estado = "S16";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S16":
                    switch(c){
                        case '.':
                            estado = "S17";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S17":
                    switch(c){
                        case 'R':
                            estado = "S18";
                            break;
                        case 'W':
                            estado = "S19";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S18":
                    switch(c){
                        case 'e':
                            estado = "S20";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S19":
                    switch(c){
                        case 'r':
                            estado = "S21";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S20":
                    switch(c){
                        case 'a':
                            estado = "S22";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S21":
                    switch(c){
                        case 'i':
                            estado = "S23";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S22":
                    switch(c){
                        case 'd':
                            estado = "S25";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S23":
                    switch(c){
                        case 't':
                            estado = "S24";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S24":
                    switch(c){
                        case 'e':
                            estado = "S25";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S25":
                    switch(c){
                        case 'L':
                            estado = "S26";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S26":
                    switch(c){
                        case 'i':
                            estado = "S27";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S27":
                    switch(c){
                        case'n':
                            estado = "S28";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S28":
                    switch(c){
                        case 'e':
                            estado = "F";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S29":
                    switch(c){
                        case 'i':
                            estado = "S30";
                            break;
                        case 'o':
                            estado = "S31";
                            fin = true;
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S30":
                    switch(c){
                        case 'm':
                            estado = "F";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S31":
                    switch(c){
                        case 'u':
                            estado = "S32";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S32":
                    switch(c){
                        case 'b':
                            estado = "S33";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S33":
                    switch(c){
                        case 'l':
                            estado = "S28";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S34":
                    switch(c){
                        case 'n':
                            estado = "S35";
                            break;
                        case 'l':
                            estado = "S36";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S35":
                    switch(c){
                        case 'd':
                            estado = "F";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S36":
                    switch(c){
                        case 's':
                            estado = "S37";
                            break;
                        default:
                            return false;
                    }
                    break;
                case "S37":
                    switch(c){
                        case 'e':
                            estado = "S38";
                            fin = true;
                            break;
                        default:
                            return false;
                    }
                    break;
            }
        }
        return estado.equals("F") || fin;
    }
    
}
