/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. 
Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE)
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().

 */
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro4_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("DISPOSITIVO RS232");
        
        
        Scanner sc = new Scanner(System.in);
        int correcto = 0;
        int incorrecto = 0;
        String frase = " ";
        Boolean aux = true ;
        do{
            System.out.println("Indique frases");
            frase = sc.nextLine();
             
             
        if (frase.length()==5 && frase.substring(0,1).equals("x")&& frase.substring(4,5).equals("o")) {
            System.out.println("Frase correcta de 5 caract.");
            correcto++;
            break;
            
        }else{
            System.out.println("Frase incorrecta");
            incorrecto++;
        }
        } while (!frase.equals("&&&"));{
        System.out.println("Las frases correctas fueron " + correcto);
        System.out.println("Las frases incorrectas fueron " + incorrecto);
    }
         
            
            
        
    
        
        
    }
    
}
