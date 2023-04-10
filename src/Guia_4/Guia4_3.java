/*Crea una aplicación que a través de una función nos convierta 
una cantidad de euros introducida por teclado a otra moneda, 
estas pueden ser a dólares, yenes o libras. 
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir 
que será una cadena, este no devolverá ningún valor y 
mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package Guia_4;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Guia4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*** CASA DE CAMBIO ***");
        System.out.println("El cambio de divisas es:\n" +
                           "* 0.86 'LIBRA' es un 1 €\n" +
                           "* 1.28611 'DOLAR' es un 1 €\n" +
                           "* 129.852 'YENES' es un 1 €");
        
        
        
        
        String rta = "";
        
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Elija el cambio ");
            String moneda= sc.nextLine();
            System.out.println("Cuantos EUR a convertir");
            int eur = sc.nextInt();
            
            
            cambio(eur,moneda);
            System.out.println("Convertid devuelta s/n?");
            Scanner scc = new Scanner(System.in);
            rta = scc.nextLine();
            
        } while (rta.equalsIgnoreCase("s"));
         
        
        
        
        
        
    }
    
    public static void cambio(double eur , String moneda){
        
        double libra = 0.86;
        double dolar = 1.28611;
        double yenes = 129.852;
        
        if (moneda.equals("libra")||moneda.equals("dolar")||moneda.equals("yenes")) {
           switch(moneda){
            case "libra":
                eur = libra*eur;
                System.out.println("el cambio de EUR a " + moneda + " es = "+ eur + " libras");
                break;
            case "dolar":
                eur = dolar*eur;
                System.out.println("el cambio de EUR a " + moneda + " es = "+ eur + " dolares");
                break;    
            case "yenes":
                eur = yenes*eur;
                System.out.println("el cambio de EUR a " + moneda + " es = "+ eur + " yenes");
                break;        
        } 
            
        }else{
            System.out.println("Eleccion incorrecta");
        }
        
        
        
        
    }
}
