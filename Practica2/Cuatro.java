/*Calcular la distancia entre dos puntos dadas sus coordenadas. */

import java.util.Scanner;

public class Cuatro {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    double x1;
    double x2;
    double y1;
    double y2;
    double d;

<<<<<<< HEAD
    System.out.println("Ingrese el valor de x1");
    x1 = s.nextDouble();
    System.out.println("Ingrese el valor de x2");
    x2 = s.nextDouble();
    System.out.println("Ingrese el valor de y1");
    y1 = s.nextDouble();
    System.out.println("Ingrese el valor de y2");
=======
    x1 = s.nextDouble();
    x2 = s.nextDouble();
    y1 = s.nextDouble();
>>>>>>> 6f5845ef1e80ad777334f97fddce436078fd1a85
    y2 = s.nextDouble();

    d = Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));

    System.out.println("d = " + d + " u");

    }
    
}