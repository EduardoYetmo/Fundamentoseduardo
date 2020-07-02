import java.util.Scanner; 
public class Ej1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "Eduardo";
        String respuesta;

        System.out.println("¿Estas registrado?  (si/no):");
        respuesta = sc.next();

        boolean b = respuesta.equals("no");

        if(b){
            System.out.println("Escribe tu nombre;");
            nombre = sc.next();
        }

        System.out.println("Hola " + nombre);


    }
}