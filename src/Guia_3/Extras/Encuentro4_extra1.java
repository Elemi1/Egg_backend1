/*Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

 */
package Guia_3.Extras;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro4_extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Dias y horas");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Indique los minutos");
         int min = sc.nextInt();
         
         int dia= min/1440;
         int horas= min/60;
         
         System.out.println("los minutos " + min + " son " + dia + "dias");
         System.out.println("los minutos " + min + " son " + horas + "horas" );
    }
    
}
