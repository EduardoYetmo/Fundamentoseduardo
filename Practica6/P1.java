//1.- Obtener el área de un terreno
import java.util.Scanner;
public class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A;
        double B;
        double C;
        double comp;
        double areat, arear, area;
        double precio, total;

        System.out.println("Ingrese las longitudes del terreno:");
        System.out.print("Longitud A: ");
            A = sc.nextDouble();
        System.out.print("Longitud B: ");
            B = sc.nextDouble();
        System.out.print("Longitud C: ");
            C = sc.nextDouble();
        comp = longitud(A, C);

        System.out.println(A);
        System.out.println(B);
        System.out.println(comp);

        areat = (A-comp)*B/2;
        arear = B*comp;
        area = areat + arear;

        System.out.println("El área total del terreno es: " + area + " u^2");
        System.out.print("Ingrese el precio por m^2: $ ");
        precio = sc.nextDouble();
        total = area * precio;
        System.out.println("El precio total por el terreno es: $ " + total + "0");
    }

    public static double longitud(double A, double C){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("La longitud de C es mayor que A");
            System.out.print("Ingresa otro valor de C: ");
            C = sc.nextDouble();
        }while(A<=C);

        return C;
    }
}