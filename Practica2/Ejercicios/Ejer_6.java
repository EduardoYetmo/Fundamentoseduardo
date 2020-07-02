//6. Resuelva la ecuación ax^2 + bx + c para a, b y c dados por el usuario.
import java.util.Scanner; 
public class Ejer_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        double d;
        double e;
        double f;
        double g;
        double i;
        double x1;
        double x2;

        System.out.println("Ingresa los valores de una Ecuacion cuadratica; ");

        System.out.println("Valor de a"); 
        a = sc.nextDouble();
        System.out.println("Valor de b"); 
        b = sc.nextDouble();
        System.out.println("Valor de c"); 
        c = sc.nextDouble();

        d = Math.pow(b,2);
        e = 4 * a * c;
        f = 2*a;

        g = d - e;
        i = Math.sqrt(g);

        x1 = (-b + i) / f;
        x2 = (-b - i )/ f;

        System.out.println("x1 = " + x1 );
        System.out.println("x2 = " + x2 );
    }
}