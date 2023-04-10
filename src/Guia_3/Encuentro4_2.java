package Guia_3;


import java.util.Scanner;

/*Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.

package clase1_ejerc1;

/**
 *
 * @author Inspiron
 */
public class Encuentro4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("BUENAS VEAMOS LA FRASE SECRETA");
        
        Scanner sc = new Scanner(System.in);
        
        String fra = "eureka";
        String frase = sc.nextLine();
        
            if(frase.equals(fra)){
                System.out.println("Frase correcta");
            }else{
                System.out.println("Frase incorrecta");
            }
           
            
        }
        
    }
    

