
package com.mycompany.practical1.backend;


public class Cuadricula {
    private int columnas;
    private int filas;
    
    public void crearCuadricula(String fila, String columna) throws CuadriculaException{
        try {
            filas = Integer.valueOf(fila);
            columnas = Integer.valueOf(columna);
            if (filas <= 0 || columnas <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException ex) {
            throw new CuadriculaException("Porfavor Ingrese un numero valido");
        }
    }
}
