/*
 * Escribir un programa que lea un número entero por teclado y 
muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

 */
package Guia_2;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("**  Vamos con dobles , triples y Raiz");
        
        Scanner leer = new Scanner(System.in);
        
        int n = leer.nextInt();
        
        
        
        System.out.println("El doble de tu numero es " + n * 2 );
         System.out.println("El triple de tu numero es " + n * 3 );
          System.out.println("La raiz de tu numero es " + Math.sqrt(n) );
        
    }    
}
