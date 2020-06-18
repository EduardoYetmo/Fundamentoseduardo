/*Actividad 1: Escribir el programa 3 de la sección 4.2 utilizando 
  un switch para seleccionar la calificación númerica.
*/
import java.util.Scanner;
public class Act1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String c;
        double suma = 0;
        int cont = 0;
        int contnv = 0;
        

        System.out.println("\n                  *****Calificaciones*****\n");
        System.out.println("Las calificaciones son: MB = 10, B = 8, S = 6 y NA = 5.");
        System.out.println("Al finaliza de ingresar tus calificaciones escribe la palabra FIN. \n");
        System.out.println("Para obtener tu promedio escribe tu calificación: ");
        System.out.print("Calificación:  ");
        c = sc.nextLine();

        while(  !c.equals("FIN") ){
            
            switch(c){
                case "MB": suma += 10.0;
                        break;
                case "B": suma += 8.0;
                        break;
                case "S": suma += 6.0;
                        break;
                case "NA": suma += 5.0;
                        break;
                default: System.out.println("---Valor no valido---");
                contnv++;
            }

            cont++; 
            
            System.out.print("Calificación:  ");
            c = sc.next();
        }

        cont = cont - contnv;
    
        if(cont == 0){
            System.out.println("No escribiste nada");
        }else{

        System.out.println("\nTu promedio es: " + suma/cont);
        }
    
   
    }
}