import java.util.Scanner;

public class Uno {
    public static void main(String[] args) {
        System.out.println("hola!");
        
        Scanner s = new Scanner(System.in);

        double d;
        double t;
        double v;

        d = s.nextDouble();
        t = s.nextDouble();

        v=d/t;

        System.out.println("Velocidad = " + v);



    }
    
}