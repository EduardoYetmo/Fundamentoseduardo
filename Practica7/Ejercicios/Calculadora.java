import java.util.Scanner; 
public class Calculadora{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do{

        

        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");

        System.out.println("Selecciona una opción: ");
        op = sc.nextInt();

        switch(op){
            case 1://suma
                sumar();
                break;
            case 2: //Resta
                restar();
                break;
            case 3: //Multiplicación
                multiplicar();
                break;
            case 4: //División
                dividir();
                break;
            case 5: System.out.println("Apagando calculadora");
                break;
            default: System.out.println("---Opción no Valida---");
                
            
        }
            

        }while(op !=5);
    }
    public static void sumar(){
        double a,b,r;
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        a=sc.nextDouble();

        System.out.print("b = ");
        b=sc.nextDouble();

        r = a+b;
        System.out.println("resultado = " + r);



    }
    public static void restar(){
        
    }
    public static void multiplicar(){
        
    }
    public static void dividir(){
        
    }
}