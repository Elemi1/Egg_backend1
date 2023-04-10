/*Realizar un algoritmo que calcule la suma de todos los elementos de un 
vector de tamaño N, con los valores ingresados por el usuario.
 */
package Guia_5;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("VECTOR SUMA");
        Scanner sc = new Scanner(System.in);
        
        int [] vect = new int [10];
        int suma = 0;
        for (int i = 0; i < vect.length; i++) {
            vect[i]= sc.nextInt();
            suma += vect[i];
        }
        
        System.out.println("la suma es " + suma);
    }
    
}
