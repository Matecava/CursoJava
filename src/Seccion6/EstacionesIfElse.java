
package Seccion6;

import java.util.Scanner;


public class EstacionesIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporcione el mes: ");
        int mes = Integer.parseInt(scanner.nextLine()); 
        var estacion = "Estacion desconocida"; 
        
        if(mes == 1 || mes == 2 || mes == 12){
          estacion = "Verano" ; 
        }
        else if(mes <=3 || mes >= 5){
            estacion = "Otonio";
        }
        else if(mes <=6 || mes >= 8){
            estacion = "Invierno";
        }else if(mes <=9 || mes >= 11){
            estacion = "Primavera";
        }
        System.out.println("Estacion = " + estacion);
    }
}
