package org.iesvdm;

import java.util.*;
import java.util.Scanner;

public class EjercicioD {
    /*
    Ejercicio D. Repaso Bucles
    Realiza un programa que pida primero un número y a continuación un dígito.
    El programa nos debe dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese dígito en  el número introducido.

     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Integer numero = 0;
        String numeroString = "";
        Integer digito = 0;
        int longitud = 0;
        List<Integer> repetidos = new ArrayList<>();

        System.out.println("Introduzca un numero de mas de 5 digitos");
        numero = in.nextInt();
        numeroString = String.valueOf(numero);
        System.out.println("Introduzca un digito");
        char digitoChar = in.next().charAt(0);


        longitud = numero.toString().length();


        for (int i = 0; i < longitud; i++) {
            if (numeroString.charAt(i) == digitoChar){
                repetidos.add(i);
            }
        }
        System.out.println("las posiciones donde encontramos el digito son :" + repetidos.toString());

        }

    }

