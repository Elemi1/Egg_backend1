/*Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
y le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
*/
package Guia_5;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Ejerc_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("VECTOR");
        Scanner sc = new Scanner(System.in);
        int [] num = new int[20];
        
        for (int i = 0; i < num.length; i++) {
            num[i]= (int) (Math.random()*20);
            System.out.print(num[i]+" ");
            
        }
        System.out.println("");
        System.out.print("Indique un numero");
        int num2 = sc.nextInt();
        
        for (int i = 0; i < num.length ; i++) {
            if (num2==num[i]) {
            System.out.println("El numero " + num2 + " se repite en posicion "+ (i +1));
            
            }
                
            
        }
        
       
    
    
    }
    }
    

