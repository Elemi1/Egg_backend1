/*Realice un programa que calcule y visualice el valor máximo, 
el valor mínimo y el promedio de n números (n>0). 
El valor de n se solicitará al principio del programa y 
los números serán introducidos por el usuario. Realice dos versiones del programa, 
una usando el bucle “while” y otra con el bucle “do - while”.

 */
package Guia_3.Extras;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro4_extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("INGRESE UN NUMERO");
      
        Scanner sc = new Scanner(System.in);
          int num1 = sc.nextInt();
          int num2 = 0;
        
        int promedio =0;
        int  min=999999 , suma=0;
        int max=0 ;
        System.out.println("Escriba los " +num1 + " numeros");
        while(num2<num1){
            int num3 = sc.nextInt();
            num2++;
            suma += num3;
            
            promedio = suma/num1;
            
            max = Math.max(max, num3);
            min = Math.min(min, num3);
        }
        System.out.println("la suma es  " + suma );
        System.out.println("el promedio es  " + promedio );
        System.out.println("El maximo es " + max );
        System.out.println("El minimo es " + min );
        
        
        
        
        
        
    }
    
}
