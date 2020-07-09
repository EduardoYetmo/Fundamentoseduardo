import java.util.Scanner; 
public class Ej4gato{
    
    static char tablero[][] = new char[3][3];

    public static void main(String[] args) {

        int tiro[] = new int[2];
        String ganador = "nadie";
        int n=0;
        
        iniciaTablero();
        dibujaTablero();
        do{
        juegaUsuario(tiro);
        actualizaTablero(tiro,'X');
        juegaCPU(tiro);
        actualizaTablero(tiro,'O');

        ganador = analiza();
        dibujaTablero();
        }while(!ganador.equals("nadie"));
    }

    public static void actualizaTablero(int tiro[],char c){
        tablero[tiro[0]][tiro[1]] = c;

        return c;
    }

    public static void analiza(){
        String ganador="nadie";
            if (tablero[0][0]== "X" && tablero[0][1]== "X" && tablero[0][2]== "X") {
            System.out.println("El ganador es el jugador 'x'.");
            break;
            }
            if (tablero[1][0]== "X" && tablero[1][1]== "X" && tablero[1][2]== "X") {
            System.out.println("El ganador es el jugador 'x'.");
            break;
            }
            else if (tablero[2][0]== "X" && tablero[2][1]== "X" && tablero[2][2]== "X") {
            System.out.println("El ganador es el jugador X.");
            break;
            }
            if (tablero[0][0]== "X" && tablero[1][0]== "X" && tablero[2][0]== "X") {
            System.out.println("El ganador es el jugador X.");
            break;
            }
            if (tablero[0][1]== "X" && tablero[1][1]== "X" && tablero[2][1]== "X") {
            System.out.println("El ganador es el jugador X.");
            break;
            }
            if (tablero[0][2]== "X" && tablero[1][2]== "X" && tablero[2][2]== "X") {
            System.out.println("El ganador es el jugador 'X'.");
            break;
            }
            //diagonales faltan
            if (tablero[0][0]== "X" && tablero[1][1]== "X" && tablero[2][2]== "X") {
            System.out.println("El ganador es el jugador X.");
            break;
            }
            if (tablero[0][2]== "X" && tablero[1][1]== "X" && tablero[2][0]== "X") {
            System.out.println("El ganador es el jugador X.");
            break;
            }
            //condiciones victoria
            
            if (n==9) {
            break;
            }
        return ganador;
    }

    public static void juegaCPU(int tiro[]){
        System.out.println("Turno del CPU, Juega con O:");
        tiro[0]=(int)(Math.random()*3)+0;
        tiro[1]=(int)(Math.random()*3)+0;
        //generar fila y columna aleatorias, localidades descupadas.
    }

    public static void juegaUsuario(int tiro[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Turno del usuario, Juega con X:");
        System.out.print("fil: ");
        tiro[0] = sc.nextInt();
        System.out.print("col: ");
        tiro[1] = sc.nextInt();

        sc.close();
    }

    public static void dibujaTablero(){
        System.out.println("     c0   c1   c2 ");
        System.out.println("        |    |    ");
        System.out.println("f0   "+tablero[0][0]+"  | "+tablero[0][1]+"  | "+tablero[0][2]);
        System.out.println("    ____|____|____");
        System.out.println("        |    |    ");
        System.out.println("f1   "+tablero[1][0]+"  | "+tablero[1][1]+"  | "+tablero[1][2]);
        System.out.println("    ____|____|____");
        System.out.println("        |    |    ");
        System.out.println("f2   "+tablero[2][0]+"  | "+tablero[2][1]+"  | "+tablero[2][2]);
        System.out.println("        |    |    ");
    }

    public static void iniciaTablero(){

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                tablero[i][j] = ' ';
            }
        }
    } 

}