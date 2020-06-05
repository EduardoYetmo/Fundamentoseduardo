/**Actividad 4: Dado un número entero entre 1 y 999, escribir su equivalente
 * en numeración romana
 */

import java.util.Scanner;

public class Nueve {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int unidad;
        int decena;
        int centena;
        int millar;
        int n;
        int temp = 0;

        String[] unidadx = {"I", "II", "II", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] decenax = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] centenax = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] millarx = {"M"};

        s = new Scanner(System.in);

        System.out.println("Ingresa un número: ");

        n = s.nextInt();
        
        unidad = n % 10;
        n/= 10;

        decena = n % 10;
        n /= 10;

        centena = n % 10;
        n /= 10;

        millar = n % 10;

        System.out.println(); 
        System.out.println("El número romano es:");

        for (int i = 1; i <= 3; i++) {
            if (millar == i && millar != 0) {
                temp = i - 1;
                System.out.println(millarx[temp]);
            }
        }
        for (int i = 1; i <= 9; i++) {
            if (centena == i && centena != 0) {
                temp = i - 1;
                System.out.println(centenax[temp]);
            }
        }
        for (int i = 1; i <= 9; i++) {
            if (decena == i && decena != 0) {
                temp = i - 1;
                System.out.println(decenax[temp]);
            }
        }
        for (int i = 1; i <= 9; i++) {
            if (unidad == i && unidad != 0) {
                temp = i - 1;
                System.out.println(unidadx[temp]);
            }
        }
    }
}