/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_3.Extras;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de familias: ");
        int nFamilias = sc.nextInt();

        int totalHijos = 0;
        int totalEdades = 0;

        for (int i = 1; i <= nFamilias; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            int nHijos = sc.nextInt();

            for (int j = 1; j <= nHijos; j++) {
                System.out.print("Ingrese la edad del hijo " + j + " de la familia " + i + ": ");
                int edad = sc.nextInt();

                totalHijos++;
                totalEdades += edad;
            }
        }

        if (totalHijos > 0) {
            double mediaEdad = (double) totalEdades / totalHijos;
            System.out.println("La media de edad de los hijos de todas las familias es " + mediaEdad);
        } else {
            System.out.println("No se ingresaron datos de ninguna familia.");
        }

        sc.close();
    }

 }
    
