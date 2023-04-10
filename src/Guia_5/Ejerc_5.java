/*Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia 
traspuesta, pero cambiada de signo. 
Es decir, A es antisimétrica si A = -AT. 
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
sus filas por columnas (o viceversa).
*/
package Guia_5;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Ejerc_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("MATRIZ");
        Scanner sc = new Scanner(System.in);
        int [][] matrizA = new int[3][3];
        int [][] matrizB = new int[3][3];
        
        
         for (int i = 0; i < matrizA.length; i++) {
             for (int j = 0; j < matrizA.length; j++) {
                 matrizA[i][j]= sc.nextInt();
                 matrizB[j][i]-= matrizA[i][j];
             }
        }
     
        
          mostrarMatriz(matrizA);
          System.out.println("---------------------");
          mostrarMatriz(matrizB);
    
    }
    
    
    public static void mostrarMatriz(int [][] mat){
        
        for (int[] mat1 : mat) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("[" + mat1[j] + "]");
            }
            System.out.println(" ");
        }
        
    }
    
    public static void llenarMatriz(int [][] mat){
        for (int[] mat1 : mat) {
            for (int j = 0; j < mat.length; j++) {
                mat1[j] = (int) (Math.random()*10);
            }
        
        
    }
}
}