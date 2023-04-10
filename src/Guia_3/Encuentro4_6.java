/*Realizar un programa que pida dos números enteros positivos por teclado 
y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción
y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa 
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

 */
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro4_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenidos al Menu");
        System.out.println("Digame dos numeros enteros");
        
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean aux = true; // SE USA EN ESTE CASO PARA CERRAR EL WHILE
        
        
        do {
        System.out.println("Menu");
        System.out.println("1 Sumar");
        System.out.println("2 Restar");
        System.out.println("3 dividir");
        System.out.println("4 multiplicar");
        System.out.println("5 Salir");
        System.out.println("Ingrese una opcion del 1 al 5");
        int opc = sc.nextInt();
       
        
        switch (opc){
            case 1:
                System.out.println("Opcion 1 Sumar");
                int suma = num1 + num2;
                System.out.println("El resultado de la suma es " + suma);
                aux = false; // SALE DEL PROGRAMA CON EL BOOLEAN
                break;
                
            case 2:
                System.out.println("Opcion 2 Restar");
                int resta = num1 - num2;
                System.out.println("El resultado de la resta es " + resta);
                break;
            case 3:
                System.out.println("Opcion 3 Dividir");
                int div = num1 / num2;
                System.out.println("El resultado de la division es " + div);
                break;
            case 4:
                System.out.println("Opcion 4 Multiplicar");
                int mult = num1 * num2;
                System.out.println("El resultado de la multiplicacion es " + mult);
                break;
            case 5:
                System.out.println("Opcion 5 Salir");
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                Scanner scc = new Scanner(System.in);
                String rta = scc.nextLine();
                //String n = sc.nextLine();
                if (rta.equals("s")) {
                    aux = false; // SALE DEL PROGRAMA CON EL BOOLEAN PARA WHILE
                    break;
                }
               
         }         
        } while (aux);
         
    }
    
}
