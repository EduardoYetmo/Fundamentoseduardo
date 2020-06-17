import java.util.Scanner; 

public class Act5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        int a=0;
        int b=1;
        int c;

        System.out.println("\nIngrese un número: ");    
        n = sc.nextInt();
        System.out.println("\nSiendo f0=0 y f1=1 el resultado es: \n");

        for(int i=1;i>=a;i++){
            System.out.println(a);
            c = a+b;
            a = b;
            b = c;
        }
        
        System.out.println(a);
        System.out.println("\nEl resultado es: "+ a);
        
        
    }
    
}