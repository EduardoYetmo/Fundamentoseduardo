//2. Hacer un programa para calcular el área de un círculo de radio r

import java.util.Scanner; 
public class Ejer_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double area;
        double radio;
        double distancia;

        //primera forma: cuando nos dan el radio.
        System.out.println("Cuando tenemos el radio");
        System.out.println("Ingresa el radio");
        radio = sc.nextDouble();

        area = Math.PI * Math.pow(radio,2);

        System.out.println("El área es: " + area + " u^2");

        //segunda forma: cuando tenemos el diametro.
        System.out.println("Cuando tenemos el diametro");
        System.out.println("Ingresa el diametro");
        distancia = sc.nextDouble();

        area = Math.PI * Math.pow(distancia/2,2);

        System.out.println("El área es; " + area + " u^2");
    }
    
}