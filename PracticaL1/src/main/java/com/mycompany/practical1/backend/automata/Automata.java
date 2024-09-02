/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1.backend.automata;

import com.mycompany.practical1.backend.SquareColor;
import com.mycompany.practical1.backend.Token;
import com.mycompany.practical1.backend.enums.Tokens;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafael-cayax
 */
public class Automata{
    private String estado;
    private List<Character> lexema;
    private List<Token> tokens;
    private int fila = 1;
    private int columna = 1;
    private Tokens token;
    private boolean signos = false;

    public Automata(String texto) {
        evaluarCadena(texto);
    }
    
    private boolean evaluarCadena(String texto) {
        lexema = new ArrayList<>();
        tokens = new ArrayList<>();
        estado = "S0";
        token = Tokens.IDENTIFICADOR;
        char[] caracteres = texto.toCharArray();
        for(int i = 0; i < caracteres.length; i++){
            signos = false;
            char c = caracteres[i];
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
                        case 'O' -> estado = "S81";
                        case 'R' -> estado = "S61";
                        case 'S' -> estado = "S65";
                        case 'T' -> estado = "S71";
                        case 'W' -> estado = "S73";
                        case '^' -> {
                            estado = "Q";
                            token = Tokens.ARITMETICO_EXPONENTE;
                        }
                        case '"' -> {
                            token = Tokens.ERROR;
                            estado = "C1";
                        }
                        case '\'' -> {
                            estado = "C2";
                            token = Tokens.COMENTARIO;
                        }
                        case '<' -> {
                            estado = "R1";
                            token = Tokens.RELACIONAL_MENOR_QUE;
                        }
                        case '>' -> {
                            estado = "R2";
                            token = Tokens.RELACIONAL_MAYOR_QUE;
                        }
                        case '=' -> {
                            estado = "AS";
                            token = Tokens.ASIGNACION_SIMPLE;
                        }
                        case '+' -> {
                            token = Tokens.ARITMETICO_SUMA;
                            estado = "A1";
                        }
                        case '-' -> {
                            token = Tokens.ARITMETICO_RESTA;
                            estado = "A1";
                        }
                        case '/' -> {
                            token = Tokens.ARITMETICO_DIVISION;
                            estado = "A2";
                        }
                        case '*' -> {
                            token = Tokens.ARITEMTICO_MULTIPLICACION;
                            estado = "A2";
                        }
                        case '.' -> {
                            estado = "Z";
                            token = Tokens.PUNTO;
                        }
                        default -> {
                            if (esNumero(c)) {
                                token = Tokens.ENTERO;
                                estado = "N";
                            } else if (esSimboloOSigno(c)) {                               
                                analizarSimboloOSigno(c);
                                lexema.add(c);
                                crearToken();
                                signos = true;
                            } else {
                                analizarCaracter(c);
                            }
                    }
                    }
                }
                case "S1" -> {
                    switch(c){
                        case 's' -> {
                            estado = "F";
                            token = Tokens.PALABRA_RESERVADA;
                        }
                        case 'n' -> estado = "S80";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S2" -> {
                    switch(c){
                        case 'o' -> estado = "S3";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S3" -> {
                    switch(c){
                        case 'o' -> estado = "S4";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S4" -> {
                    switch(c){
                        case 'l' -> estado = "S5";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S5" -> {
                    switch(c){
                        case 'e' -> estado = "S6";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S6" -> {
                    switch(c){
                        case 'a' -> estado = "S7";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S7" -> {
                    switch(c){
                        case 'n' -> {
                            estado = "F";
                            token = Tokens.PALABRA_RESERVADA;
                        }
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S8" -> {
                    switch(c){
                        case 'h' -> estado = "S9";
                        case 'o' -> estado = "S10";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S9" -> {
                    switch(c){
                        case 'a' -> estado = "S11";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S10" -> {
                    switch(c){
                        case 'n' -> estado = "S12";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S11" -> {
                    switch(c){
                        case 'r' -> {
                            estado = "F";
                            token = Tokens.PALABRA_RESERVADA;
                        }
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S12" -> {
                    switch(c){
                        case 's' -> estado = "S13";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S13" -> {
                    switch(c){
                        case 'o' -> estado = "S14";
                        case 't' -> {
                            estado = "F";
                            token = Tokens.PALABRA_RESERVADA;
                        }
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S14" -> {
                    switch(c){
                        case 'l' -> estado = "S15";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S15" -> {
                    switch(c){
                        case 'e' -> estado = "S16";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S16" -> {
                    switch(c){
                        case '.' -> estado = "S17";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S17" -> {
                    switch(c){
                        case 'R' -> estado = "S18";
                        case 'W' -> estado = "S19";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S18" -> {
                    switch(c){
                        case 'e' -> estado = "S20";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S19" -> {
                    switch(c){
                        case 'r' -> estado = "S21";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S20" -> {
                    switch(c){
                        case 'a' -> estado = "S22";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S21" -> {
                    switch(c){
                        case 'i' -> estado = "S23";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S22" -> {
                    switch(c){
                        case 'd' -> estado = "S25";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S23" -> {
                    switch(c){
                        case 't' -> estado = "S24";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S24" -> {
                    switch(c){
                        case 'e' -> estado = "S25";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S25" -> {
                    switch(c){
                        case 'L' -> estado = "S26";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S26" -> {
                    switch(c){
                        case 'i' -> estado = "S27";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S27" -> {
                    switch(c){
                        case'n' -> estado = "S28";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S28" -> {
                    switch(c){
                        case 'e' -> {
                            estado = "F";
                            token = Tokens.PALABRA_RESERVADA;
                        }
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S29" -> {
                    switch(c){
                        case 'i' -> estado = "S30";
                        case 'o' -> {
                            estado = "S31";
                            token = Tokens.PALABRA_RESERVADA;
                        }
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S30" -> {
                    switch(c){
                        case 'm' -> {
                            estado = "F";
                            token = Tokens.PALABRA_RESERVADA;
                        }
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S31" -> {
                    switch(c){
                        case 'u' -> estado = "S32";
                        default -> {
                            palabraReservada(c);
                    }
                    }
                }
                case "S32" -> {
                    switch(c){
                        case 'b' -> estado = "S33";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S33" -> {
                    switch(c){
                        case 'l' -> estado = "S28";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S34" -> {
                    switch(c){
                        case 'n' -> estado = "S35";
                        case 'l' -> estado = "S36";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S35" -> {
                    switch(c){
                        case 'd' -> {
                            estado = "F";
                            token = Tokens.PALABRA_RESERVADA;
                        }
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S36" -> {
                    switch(c){
                        case 's' -> estado = "S37";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S37" -> {
                    switch(c){
                        case 'e' -> {
                            estado = "S38";
                            token = Tokens.PALABRA_RESERVADA;
                        }
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S38" -> {
                    switch(c){
                        case 'I' -> estado = "S39";
                        default -> {
                            palabraReservada(c);
                    }
                    }
                }
                case "S39" -> {
                    switch(c){
                        case 'f' -> {
                            estado = "F";
                            token = Tokens.PALABRA_RESERVADA;
                        }
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S40" -> {
                    switch(c){
                        case 'o' -> estado = "S11";
                        case 'u' -> estado = "S41";
                        case 'a' -> estado = "S77";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S41" -> {
                    switch(c){
                        case 'n' -> estado = "S42";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S42" -> {
                    switch(c){
                        case 'c' -> estado = "S43";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S43" -> {
                    switch(c){
                        case 't' -> estado = "S44";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S44" -> {
                    switch(c){
                        case 'i' -> estado = "S45";
                        default -> {
                           identificador(c);
                    }
                    }
                }
                case "S45" -> {
                    switch(c){
                        case 'o' -> estado = "S7";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S46" -> {
                    switch(c){
                        case 'f' -> {
                            estado = "F";
                            token = Tokens.PALABRA_RESERVADA;
                        }
                        case 'n' -> estado = "S47";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S47" -> {
                    switch(c){
                        case 't' -> estado = "S48";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S48" -> {
                    switch(c){
                        case 'e' -> estado = "S49";
                        default -> { 
                            identificador(c);
                    }
                    }
                }
                case "S49" -> {
                    switch(c){
                        case 'g' -> estado = "S50";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S50" -> {
                    switch(c){
                        case 'e' -> estado = "S11";
                        default -> {
                            identificador(c);
                    }
                    }
                }
                case "S51" -> {
                    switch(c){
                        case 'o' -> estado = "S52";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S52" -> {
                    switch(c){
                        case 'o' -> estado = "S53";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S53" -> {
                    switch(c){
                        case 'p' -> {
                            estado = "F";
                            token = Tokens.PALABRA_RESERVADA;
                        }
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S54" -> {
                    switch(c){
                        case 'a' -> estado = "S55";
                        case 'o' -> estado = "S56";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S55" -> {
                    switch(c){
                        case 'i' -> estado = "S7";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S56" -> {
                    switch(c){
                        case 'd' -> {
                            estado = "S57";
                            token = Tokens.ARITMETICO_MODULO;
                        }
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S57" -> {
                    switch(c){
                        case 'u' -> {
                            estado = "S33";
                            token = Tokens.IDENTIFICADOR;
                        }
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S58" -> {
                    switch(c){
                        case 'e' -> estado = "S59";
                        case 'o' -> estado = "S82";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S59" -> {
                    switch(c){
                        case 'x' -> estado = "S60";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S60" -> {
                    switch(c){
                        case 't' -> {
                            estado = "F";
                            token = Tokens.PALABRA_RESERVADA;
                        }
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S61" -> {
                    switch(c){
                        case 'e' -> estado = "S62";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S62" -> {
                    switch(c){
                        case 't' -> estado = "S63";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S63" -> {
                    switch(c){
                        case 'u' -> estado = "S64";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S64" -> {
                    switch(c){
                        case 'r' -> estado = "S7";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S65" -> {
                    switch(c){
                        case 'u' -> estado = "S66";
                        case 't' -> estado = "S67";
                        case 'q' -> estado = "S83";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S66" -> {
                    switch(c){
                        case 'b' -> {
                            estado = "F";
                            token = Tokens.PALABRA_RESERVADA;
                        }
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S67" -> {
                    switch(c){
                        case 'r' -> estado = "S68";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S68" -> {
                    switch(c){
                        case 'i' -> estado = "S69";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S69" -> {
                    switch(c){
                        case 'n' -> estado = "S70";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S70" -> {
                    switch(c){
                        case 'g' -> {
                            estado = "F";
                            token = Tokens.PALABRA_RESERVADA;
                        }
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S71" -> {
                    switch(c){
                        case 'o' -> {
                            estado = "F";
                            token = Tokens.PALABRA_RESERVADA;
                        }
                        case 'r' -> estado = "S75";
                        case 'h' -> estado = "S72";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S72" -> {
                    switch(c){
                        case 'e' -> estado = "S7";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S73" -> {
                    switch(c){
                        case 'h' -> estado = "S74";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S74" -> {
                    switch(c){
                        case 'i' -> estado = "S33";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S75" -> {
                    switch(c){
                        case 'u' -> estado = "S76";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S76" -> {
                    switch(c){
                        case 'e' -> {
                            estado = "B";
                            token = Tokens.BOOLEAN;
                        }
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S77" -> {
                    switch(c){
                        case 'l' -> estado = "S78";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S78" -> {
                    switch(c){
                        case 's' -> estado = "S79";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S79" -> {
                    switch(c){
                        case 'e' -> {
                            estado = "B";
                            token = Tokens.BOOLEAN;
                        }
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S80" -> {
                    switch(c){
                        case 'd' -> {
                            estado = "B";
                            token = Tokens.LOGICO_Y;
                        }
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S81" -> {
                    switch(c){
                        case 'r' -> {
                            estado = "B";
                            token = Tokens.LOGICO_O;
                        }
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S82" -> {
                    switch(c){
                        case 't' -> {
                            estado = "B";
                            token = Tokens.LOGICO_NEGACION;
                        }
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S83" -> {
                    switch(c){
                        case 'u' -> estado = "S84";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S84" -> {
                    switch(c){
                        case 'a' -> estado = "S85";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S85" -> {
                    switch(c){
                        case 'r' -> estado = "S86";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S86" -> {
                    switch(c){
                        case 'e' -> estado = "S87";
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S87" -> {
                    switch(c){
                        case '.' -> {
                            estado = "S88";
                            token = Tokens.ERROR;
                        }
                        default -> {
                            identificador(c);
                        }
                    }
                }
                case "S88" -> {
                    switch(c){
                        case 'C' -> estado = "S89";
                        default -> {
                            estado = "E";
                        }
                    }
                }
                case "S89" -> {
                    switch(c){
                        case 'o' -> estado = "S90";
                        default -> {
                            estado = "E";
                        }
                    }
                }
                case "S90" -> {
                    switch(c){
                        case 'l' -> estado = "S91";
                        default -> {
                            estado = "E";
                        }
                    }
                }
                case "S91" -> {
                    switch(c){
                        case 'o' -> estado = "S92";
                        default -> {
                            estado = "E";
                        }
                    }
                }
                case "S92" -> {
                    switch(c){
                        case 'r' -> estado = "S93";
                        default -> {
                            estado = "E";
                        }
                    }
                }
                case "S93" -> {
                    switch(c){
                        case '(' -> estado = "S95";
                        default -> {
                            estado = "E";
                        }
                    }
                }
                case "S95" -> {
                    switch(c){
                        case '#' -> estado = "S96";
                        case ' ' -> estado = "S95";
                        default -> {
                            estado = "E";
                        }
                    }
                }
                case "S96" -> {
                    if (esColor(c)) {
                        estado = "S97";
                    } else{
                        estado = "E";
                    }
                }
                case "S97" -> {
                    if (esColor(c)) {
                        estado = "S98";
                    } else{
                        estado = "E";
                    }
                }
                case "S98" -> {
                    if (esColor(c)) {
                        estado = "S99";
                    } else{
                        estado = "E";
                    }
                }
                case "S99" -> {
                    if (esColor(c)) {
                        estado = "S100";
                    } else{
                        estado = "E";
                    }
                }
                case "S100" -> {
                    if (esColor(c)) {
                        estado = "S101";
                    } else{
                        estado = "E";
                    }
                }
                case "S101" -> {
                    if (esColor(c)) {
                        estado = "S102";
                    } else{
                        estado = "E";
                    }
                }
                case "S102" -> {
                    switch(c){
                        case ',' -> estado = "S103";
                        case ')' -> {
                            estado = "SQS";
                            token = Tokens.ESPECIAL_SIMPLE;
                        }
                        case ' ' -> estado = "S102";
                        default -> {
                            estado = "E";
                        }
                    }
                }
                case "S103" -> {
                    switch(c){
                        case ' ' -> estado = "S103";
                        default -> {
                            if (esNumero(c)) {
                                estado = "S104";
                            } else {
                                estado = "E";
                            }
                        }
                    }
                }
                case "S104" -> {
                    if (esNumero(c)) {
                        estado = "S104";
                    } else if (c == ' ') {
                        estado = "S105a";
                    } else if (c == ',') {
                        estado = "S106";
                    } else {
                        estado = "E";
                    }
                }
                case "S105a" -> {
                    if (c == ' ') {
                        estado = "S105a";
                    } else if (c == ',') {
                        estado = "S106";
                    } else {
                        estado = "E";
                    }
                }
                case "S106" -> {
                    if (esNumero(c)) {
                        estado = "S106";
                    } else if (c == ' ') {
                        estado = "S107a";
                    } else if (c == ')') {
                        estado = "SQS";
                        token = Tokens.ESPECIAL;
                    } else {
                        estado = "E";
                    }
                }
                case "S107a" -> {
                    if (c == ' ') {
                        estado = "S107a";
                    } else if (c == ')') {
                        estado = "SQS";
                        token = Tokens.ESPECIAL;
                    } else {
                        estado = "E";
                    }
                }
                case "SQS" -> {
                    if (!esLexemaNuevo(c)) {
                        token = Tokens.ERROR;
                        estado = "E";
                    }
                }
                case "F" -> {
                    palabraReservada(c);
                }
                case "E" -> {
                    token = Tokens.ERROR;
                    if (esLexemaNuevo(c)) {
                        estado = "S0";
                    } else if (esSimboloOSigno(c)) {
                        crearToken();
                        analizarSimboloOSigno(c);
                        lexema.add(c);
                        crearToken();
                        signos = true;
                    }
                }
                case "B" -> {
                    analizarCaracter(c);
                }
                
                case "I" -> {
                    identificador(c);
                }
                
                case "N" -> {
                    switch(c){
                        case '.' -> {
                            estado = "D";
                            token = Tokens.ERROR;
                        }
                        default -> {
                            if (esNumero(c)) {
                                token = Tokens.ENTERO;
                            } else {
                                analizarNumero(c);
                            }
                        }
                    }
                }
                case "D" -> {
                    switch(c){
                        case '.' -> estado = "E";
                        default -> {
                            if (esNumero(c)) {
                                token = Tokens.DECIMAL;
                            } else {
                                analizarNumero(c);
                            }
                        }
                    }
                }
                case "A1" -> {
                    switch(c){
                        case '=' -> {
                            estado = "Q";
                            token = Tokens.ASIGNACION_COMPUESTA;
                        }
                        default -> {
                            if (!esLexemaNuevo(c)) {
                                if (esNumero(c)) {
                                    token = Tokens.ENTERO;
                                    estado = "N";
                                } else {
                                    token = Tokens.ERROR;
                                    estado = "E";
                                }
                            }
                        }
                    }
                }
                case "A2" -> {
                    switch(c){
                        case '=' -> {
                            estado = "Q";
                            token = Tokens.ASIGNACION_COMPUESTA;
                        }
                        default -> {
                            if (!esLexemaNuevo(c)) {
                                token = Tokens.ERROR;
                                estado = "E";
                            }
                        }
                    }
                }
                case "C1" -> {
                    switch(c){
                        case '"' -> {
                            token = Tokens.CADENA;
                            estado = "Q";
                        }
                        default -> {
                            if (esSaltoDeLinea(c)) {
                                token = Tokens.ERROR;
                                crearToken();
                                estado = "S0";
                            }
                        }
                    }
                }
                case "C2" -> {
                    estado = "C3";
                }
                case "C3" -> {
                    switch(c){
                        case '\'' -> {
                            token = Tokens.CARACTER;
                            estado = "Q";
                        } 
                        default -> {
                            token = Tokens.COMENTARIO;
                            estado = "C4";
                        }
                    }
                }
                case "C4" -> {
                    if (esSaltoDeLinea(c)) {
                        crearToken();
                        nuevaFila();
                    }
                }
                case "R1" -> {
                    switch(c){
                        case '>' -> {
                            token = Tokens.RELACIONAL_DIFERENTE;
                            estado = "P";
                        }
                        case '=' -> {
                            token = Tokens.RELACIONAL_MENOR_IGUAL_QUE;
                            estado = "P";
                        }
                        default -> {
                            if (!esLexemaNuevo(c)) {
                                estado = "E";
                                token = Tokens.ERROR;
                            }
                        }
                    }
                }
                case "R2" -> {
                    switch(c){
                        case '=' -> {
                            token = Tokens.RELACIONAL_MAYOR_IGUAL_QUE;
                            estado = "P";
                        }
                        default -> {
                            if (!esLexemaNuevo(c)) {
                                estado = "E";
                                token = Tokens.ERROR;
                            }
                        }
                    }
                }
                case "AS" -> {
                    switch(c){
                        case '=' -> {
                            token = Tokens.RELACIONAL_IGUAL;
                            estado = "P";
                        }
                        default -> {
                            if (!esLexemaNuevo(c)) {
                                estado = "E";
                                token = Tokens.ERROR;
                            }
                        }
                    }
                }
                case "P" -> {
                    if (!esLexemaNuevo(c)) {
                        estado = "E";
                        token = Tokens.ERROR;
                    }
                }
                case "Q" -> {
                    if (!esLexemaNuevo(c)) {
                        if (esSimboloOSigno(c)) {
                            crearToken();
                            analizarSimboloOSigno(c);
                            lexema.add(c);
                            crearToken();
                            signos = true;
                        } else {
                            estado = "E";
                            token = Tokens.ERROR;
                        }
                    }
                }
                case "Z" -> {
                    if (!esLexemaNuevo(c)) {
                        estado = "E";
                        token = Tokens.ERROR;
                    }
                }
                
            }
            if (!esCaracterIgnorado(c) && !signos) {
                lexema.add(c);
            }
        }
        crearToken();
        return estado.equals("F") || estado.equals("S31") || estado.equals("S38");
    }
    
    private void palabraReservada(char c){
        token = Tokens.PALABRA_RESERVADA;
        analizarCaracter(c);
    }
    private void identificador(char c){
        if (!esIdentificador(c)) {
            analizarCaracter(c);
        } 
    }
    private void analizarNumero(char c){
        if (!esLexemaNuevo(c)) {
            if (esSimboloOSigno(c)) {
                crearToken();
                analizarSimboloOSigno(c);
                lexema.add(c);
                crearToken();
                signos = true;
            } else {
                token = Tokens.ERROR;
                estado = "E";
            }
        }
    }
    private void analizarCaracter(char c){
        if (!esLexemaNuevo(c)) {
            if (esIdentificador(c)) {
                token = Tokens.IDENTIFICADOR;
                estado = "I";
            } else if (esSimboloOSigno(c)) {
                crearToken();
                analizarSimboloOSigno(c);
                lexema.add(c);
                crearToken();
                signos = true;
            } else {
                token = Tokens.ERROR;
                estado = "E";
            }
        }
    }
    
    private boolean esSimboloOSigno(char c){
        return c == '(' || c == ')' || c == '{' || c == '}' || c == '[' || c == ']' || c == ',';
    }
    
    private void analizarSimboloOSigno(char c){
        if (c == '(' || c == ')') {
            token = Tokens.PARENTESIS;
        } else if (c == '{' || c == '}') {
            token = Tokens.LLAVES;
        } else if ( c == '[' || c == ']') {
            token = Tokens.CORCHETES;
        } else if ( c == ',') {
            token = Tokens.COMA;
        } 
    }
    
    private boolean esCaracterIgnorado(char c){
        return esSaltoDeLinea(c) || esTabulacion(c) || esEspacio(c);
    }
    
    private boolean esSaltoDeLinea(char c){
        return c == '\n';
    }
    
    private boolean esTabulacion(char c){
        return c == '\t';
    }
    
    private boolean esEspacio(char c){
        return c == ' ';
    }
    
    private boolean esLetra(char c){
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == 'ñ' || c == 'Ñ';
    }
    
    private boolean esNumero(char c){
        return c >= '0' && c <= '9';
    }
    
    private boolean esIdentificador(char c){
        return esLetra(c) || esNumero(c) || c == '_';
    }
    
    private boolean esColor(char c){
        return (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f') || esNumero(c);
    }

    private void crearToken() {
        if (lexema.size() > 0) {
            Token token = new Token();
            token.setColumna(columna);
            token.setFila(fila);
            token.setLexema(lexema);
            token.setToken(this.token);
            if (this.token == Tokens.ESPECIAL || this.token == Tokens.ESPECIAL_SIMPLE) {
                SquareColor color = new SquareColor(lexema);
                token.setSquare(color);
            }
            lexema = new ArrayList<>();
            tokens.add(token);
            estado = "S0";
            this.token = Tokens.IDENTIFICADOR;
            columna++;
        }
    }
    
    private boolean esLexemaNuevo(char c){
        if (esCaracterIgnorado(c)) {
            crearToken();
            if (esSaltoDeLinea(c)) {
                nuevaFila();
            }
            return true;
        }        
        return false;
    }
    
    private void nuevaFila(){
        fila++;
        columna = 1;
    }

    public List<Token> getTokens() {
        return tokens;
    }
        
}
