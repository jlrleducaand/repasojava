package org.iesvdm;

import java.util.Scanner;

public class EjercicioF {

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

        // Recorremos el tablero

        for(int fil = TAMANO_TABLERO; fil >= 1; fil--) {
            for(int col = 1; col <= TAMANO_TABLERO; col++) {
                if ((Math.abs(fila - fil) == Math.abs(columna - col))
                        && (!((fila == fil) && (columna == col)))) {
                    System.out.print((char)(col + 96) + "" + fila + " ");
                }
            }
        }

    }
}
