/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1.backend;

import com.mycompany.practical1.frontend.MenuEditor;

/**
 *
 * @author rafael-cayax
 */
public class Menu {
    private Cuadricula cuadricula;
    private MenuEditor menuE;

    public Menu(String fila, String columna) throws CuadriculaException {
        menuE = new MenuEditor();
        crearCuadricula(fila, columna);
    }
    
    private void crearCuadricula(String fila, String columna) throws CuadriculaException{
        int filas;
        int columnas;
        try {
            filas = Integer.valueOf(fila);
            columnas = Integer.valueOf(columna);
            cuadricula = new Cuadricula(filas, columnas);
            menuE.definirCuadricula(filas, columnas);
            crearCeldas();
            if (filas <= 0 || columnas <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException ex) {
            throw new CuadriculaException("Porfavor Ingrese un numero valido");
        }
    }

    private void crearCeldas() {
        menuE.llenarCuadricula(cuadricula.crearCeldas());
        menuE.setVisible(true);
    }
    
}
