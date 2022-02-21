/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utadeo.ejemplo;

/**
 * @author usuario1
 */
public class EjercicioUno {

    int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int fibonacciN() {

        int n1 = 0;
        int n2 = 1;
        int n3;

        System.out.print(n1 + " " + n2);

        for (int i = 2; i < numero; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        return getNumero();

    }

}
