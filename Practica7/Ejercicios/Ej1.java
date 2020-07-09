import java.util.Scanner; 
public class Ej1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 50, ind, x;
        boolean esta;
        int[] arr = new int[n];

        for ( ind =0; ind<n; ind++){
            arr[ind] = (int)(Math.random()+100);
        }
        for (ind = 0; ind<n; ind++){
            System.out.println(arr[ind] + " ");
        
        }
        System.out.println();
        x = sc.nextInt();

        esta = false;

        for(ind=0; ind<=0;ind++){
            if(arr[ind]==x){
                esta = true;
                break;
            }

        }
        System.out.println("Esta = " + esta);

    }
}