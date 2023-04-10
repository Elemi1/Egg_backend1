/*Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.

 */
package Guia_3.Extras;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro4_extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*****   BIENVENIDO A LA CLINICA   *****");
        System.out.println();
        System.out.println("Socios tipo A");
        System.out.println("Socios tipo B");
        System.out.println("Socios tipo C");
        
        
        Scanner sc = new Scanner(System.in);
        int cuota;
        String socio ;
        Boolean bandera = true;
       
        
     /*   System.out.println("Indique la cuota a abonar");
          cuota= sc.nextInt();
          System.out.println("la " + cuota + " para un socio " + socio + " ");
      */      
        do {
            System.out.println("Indique tipo de socio");
            socio = sc.nextLine().toLowerCase();
            
            
            if (socio.equals("a") || socio.equals("b") || socio.equals("c")) {
                switch(socio){
                    case "a":
                        System.out.println("Socio " + socio + ". Indique su cuota");
                        cuota=sc.nextInt();
                        System.out.println("Su cuota de " + cuota+"$" + " Los tratamientos los paga con 50% menos , un total de = "+ (cuota/2)+"$" );
                        bandera=false;
                        break;
                    case "b":
                        System.out.println("Socio " + socio + ". Indique su cuota");
                        cuota=sc.nextInt();
                        System.out.println("Su cuota de " + cuota+"$" + " Los tratamientos los paga con 35% menos , un total de = "+ (cuota*35)/100 +"$" );
                        bandera=false;
                        break;    
                    case "c":
                        System.out.println("Socio " + socio + ". Indique su cuota");
                        cuota=sc.nextInt();
                        System.out.println("Su cuota de " + cuota+"$" + " No tiene descuentos en $" );
                        bandera=false;
                        break;
                    
                }
            }else{
                System.out.println("Incorrecto");
            }
            
        } while (bandera);
  
    }
    
}
