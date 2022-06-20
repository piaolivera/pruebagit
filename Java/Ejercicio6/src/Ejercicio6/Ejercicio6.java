/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author piaol
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
       float luis, guillermo, juan; //  Luis = mitad de guillermo . juan = mitad de lo q tiene luis y guillermo juntos
       float suma;
       
        System.out.println("Ingrese el dinero que tiene guillermo: \n");
        guillermo = Float.parseFloat (entrada.nextLine());
        
        luis = guillermo / 2;
        juan = (guillermo + luis) /2;
        
        suma = guillermo + luis + juan;
        
        System.out.println("luis = " + luis);
        System.out.println("juan = " + juan);
        System.out.println("La suma de dinero entre los tres amigos es de  " + suma);
       
        
    }
    
}
