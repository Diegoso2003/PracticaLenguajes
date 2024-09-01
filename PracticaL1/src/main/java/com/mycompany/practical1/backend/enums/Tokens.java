/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.practical1.backend.enums;

/**
 *
 * @author rafael-cayax
 */
public enum Tokens {
    IDENTIFICADOR("#FFD300"),
    PALABRA_RESERVADA("#60A917"),
    ARITMETICO_SUMA("#FF33FF"),
    ARITMETICO_RESTA("#C19A6B"),
    ARITMETICO_EXPONENTE("#FCD0B4"),
    ARITMETICO_DIVISION("#B4D941"),
    ARITMETICO_MODULO("#D9AB41"),
    ARITEMTICO_MULTIPLICACION("#D80073"),
    RELACIONAL_IGUAL("#6A00FF"),
    RELACIONAL_DIFERENTE("#3F2212"),
    RELACIONAL_MAYOR_QUE("#D9D441"),
    RELACIONAL_MENOR_QUE("#D94A41"),
    RELACIONAL_MAYOR_IGUAL_QUE("#E3C800"),
    RELACIONAL_MENOR_IGUAL_QUE("#F0A30A"),
    LOGICO_Y("#414ED9"),
    LOGICO_O("#41D95D"),
    LOGICO_NEGACION("#A741D9"),
    ASIGNACION_SIMPLE("#41D9D4"),
    ASIGNACION_COMPUESTA("#FFFFFF"),
    ENTERO("#1BA1E2"),
    DECIMAL("#FFFF88"),
    CADENA("#E51400"),
    CARACTER("#0050EF"),
    COMENTARIO("#B3B3B3"),
    BOOLEAN("#FA6800"),
    PARENTESIS("#9AD8DB"),
    LLAVES("#DBD29A"),
    CORCHETES("#DBA49A"),
    COMA("#B79ADB"),
    PUNTO("#9ADBA6"),
    ERROR("error");
    
    private String color;

    private Tokens(String color) {
        this.color = color;
    }
    
    public String color(){
        return color;
    }
}
