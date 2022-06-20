/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresigualdad;

/**
 *
 * @author piaol
 */
public class OperadoresIgualdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var numA= 4;
        var numB= 5;
        var numC= ( numA== numB);
        System.out.println("numC = " + numC);
        var numD= (numA != numB);
        System.out.println("numD = " + numD);
        
        var varE = numA < numB;
        System.out.println("vsrE = " + varE);
        if (numB %2==0 ){
            System.out.println("El numero es par "  );
        }
            else{ 
            System.out.println("El numero es impar " );
        }
        var edad= 30;
        var adulto =18;
        if (edad >= adulto){
            System.out.println("Sos mayor de edad " );
        }
        else {
            System.out.println("Sos menor de edad " );
        }
    }
        
        
        
        
    }
    
}
