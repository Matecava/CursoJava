
package Seccion6;


public class IfElse {
    public static void main(String[] args) {
        var numero = 2;
        var numeroTexto = "Numero desconocido";
        
        if (numero == 2){
            numeroTexto = "Numero dos";
        }
        else if(numero == 1){
            numeroTexto = "numero uno";
        }
        else if(numero == 3){
            numeroTexto = "numero tres";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
