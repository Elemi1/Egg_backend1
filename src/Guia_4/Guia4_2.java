/*Diseñe una función que pida el nombre y la edad de N personas e imprima
los datos de las personas ingresadas por teclado e indique si son mayores o 
menores de edad. Después de cada persona, el programa debe preguntarle al 
usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese 
la palabra “No”.


 */
package Guia_4;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Guia4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Personas registradas");
        Scanner sc = new Scanner(System.in);
        String rta = "";
        int e=0;
        String n="";
        do {
            System.out.println("Nombre y edad");
            mostrar(n,e);
            System.out.println("Desea continuar s/n ?");
            rta=sc.nextLine();
            
        } while (rta.equalsIgnoreCase("s"));
        
        
    }
    public static void mostrar(String nombre , int edad){
        Scanner scc = new Scanner(System.in);
        nombre= scc.nextLine();
        edad= scc.nextInt();
        
        if (edad>18) {
            System.out.println("Usted "+nombre + " tiene "+ edad + " es mayor de edad");
            
        }else {
            System.out.println("Usted "+ nombre + " Es menor de edad");
        }
        
       
        
    }
}
