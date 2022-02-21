/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utadeo.ejemplo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author usuario1
 */
public class App {
    
    public static void main(String[] args) {
        new Ejemplo("Hilo 1: ").start();
        new Ejemplo("Hilo 2: ").start();

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));


    }
    
}
