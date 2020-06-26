import java.util.Scanner; 

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Escribe los números: ");

        x = sc.nextInt();
        y = sc.nextInt();

        if(x>y){
            System.out.println("El mayor es: "+ x);
        }else{
            System.out.println("El mayor es:"+ y);
        }


    }
    
}