/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("** Dame 2 numero ** ");
        
        Scanner leer = new Scanner(System.in);
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25  ){
            System.out.println("\"Ambos son mayores a 25");
        }else if(num2 > 25 ) {
            System.out.println("Tu segundo numero es mayor que 25");
        }else if(num1 > 25 ){
             System.out.println("Tu primer numero es mayor que 25");
        }
        
        
                
        
    }
    
}
