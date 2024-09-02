/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1.backend;

import com.mycompany.practical1.frontend.MenuEditor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author rafael-cayax
 */
public class Lector {
    private MenuEditor menu;
    private File file;

    public Lector(MenuEditor menu, File file) {
        this.menu = menu;
        this.file = file;
    }

    public void leer() {
        try (FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String linea = bufferedReader.readLine();
            while(linea != null) {
                menu.escribir(linea);
                linea = bufferedReader.readLine();
            }
        } catch (IOException e) {
        }
    }
    
}
