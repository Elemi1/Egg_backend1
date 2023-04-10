/*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.
*/
package Guia_3.Extras;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro4_extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*** ALTURA DE PERSONAS ***");
        
        Scanner sc = new Scanner(System.in);
        
        int pers,cont=0 ;
        double altura =0 , sumaAltura=0 , sumaAltMenor = 0;
        
        System.out.println("Ingrese la cantidad de personas");
            pers = sc.nextInt();
            
        for (int i = 0; i < pers; i++) {
            System.out.println("Ingrese la estatura de la personas #" + i + " en metros: ");
             altura = sc.nextDouble();
             sumaAltura += altura;
        
            }    
         double promedioMenor = 0;  
         if (altura<1.6) {
            sumaAltMenor += altura;
            promedioMenor = sumaAltMenor / altura ;
            cont++;
            }
         double promedio = 0;
        
         if (altura>0) {
            promedio = sumaAltura / altura;
                    
            }
    
        System.out.println("El promedio general en "+ pers + " es " + promedio);
        System.out.println("El promedio de alturas menores" + cont + " a 1.6 es " + promedioMenor);
        
        
    }
    
}
