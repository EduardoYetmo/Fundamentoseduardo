/*
Actividad 1: Dados tres números obtener el resultado de multiplicar 
los dos mayores mas el menor
*/

import java.util.Scanner;

public class Siete {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
            
        double a;
        double b;
        double c;
        double resultado;

        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();

        if(a>b && b>c){
            resultado = a * b + c;
            System.out.println(resultado);
        
        }else{
        
        if(a>c && c>b){
            resultado = a * c + b;
            System.out.println(resultado);
        
        }else{
        
        if(b>a && a>c){
            resultado = b * a + c;
            System.out.println(resultado);
        
        }else{
        
        if(b>c && c>a){
            resultado = b * c + a;
            System.out.println(resultado);
                    
        }else{

        if(c>a && a>b){
            resultado = c * a + b;
            System.out.println(resultado);
            
        }else{

        if(c>b && b>a){
            resultado = c * b + a;
            System.out.println(resultado);
            
        }
        }
        }
        }
        }
        }
    }
}