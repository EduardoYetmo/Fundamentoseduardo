//6. Calcular la distancia entre dos puntos dadas sus coordenadas. 
import java.util.Scanner;
public class Ejer_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x1;
        double x2;
        double y1;
        double y2;
        double d;

        System.out.println("Ingrese el valor de x1");
        x1 = sc.nextDouble();
        System.out.println("Ingrese el valor de x2");
        x2 = sc.nextDouble();
        System.out.println("Ingrese el valor de y1");
        y1 = sc.nextDouble();
        System.out.println("Ingrese el valor de y2");
        y2 = sc.nextDouble();

        d = Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));

        System.out.println("d = " + d + " u");
        
    }
}