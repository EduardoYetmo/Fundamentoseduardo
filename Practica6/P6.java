
import java.util.Scanner;
public class P6 {
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
            System.out.println("5.-Factorial");
            System.out.println("6.-Combinacioones de K elementos en un grupo de n");
            System.out.println("7.-Exponencial");
            System.out.println("8.-Salir");

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
                case 5: //Factoria
                        System.out.println("Ingrese el número para obtener su factorial: ");
                        a = solicitarOperador();
                        r = factorial(a);
                        imprimeResultado(r);
                        break;
                case 6: //Combinaciones de k elementos de un grupo en n
                        System.out.println("Ingrese los números para obtener la combinación: ");
                        a = solicitarOperador();
                        b = solicitarOperador();
                        r = combinaciones(a,b);
                        imprimeResultado(r);;
                        break;
                case 7: //Exponencial
                        System.out.println("Ingrese un número para obtener su exponencial: ");
                        a = solicitarOperador();
                        r = exponencial(a);
                        imprimeResultado(r);
                        break;
                case 8: //Salir
                        System.out.println("\nApagando la Calculadora...");
                        break;
                default: System.out.println("---Opción no valida---\n");
                        break;
            }
        }while(op != 8);
    }
    public static void imprimeResultado(double resp){
        System.out.print("\nEl resultado es: " + resp + "\n");
    }

    public static double solicitarOperador(){
        double x; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Operando = ");
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

    public static double factorial(double x){
        double r=1;
        for(int i=1;i<=x;i++){
            r=r*i;
        }
        return r;
    }

    public static double combinaciones(double n, double K){
        double r=0;
        r = factorial(n) / (factorial(K)*factorial(n-K));
        return r;
    }

    public static double exponencial(double x){
        double r=0;
        int n=50;
        for(int i=1; i<=n;i++){
            r += (Math.pow(x, i)/factorial(i));
        }
        return r;
    }

}