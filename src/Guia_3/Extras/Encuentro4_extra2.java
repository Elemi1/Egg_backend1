/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales
y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package Guia_3.Extras;

/**
 *
 * @author Inspiron
 */
public class Encuentro4_extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Variables tipo entero");
        int A=5,B=2,C=9,D=7;
        int aux;
        System.out.println("el valor de A " + A);
        System.out.println("el valor de B " + B);
        System.out.println("el valor de C " + C);
        System.out.println("el valor de D " + D);
     //------------------------------------------------
        aux = A;
        aux = D;
        
        System.out.println("el nuevo valor de A " + D);
     //------------------------------------------------  
        aux = C;
        aux = B;  
        System.out.println("el nuevo valor de B " + C);
     //------------------------------------------------
        aux = A;
        aux = C;
        System.out.println("el nuevo valor de C " + A);
     //------------------------------------------------  
        aux = B;
        aux = D;
        System.out.println("el nuevo valor de D " + B);
        
        
        
    }
    
}
