/*Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos.
*/
package Guia_5;

/**
 *
 * @author Inspiron
 */
public class Extra_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("MATRIZ SUMA ");
        int [][] matriz = new int [3][3];
        int resul = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random()*10);
                resul += matriz[i][j];
            }
        }
        mostrarMatriz(matriz);
        System.out.println("la suma de la matriz es = " + resul);
        
        
    }
    public static void mostrarMatriz(int [][] m ){
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print("[" + m[i][j] + "]");
            }
            System.out.println(" ");
        }  
        
    }
}
