//Actividad 12: Utilizar el problema anterior para encontrar los primeros 
//6 números perfectos.
import java.util.Scanner; 
public class Ej12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int suma = 0; 
        int n=1;
        int np=1;
        String nump="";
        
        System.out.println("Imprime los primeros números perfectos");
        while(np<5){
            n++;
            for (int i = 1; i < n; i++) { 
                if(n % i == 0){
                    suma = suma + i;  
                }
            }
            if(suma == n){
                np = np +1;
                nump = nump + suma + ", ";
                suma=0;
            }else{
                suma = 0;
            }
        }
        System.out.println("Los primeros 4 son: "+nump);
    }
}
