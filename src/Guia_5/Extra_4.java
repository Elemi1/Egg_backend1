/*Los profesores del curso de programación de Egg necesitan llevar un registro 
de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de 
aprobados y desaprobados. 
Durante el período de cursado cada alumno obtiene 
4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
Al final del programa los profesores necesitan obtener por pantalla la cantidad
de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos 
con promedio mayor o igual al 7 de sus notas del curso.
*/
package Guia_5;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Extra_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("REGISTRO EGG");
        Scanner sc = new Scanner(System.in);
    
        double [][] egg = new double[10][5]; //10 filas - 5 columnas
       
         
        int aprobo=0;
        int noaprobo=0;
        
        int cont1 = 0;
        int cont2 = 0;
      

        System.out.println(" Notas = ");

     
            for (int i = 0; i < 10; i++) {
           //System.out.print("Primer trabajo práctico evaluativo: ");
            egg [i][0] = (int) (Math.random() * 10 + 1);
            //System.out.print("Segundo trabajo práctico evaluativo: ");
            egg [i][1] = (int) (Math.random() * 10 + 1);
            //System.out.print("Primer Integrador: ");
            egg [i][2] = (int) (Math.random() * 10 + 1);
            //System.out.print("Segundo Integrador: ");
            egg [i][3] = (int) (Math.random() * 10 + 1);
        
        }
      
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + egg[i][j] + "]");
            }
        }
        System.out.println("");
        System.out.println("-----------------------------------");
        
        double nota1 = 0.10;//Primer trabajo práctico evaluativo 10%
        double nota2 = 0.15;//Segundo trabajo práctico evaluativo 15%
        double nota3 = 0.25;//Primer Integrador 25%
        double nota4 = 0.50;//Segundo integrador 50%
        for (int i = 0; i < 10; i++) {
            nota1 = egg[i][0] * 0.10;
            nota2 = egg[i][1] * 0.15;
            nota3 = egg[i][2] * 0.25;
            nota4 = egg[i][3] * 0.50;
            egg[i][4] = (nota1 + nota2 + nota3 + nota4);

            if (egg[i][4] >= 7) {
                aprobo++;
            } else {
                noaprobo++;

            }
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + egg[i][j] + "]");
            }
        }
        
         
        System.out.println(" ");
        System.out.println("Cantidad de aprobados: " + aprobo);
        System.out.println("Cantidad de desaprobados: " + noaprobo);
        
        }
        
    }     
         
     
   /*     mostrarMatriz(egg);
        //System.out.println("----------");
        // System.out.println("APROBADOS  " + cont1 + " promedio de notas = " + prom);
        // mostrarVector(aprob);
        //  System.out.println("-----------");
        //  System.out.println("DESAPROBADOS  " + cont2);
        // mostrarVector(desap);

    }

    public static void mostrarVector(int[] mat) {

        for (int j = 0; j < mat.length; j++) {
            System.out.print("[" + mat[j] + "]");
        }
        System.out.println(" ");
    }

    public static void mostrarVectorD(double[] mat) {

        for (int j = 0; j < mat.length; j++) {
            System.out.print("[" + mat[j] + "]");
        }
        System.out.println(" ");
    }

    public static void mostrarMatriz(int[][] mat) {

        for (int[] mat1 : mat) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("[" + mat1[j] + "]");
            }
            System.out.println(" ");
        }
    }
*/

