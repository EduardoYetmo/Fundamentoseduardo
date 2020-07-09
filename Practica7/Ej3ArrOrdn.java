public class Ej3ArrOrdn{
    public static void main(String[] args) {
        int[] arr, arrOrd;
        int n=50; //tamaño del arreglo
        int r=100; //rango de aleatorios

            arr = generaArreglo(n,r);
        System.out.println("Se obtenienen "+n+" números aleatorios");
            imprimirArreglo(n,arr);

            arrOrd = ordenaArreglo(n,arr);
        System.out.println("\nLos mismos 50 número ordenados de mayor a menor: ");
            imprimirArreglo(n,arrOrd);
    }

    public static int[] generaArreglo(int n, int r){
        int[] arr = new int[n];
        int ind;

        for(ind = 0; ind<n; ind++){
            arr[ind] = (int)(Math.random()*r);
        }

        return arr;
    }

    public static void imprimirArreglo(int n, int[] arr){
        int ind;

        for(ind=0; ind<n; ind++){
            System.out.print(arr[ind] + " ");
        }
        System.out.println();
    }

    public static int[] ordenaArreglo(int n, int[] arr){
        int[] arrOrd = new int[n];
        int N, mayor, ind=0;

        for(int j=0; j<n; j++){
            mayor=0;
            for(int i=0; i<n;i++){
                if(arr[i]>mayor){
                    mayor = arr[i];
                    ind=i;  
                }
            }
            arr[ind]=0;
            arrOrd[j]=mayor;
        }

        return arrOrd;
    }
}