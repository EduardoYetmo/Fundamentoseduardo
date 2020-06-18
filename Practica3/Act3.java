/*Actividad 3: Escriba un programa que le solicite tres longitudes (reales) y le diga
si se puede formar o no un triángulo con ellas. Se forma un triángulo si la longitud 
de cualquiera de los tres lados es mayor a la suma de los dos restantes.*/

import java.util.Scanner; 
public class Act3 {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        String respuesta;

        Scanner sc = new Scanner(System.in);

        System.out.println("\n    *****Triángulo*****\n");
        System.out.println("Ingrese tres logitudes:");
        System.out.print("a: ");
        a = sc.nextDouble();
        System.out.print("b: ");
        b = sc.nextDouble();
        System.out.print("c: ");
        c = sc.nextDouble();

        if(a >= b + c || a >= c + b){
            System.out.println("Es un triangulo");
            
            if(b >= c + a || b >= a + c){
                System.out.println("Es un triangulo");
            }
            if(c >= a + b || c >= b + a){
                System.out.println("Es un triangulo");
            }
        }else{
            System.out.println("No es un triángulo");
        }
        
    }
    
}