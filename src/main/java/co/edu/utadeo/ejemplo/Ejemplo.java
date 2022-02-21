/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utadeo.ejemplo;

/**
 *
 * @author usuario1
 */
public class Ejemplo extends Thread {

    public Ejemplo(String str) {
        super(str);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 1000; k++) {
                    for (int n = 0; n < 1000; n++) {
                        System.out.println("Hilo: " + getName() + " imprime: " + i);
                    }
                }
            }
        }
    }

}
