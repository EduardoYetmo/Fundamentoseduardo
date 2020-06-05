import java.util.Scanner; 
public class Once {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int a;
        int pregunta;
        double otra;

        System.out.println("***Deposito a tarjeta***");
        System.out.println("***Inserte tarjeta***");
        System.out.println("***Ingrese el NIP***");

        a = s.nextInt();

        System.out.println("Capture el número de cuenta: ");

        a = s.nextInt();

        System.out.println("Monto que desea depositar: ");
       
        a = s.nextInt();

        System.out.println("Ustede desea depositar; $ " + a +".00");

        pregunta = SoN();
        
        if(pregunta == 1){
            System.out.println("Espere un momento...");  
            System.out.println("***Retire su ticket***");
            System.out.println("***Retire su tarjeta***");         
        }
        if(pregunta == 2){
           System.out.println("Digite otra cantidad: ");
           otra = s.nextDouble();
           System.out.println("¿Esta Seguro que desea retirar: $ " + otra +"0?");
           pregunta = SoN();
           
        if(pregunta == 1){
            System.out.println("Espere un momento..."); 
            System.out.println("***Retire su ticket***");
            System.out.println("***Retire su tarjeta***");   
        }       
        }
        if(pregunta == 2){
            System.out.println("***Su transferencia fue denegada, intente mas tarde***");

        }
        
        System.out.println("***Gracias por su preferencia***");
        

    
    }
    public static int SoN(){
        int r=0;
        Scanner s = new Scanner(System.in);

        System.out.println("1.-Si         2.-No");

        r = s.nextInt();
        return r;
    }
}