import java.util.Scanner; 

public class Ej7{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pares=0;
        int impares=0; 
        int cont = 0;
        int num;

        System.out.println("Ingresa los números: ");

        while(cont<10){
            num = sc.nextInt();
            if(num%2 == 0){
                pares = pares+1;
            }else{
                impares = impares+1;
            }
            cont = cont+1;
        }
        
        System.out.println("Pares: "+ pares);
        System.out.println("impares: "+impares);

    }
}