//1.-Un empleado realiza N ventas durante el dia, se requiere saber cuales fueron las ventas:
//      Cuántas de ellas fueron mayores a $1000.
//      Cuántas fueron mayores a $ 500 pero menores o iguales a $ 1000.
//      Cuántas fueron menores o iguales a $ 500.
//Identificar el monto de lo vendido en cada categoría y de forma global.

import java.util.Scanner; 
public class P5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num,A=0,B=0,C=0;
        double N;
        double CN = 0,T1=0,T2=0,T3=0;

        System.out.println("*****Tienda Tiki Taka*****\n");
        System.out.print("Ingrese el número de ventas que se realizarón durante el día: ");
        num = sc.nextInt();

        for(int i=1; i<=num; i++){
            System.out.print("Ingrese la venta "+i+": $ ");
            N = sc.nextDouble();

            if(N>1000){
                A = A+1;   
                T1 = T1+N;
            }
            if(N>500 && N<=1000){
                B = B+1;
                T2 = T2+N;
            }
            if(N<=500){
                C = C+1; 
                T3 = T3+N;
            }
            CN=CN+N;
            
        }

        System.out.println("\nVentas Mayores a $ 1000:   " + A + " ventas");
        System.out.println("El total de ventas mayores a $ 1000 son: $ " + T1);
        System.out.println("\nVentas entre $ 500 y $ 1000:    " + B + " Ventas");
        System.out.println("El total de ventas entre $ 500 y $ 1000 son: $ " + T2);
        System.out.println("\nVentas Menores a $ 500:    " + C + " Ventas");
        System.out.println("El total de ventas menores a $ 500 son: $ " + T3);
        System.out.println("\nLas ventas totales fueron: $ " + CN);
    }
}