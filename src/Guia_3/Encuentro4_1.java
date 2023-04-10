/*
 * Crear un programa que dado un número determine si es par o impar.

 */
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido, veamos pares o impares");
        
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("Ingrese un numero entero");
        int num = sc.nextInt();
        
        if (num % 2 == 0){
            System.out.println("El numero " + num + " es par ");
            
        }else{
            System.out.println("El numero " + num + " Es impar ");
        }
        
    }
    
}
