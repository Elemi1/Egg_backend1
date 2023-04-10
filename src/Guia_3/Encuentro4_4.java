/*Escriba un programa que pida una frase o palabra y 
valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Substring y equals() de Java.
 */
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Dame una frase, si la primera letra es A sera correcto");
        
        Scanner sc = new Scanner(System.in);
        
        String frase = sc.nextLine();
       
        
        if (frase.substring(0,1).equals("a")) {      
            System.out.println("La frase contiene la letra a");
            
        }else{
            System.out.println("No contiene la letra");
        }
        
    }
    
}
