/*
Escribir un programa que pida una frase 
y la muestre toda en mayúsculas y después toda en minúsculas. 

 */
package Guia_2;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Inspiron
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("** Bienbenido escibra una frase");
        
        Scanner leer = new Scanner(System.in);
        
        String frase = leer.nextLine();
        
       // frase = toUpperCase(frase); 
       
        System.out.println("Tu frase en mayusculas es = " + toUpperCase(frase));
        
        System.out.println("Tu frase en minusculas es = " + toLowerCase(frase));
        
    }
    
}
