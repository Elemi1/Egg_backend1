/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito
, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/
package Guia_5;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Ejerc_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("VECTOR");
           
        int [] num = new int[10];
        int [] cont = new int[5] ;
        
        for (int i = 0; i < num.length; i++) {
            num[i]= (int) (Math.random()*10000);
            int digitos = contarDigitos(num[i]);
            System.out.println("[" + num[i] + "]");
            
            if (digitos<=5) {
                cont[digitos-1]++;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Cantidad de números con " + (i + 1) + " dígito(s): " + cont[i]);
        }
        
        
        
    
       
    }
    public static int contarDigitos(int numero) {
        int digitos = 0;
        while (numero != 0) {
            numero /= 10;
            digitos++;
        }
        return digitos;    
}
}            
        
        
        
        
    
    

