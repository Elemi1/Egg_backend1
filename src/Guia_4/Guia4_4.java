/*Crea una aplicación que nos pida un número por teclado 
y con una función se lo pasamos por parámetro para que nos indique 
si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package Guia_4;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Guia4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("DIGAME UN NUMERO, VEREMOS SI ES PRIMO");
        
        Scanner sc = new Scanner(System.in);
     
         int num = sc.nextInt();
        
        if (primo(num)) {
            System.out.println(num + " es primo.");
        } else {
            System.out.println(num + " no es primo.");
        }
       
        
    }
    public static Boolean primo(int num){
        
         
   if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
        
    }
}
