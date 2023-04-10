/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”
, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.

 */
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("BUENAS VAMOS CON FRASES DE 8 CARACTERES");
        
        Scanner sc = new Scanner(System.in);
        
        String frase = sc.nextLine();
        
        if (frase.length()==8) {
            System.out.println("La frase es correcta de " + frase.length() + " caracteres");
            
        }else{
            System.out.println("Incorrecto los caracteres son " + frase.length());
        }
        
    }
    
}
