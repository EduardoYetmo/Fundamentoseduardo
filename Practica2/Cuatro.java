import java.util.Scanner;

public class Cuatro {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    double x1;
    double x2;
    double y1;
    double y2;
    double d;

    x2 = s.nextDouble();
    x1 = s.nextDouble();
    y2 = s.nextDouble();
    y1 = s.nextDouble();

    d = Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));

    System.out.println("d = " + d + " u");

    }
    
}