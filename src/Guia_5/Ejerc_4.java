/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
muestre la traspuesta de la matriz. 
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando
sus filas por columnas (o viceversa).
*/
package Guia_5;

/**
 *
 * @author Inspiron
 */
public class Ejerc_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Matriz");
        int [][] matriz = new int[4][4];
        int [][] matrizB = new int[4][4];
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]= (int) (Math.random()*20);
                matrizB[j][i] = matriz[i][j];
            }
            
        }
        mostrarMatriz(matriz);
        System.out.println("-------------------------");
        mostrarMatriz(matrizB);
        
        
        
        
    }
    
    public static void mostrarMatriz(int [] [] mat){
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(" [ " + mat[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
    
}