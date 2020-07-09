import java.util.Scanner; 
public class Ej3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] arr, arrOrd;
        int n=50; //tamaño de arreglo
        int r=100; //rango de aleatorios

        arr = generaArreglo(n,r);
        imprimirArreglo(n,arr);

        arrOrd = ordenaArreglo(n,arr);
        imprimirArreglo(n,arrOrd);
    }

    public static int[] generaArreglo(int n, int r){
        int[] arr = new int[n];

        //codigo para genera arreglo
        return arr;
    }

    public static void imprimirArreglo(int n, int[] arr){
        //codigo para imprimir arr
    }

    public static int[] ordenaArreglo(int n, int[] arr){
        int[] arrOrd = new int[n];

        return arrOrd;
        
    }


}