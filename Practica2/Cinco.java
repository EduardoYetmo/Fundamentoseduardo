import java.util.Scanner; 
public class Cinco {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int a,b;
        int pregunta;

        System.out.println("***Deposito a tarjeta***");
        System.out.println("Inserta tu tarjeta");
        System.out.println("Inserte NIP de 4 digitos: ");
            a = s.nextInt();
            a = dep();
        
        switch(a){
            case 1:
                    System.out.println("Espere un momento...");
                    break;
            case 2:
                    System.out.println("¿Desea cambiar los datos del deposito?");
                    
                    do{
                        pregunta = SoN();
                        if(pregunta == 1){
                        b = dep();
                        }
                        if(pregunta == 2){
                        break;

                        }

                    }while(pregunta == 2);
                    System.out.println("Espere un momento...");
                    break;
        }
        System.out.println("Retire su ticket");
        System.out.println("Retire su tarjeta");
        System.out.println("***Gracias por su preferencia***");

    }

    

    public static int dep(){
        Scanner s = new Scanner(System.in);
        int a,c,p;
        System.out.println("Capture el número de cuenta: ");
            c = s.nextInt();
        System.out.println("Monto que desea depositar: ");
            a = s.nextInt();
        System.out.println("Usted quiere depositar $ " + a + ".00");
        System.out.println("Al numero de cuenta: " + c);
        System.out.println("¿Desea continuar con el deposito?");
        p = SoN();
        return p;
    }

    public static int SoN(){
        Scanner s = new Scanner(System.in);
        int r;
        System.out.println("1.-Si         2.-No");
        r = s.nextInt();
        return r;

    }

}