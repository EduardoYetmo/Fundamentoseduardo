public class Ej1recorrido{
    public static void main(String[] args) {
        int p=3, n=4, m=5;//p planos, n flinas, m columnas

        int[]       arr  = new int[n];
        int[][]     arr2 = new int[n][m];
        int[][][]   arr3 = new int[p][n][m];

        int ind, pla, fil, col;

        for(ind = 0; ind<n; ind++){
            arr[ind] = (int)(Math.random()*10);
        }
        for(ind = 0; ind<n; ind++){
            System.out.print(arr[ind] + " ");
        }
        System.out.println();

        for(ind = 0; ind<n; ind++){
            System.out.print("arr{" + ind + "] = " + arr[ind] + ", ");
        }
        System.out.println("\n**************************\n");


        for (fil=0; fil<n; fil++){
            for(col =0; col<m; col++){
                arr2[fil][col] = (int)(Math.random()*10);
            }
        }
        for(fil=0; fil<n; fil++){
            for(col=0; col<m; col++){
                System.out.print(arr2[fil][col] + " ");
            }
            System.out.println("");
        }
        for( fil=0; fil<n; fil++){
            for(col=0; col<m; col++){
                System.out.print("arr[" + fil + "][" + col +"]= " + arr2[fil][col] + ",");
            }

        }

        System.out.println("\n**************************");


        for(pla=0; pla<p; pla++){
            for(fil=0; fil<n; fil++){
                for(col=0; col<m; col++){
                    arr3[pla][fil][col] = (int)(Math.random()*10);

                }

            }
        }

        for(pla=0; pla<p; pla++){
            for(fil=0; fil<n; fil++){
                for(col=0; col<m; col++){

                    System.out.print(arr3[pla][fil][col] + " ");
                    }    
                System.out.println(" ");
                }           
            System.out.println(" ");
        }
        for(pla=0; pla<p; pla++){
            for(fil=0; fil<n; fil++){
                for(col=0; col<m; col++){
                    System.out.println("arr3[" + pla + "][" + fil + "][" + col + "]= " + arr3[pla][fil][col] + ". ");
                }
            }
        } 

        System.out.println("\n********************");
    }
}