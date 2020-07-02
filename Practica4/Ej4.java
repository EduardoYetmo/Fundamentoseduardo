//Actividad 4: Calcular el promedio de tres números dados por el usuario.
import java.util.Scanner; 
public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        int suma;
        double r;

        System.out.println("Ingrese tres números para calcular el promedio: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        suma = a + b + c;

        System.out.println("La sumatoria de los números es;" + suma);

        r = suma / 3;

        System.out.println("El promedio es: " + r);
   
    }
}