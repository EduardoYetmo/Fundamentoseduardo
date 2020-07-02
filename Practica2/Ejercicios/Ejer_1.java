//1. Hacer un programa para calcular la velocidad de un objeto dad la distancia y el tiempo.

import java.util.Scanner; 
public class Ejer_1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double d;
        double t;
        double v;

        System.out.println(" Velocidad ");
        System.out.print("Ingrese la distancia: ");
        d = sc.nextDouble();
        System.out.print("Ingrese el tiempo: ");
        t = sc.nextDouble();

        v = d/t;

        System.out.println("Velocidad = " + v + " m/s");
    }
}