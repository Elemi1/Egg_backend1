/*Escribir un programa que lea un número entero y devuelva el número de dígitos
que componen ese número. Por ejemplo, si introducimos el número 12345,
el programa deberá devolver 5. 
Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
Nota: recordar que las variables de tipo entero truncan los números o resultados.*/
package Guia_3.Extras;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro4_extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("INGRESE UN NUMERO");
        
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        double num2 = sc.nextInt();
        int cont = 0;
        while(num1!=0){
            
            num1=num1/10;
            cont++;
        }
           System.out.println(cont);
        num2=num2/10;
        System.out.println(num2);
    }
    
}
