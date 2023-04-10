 /*
         * Ejercicio 11
         * Escribir un programa que procese una secuencia de
         * caracteres ingresada por teclado y terminada en punto, y luego
         * codifique la palabra o frase ingresada de la siguiente manera: cada
         * vocal se reemplaza por el carácter que se indica en la tabla y el
         * resto de los caracteres (incluyendo a las vocales acentuadas) se
         * mantienen sin cambios. 
         * aeiou
         * @#$%* 
         * Realice un subprograma que reciba una secuencia de caracteres y
         * retorne la codificación correspondiente. Utilice la estructura
         * “según” para la transformación. Por ejemplo, si el usuario ingresa:
         * Ayer, lunes, salimos a las once y 10.
         * La salida del programa debería ser: 
         * @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
         */
package Guia_4;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    
     
    public static void main(String[] args) {
        System.out.println("Indica una frase");
        
        Scanner sc = new Scanner(System.in);
        
        String fra = sc.nextLine();
       String codificacion = codificar(fra);
        System.out.println("La secuencia codificada es: " + codificacion);
       
 }
    public static String codificar(String secuencia) {
        String codificacion = "";
        for (int i = 0; i < secuencia.length(); i++) {
            char letra = secuencia.charAt(i); // char tipo de DATO CARACTER
            switch (letra) {
                case 'a':
                    codificacion += "@";
                    break;
                case 'e':
                    codificacion += "#";
                    break;
                case 'i':
                    codificacion += "$";
                    break;
                case 'o':
                    codificacion += "%";
                    break;
                case 'u':
                    codificacion += "*";
                    break;
                default:
                    codificacion += letra;
                    break;
            }
        }
        return codificacion;
   }
    
}     