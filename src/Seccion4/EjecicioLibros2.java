package Seccion4;


import java.util.Scanner;

public class EjecicioLibros2 {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        var nombre = consola.nextLine();
        System.out.println(nombre);

        System.out.println("Proporciona el id:");
        var id = Integer.parseInt(consola.nextLine());
        System.out.println(id);

        System.out.println("Proporciona el precio:");
        var precio = Double.parseDouble(consola.nextLine());
        System.out.println("$" + precio);

        if (precio >= 500) {
            boolean envioGratuito = true;
            System.out.println("envioGratuito = " + envioGratuito);
        } else {
            boolean envioGratuito = false;
            System.out.println("envioGratuito = " + envioGratuito);
        }
    }
}
