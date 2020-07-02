//Actividad 2: Calcular el promedio de un conjunto de numeros positivos.
//Los números son ingresados por el usuario y el promedio se calculará y 
//mostrará cuando se ingrese un número negativo.
import java.util.Scanner; 
public class Act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int cont = 0;
        double suma = 0;
        double prom = 0;

        System.out.println("\n      *****Promedio de Conjunto de Números*****\n");
        System.out.println("Ingrese un conjunto de números para obtener su promedio\ningrese un número negativo para finalizar.");
        System.out.println("Escribe los datos:\n ");
        numero = sc.nextInt();
        
        while( numero>=0){
            suma+=numero;
            cont++;
            numero = sc.nextInt();
        }

        prom = suma/cont;

        System.out.println("\nEl número de datos es: " + cont);
        System.out.println("La sumatoria de los datos: " + suma);
        System.out.println("El promedio de los datos es: " + prom);
        
        
    }
    
}