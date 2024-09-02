/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1.backend;

import com.mycompany.practical1.frontend.CeldaFrontend;
import java.util.logging.Logger;

/**
 *
 * @author rafael-cayax
 */
public class Celda {
    
    private int filaCuadricula;
    private int columnaCuadricula;
    private CeldaFrontend celda;
    private Token token;

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
        if (token != null) {
            celda.colorear(token.getToken().color());
        }
    }
    
    
    
}
