
package Seccion5;


public class OpeCondicionales {
    public static void main(String[] args) {
        var a  = 50;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        var resultado = a >=valorMinimo && a <= valorMaximo;
        if(resultado){
            System.out.println("Dentro de rango");
        }else {
            System.out.println("Fuera de rango");
        }
        
       var vacaciones = false;
       var diaDescanso = true;
       
       if(vacaciones || diaDescanso){
           System.out.println("Puede asistir al juego");
       }else{
           System.out.println("No puede asistir al juego");
       }
    }
}
