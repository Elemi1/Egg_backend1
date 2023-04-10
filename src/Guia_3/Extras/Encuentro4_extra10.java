/*Realice un programa para que el usuario adivine el resultado de una multiplicación
}entre dos números generados aleatoriamente entre 0 y 10. 
El programa debe indicar al usuario si su respuesta es o no correcta. 
En caso que la respuesta sea incorrecta se debe permitir 
al usuario ingresar su respuesta nuevamente. 
Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.

 */
package Guia_3.Extras;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro4_extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("MULTIPLICACION ALEATORIA");
        Scanner sc = new Scanner(System.in);
         int num1 = (int) (Math.random()*10);
         int num2 = (int) (Math.random()*10);
          System.out.println("Adivine la respuesta");
          System.out.println("Cuanto es " + num1 + " x " + num2);
           int respuesta = sc.nextInt(); 
           
           
        do {
            int resultado = num1*num2;
           
            
            if (resultado==respuesta) {
                System.out.println("Respuesta correcta");
                break;
            }else{
                System.out.println("INCORRECTO - Indique nuevamente");
                respuesta = sc.nextInt();
            }         
        } while (true);
        
        
    }
    
}
