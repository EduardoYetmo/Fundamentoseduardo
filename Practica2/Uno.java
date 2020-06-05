/*1. Hacer un programa para calcular la velocidad de un objeto dad la distancia y el tiempo.
*/

import java.util.Scanner;

public class Uno {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

       
        double d;
        double t;
        double v;

        System.out.println("Ingresa la distancia:");
        d = s.nextDouble();
        System.out.println("Ingresa el tiempo:");
        t = s.nextDouble();

        v=d/t;

        System.out.println("Velocidad = " + v + " m/s");



    }
    
}