/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*        *
*        *
* * * *

 */
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro4_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Dibueje un cuadrado con * ");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Indique un numero");
        
        int num = sc.nextInt();
        
       
         for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(j==0||i==num-1||i==0 || j==num-1){
            System.out.print("*");
            }else{
                  System.out.print(" ");  
                }
                 
        }
         System.out.println("");
   
       
            
   
         }   
      
    }
    
}
