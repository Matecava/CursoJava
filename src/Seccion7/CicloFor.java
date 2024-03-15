package Seccion7;

public class CicloFor {

    public static void main(String[] args) {
        for (var contador = 0; contador < 50; contador++) {
            if (contador % 2 == 0) {
                continue;
            }
            System.out.println("contador = " + contador);
        }
    }
}
