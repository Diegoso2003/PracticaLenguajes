/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1.backend;

import com.mycompany.practical1.backend.enums.Tokens;
import com.mycompany.practical1.frontend.CeldaFrontend;

/**
 *
 * @author rafael-cayax
 */
public class Celda {
    
    private int filaCuadricula;
    private int columnaCuadricula;
    private CeldaFrontend celda;
    private Token token;
    private String colorSquare;

    public int getFilaCuadricula() {
        return filaCuadricula;
    }

    public void setFilaCuadricula(int filaCuadricula) {
        this.filaCuadricula = filaCuadricula;
    }

    public int getColumnaCuadricula() {
        return columnaCuadricula;
    }

    public void setColumnaCuadricula(int columnaCuadricula) {
        this.columnaCuadricula = columnaCuadricula;
    }

    public CeldaFrontend getCelda() {
        return celda;
    }

    public void setCelda(CeldaFrontend celda) {
        this.celda = celda;
    }
    
    public void limpiar(){
        colorSquare = null;
        token = null;
        celda.limpiar();
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
        token.setColumnaCuadro(columnaCuadricula);
        token.setFilaCuadro(filaCuadricula);
    }

    public void colorear() {
        if (colorSquare != null) {
            celda.colorear(colorSquare);
        } else if (token != null) {
            if (token.getToken() == Tokens.ESPECIAL_SIMPLE) {
                celda.colorear(token.getSquare().getColor());
            } else{
                celda.colorear(token.getToken().color());
            }
        }
        celda.setToken(token != null && token.getToken() != Tokens.ESPECIAL_SIMPLE);
    }

    public String getColorSquare() {
        return colorSquare;
    }

    public void setColorSquare(String colorSquare) {
        this.colorSquare = colorSquare;
    }
}
