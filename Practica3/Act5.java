/*Sea "n" un número dado por el usuario, mostrar el n-esimo número de Fibonacci.
  El n-esimo número de Fibonacci se calcula en función de los números n-1 y n-2 
  de la siguiente forma: f(n) = f(n-1) + f(n-2) para n>=2 y por definición 
  f(0) = 0 y F(1) = 1.*/
import java.util.Scanner;
public class Act5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int a=0;
        int b=1;
        int c;
        
        System.out.println("\n      *****n-ésimo Número de Fibonacci*****");
        System.out.print("\nIngrese un número: ");    
        n = sc.nextInt();
        System.out.println("\nPor definición, f(0)=0 y f(1)=1 por lo tanto: \n");

        for(int i=1; i<=n; i++){
            System.out.println(a);
            c = a +b;
            a = b;
            b = c;
        }
        System.out.println(a);
        System.out.println("\nY el resultado f("+ n + ") = " + a);
    
        
    }
}