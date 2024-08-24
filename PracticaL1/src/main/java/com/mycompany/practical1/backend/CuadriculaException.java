/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.mycompany.practical1.backend;

/**
 *
 * @author rafael-cayax
 */
public class CuadriculaException extends Exception{

    /**
     * Creates a new instance of <code>CuadriculaException</code> without detail
     * message.
     */
    public CuadriculaException() {
    }

    /**
     * Constructs an instance of <code>CuadriculaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CuadriculaException(String msg) {
        super(msg);
    }
}
