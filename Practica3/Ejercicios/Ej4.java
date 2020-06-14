import java.util.Scanner; 

public class Ej4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;
        int mayor = 0;

        System.out.println("Número: ");
        numero = sc.nextInt();
        

        while( numero >= 0){

            if( numero > mayor ){
                mayor = numero;
            }

            System.out.println("    Mayor = " + mayor);
            System.out.println("Número: ");
            numero = sc.nextInt();
            
        }

        System.out.println("El mayor es: " + mayor);

    }
    
}