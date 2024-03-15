
public class TiposPrimitivos {

    public static void main(String args[]) {
        /*
        tipos primitivos enteros : byte, short, int, long
         */
        byte numerobyte = 10;
        System.out.println("Valor Byte = " + numerobyte);

        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);
        System.out.println("Valor mininmo short: " + Short.MIN_VALUE);

        int numeroInt = 10;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
        System.out.println("Valor mininmo int: " + Integer.MIN_VALUE);

        // Si un valor supero el maximo de int, la solucion es agregar un L mayuscula al final del numero, eso lo conivrte en una literal de tipo long
        long numeroLong = 10;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
         System.out.println("Valor mininmo long: " + Long.MIN_VALUE);
         
         /*
         tipos primitivos de tipo flotante: float, double
         */
         float numroFloat = (float)3.4028236E38D;
         System.out.println("numroFloat = " + numroFloat);
         System.out.println("Valor maximo float: " + Float.MAX_VALUE);
         System.out.println("Valor mininmo float: " + Float.MIN_VALUE);
         
         double numroDouble = 10.1;
         System.out.println("numroDouble = " + numroDouble);
         System.out.println("Valor maximo double: " + Double.MAX_VALUE);
         System.out.println("Valor mininmo double: " + Double.MIN_VALUE);
    }
}
