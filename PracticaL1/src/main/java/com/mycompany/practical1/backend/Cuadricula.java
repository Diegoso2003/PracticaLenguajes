
package com.mycompany.practical1.backend;

import com.mycompany.practical1.frontend.CeldaFrontend;


public class Cuadricula {

    private Celda[][] celdas;
    private int filas;
    private int columnas;
    
    public Cuadricula(int fila, int columna) {
        filas = fila;
        columnas = columna;
        celdas = new Celda[fila][columna];
    }
    
    public CeldaFrontend[][] crearCeldas(){
        CeldaFrontend[][] c = new CeldaFrontend[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                celdas[i][j] = new Celda();
                celdas[i][j].setFilaCuadricula(i+1);
                celdas[i][j].setColumnaCuadricula(j+1);
                c[i][j] = new CeldaFrontend();
                c[i][j].setCelda(celdas[i][j]);
            }
        }
        
        return c;
    }
    
}
