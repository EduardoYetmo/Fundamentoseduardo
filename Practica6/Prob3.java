import java.util.Scanner; 
public class Prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TT,n;
        double LA,AC,NC;

        

        System.out.println("*****Bienvenido al Banco Pueblo Desconocido*****");
        System.out.println("Opciones de servicios de tarjetas");
        System.out.println("1.-Tarjeta tipo 1");
        System.out.println("2.-Tarjeta tipo 2");
        System.out.println("3.-Tarjeta tipo 3");
        System.out.println("4.-Otra tarjeta");
        System.out.println("5.-Manejo más de una tarjeta");
        System.out.println("6.-No majeno tarjetas");
        System.out.println("\nPor favor indique que tipo de tarjeta maneja");

       

        TT = sc.nextInt();

        while(TT >= 6){

        switch(TT){
            case 1: 
                    System.out.println("Usted maneja la tarjeta del tipo 1");
                    System.out.print("Ingrese el límite actual de credito: ");
                    LA = sc.nextDouble();
                    System.out.println("Tu limite de credito es de $ " + LA + "0");
                    System.out.println("El incremento autorizado es del 25%");
                    AC = 1.25;
                    NC = LA * AC;
                    System.out.println("El nuevo límite de credito es de: $ " + NC+ "0");
                    break;

            case 2: 
                    System.out.println("Usted maneja la tarjeta del tipo 2");
                    System.out.print("Ingrese el límite actual de credito: ");
                        LA = sc.nextDouble();
                    System.out.println("Tu limite de credito es de $ " + LA + "0");
                    System.out.println("El incremento autorizado es del 35%");
                        AC = 1.35;
                        NC = LA * AC;
                    System.out.println("El nuevo límite de credito es de: $ " + NC+ "0");
                    break;

            case 3:
                    System.out.println("Usted maneja la tarjeta del tipo 3");
                    System.out.print("Ingrese el límite actual de credito: ");
                        LA = sc.nextDouble();
                    System.out.println("Tu limite de credito es de $ " + LA + "0");
                    System.out.println("El incremento autorizado es del 40%");
                        AC = 1.40;
                        NC = LA * AC;
                    System.out.println("El nuevo límite de credito es de: $ " + NC+ "0");
                    break;

            case 4:
                    System.out.println("Usted maneja otra tarjeta diferente");
                    System.out.print("Ingrese el límite actual de credito: ");
                    LA = sc.nextDouble();
                    System.out.println("Tu limite de credito es de $ " + LA + "0");
                    System.out.println("El incremento autorizado es del 50%");
                        AC = 1.50;
                        NC = LA * AC;
                    System.out.println("El nuevo límite de credito es de: $ " + NC+ "0");
                    break;

            case 5: 
                    System.out.println("Usted maneja mas de dos tarjetas");
                    System.out.print("Indique cuantas tarjetas maneja: ");
                    n = sc.nextInt();
                    System.out.println("Indique en que tarjeta le gustaria que le aplicara el aumento de límite de credito");
                    System.out.println("1.-Tarjeta tipo 1");
                    System.out.println("2.-Tarjeta tipo 2");
                    System.out.println("3.-Tarjeta tipo 3");
                    TT = sc.nextInt();
                    break;

            case 6: 
                    System.out.println("---Gracias por su atencion y preferencia---");
                    break;
            default: 
                    System.out.println("Opción no valida");
                    
        
        }
    }

    
}
}