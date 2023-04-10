/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 
y se muestre su equivalente en romano.
 */
package Guia_3.Extras;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro4_extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*****    NUMERO ROMANOS   *****");
        
        Scanner sc = new Scanner(System.in);
        Boolean bandera = true;
        int num;
        do {
            
            System.out.println("Ingrese numeros del 1 al 10 ");
            num = sc.nextInt();
            
            if (num>=1 && num<=10) {
               switch(num){
                   case 1:
                       System.out.println("El numero "+ num + " Romano es : I ");
                     break;
                   case 2:
                       System.out.println("El numero "+ num + " Romano es : II ");
                     break;
                   case 3:
                       System.out.println("El numero "+ num + " Romano es : III ");
                     break; 
                   case 4:
                       System.out.println("El numero "+ num + " Romano es : IV ");
                     break; 
                   case 5:
                       System.out.println("El numero "+ num + " Romano es : V ");
                     break; 
                   case 6:
                       System.out.println("El numero "+ num + " Romano es : VI ");
                     break; 
                   case 7:
                       System.out.println("El numero "+ num + " Romano es : VII ");
                     break; 
                   case 8:
                       System.out.println("El numero "+ num + " Romano es : VIII ");
                     break; 
                   case 9:
                       System.out.println("El numero "+ num + " Romano es : IX ");
                     break; 
                   case 10:
                       System.out.println("El numero "+ num + " Romano es : X ");
                     break; 
               }
            }else{
                System.out.println("El " + num + " Esta Fuera de rango");
                bandera = false;
            }
            
            
        } while (bandera);{
        System.out.println("Se termino el programa, GRACIAS");
    }
        
        
    }
    
}
