package Seccion8;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Mateo";
        persona1.apellido = "Cava";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        persona2.desplegarInformacion();
    }

}
