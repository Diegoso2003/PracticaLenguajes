package com.mycompany.practical1.backend;

import com.mycompany.practical1.backend.enums.Tokens;
import com.mycompany.practical1.frontend.CeldaFrontend;
import com.mycompany.practical1.frontend.ReportesFrontend;
import java.util.ArrayList;
import java.util.List;

public class Cuadricula {

    private Celda[][] celdas;
    private int filas;
    private int columnas;
    private int simples;
    private List<Token> errores;
    private List<SquareColor> squaresEspeciales;

    public Cuadricula(int fila, int columna) {
        filas = fila;
        columnas = columna;
        celdas = new Celda[fila][columna];
    }

    public CeldaFrontend[][] crearCeldas() {
        CeldaFrontend[][] c = new CeldaFrontend[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                celdas[i][j] = new Celda();
                celdas[i][j].setFilaCuadricula(i + 1);
                celdas[i][j].setColumnaCuadricula(j + 1);
                c[i][j] = new CeldaFrontend();
                c[i][j].setCelda(celdas[i][j]);
                celdas[i][j].setCelda(c[i][j]);
            }
        }

        return c;
    }

    public void limpiar() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                celdas[i][j].limpiar();
            }
        }
    }

    public void llenar(List<Token> listaDeTokens) {
        errores = new ArrayList<>();
        verificarErrores(listaDeTokens);
        int indice = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                Token token2 = null;
                if (indice == listaDeTokens.size()) {
                    colocarColor();
                    return;
                }
                do {
                    token2 = listaDeTokens.get(indice);
                    if (token2.getToken() == Tokens.ERROR) {
                        errores.add(token2);
                    } else if (token2.getToken() != Tokens.ESPECIAL) {
                        celdas[i][j].setToken(token2);
                    }
                    indice++;
                } while ((token2.getToken() == Tokens.ERROR || token2.getToken() == Tokens.ESPECIAL) && indice < listaDeTokens.size());
            }
        }
        colocarColor();
    }

    private void colocarColor() {
        if (squaresEspeciales.size() > 0) {
            for (SquareColor c : squaresEspeciales) {
                celdas[c.getFila()][c.getColumna()].setColorSquare(c.getColor());
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                celdas[i][j].colorear();
            }
        }
    }

    public void mostrarReporte() {
        ReportesFrontend r = new ReportesFrontend();
        r.mostrar(celdas);
        r.setVisible(true);
    }


    private void verificarErrores(List<Token> listaDeTokens) {
        squaresEspeciales = new ArrayList<>();
        for (Token t : listaDeTokens) {
            if (t.getToken() == Tokens.ESPECIAL) {
                try {
                    Celda celda = celdas[t.getSquare().getFila()][t.getSquare().getColumna()];
                    squaresEspeciales.add(t.getSquare());
                } catch (ArrayIndexOutOfBoundsException e) {
                    t.setToken(Tokens.ERROR);
                }
            }
        }
    }
}
