/*Escriba un programa en el cual se ingrese un valor límite positivo,
y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro4_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un limite , cuando la suma supere termina");
        
        Scanner sc = new Scanner(System.in);
        
       // int num = sc.nextInt();
        
        int limite = sc.nextInt();
        int suma = 0 ;
        int num;
        System.out.println("Ingreso un limite de " + limite );
        
        do{
             System.out.println("Ingrese un numero");
             num = sc.nextInt();
             suma= num + suma;
             
        } while(suma < limite);{
          System.out.println("Limite excedido supero la suma " + suma );
    }
       
       
        
        
    }
    
}
