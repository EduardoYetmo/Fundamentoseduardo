//Actividad 2: Dada la calificación c numérica de un alumno, dar su 
//calificación con la letra de acuerdo a la escala:
//0 <= c < 6 ----> NA 
//6 <= c < 7.5----> B
//7.50 <= c < 10 ----> MB

import java.util.Scanner; 
public class Dos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double c;
   
        System.out.println("Ingresa tu calificación: ");
        c = s.nextDouble();

        if(0 <= c && c < 6){
            System.out.println("La calificación es: NA");
    
        }else{

            if(6 <= c && c < 7.5){
                System.out.println("La calificación es: B");
    
            }else{
    
                if(7.5 <= c && c <= 10){
                    System.out.println("La calificación es: MB");
                }
            }
        }
        
    }
    
}