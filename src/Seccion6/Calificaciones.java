package Seccion6;

import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10: ");
        var nota = Integer.parseInt(scanner.nextLine());
        var calificacion = "Valor desconocido";

        switch (nota) {
            case 0, 1, 2, 3, 4, 5 ->
                calificacion = "F";
            case 6 ->
                calificacion = "D";
            case 7 ->
                calificacion = "C";
            case 8 ->
                calificacion = "B";
            case 9, 10 ->
                calificacion = "A";
        }
        System.out.println(calificacion);
    }

}
