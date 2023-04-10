/*
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
e imprima el número ingresado seguido de tantos asteriscos como indique su valor.
Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
      System.out.println("Escriba 4 numeros");
      
      int n1 = leer.nextInt();
      int n2 = leer.nextInt();
      int n3 = leer.nextInt();
      int n4 = leer.nextInt();
      
        
      System.out.print(n1);
      if(n1<20){
          
      
        for (int i = 0; i < n1; i++) {
            System.out.print(" * ");
           }
        
         System.out.println("");
         System.out.print(n2);
         
        for (int i = 0; i < n2; i++) {
            System.out.print(" * ");
           }
        
         System.out.println("");
         System.out.print(n3);
         
        for (int i = 0; i < n3; i++) {
            System.out.print(" * ");
           }
        System.out.println("");
         System.out.print(n4);
         
        for (int i = 0; i < n4; i++) {
            System.out.print(" * ");
           }
      } else {
          System.out.println("NUmero fuera de rango");
      }
          
                
       
 
  }
}
