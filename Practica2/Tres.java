/**Actividad 4: Dado un número entero entre 1 y 999, escribir su equivalente
 * en numeración romana
 */
import java.util.Scanner;
public class Tres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num; 

        System.out.println("Números Romanos");
        System.out.println("Ingrese un numero entre el 1 y el 1000:");

        do{
        num = sc.nextInt();
        }while(num < 1 || num > 1000);
        System.out.println(num + " en número romano es: " + convertirRomano(num));
    }

    public static String convertirRomano(int num){
        int m, c, d, u;
        String romano = "";

        m = num/1000;
        c = num / 100 % 10;
        d = num / 10 % 10;
        u = num % 10; 

        //millar
        if(m == 1){
            romano = romano + "M";
        }
      
        //Centenas
        if(c <= 3){
            for(int i=1; i<=c; i++){
                romano = romano + "C";
            }
        }
        if(c == 4){
            romano = romano + "CD";
        }
        if(c >= 5 && c <= 8){
            romano = romano + "D";
                for(int i=6; i<=c; i++){
                    romano = romano + "C";
                }
        }
        if(c == 9){
            romano = romano + "CM";
        }

        //Decenas
        if(d <= 3){
            for(int i=1; i<=d; i++){
                romano = romano + "X";
            }
        }
        if(d == 4){
            romano = romano + "XL";
        }
        if(d >= 5 && d <= 8){
            romano = romano + "L";
                for(int i=6; i<=d; i++){
                    romano = romano + "X";
                }
        }
        if(d == 9){
            romano = romano + "XC";
        }

        //Unidades
        if(u <= 3 ){
            for(int i=1; i<=u; i++){
                romano = romano+"I";
            }
        }
        if(u == 4){
           romano = romano + "IV";
        }
        if(u >= 5 && u <= 8){
            romano = romano + "V";
                for(int i=6; i<=u; i++){
                    romano = romano + "I";
                }
        }
        if(u == 9){
            romano = romano + "IX";
        }

        
        return romano;        
    }
    
}