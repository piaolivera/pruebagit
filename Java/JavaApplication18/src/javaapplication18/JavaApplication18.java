/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

/**
 *
 * @author piaol
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);
        
        var varC = true;
        var varD = !varC;
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
    // valores unarios : pre -incremento 
        
        var varE = 9; //se va a incrementar la variable E
        var varF= ++varE;
        System.out.println("varE = " + varE);
        System.out.println("varF = " + varF);
        
        // valores unarios : post incre,emto
        var varG = 9; // se va a sumar uno 
        var varH = varG++; // se va a mantener el valor de la variable G
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        //vslores unarios decremento
        var varI = 5;
        var varJ = --varI; // se va a restar uno
        System.out.println("varI = " + varI);
        System.out.println("varJ = " + varJ);
        
        //valores unarios post decremento 
        var varK = 4; // se va a restar uno
        var varL = varK--; // va a manetener el valor de k 
        System.out.println("varK = " + varK);
        System.out.println("varL = " + varL);
        
        
        
    }
    
}
