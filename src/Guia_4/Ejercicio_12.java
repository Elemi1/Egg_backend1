/*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario
, validando que el primer número múltiplo del segundo e 
imprima si el primer número es múltiplo del segundo, sino informe que no lo son.

 */
package Guia_4;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println("Ingrese dos numeros");
        Scanner sc = new Scanner(System.in);
        
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        
        EsMultiplo(numero1,numero2);


    }
    public static void EsMultiplo(int num1,int num2){
        
        if (num1 % num2 == 0) {
            System.out.println("El numero "+ num1 + " es multiplo del numero "+ num2); 
        }else{
            System.out.println("los numeros no son multiplos");
        }
    }
    
    
    
    
}
