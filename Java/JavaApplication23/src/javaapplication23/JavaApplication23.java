/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication23;

import java.util.Scanner;

/**
 *
 * @author piaol
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
         float nota1, nota2, nota3, suma;
        
        System.out.println("Ingrese el resultado de la primer calificacion");
        nota1 = Float.parseFloat(entrada.nextLine ());
        nota2 = Float.parseFloat (entrada.nextLine());
        nota3= Float.parseFloat (entrada.nextLine());
       
        suma = nota1 + nota2 + nota3;
        
        System.out.println("suma = " + suma);
        
        
        
        
        
        
             
    }
    
}
