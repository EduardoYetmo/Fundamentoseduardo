//4.- Determinar cuánto ahorrará una persona en un año, si al  
//final de cada mes deposita variables cantidades de dinero.
import java.util.Scanner;
public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = 0;
        int CA;
        double AH=0;
        
        for(int i=1;i<=12;i++){
            System.out.println("Ingresa el ahorro del mes "+i);
            CA = sc.nextInt();
            AH = AH + CA;
            M = M+1;
            System.out.println("El ahorro por mes es: $ " + AH + "0\n");
        }
        System.out.println("El total del ahorro en un año es de: $ " + AH+"0");
    }
}