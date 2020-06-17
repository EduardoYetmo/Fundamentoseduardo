import java.util.Scanner; 

public class Act6 {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int a = 1;
        int b = 1;
        int c = 1;
        int d;
        int n;

        System.out.println("\nIngresa el calor de n para P(n): ");
        n = sc.nextInt();

        System.out.println("Tomando en cuenta que P(0) = P(1) = P(2) = 1");
        System.out.println("Nos da la siguiente sucesión: ");

        for(int i=1; i<=n; i++){

            System.out.println(a);
            d = a + b;
            a = b;
            b = c;
            c = d;
        }

        System.out.println(a);
        System.out.println("\nEl resultado cuando P(" + n + ") es: " + a);
    }
    
}