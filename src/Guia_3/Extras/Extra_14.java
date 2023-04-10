/*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
cantidad de hijos. Escriba un programa que pida la cantidad de familias
y para cada familia la cantidad de hijos para averiguar la media de edad de 
los hijos de todas las familias.
*/
package Guia_3.Extras;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Extra_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("FAMILIAS");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantas FAMILIAS hay ");
        int familia= sc.nextInt();
        int sumah=0;
        int hijo1=0;
        for (int i = 0; i < familia; i++) {
            System.out.println("Hijos en familia " + (i+1));
             hijo1=sc.nextInt();
             sumah+=hijo1;
        }
        
        System.out.println("En las "+ familia + " familias hay " + sumah+ " hijos");
         
        int suma=0;
        System.out.println("Edades de los "+ sumah +"  hijos  " );   
        for (int i = 0; i < sumah; i++) {
            System.out.println("Hijo " + (i+1));
            int edad= sc.nextInt();
            suma+=edad;
        }
        
        int media= suma / sumah;
        
        System.out.println("La media de edad del los " + sumah + " hijos es " + media);
    }
    
}
