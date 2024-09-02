/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1.backend;

import java.util.List;

/**
 *
 * @author rafael-cayax
 */
public class SquareColor {
    private String color = "";
    private int fila;
    private int columna;
    private boolean simple;
    
    public SquareColor(List<Character> lexema){
        extraerColor(lexema);
    }

    private void extraerColor(List<Character> lexema) {
        boolean color2 = false;
        boolean filas = false;
        boolean columnas = false;
        String fila2 = "";
        String columna2 = "";
        for(Character c: lexema){
            if (c == '(') {
                color2 = true;
            } else if(color2){
                if (c != ',' && c != ')') {
                    color += c;
                } else {
                    color2 = false;
                    filas = true;
                }
            } else if (filas) {
                if (c != ',' && c != ')') {
                    fila2 += c;
                } else {
                    filas = false;
                    columnas = true;
                    fila = Integer.valueOf(fila2);
                }
            } else if (columnas) {
                if (c != ',' && c != ')') {
                    columna2 += c;
                } else {
                    columnas = false;
                    columna = Integer.valueOf(columna2);
                }
            }
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public boolean isSimple() {
        return simple;
    }

    public void setSimple(boolean simple) {
        this.simple = simple;
    }
}
