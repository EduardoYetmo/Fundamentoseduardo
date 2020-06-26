import java.util.Scanner; 
public class Calculadora{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int op;
        double a,b,r;

        do{
            System.out.println("\n*****Calculadora*****");
            System.out.println("\n1.-Suma");
            System.out.println("2.-Resta");
            System.out.println("3.-Multiplicación");
            System.out.println("4.-División");
            System.out.println("5.-Salir");

            System.out.print("\nSelecciona una opción: ");
            op = sc.nextInt();

            switch(op){
                case 1: //Suma
                        System.out.println("Ingrese los números para sumar: ");
                        a = solicitarOperador();
                        b = solicitarOperador();
                        r = suma(a,b);
                        imprimeResultado(r);
                        break;
                case 2: //Resta
                        System.out.println("Ingrese los números para restar: ");
                        a = solicitarOperador();
                        b = solicitarOperador();
                        r = resta(a,b);
                        imprimeResultado(r);
                        break;
                case 3: //Multiplicación
                        System.out.println("Ingrese los números para multiplicar: ");
                        a = solicitarOperador();
                        b = solicitarOperador();
                        r = multiplicacion(a,b);
                        imprimeResultado(r);
                        break;
                case 4: //División
                        System.out.println("Ingrese los números para dividir: ");
                        a = solicitarOperador();
                        b = solicitarOperador();
                        r = division(a,b);
                        imprimeResultado(r);
                        break;
                case 5: System.out.println("\nApagando la Calculadora...");
                        break;
                default: System.out.println("---Opción no valida---\n");
                        break;
            }



        }while(op != 5);
    }

    public static void imprimeResultado(double resp){
        System.out.print("\nEl resultado es:      " + resp + "\n");
    }

    public static double solicitarOperador(){
        double x; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Operando =        ");
        x = sc.nextDouble();
        return x;
    }

    public static double suma(double x, double y){
        double r;
        r = x+y;
        return r;
    }

    public static double resta(double x, double y){
        double r;
        r = x-y;
        return r;
    }

    public static double multiplicacion(double x, double y){
        double r;
        r = x*y;
        return r;
    }

    public static double division(double x, double y){
        double r;
        r = x/y;
        return r;
    }
}