public class Ej3Ordenacion {
    public static void main(String[] args) {
        int[] arr, arrOrd;
        int n=50; //tamaño del arreglo
        int r=100; //rango de aleatorios

        arr = generaArreglo(n,r);

        imprimirArreglo(n,arr);

        arrOrd = ordenaArreglo(n,arr);

        imprimirArreglo(n,arrOrd);
    }

    public static int[] generaArreglo(int n, int r){
        int[] arr = new int[n];
        int ind;

        for(ind = 0; ind<n; ind++){
            arr[ind] = (int)(Math.random()*10);
        }

        return arr;
    }

    public static void imprimirArreglo(int n, int[] arr){
        int ind;

        for(ind=0 ; ind<n; ind++){
            System.out.print(arr[ind] + " ");
        }
        System.out.println();
    }

    public static int[] ordenaArreglo(int n, int[] arr){
        int[] arrOrd = new int[n];

        return arrOrd;

    }
}