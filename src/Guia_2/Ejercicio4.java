/*
 * Dada una cantidad de grados centígrados se debe mostrar su 
equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */
package Guia_2;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("**  Veamos los grados FAHRENHEIT");
        
        System.out.println("Dime los grados centigrados");
        
        Scanner leer = new Scanner(System.in);
        
        int c = leer.nextInt() ;
        double F = 32 + (9 * c / 5); 
        
        System.out.println("Los Fahrenhet son "  + F);
        
        
        
        
        
        
    }
    
}
