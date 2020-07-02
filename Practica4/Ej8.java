//Actividad 8: Calcular la suma de los primeros "n" número naturales
//con la formula suma=n(n+1)/2.
import java.util.Scanner;
public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int suma;

        System.out.println("Ingresa un número: ");
        num = sc.nextInt();
        suma = num * (num + 1)/2; 
        System.out.println("La suma de los primeros n es: "+ suma);
    }
    
}