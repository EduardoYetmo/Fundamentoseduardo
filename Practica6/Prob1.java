import java.util.Scanner; 
public class Prob1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A;
        double B;
        double C;
        double areat, arear, area;
        double precio, total;

        System.out.println("Ingrese las longitudes del terreno:");
        System.out.print("Longitud A: ");
        A = sc.nextDouble();
        System.out.print("Longitud B: ");
        B = sc.nextDouble();
        System.out.print("Longitud C: ");
        C = sc.nextDouble();
        
        areat = (A-C)*B / 2;
        arear = B*C;
        area = areat + arear;

        System.out.println("El área total del terreno es: " + area + " m^2");
        System.out.print("Ingrese el precio por m^2: $ ");
        precio = sc.nextDouble();

        total = precio * area;

        System.out.println("El precio total por el terreno es: $ " + total);

    
    }
}