import java.util.Scanner; 

public class Ej3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String calif;
        double suma = 0;
        int cont = 0;


        System.out.println("Escribe tu calificación; ");
        calif = sc.next();

        while( !calif.equals("FIN") ){

            if( calif.equals("NA")){
                suma += 5.0;
            }
            if( calif.equals("S")){
                suma += 6.0;
            }
            if( calif.equals("B")){
                suma += 8.0;
            }
            if( calif.equals("MB")){
                suma += 10.0;
            }
           
            cont++;

            System.out.println(calif);
            System.out.println("Escribe tu calificación; ");
            calif = sc.next();
        }

        if(cont == 0){
            System.out.println("No escribiste nada");
        }else{

        System.out.println("Tu promedio es: " + suma/cont);
        }
    }
    
}