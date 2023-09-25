package org.iesvdm;

import java.util.Scanner;

public class EjercicioE {
    /*
    Ejercicio E. Repaso Bucles
        Realiza un programa que pinte una pirámide maya.
        Por los lados, se trata de una pirámide normal y corriente.
        Por el centro se van pintando líneas de asteriscos de forma alterna (empezando por la superior): la primera se pinta, la segunda no, la tercera sí, la cuarta no, etc.
        La terraza de la pirámide siempre tiene 6 asteriscos, por tanto, las líneas centrales que se añaden a la pirámide normal tienen 4 asteriscos.
        El programa pedirá la altura. Se supone que el usuario introducirá un número entero mayor o igual a 3; no es necesario comprobar los datos de entrada.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int alt = 3;
        //int fil, col;
        boolean alturaValidada = true;

        // Pedir la altura de la pirámide al usuario
        while (alturaValidada) {
            System.out.println("Introduce la altura de la pirámide que sea mayor o igual de 3 : ");
            alt = in.nextInt();
            alturaValidada = !(alt >= 3);
        }

        //Bucle para las filas
        for (int fil = 1; fil <=alt; fil++) {


            // el primer bucle gestiona los espacios en blanco
            //va desde el numero de fila
            for (int col = fil; col < alt ; col++) {
                System.out.print(" ");
            }
            // segundo triangulo de *
            for (int col = alt-fil; col < alt; col++) {
                System.out.print("*");
            }
            // el centro es como un cuadrado
            for (int i= 0; i<4; i++) {
                if (fil%2 != 0) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            // la ultima piramide
            for (int col = 2; col <= fil+1; col++) {
                System.out.print("*");
            }
            System.out.println();

        }


        in.close();
    }

}

