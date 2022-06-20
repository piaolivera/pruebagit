/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication22;

/**
 *
 * @author piaol
 */
public class JavaApplication22 {

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
        
        var vacaciones = false;
        var diaLibre = true;
        if (vacaciones || diaLibre){ 
            System.out.println("Puedo asistir al juego con mi hijo");
        }
        else {
            System.out.println(" No puedo asistir al juego con mi hijo"  );
        }
        // OPERADOR TERNARIO 
            var resultadoT = (4 > 5)? "verdadero" : "falso";
            System.out.println("resultadoT = " + resultadoT);
            
            var numeroT= 7;
           var  resultado = (numeroT % 2 ==0)? "Es par" : "Es impar";
           System.out.println("resultado = " + resultado);
           
           var x= 10;
           var y= 5;
           var z= ++x + y--; 
           System.out.println("x = " + x); //11
           System.out.println("y = " + y); //4
           System.out.println("z = " + z); //15
           
           //solucion aritemtica 
           
           var solucionArimetica = 4 + 6 *5 / 3;
           System.out.println("solucionArimetica = " + solucionArimetica);
           
           var solucionArimetica2 = (4 + 5) *6 / 3;
           System.out.println("solucionArimetica2 = " + solucionArimetica2);
           
           
           
           
           
           
           
        
        
    }
    
}
