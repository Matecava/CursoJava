package Seccion5;
 //OPperadores aritmeticos
public class Operadores {
    public static void main(String[] args) {
        int a=10, b=2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        
        resultado = a - b ; 
        System.out.println("resultado resta = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        
        var resultado2 = 3F / b;
        System.out.println("resultado division = " + resultado2);
        
        resultado = a % b;
        System.out.println("resultado modulo= " + resultado);
        
        
        if ( a % 2 == 0)
            System.out.println(a + " Es par");
            else 
            System.out.println(a + " Es impar");
        
    }
}
