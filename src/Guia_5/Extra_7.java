/*Realizar un programa que complete un vector con los N primeros números de la 
sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de 
los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. 
Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función 
que reciba como parámetro el valor de “n” y que calcule la serie hasta llegar 
a ese valor.
*/
package Guia_5;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Extra_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Fibonacci");
        Scanner sc = new Scanner(System.in);
        int [] fibo = new int [10];
        int [] fibosuma = new int [10];
        int suma = 1;
        int num1 = 0;
        int num2 = 1;
        
        
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println(suma);
              //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;
            fibo[i] = num2 ;
        }
       
      
        
        for (int i = 0; i < 10; i++) {
            System.out.println("[" + fibo[i] + "]");
        
            
        }
        
        
        
    }
    
}
