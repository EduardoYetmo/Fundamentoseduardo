import java.util.Scanner; 
public class Prob2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String TI, TP;
        int N;
        double PA,CA,TO,TOT;

        System.out.println("*****El Náufrago Satisfecho*****\n");
        System.out.println("Te ofrece las siguientes hamburguesas: ");
        System.out.println("1. Secillas----------$ 20.00");
        System.out.println("2. Dobles------------$ 25.00");
        System.out.println("3. Triples-----------$ 28.00");
        System.out.print("\nSelecciona la opción deseada: ");

        N = sc.nextInt();

        do{
        switch(N){
            case 1: 
                    break;
            case 2: 
                    break;
            case 3: 
                    break;
            default: System.out.println("No elegiste una opción");

        }
    }while(N!=4);
    }
}