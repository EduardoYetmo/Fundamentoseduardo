import java.util.Scanner; 
public class Ej9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int cont;
        int num;
        int ma=0;
        int me=1000;

        System.out.println("Escribe el número de datos: ");
        n = sc.nextInt();
        cont = n;
        
        do{
            num = sc.nextInt();
            if(num>ma){
                ma = num;
            }
            if(num<me){
                me = num;
            
             }
             cont = cont-1;
            
        }
        while(cont==0);
            
        System.out.println("Mayor = "+ ma);
        System.out.println("Menor = "+ me);
    }
}