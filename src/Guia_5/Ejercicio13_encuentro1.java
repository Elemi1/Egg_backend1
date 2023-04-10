/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_5;

import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class Ejercicio13_encuentro1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Equipo EGG");
        
        String [] equipo = new String [3];
        Scanner sc = new Scanner(System.in);
        
        
        for (int i = 0; i < equipo.length; i++) {
            equipo[i] = sc.nextLine();
            
        }
        String aux = "";
        
        for (String elemento : equipo) {
            aux += " [ " + elemento + " ] ";
        }
        
        System.out.println( aux );
    }   
    
}
