/*Crear una función rellene un vector con números aleatorios, 
pasándole un arreglo por parámetro. 
Después haremos otra función o procedimiento que imprima el vector.
*/
package Guia_5;

import java.util.Random;

/**
 *
 * @author Inspiron
 */
public class Extra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("FUNCION RELLENAR VECTOR");
        int [] vect = new int [10];
        
        
        rellenaVector(vect);
        mostrarVector(vect);
        
    }
    
    
    
    public static int rellenaVector(int [] v){
        Random random = new Random();
        int n = random.nextInt(100);
        for (int i = 0; i < v.length; i++) {
            
            v[i]= n;
          
        }
        return n;
    }
    
    public static void mostrarVector(int[] mat) {

        for (int j = 0; j < mat.length; j++) {
            System.out.print("[" + mat[j] + "]");
        }
        System.out.println(" ");
    }
}
