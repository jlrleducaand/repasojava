package org.iesvdm;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EjercicioA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean seguir = true;
        double nota1 = 0;
        while (seguir) {
            try {
                System.out.println("introduce la nota del primer control:");
                nota1 = (scanner.nextDouble());
                seguir = !(nota1 >= 0 && nota1 <= 10);
            } catch (Exception e) {
                System.out.println("el numero tiene que estar comprendido entre 0 y 10:");
            }
        }
        seguir = true;
        double nota2 = 0;

        while (seguir) {
            try {
                System.out.println("introduce la nota del segundo control");
                nota2 = scanner.nextDouble();
                seguir = !(nota2 >= 0 && nota2 <= 10);

            } catch (Exception e) {
                System.out.println("introduce la nota del segundo control (numero entre 0 y 10");
            }
        }

        double notamedia = (nota1 + nota2) / 2;

        if (notamedia >= 5.0) {
            System.out.println("Tu nota media de porogramacion ha sido: " + notamedia);

        } else {
            boolean apto_noapto = true;
            String Es_apto = "";
            scanner.nextLine();


            while (apto_noapto) {

                System.out.println("¿Cual ha sido el resultado de La recuperacion?  Apto / No Apto");

                Es_apto = scanner.nextLine();

                if (Es_apto.equalsIgnoreCase("apto")) {

                    System.out.println("Tu nota de programacion es 5");

                } else if (Es_apto.equalsIgnoreCase("No Apto")) {
                    System.out.println("Tu nota de Programacion es: " + notamedia);
                } else {
                    System.out.println("Parece que hubo un error en la respuesta,  Repitala");
                }
                apto_noapto = !(Es_apto.equalsIgnoreCase("apto") || Es_apto.equalsIgnoreCase("no apto"));

            }
        }
    }
}
