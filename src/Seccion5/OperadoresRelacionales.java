package Seccion5;

public class OperadoresRelacionales {

    public static void main(String[] args) {
        var a = 3;
        var b = 2;

        var c = (a == b);
        System.out.println("c = " + c);

        var d = a != b;
        System.out.println("d = " + d);

        var cadena = "Hola";
        var cadena2 = "Adios";

        var e = cadena.equals(cadena2);
        System.out.println("e = " + e);

        var g = a >= b;
        System.out.println("g = " + g);

        if (a % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }
    }
}
