/*2. Hacer un programa para calcular el área de un círculo de radio r*/

import java.util.Scanner;

public class Dos {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        double area;
        double radio;
        double distancia;

        //primera forma: cuando nos dan el radio.
        System.out.println("Cuando tenemos el radio");
        System.out.println("Ingresa el radio");
        radio = s.nextDouble();

        area = Math.PI * Math.pow(radio,2);

        System.out.println("El área es: " + area + " u^2");

        //segunda forma: cuando tenemos el diametro.
        System.out.println("Cuando tenemos el diametro");
        System.out.println("Ingresa el diametro");
        distancia = s.nextDouble();

        area = Math.PI * Math.pow(distancia/2,2);

        System.out.println("El área es; " + area + " u^2");



    }
    
}