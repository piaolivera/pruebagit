/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author piaol
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner entrada = new Scanner (System.in);
        System.out.println(" Digite el nombre del libro: \n "  );
        
        String nombreLibro = entrada.nextLine();
        
        System.out.println ("Digite el id del libro");
        int idLibro = Integer.parseInt (entrada.nextLine());
        
        System.out.println(" Ingrese el precio del libro: " );
        double precioLibro = Double.parseDouble(entrada.nextLine());
        
        System.out.println("Confirme si el envio es gratis");
        boolean envioGratis = Boolean.parseBoolean (entrada.nextLine());
        
        System.out.println(nombreLibro +" # "+idLibro);
        System.out.println("precioLibro = " + precioLibro);
        System.out.println("El envio del libro es gratis = " +envioGratis);
    }
    
}
