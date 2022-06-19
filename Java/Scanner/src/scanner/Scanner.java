/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;





/**
 *
 * @author piaol
 */
public class Scanner {

    /**
     * @param args the command line arguments
     *//*
    public static void main(String[] args) {
        
        var usuario2 = "carlos";
        
        System.out.println("usuario2 = " + usuario2);
        // TODO code application logic here*/
     public static void main(String[] args) {
         
       /*  Scanner entrada = new Scanner (system.in);
         
        var usuario2="carlitos";
        System.out.println("usuario2: "+usuario2); */
       
       Scanner entrada = new Scanner(System.in);
       System.out.println ("Digite un nombre");
       var usuario2 = entrada.nextLine();
         System.out.println("usuario2 = " +usuario2 );
         System.out.println("Escriba un titulo:   "  );
         var titulo2 = entrada.nextLine();
         System.out.println("Resultado = " +titulo2 + " "+usuario2 );
    }
    }
    

