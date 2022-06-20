/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication21;

/**
 *
 * @author piaol
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //OPERADORES CONDICIONALES = AND Y OR 
        var valorA= 7;
        var valorMinimo =0; // ( CREAMOS UN RANGO DEL CERO AL 10)
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <=10;
        
        if (respuesta)
            System.out.println("Esta dentro del rango" );
        else
            System.out.println("Esta fuera del rango" );
    }
    
}
