/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1.backend;

/**
 *
 * @author rafael-cayax
 */
public class Menu {
    private Cuadricula cuadricula;

    public Menu(String fila, String columna) throws CuadriculaException {
        cuadricula = new Cuadricula();
        cuadricula.crearCuadricula(fila, columna);
    }
    
}
