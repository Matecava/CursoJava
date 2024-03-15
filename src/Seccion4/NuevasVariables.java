package Seccion4;


import java.util.Scanner;

public class NuevasVariables {

    public static void main(String args[]) {

        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();

        System.out.println("Escribe el titulo:");
        var titulo = consola.nextLine();

        System.out.println(titulo + " " + usuario);
    }
}
