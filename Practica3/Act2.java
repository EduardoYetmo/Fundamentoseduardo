import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int cont = 0;
        double suma = 0;
        double prom = 0;

        System.out.println("Escribe los datos:\n ");
        numero = sc.nextInt();
        
        while( numero>=0){
            suma+=numero;
            cont++;
            numero = sc.nextInt();
        }

        prom = suma/cont;
        System.out.println("\nEl promedio de los datos es:" + prom);
        
        
    }
    
}