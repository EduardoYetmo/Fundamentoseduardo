//Actividad 4: Hacer un programa para retirar dinero de una tarjeta en un cajero automatico
import java.util.Scanner; 
public class Cuatro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, r;
        double saldo = 5000;
        double otra;
        int pregunta;
        int respuesta;

        System.out.println("***Retiro de Dinero***");
        System.out.println("Inserta tu tarjeta");
        System.out.println("Inserte NIP de 4 digitos: ");

            a = s.nextDouble();

        System.out.println("Tu saldo en tu cuenta es de: $ " + saldo + "0");
        System.out.println("¿Quieres hacer un retiro?");
            
        pregunta = SoN();

        if(pregunta == 1){
            System.out.println("Espere un momento...");
            System.out.println("***Seleccione la cantidad que desea retirar***");
                respuesta = despliegaMenu();

            switch(respuesta){
                case 1: 
                    System.out.println("Está seguro que desea retirar $ 50.00");
                    r = SoN();
                    break;
                case 2:
                    System.out.println("Está Seguro que desea retirar $ 100.00");
                    r = SoN();
                    break;
                case 3:
                    System.out.println("Está Seguro que desea retirar $ 200.00");
                    r = SoN();
                    break;
                case 4:
                    System.out.println("Está Seguro que desea retirar $ 300.00");
                    r = SoN();
                    break;
                case 5:
                    System.out.println("Está Seguro que desea retirar $ 400.00");
                    r = SoN();
                    break;
                case 6:
                    System.out.println("Está Seguro que desea retirar $ 500.00");
                    r = SoN();
                    break;
                case 7:
                    System.out.println("Está Seguro que desea retirar $ 1000.00");
                    r = SoN();
                    break;
                case 8:
                        otra = canti(); 
                        break; 
                default:
                    System.out.println("Opción invalida por favor elige otra opción:");
                    break;        
                }
        System.out.println("Espere un momento...");
        System.out.println("***Retire su tarjeta***");
        System.out.println("***Retire su dinero***");
        System.out.println("***Retire su ticket***");
        System.out.println("Gracias por su preferencia Excelente día.");

        }

    }

    public static int canti(){
        int r=0;
        int resp;
        int x;
        Scanner s = new Scanner(System.in);
        
        do{
        System.out.print("Digite otra cantidad: $ ");
        r = s.nextInt();
        System.out.println("Está seguro que desea retirar: $ " + r);
        x = preg();
        }while(x == 2);

        return r;
    }

    public static int preg(){
        int r=0;
        Scanner s = new Scanner(System.in);
        System.out.println("1.Si            2.No");
            r = s.nextInt();

        return r;
    }

    public static int SoN(){
        int r=0;
        Scanner s = new Scanner(System.in);
        System.out.println("1.Si            2.No");
            r = s.nextInt();

            if(r==2){
                System.out.println("***Retire su tarjeta***");
                System.out.println("Gracias por su preferencia.");   
            }
            return r;
    }
    
    public static int despliegaMenu(){
        int r = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("1.- $ 50.00       5.- $ 400.00");
        System.out.println("2.- $ 100.00      6.- $ 500.00");
        System.out.println("3.- $ 200.00      7.- $ 1000.00");
        System.out.println("4.- $ 300.00      8.- Otra cantidad");

        r = s.nextInt();

            
        return r;
    }
}