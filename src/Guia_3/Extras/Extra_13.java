/*Crear un programa que dibuje una escalera de números,
donde cada línea de números comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package Guia_3.Extras;

/**
 *
 * @author Inspiron
 */
public class Extra_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ESCALERA");
        
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        
                
            
        }
    
}
