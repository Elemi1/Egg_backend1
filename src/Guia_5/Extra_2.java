/*Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre 
los elementos).
*/
package Guia_5;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("VECTOR DUBLICADO");
        Scanner sc = new Scanner(System.in);
   
        int[] vect1 = new int[3];
        int[] vect2 = new int[3];

        for (int i = 0; i < 3; i++) {
            vect1[i] = sc.nextInt();
        }
        mostrarVector(vect1);
        for (int i = 0; i < 3; i++) {
            vect2[i] = sc.nextInt();
        }
        mostrarVector(vect2);
        for (int i = 0; i < 3; i++) {
            if (vect1[i] != vect2[i]) {
                System.out.println("Desigual");
                return;

            } else {
                System.out.println("igual");
                return;
            }
        }

    }

    public static void mostrarVector(int[] mat) {

        for (int j = 0; j < mat.length; j++) {
            System.out.print("[" + mat[j] + "]");
        }
        System.out.println(" ");
    }

}
