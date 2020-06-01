import java.util.Scanner;

public class Cinco{
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);

        double a;
        double b;
        double c;

        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();


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