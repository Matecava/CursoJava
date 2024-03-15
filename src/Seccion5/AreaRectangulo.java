package Seccion5;

import java.util.Scanner;

public class AreaRectangulo {

    public static void main(String[] args) {
        int alto, ancho;

        var teclado = new Scanner(System.in);
        System.out.println("Proporcione el alto:");
        alto = Integer.parseInt(teclado.nextLine());
        System.out.println("Proporcione el ancho:");
        ancho = Integer.parseInt(teclado.nextLine());

        int area = alto * ancho;
        System.out.println("Area: " + area);
        int perimetro = (alto + ancho) * 2;
        System.out.println("perimetro: " + perimetro);

    }
}
