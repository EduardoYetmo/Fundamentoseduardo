//3.- El banco "Pueblo Desconocido" decidio aumentar el limite de crédito de las tarjetas 
//de crédito de sus clientes. Determinar el nuevo límite de crédito que tendrá una persona
//en su tarjeta.
import java.util.Scanner;
public class P3{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int TT;
        double AC,NC;

        System.out.println("*****Bienvenido al Banco Pueblo Desconocido*****");
        do{
            TT = menu();
        switch(TT){
            case 1:
                    AC = 0.25;
                System.out.println("\nUsted maneja la tarjeta del tipo 1");
                System.out.println("El incremento autorizado es del 25%");
                    NC = credito(AC);
                break;
            case 2:
                    AC = 0.35;
                System.out.println("\nUsted maneja la tarjeta del tipo 2");
                System.out.println("El incremento autorizado es del 35%");
                    NC = credito(AC);
                break; 
            case 3:
                    AC = 0.40;
                System.out.println("\nUsted maneja la tarjeta del tipo 3");
                System.out.println("El incremento autorizado es del 40%");
                    NC = credito(AC);
                break;
            case 4:
                    AC = 0.50;
                System.out.println("\nUsted maneja otra tarjeta");
                System.out.println("El incremento autorizado es del 50%");
                    NC = credito(AC);
                break;
            case 5:
                System.out.println("\nUsted no maneja ningun tipo de tarjetas.\n");
                System.out.println("Lo invitamos a tramitar alguna de nuestras tarjetas para que disfrute ");
                System.out.println("de los benefinicios que se le dan a nuestros clientes.");
                System.out.println("Puede acudir a nuestras sucursales para más información.");
                System.out.println("---Gracias por su atención y preferencia---");
                break;
            default: 
                System.out.println("\nOpción no valida.");
                System.out.println("Intenta de nuevo.\n");
                break;
        }


        }while(TT >5);
    }

    public static double credito(double AC){
        Scanner sc = new Scanner(System.in);
        double r,n,LA;

        System.out.print("Ingrese el límite actual de credito: ");
            LA = sc.nextDouble();
        System.out.println("Tu limite de credito es de $ " + LA + "0");
            n = LA * AC;
        System.out.println("El aumento de su credito es de: $ " + n);
            r = LA+n;
        System.out.println("El nuevo límite de su crédito es de: $ " + r);
        System.out.println("Esperemos que disfrute de su crédito.");
        System.out.println("Agradecemos su preferencia.");
        return r;

    }

    public static int menu(){
        Scanner sc = new Scanner(System.in);
        int r;

        System.out.println("Opciones de servicios de tarjetas");
        System.out.println("1.-Tarjeta tipo 1");
        System.out.println("2.-Tarjeta tipo 2");
        System.out.println("3.-Tarjeta tipo 3");
        System.out.println("4.-Otra tarjeta");
        System.out.println("5.-No majeno tarjetas");

        System.out.println("\nPor favor indique que tipo de tarjeta maneja");
            r = sc.nextInt();
        return r;

    }
}