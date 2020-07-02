import java.util.Scanner; 
public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Escribe un número; ");
        numero = sc.nextInt();

        if(numero%2 == 0){
            System.out.println(numero + " Es par");
        }else{
            System.out.println(numero + " Es impar");
        }
        
    }
}