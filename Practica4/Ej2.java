import java.util.Scanner; 
public class Ej2 {
    public static void main(String[] args) {
        
        int a, b;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        
        if(a>b){
            System.out.println("El mayor es = " + a);
        }
        if(a==b){
            System.out.println("Los números son iguales");
        }
        if(a<b){
            System.out.println("El mayor es = " + b);
        }
        
    }
}