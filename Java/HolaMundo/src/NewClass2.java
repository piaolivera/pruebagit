
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author piaol
 */
public class NewClass2 {
    public static void main(String[] args){
        /*var edad= 20;
        System.out.println("edad = " + edad);
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valor pi -" +valorPi);
        
        // pedir un valor al usuario 
        var entrada = new Scanner (System.in);
        System.out.println(" Digite su edad = "  );
        edad= Integer.parseInt (entrada.nextLine());
        System.out.println("edad = " + edad);
        */
        //CONVERSION DE TIPO ENTERO A TIPO STRING
        var edadTexto= String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        var entrada = new Scanner (System.in);
        var fraseChar = "programadores".charAt(0); // va a mostrar la posicion de la letra
        System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Digite una frase = " );
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);
        
        
        
    }
    
}
