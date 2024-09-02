/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1.backend;

import com.mycompany.practical1.backend.enums.Tokens;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author rafael-cayax
 */
public class Token {
    
    private List<Character> lexema;
    private Tokens token;
    private SquareColor square;
    private int fila;
    private int columna;
    private int filaCuadro;
    private int columnaCuadro;

    public Token() {
        lexema = new ArrayList<>();
    }
    
    public void imprimir(){
        System.out.println(token);
    }

    public List<Character> getLexema() {
        return lexema;
    }

    public void setLexema(List<Character> lexema) {
        this.lexema = lexema;
    }

    public Tokens getToken() {
        return token;
    }

    public void setToken(Tokens token) {
        this.token = token;
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

    public int getFilaCuadro() {
        return filaCuadro;
    }

    public void setFilaCuadro(int filaCuadro) {
        this.filaCuadro = filaCuadro;
    }

    public int getColumnaCuadro() {
        return columnaCuadro;
    }

    public void setColumnaCuadro(int columnaCuadro) {
        this.columnaCuadro = columnaCuadro;
    }

    public SquareColor getSquare() {
        return square;
    }

    public void setSquare(SquareColor square) {
        this.square = square;
    }
}
