/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.utadeo.ejemplo;

/**
 * @author Sergio Andres
 */
public class EjercicioUno extends Thread {

    int numero;

    public EjercicioUno(int numero) {
        this.numero = numero;
    }

    public void run() {

        /**
         * Falta verificar porque salen numeros negativos
         * cuando el usuario ingresa un numero muy alto.
         */
        int n1 = 0;
        int n2 = 1;
        int n3;

        System.out.print(" F:" + n1 + " F:" + n2);

        for (int i = 2; i < numero; i++) {
            n3 = n1 + n2;
            System.out.print(" F:" + n3);
            n1 = n2;
            n2 = n3;
        }

        /**
         * Hay que tener en cuenta que estoy iniciando el contador en 1,
         * esto debido a que no se puede hacer una comparacion con el cero,
         * a su vez la condicional se ve afectada por este caracteristica,
         * la cual soluciono agregando mayor o igual en vez de solo mayor.
         */
        for (int i = 1; numero >= i; i++) {
            if (numero % i == 0) {
                System.out.print(" P:" + i);
            }
        }

        /**
         * El metodo funciona, en teoria deberia realizar la multiplicacion
         * de manera contraria, pero no lo hace. ¿Porque no lo hace?
         * <p>
         * Con valores mayores a 12 el metodo deja de funcionar correctamente
         * ¿Porque?
         */
        int factorial = 1;

        for (int i = 1; numero >= i; i++) {

            /**
             * Al reemplazar i por numero
             */
            factorial = factorial * i;

            /**
             * y agregar la siguiente linea, realiza el procedimiento
             * contrario del contrario.
             * numero = numero - 1;
             */

        }
        System.out.print(" Fc:" + factorial);

    }

}
