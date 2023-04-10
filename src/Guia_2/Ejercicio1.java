/*
 * Escribir un programa que pida dos números enteros por teclado y 
 * calcule la suma de los dos. 
 * El programa deberá después mostrar el resultado de la suma
 */
package Guia_2;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("*** Biembenido ***");
        System.out.print("Ingrese 2 numeros entero");
        
        Scanner leer = new Scanner(System.in); // Creamos e|l Scanner
       
        int numEntero1 = leer.nextInt(); // Leer un entero
      
        int numEntero2 = leer.nextInt(); // Leer un entero
        
        int resultado = numEntero1 + numEntero2;
        
        System.out.println("el resultado de la suma es " + resultado);
         
    }
    
}
