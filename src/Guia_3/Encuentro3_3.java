/*
 *Escriba un programa que valide si una nota está entre 0 y 10, 
sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Notas entre 1 y 10");
        Scanner leer = new Scanner(System.in);
          int nota = leer.nextInt(); 
        
         while(nota <0 || nota >10) {
        
        System.out.println("Nota incorrecta. Ingrese nuevamente la nota");
        nota = leer.nextInt();
        
        }
      System.out.println("Nota es correcta");
       }  
      }

