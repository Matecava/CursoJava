package Seccion4;


public class TiposBooleanos {
    public static void main(String args[]){
        boolean varBoolean = true;System.out.println("varBoolean = " + varBoolean);
        boolean varBooleanF = false;System.out.println("varBooleanF = " + varBooleanF);
        
        if(varBooleanF){
            System.out.println("La bandera es verdadera");
        }
        else{
            System.out.println("La bandera es falsa");
        }
        
        var edad = 654512312;
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }
    }
}
