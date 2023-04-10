/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir.
La aplicación debe tener una función para cada operación matemática y 
deben devolver sus resultados para imprimirlos en el main.
 */
package Guia_4;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Guia4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Indique dos numeros");
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String opc; 
        System.out.println("Elija la operacion a realizar ,'suma','resta',divicion','multiplicacion' ");
        Scanner leer = new Scanner(System.in);
        opc=leer.nextLine();
        
        
        if (opc.equals("suma")||opc.equals("resta")||opc.equals("divicion")||opc.equals("multiplicacion")) {
            switch(opc){
                case "suma":
                    System.out.println("La suma es " + sumar(num1,num2));
                    break;
                case "resta":
                    System.out.println("La resta es " + resta(num1,num2));
                    break;
                case "divicion":
                    System.out.println("La divicion es " + divicion(num1,num2));
                    break;
                case "multiplicacion":
                    System.out.println("La multiplicacion es " + multiplicar(num1,num2));
            }
        }else{
            System.out.println("Elegiste mal, programa terminado");
        }
        
        
    }
    
    public static int sumar(int num1,int num2){
        int suma;
        
        suma = num1 + num2 ;
        
        return suma;
        
    }
    public static int resta(int num1,int num2){
        int resta;
        
        resta = num1 - num2 ;
        
        return resta;
        
    }
    public static int multiplicar(int num1,int num2){
        int multi;
        
        multi = num1 * num2 ;
        
        return multi;
        
    }
    public static int divicion(int num1,int num2){
        int div;
        
        div = num1 / num2 ;
        
        return div;
        
    }
    
}
