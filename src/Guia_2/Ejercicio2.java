/*
 * Escribir un programa que pida tu nombre, 
 *  lo guarde en una variable y lo muestre por pantalla.

 */
package Guia_2;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre");
        
        Scanner leer = new Scanner(System.in);
        
         String cadena = leer.nextLine();
       
        System.out.println("Tu nombre es " + cadena);
               
         
    }
    
}
