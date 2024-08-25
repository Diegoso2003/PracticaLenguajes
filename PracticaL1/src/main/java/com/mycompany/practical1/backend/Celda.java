/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1.backend;

import java.util.logging.Logger;

/**
 *
 * @author rafael-cayax
 */
public class Celda {
    
    private int filaCuadricula;
    private int columnaCuadricula;
    private int columnaEditor;
    private int filaEditor;

    public int getColumnaEditor() {
        return columnaEditor;
    }

    public void setColumnaEditor(int columnaEditor) {
        this.columnaEditor = columnaEditor;
    }

    public int getFilaEditor() {
        return filaEditor;
    }

    public void setFilaEditor(int filaEditor) {
        this.filaEditor = filaEditor;
    }

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
    
}
