import java.util.Scanner; 
public class Ej2Busqueda {
    public static void main(String[] args) {
        
        int n = 50;

        int[] arr = new int[n];

        int ind, x;
        Scanner sc = new Scanner(System.in);
        boolean esta;

        for(ind =0; ind<n; ind++){
            arr[ind] = (int)(Math.random()*100 );
        }

        for (ind=0; ind<n; ind++){
            System.out.print(arr[ind]+" ");
        }
        System.out.println();

        x = sc.nextInt();

        esta = false;

        for(ind=0; ind<n; ind++){
            if(arr[ind]==x){
                esta = true;
                break;
            }
        }

        System.out.println("Esta = " + esta);
        
    }
}