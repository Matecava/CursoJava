package Seccion6;

import java.util.Scanner;

public class EstacionesSwitch {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporcione el mes: ");
        var mes = Integer.parseInt(scanner.nextLine());
        var estacion = "Estacion desconocida";
        
        switch (mes) {
            case 1, 2, 12 ->
                estacion = "Verano";
            case 3, 4, 5 ->
                estacion = "Otonio";
            case 6, 7, 8 ->
                estacion = "Invierno";
            case 9, 10, 11 ->
                estacion = "Primavera";
        }
        System.out.println("estacion = " + estacion);
    }
}
