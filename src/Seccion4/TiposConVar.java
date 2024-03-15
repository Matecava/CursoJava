package Seccion4;

//Como Hcaer debugging

public class TiposConVar {

    public static void main(String args[]) {
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);

        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);

        char varCharDecimal = 64;
        System.out.println("varCharDecimal = " + varCharDecimal);

        char varCharSimbolo = '?';
        System.out.println("varCharSimbolo = " + varCharSimbolo);

        var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1);

        var varCharDecimal2 = 64;
        System.out.println("varCharDecimal2 = " + varCharDecimal2);

        var varCharSimbolo3 = '?';
        System.out.println("varCharSimbolo3 = " + varCharSimbolo3);
        
        int variableEnteroSimbolo = '!';
        System.out.println("variableEnteroSimbolo = " + variableEnteroSimbolo);
        
        int letra = 'a';
        System.out.println("letra = " + letra);
    }
}
