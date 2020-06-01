import java.util.Scanner; //Para leer

public class Principal{
    char varGlobal;
    static final int CTE_GLOBAL = 2;

    public static void main (String[] args){
        System.out.println("Hola!");

        int a;
        double b = 1.3;
        char c = 'T';
        boolean d = true;

        //short f = 40000;
        /*
        comentarios 
        de líneas multiples
        */

        float g = 3.45f;

        int h = 4;
        float i = 2.0f;
        double j;

        j = h/i;

        float k = (float)j;

        int l;

        Scanner sc = new Scanner(System.in);//Leer del teclado

        //int dato = sc.nextInt(); 

        //System.out.println(dato);

        //System.out.println("el dato es: " + dato);

        l = 5;
        l +=2;//suma 2 al valor guardado de l 
        l++;//aumenta el valor de l
        System.out.println(l);

        System.out.println(d);// imprime verdadero
        System.out.println(!d);// imprime lo opuesto

        l = 2*(4+5);
        System.out.println(l);
        
        if(5<6){
            System.out.println("condición verdadera");

        }else{
            System.out.println("condición falsa");

        }//cuando cumple la confición
        if(10<6){
            System.out.println("condición verdadera");

        }else{
            System.out.println("condición falsa");

        }//cuando no cumple la condición
            System.out.println("salimos del if");

        boolean m = true;
        boolean n = false;
        boolean o;

        o = m || n;


        if( o ){
            System.out.println("condición verdadera");

        }else{
            System.out.println("condición falsa");

        }

        double p = Math.sqrt(9);

        System.out.println(p);

        String nombre;

        nombre = sc.nextLine();

        System.out.println("hola " + nombre);
        System.out.println(nombre.length());

    }


    public static void otroMetodo(){
        int varLocal;
        final int CTE_LOCAL;

        CTE_LOCAL = 1;


    }


}
