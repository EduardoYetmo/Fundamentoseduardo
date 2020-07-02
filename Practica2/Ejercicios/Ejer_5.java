//5. Indica el mayor de tres números dados por el usuario 
import java.util.Scanner; 
public class Ejer_5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Ingresa 3 número para saber cual es mayor: ");
        System.out.println("Ingresa el valor de a: ");
        a = sc.nextDouble();
        System.out.println("Ingresa el valor de b: ");
        b = sc.nextDouble();
        System.out.println("Ingresa el valor de c: ");
        c = sc.nextDouble();


        if(a>=b && a>=c){
            System.out.println("El mayor es a");
        }else{
            if(b>=a && b>=c){
                System.out.println("El mayor es b");
            }else
                System.out.println("El mayor es c");
        }
    }
}