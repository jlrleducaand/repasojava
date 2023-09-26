package org.iesvdm;

import java.util.*;

/**
 * prueba de commit
 *
 */
public class EjercicioB {
    /*    Ejercicio B. Repaso Condicional
    Escribe un programa que calcule el precio final de un producto según su  base imponible (precio antes de impuestos),
    el tipo de IVA aplicado (general, reducido o superreducido) y el código promocional. Los tipos de IVA general,  reducido y
    superreducido son del 21%, 10% y 4% respectivamente. Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que
    significan respectivamente que no se aplica promoción, el precio se reduce a la mitad,    se descuentan 5 euros
    o se descuenta el 5%. El ejercicio se da por bueno si se muestran los valores correctos, aunque los números no estén tabulados.

         Ejemplo:
         Introduzca la base imponible: 25
         Introduzca el tipo de IVA (general, reducido o superreducido): reducido
         Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
         Base imponible        25.00
         IVA (10%)              2.50
         Precio con IVA        27.50
         Cód. promo. (mitad): -13.75
         TOTAL                 13.75
         */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Double baseImponible = 0.0;
        String stIva = "";
        Double ivaValor = 0.0;
        double ivaBase =0.0;
        String promo = "";
        double descuento = 0 ;



        Map<String, Double> ivas = new HashMap<>();
        ivas.put("general", 0.21);
        ivas.put("reducido", 0.10);
        ivas.put("superreducido", 0.04);

        List<String> promos = new ArrayList<>();

        promos.add("nopro");
        promos.add("mitad");
        promos.add("menos5");
        promos.add("5porc");


        System.out.println("Introduzca la Base Imponible :");
        baseImponible = in.nextDouble();

        boolean existe = true;
        while (existe) {
            System.out.println("Introduzca el tipo de Iva: (general, reducido, superreducido)");
            in.nextLine();
            stIva = in.nextLine();

            if (stIva.equalsIgnoreCase("general") || stIva.equalsIgnoreCase("reducido")  || stIva.equalsIgnoreCase("superreducido") ){
                existe = false;
            }

            ivaValor = ivas.get(stIva);
            ivaBase = baseImponible * ivaValor;
        }

        System.out.println("Introduzca el código promocional: (nopro, mitad, menos5, 5porc");
        promo = in.nextLine();

        Integer posPromo;
        posPromo = promos.indexOf(promo);

        switch(posPromo) {

            case 0:
                descuento = 0;
                break;
            case 1:
                descuento = (baseImponible + ivaBase) / 2;
                break;

            case 2:
                descuento = (-5);
                break;

            default:
                if (posPromo < 0) {
                    System.out.println("La promo descrita no existe");
                    descuento = 0;
                }
                break;
            }

            System.out.println("Base Imponible:   " + baseImponible);
            System.out.println("Iva" + ivaValor +"   " + ivaBase);
            System.out.println("Precio con Iva     " + (baseImponible + ivaBase));
            System.out.println("Cod Promo " + promo + "    " + descuento);
            System.out.println("Total    " + (baseImponible + ivaBase - descuento));


    }

}