/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Encuentro3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("** Veamos bombas para mover Fluidos ");
        System.out.println("** Ingrese un valor de 1 a 4 ");
        Scanner leer = new Scanner(System.in);
        
        int opc = leer.nextInt();
        
        if(opc>= 1 && opc <= 4){
            
           	switch (opc) {
        	case 1:
           System.out.println("La bomba es una bomba de agua");
           break;
           case 2:
           System.out.println("La bomba es una bomba de gasolina");
           break;
           case 3:
           System.out.println("La bomba es una bomba de hormigón");
           break;
           case 4:
           System.out.println("La bomba es una bomba de pasta alimenticia");
           break;
           
        
          }
        
        
        }else{
            System.out.println("No existe un valor válido para tipo de bomba");
        }
    
    }    
}
