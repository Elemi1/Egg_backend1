/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.

 */
package Guia_3.Extras;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro4_extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("****   VOCALES  ****");
        
        
        Scanner sc = new Scanner(System.in);
        String vocal;
        Boolean bandera= true;
        do {
            System.out.println("Ingrese letras y veremos si son vocales");
            vocal = sc.nextLine().toUpperCase();
            
            if (vocal.equals("A") || vocal.equals("E") || vocal.equals("I") ||vocal.equals("O")||vocal.equals("U") ) {
                System.out.println("**** ES VOCAL ****");
                break;
            }else{
                System.out.println("Sigue intentado");
            }
            System.out.println(" ");
        } while (bandera);
        
    }
    
}
