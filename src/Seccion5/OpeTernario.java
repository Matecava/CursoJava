
package Seccion5;

public class OpeTernario {
    public static void main(String[] args) {    
 //Precedencia de operadores
         var x = 5;
         var y = 10;
         var z = ++x + y--;
         System.out.println("x = " + x);
         System.out.println("y = " + y);
         System.out.println("z = " + z);
         
         var resultado2 = 4 + 5 *6 / 3;
         System.out.println("resultado2 = " + resultado2);
         
         var resultado3 = (4 + 5) * 6 / 3;
         System.out.println("resultado3 = " + resultado3);

        var resultado = (3 > 2) ? "verdadero" : "falso" ;
         System.out.println("resultado = " + resultado);
        
         var numero = 8;
         resultado = (numero % 2 == 0) ? "El numero es par" : "El numero es impar";
         System.out.println(resultado);
         
         
         
    }    
}
