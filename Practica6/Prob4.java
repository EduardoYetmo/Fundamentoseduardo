import java.util.Scanner; 
public class Prob4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = 0;
        int CA;
        double AH=0;

        System.out.println("Ingresa el ahorro de este mes: ");
        
        while(M<=12){
        CA = sc.nextInt();

        AH = AH + CA;
        M = M+1;

        System.out.println("El ahorro por mes es: " + AH );
        }

        System.out.println("El total del ahorro en un año es de: " + AH);
    }
    
}