/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utadeo.ejemplo;

import java.util.Scanner;

/**
 * @author Sergio Andres
 */
public class App {

    public static void main(String[] args) {

        /*
        new Ejemplo("Hilo 1: ").start();
        new Ejemplo("Hilo 2: ").start();
         */

        int numero;

        /**
         * Faltaria intentarlo con el BufferedReader
         */
        System.out.println("Ingresa un numero: ");
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();

        EjercicioUno ejercicioUno = new EjercicioUno(numero);
        EjercicioUno ejercicioDos = new EjercicioUno(numero);
        EjercicioUno ejercicioTres = new EjercicioUno(numero);


        /**
         * Verificar el try-catch
         */
        try {
            ejercicioUno.start();
            ejercicioDos.start();
            ejercicioTres.start();

        } catch (ArithmeticException a) {
            System.out.println("El numero debe ser mayor a cero");

        }

    }

}
