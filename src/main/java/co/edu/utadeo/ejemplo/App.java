/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utadeo.ejemplo;

import java.util.Scanner;

/**
 * @author usuario1
 */
public class App {

    public static void main(String[] args) {

        /*
        new Ejemplo("Hilo 1: ").start();
        new Ejemplo("Hilo 2: ").start();
         */

        int numero;

        System.out.println("Ingresa un numero: ");
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();

        EjercicioUno ejercicioUno = new EjercicioUno();
        ejercicioUno.setNumero(numero);

        ejercicioUno.fibonacciN();











    }

}
