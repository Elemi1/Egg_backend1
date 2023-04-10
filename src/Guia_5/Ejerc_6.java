/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y
determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos,
es decir, están entre el 1 y el 9.
*/
package Guia_5;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Ejerc_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("CUADRADO MAGICO");
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];
        int aux = 0;

        System.out.println("Ingrese del 1 al 9 ");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                aux = sc.nextInt();
                if (aux < 1 || aux > 9) {
                    System.out.println("Error: el valor debe estar entre 1 y 9");
                    return; // Salir del programa si hay un valor incorrecto 
                }
                mat[i][j] = aux;
            }

        }

        // Suma de las filas
        int[] sumasFilas = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumasFilas[i] += mat[i][j];
            }
        }

        // Suma de las columnas
        int[] sumasColumnas = new int[3];
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                sumasColumnas[j] += mat[i][j];
            }
        }

        // Suma de las diagonales
        int sumaDiagonal1 = mat[0][0] + mat[1][1] + mat[2][2];
        int sumaDiagonal2 = mat[0][2] + mat[1][1] + mat[2][0];

        // Comprobar si todas las sumas son iguales
        int sumaf = sumasFilas[0];// 15
        int sumac = sumasColumnas[0];
    
        boolean esMagico = true;
        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (sumasFilas[i] == sumaf && sumasColumnas[j] == sumac && sumaDiagonal1 == sumac && sumaDiagonal2 == sumaf) {
                    esMagico = true;
                    break;
                } else {
                    esMagico = false;
                }
            }
        }
        System.out.println("Diagonal 2 = ");
        System.out.println(sumaDiagonal2);
        System.out.println("Diagonal 1 = ");
        System.out.println(sumaDiagonal1);
      
        // Mostrar el resultado
        if (esMagico) {
            System.out.println("¡El cuadrado es mágico!");
        } else {
            System.out.println("El cuadrado NO es mágico");
        }
       
        mostrarMatriz(mat);
    }

    public static void mostrarMatriz(int[][] mat) {

        for (int[] mat1 : mat) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("[" + mat1[j] + "]");
            }
            System.out.println(" ");
        }

    }
}