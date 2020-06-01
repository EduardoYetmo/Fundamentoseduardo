import java.util.Scanner;

public class Seis {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
        double a;
        double b;
        double c;
        double d;
        double x1;
        double x2;

        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();

        d = Math.pow(b,2) - (4 * a * c);

        x1 = (- b + (Math.sqrt(d) / (2*a)));
        x2 = (- b - (Math.sqrt(d) / (2*a)));

        System.out.println("x1 = " + x1 );
        System.out.println("x2 = " + x2 );
    
    }
    
}