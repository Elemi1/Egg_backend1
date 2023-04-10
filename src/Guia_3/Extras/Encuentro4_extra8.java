/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, 
la cantidad de números pares y la cantidad de números impares. 
Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
Nota: recordar el uso de la sentencia break.

 */
package Guia_3.Extras;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro4_extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("NUMEROS ENTEROS");
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int contPares = 0;
        int contImpar = 0;
        do {
            System.out.println("Ingrese numeros ,se detiene si el numero es multiplo de 5 ");
            int num = sc.nextInt();
            cont++;
             if (num%2==0) {
                System.out.println("ES NUMERO PAR ");
                 System.out.println("");
                contPares++;
            }else{
                System.out.println("ES NUMERO IMPAR ");
                 System.out.println("");
                contImpar++;
            }
            
            if (num%5==0) {
                System.out.println("Encontramos un multiplo de 5 = " + num);
                System.out.println("Se ingresaron " + cont  + " numeros");
                System.out.println("La cantidad de impares " + contImpar);
                System.out.println("La cantidad de impares " + contPares);
                break;
            }     
        } while (true);{
        
    }
        
        
        
        
    }
    
}
