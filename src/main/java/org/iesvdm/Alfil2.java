package org.iesvdm;

import java.util.Scanner;

public class Alfil2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        final int TAMANO_TABLERO = 8;

        String posicion="";

        System.out.println("introduce la posicion (por ejemplo d5)");
        posicion = in.nextLine();

        // transformamos a valor numerico los caracteres de la posicion.
        int columna = (int)(posicion.charAt(0)) -96;
        int fila = (int)(posicion.charAt(1) - 48);

        System.out.println("Los posibles movimientos del Alfil son los siguientes:");

        for (int fil = TAMANO_TABLERO; fil <= 1; fil--) {
            for (int col = 0; col < TAMANO_TABLERO ; col++) {
                if ((fil - col) == 1 || (fil + col) == 9){
                    System.out.print((int)fil + "" + (int)col + ",");
                }

            }
        }


    }
}
