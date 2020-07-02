//Actividad 5: Modifica el problema anterior para calcular
//el promedio de "n" número, tanto n como los números deben 
//ser dados por el usuario(utiliza el ciclo for).
import java.util.Scanner; 
public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int num;
        int acum=0;
        double r;

        System.out.println("Ingrese la cantidad de datos: ");
        num = sc.nextInt();
        acum = 0;

        for(int i=1; i<=num;i++){
            System.out.println("Ingrese el dato" + i);
            n = sc.nextInt();
            acum = acum+n;
        }
        r = acum/num;
        System.out.println("El promedio es: " + r);
    }
}