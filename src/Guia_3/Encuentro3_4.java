/*
 * Escriba un programa que lea 20 números. 
Si el número leído es igual a cero se debe salir del bucle y 
mostrar el mensaje "Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.

 */
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int cont = 0;
        int suma = 0;
        do {
            cont++;
        
            System.out.println("Ingrese un numero " + cont);
            int num = leer.nextInt();
            if (num==0){
                System.out.println("Encontramos un cero");
                break;
            }
            if (num>0){
                suma += num;
                
            }
        }
        while(cont<=20);
        System.out.println("LA SUMA DE LOS NUMEROS ES = " + suma );
    }
    
}
