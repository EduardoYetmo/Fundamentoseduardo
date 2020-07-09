public class Principal{
    public static void main(String[] args) {
        
        int[] arr = new int[2];
        int[][] arr2 = new int [2][3];
        int [][][] arr3 = new int[3][3][2];

        for(int i=0; i<2; i++){
            arr[i] = i;
        }
        for (int i=0; i<2; i++){
            System.out.println(arr[i]);
        }
    }
}