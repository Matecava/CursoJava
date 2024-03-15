package Seccion5;

public class OperadoresUnarios {

    public static void main(String[] args) {
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //incremento
        //1. Preincremento
        var e = 3;
        var f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        //2 postincremento
        var g = 5;
        var h = g++;
        System.out.println("g = " + g   );
        System.out.println("h = " + h);
        
        
           //decremento
        //1. Predecremto
        var i = 3;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //2 popstdecremento
        var k = 5;
        var l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
      
        
        
    }
}
