package Seccion4;

//Mi clase en Java
public class HolaMundo {
    public static void main(String args []){
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Adios"; 
        System.out.println(miVariableCadena);
        
        var miVariableCadena2 = "Goku";
        System.out.println("Hola, soy " + miVariableCadena2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        //Valores pewrmitidos en el nombre de una variable
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        System.out.println(miVariable + _miVariable + $miVariable);
    }
}