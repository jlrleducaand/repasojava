package org.iesvdm;

import java.util.Scanner;

public class EjercicioC {
    /*
    Ejercicio C. Repaso Bucles
    Realiza un programa que vaya pidiendo números hasta que se introduzca un número negativo y  nos diga cuántos números se han introducido,
    la media de los impares y el mayor de los pares.
    El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean pidiendo = true;
        int cont = 0;
        int valor = 0;
        int sumaValores = 0;
        double mediaValores = 0.0;

        while (pidiendo) {

            System.out.println("Introduzce un numero: ");
            valor = in.nextInt();
            if (valor > 0) {
                sumaValores += valor;
                cont++;
                mediaValores = sumaValores/cont;
            } else {
                pidiendo = false;
                System.out.println("Suma total = " + sumaValores);
                System.out.println("Media Valores = " + mediaValores);
                System.out.println("cont Numeros = " + cont);
            }
        }
    }
}
