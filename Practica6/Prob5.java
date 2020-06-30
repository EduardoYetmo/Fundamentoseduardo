import java.util.Scanner; 
public class Prob5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num,A=0,B=0,C=0;
        double N;
        double CN = 0;

        System.out.println("*****Tienda Tiki Taka*****\n");
        System.out.print("Ingrese el número de ventas que se realizarón:");
        num = sc.nextInt();   

        for(int i=1;i<=num;i++){
            System.out.print("Ingrese la cantidad de las ventas: $ ");
            N = sc.nextDouble();
            CN = CN+N;

            if(N>=1000){
                A = A+1;
            }
            if(N>=500 && N<1000){
                B = B+1;
            }
            if(N<500){
                C = C+1;
            }

        }
        
        System.out.println("Ventas Mayores a $ 1000:   " + A + " ventas");
        System.out.println("Ventas entre $ 500 y $ 1000:    " + B + " Ventas");
        System.out.println("Ventas Menores a $ 500:    " + B + " Ventas");
    }
}