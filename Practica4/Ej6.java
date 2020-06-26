import java.util.Scanner; 
public class Ej6{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double r;
        double a;

        System.out.println("Indique el radio del circulo: ");
        r = sc.nextDouble();

        a = Math.PI * Math.pow(r,2);

        System.out.println("El área del circulo es: " + a + " u^2");

        
    }
}