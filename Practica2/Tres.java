import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        
Scanner s = new Scanner(System.in);
double n;
double suma;

n = s.nextDouble();

suma = (n*(n+1))/2;

System.out.println("La suma es: " + suma);

    }
}