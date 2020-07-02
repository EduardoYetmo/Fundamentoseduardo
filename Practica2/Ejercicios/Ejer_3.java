//3. Calcular la suma de los primeror "n" números naturales(n dado por el usuario)

import java.util.Scanner; 
public class Ejer_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
double n;
double suma;

System.out.println("Ingrese el valor de n:");

n = sc.nextDouble();

suma = (n*(n+1))/2;

System.out.println("La suma es: " + suma);        
    }
    
}