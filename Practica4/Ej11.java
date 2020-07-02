//Actividad 11: Indicar si un número es perfecto po no. 
import java.util.Scanner; 
public class Ej11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int suma = 0, n;
        
        System.out.println("Ingresa un número para saber si es un número perfecto: ");
        n = sc.nextInt();
        for (int i = 1; i < n; i++) { 
            if (n % i == 0) {
                suma = suma + i;  
            }
        }
        if (suma == n) {
            System.out.println(n + " Perfecto");
        } else {
            System.out.println(n + " No es perfecto");

        }
    }
    
}