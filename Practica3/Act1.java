import java.util.Scanner; 

public class Act1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String c;
        double suma = 0;
        int cont = 0;

        System.out.println("Escribe tu calificación: ");
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
                default: System.out.println("El valor es invalido");
            }

            cont++; 
            System.out.println(c);
            System.out.println("Escribe tu calificación; ");
            c = sc.next();
        }
    
        if(cont == 0){
            System.out.println("No escribiste nada");
        }else{

        System.out.println("Tu promedio es: " + suma/cont);
        }
    
   
    }
}