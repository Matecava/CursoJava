package Seccion4;


import java.util.Scanner;


public class Conversiones {

    public static void main(String[] args) {
        //Convertit tipo String a int se usa el metodo Integer.parseInt()
        //Para convertir a string se usa String.valueOf()

        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        var consola = new Scanner(System.in);
//        System.out.println("Porporciona tu edad:");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad  );
        //Como pasar tipod de datos a string
       var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        //como pedir un solo caracter de un string
        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter");
        caracter  = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
       
    }
}
