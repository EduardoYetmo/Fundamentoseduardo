import java.util.Scanner; 
public class Ej10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int m;

        System.out.println("Escribe los numeros para obtener MCD: ");

        do{
            a = sc.nextInt();
            b = sc.nextInt();
        }
        while(a<=0 && b<=0);

        m = a%b;

        while(m!=0){
            a=b;
            b=m;
            m=a%b;
        }
        System.out.println("MCD = " + b);
    }
}