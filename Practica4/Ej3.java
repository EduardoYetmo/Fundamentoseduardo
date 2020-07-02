//Actividad 3: Modificar el programa anterior para que en caso 
//de que sean iguales lo indique.
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        int x;
       int y;

       Scanner sc = new Scanner(System.in);
       x = sc.nextInt();
       y = sc.nextInt();

       if(x > y){
           System.out.println("El mayor es: " + x);
       }else{
            if(x==y){
                System.out.println("Los números son iguales");
            }else{
                System.out.println("El mayor es: " + y);
            }
       }   
    }
}