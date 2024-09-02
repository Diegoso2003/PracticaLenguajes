/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1.backend;

import com.mycompany.practical1.frontend.MenuEditor;
import java.util.List;

/**
 *
 * @author rafael-cayax
 */
public class Menu {
    private Cuadricula cuadricula;
    private MenuEditor menuE;
    private AnalizadorLexico analizador;

    public Menu(String fila, String columna) throws CuadriculaException {
        menuE = new MenuEditor(this);
        crearCuadricula(fila, columna);
        analizador = new AnalizadorLexico();
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
    
    public void iniciarAnalisis(String texto){
        limpiarCuadricula();
        llenarCuadricula(analizador.analizar(texto));
    }

    private void limpiarCuadricula() {
        cuadricula.limpiar();
    }

    private void llenarCuadricula(List<Token> listaDeTokens) {
        if (listaDeTokens.size() > 0) {
            cuadricula.llenar(listaDeTokens);
        }
    }

    public void escribirReporte() {
        cuadricula.mostrarReporte();
    }
    
}
