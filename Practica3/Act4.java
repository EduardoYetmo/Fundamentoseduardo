import java.util.Scanner; 

public class Act4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        int numero;
        int contador = 0;

        System.out.println("\nIngrese un número: ");
        numero = sc.nextInt();

        for(int i=1; i<=numero; i++){
            if((numero%i)==0){
                contador++;
            }
        }
        if(contador <= 2){
            System.out.println("El número es primo");
        }else{
            System.out.println("El numero no es primo");
        }
        
    }
    
}