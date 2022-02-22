/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utadeo.ejemplo;

/**
 * @author Sergio Andres
 */
public class EjercicioUno {

    int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Falta verificar porque salen numeros negativos
     * cuando el usuario ingresa un numero muy alto.
     */
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

    /**
     * Hay que tener en cuenta que estoy iniciando el contador en 1,
     * esto debido a que no se puede hacer una comparacion con el cero,
     * a su vez la condicional se ve afectada por este caracteristica,
     * la cual soluciono agregando mayor o igual en vez de solo mayor
     */
    public int primosN() {

        for (int i = 1; numero >= i; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
        }
        return getNumero();

    }

}
