import java.util.Scanner; 

public class Ej5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;
        int contadorpares = 0;
        int contadorimpares = 0;

        for(int i=0 ; i<10 ; i++){
            System.out.println("Dame un número: ");
            numero = sc.nextInt();
            
            if( numero%2 == 0 ){
                contadorpares++;
            }else{
                contadorimpares++;
            }
        }
        System.out.println("Fueron " + contadorimpares + " impares");
        System.out.println("Fueron " + contadorpares + " pares");
    }

}