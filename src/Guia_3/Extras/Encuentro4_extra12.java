/*Necesitamos mostrar un contador con 3 dígitos (X-X-X), 
que muestre los números del 0-0-0 al 9-9-9, con la particularidad que cada vez
que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.*/
package Guia_3.Extras;

/**
 *
 * @author Inspiron
 */
public class Encuentro4_extra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("CONTADOR");
             int num1 ;
             int num2 ;
             int num3 ;
        
               do {
                   num1 = (int) (Math.random()*10);
                   num2 = (int) (Math.random()*10);
                   num3 = (int) (Math.random()*10);
                   String num1e = String.valueOf(num1);
                   String num2e = String.valueOf(num2);
                   String num3e = String.valueOf(num3);
             
                    switch(num1e){
                    case "3":
                        num1e = "E";
                        //break;
                }
                 switch(num2e){
                    case "3":
                        num2e = "E";
                        //break;
                }
                  switch(num3e){
                    case "3":
                        num3e = "E";
                       // break;
                }
                  System.out.println(num1e + "-" + num2e + "-" + num3e);
    
                  
                  } while (num1==10 && num2==10 && num3==10);
        
               for (int i = 0; i < 10; i++) {
            String contador = String.format("%03d", i);
            contador = contador.replace("3", "E");
            System.out.println(contador.charAt(0) + "-" + contador.charAt(1) + "-" + contador.charAt(2));
        }          
     
                 
            }
           
                
            
            
            
            
        
        
    }
    

