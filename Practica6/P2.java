//2.- "el náufrago satisfecho" suponer que un cliente adquiere solo un tipo de hamburguesa 
// y pagara ya sea en efectivo o tarjeta de credito.
import java.util.Scanner; 
public class P2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String TI,TP;
        double PA,TO,TOT;
        double CA = 0.05;
        int N;

        System.out.println("\n*****El Náufrago satisfecho*****\n");
        System.out.println("Ofrece las siguientes hamburguesas:");
            
            TI =  menu();

            switch(TI){
                case "S"://Hamburguesa Sencilla
                        PA = 20.0;
                    System.out.println("\nElegiste la Hamburguesa Sencilla");
                    System.out.println("El costo de la Hamburguesa Sencilla es de $ "+PA+"0");
                    System.out.print("Indica el número de Hamburguesas: ");
                        N = s.nextInt();
                    System.out.println("Tu orden es de " + N + " Hamburguesas Sencillas");
                        TO = N*PA;
                    System.out.println("El costo de tu orden es de: $ " + TO);
                        TP = pago();
                        if(TP != "T"){
                        TOT = cargo(CA,TO);
                        }
                    break;
                case "D"://Hamburguesa Doble 
                        PA = 25.0;
                    System.out.println("\nElegiste la Hamburguesa Doble");
                    System.out.println("El costo de la Hamburguesa Doble es de $ "+PA+"0");
                    System.out.print("Indica el número de Hamburguesas: ");
                        N = s.nextInt();
                    System.out.println("Tu orden es de " + N + " Hamburguesas Doble");
                        TO = N*PA;
                    System.out.println("El costo de tu orden es de: $ " + TO);
                        TP = pago();
                        if(TP != "T"){
                        TOT = cargo(CA,TO); 
                        }
                    break; 
                case "T"://Hamburguesa Triple 
                        PA = 28.0;
                    System.out.println("\nElegiste la Hamburguesa Triple");
                    System.out.println("El costo de la Hamburguesa Triple es de $ "+PA+"0");
                    System.out.print("Indica el número de Hamburguesas: ");
                        N = s.nextInt();
                    System.out.println("Tu orden es de " + N + " Hamburguesas Triple");
                        TO = N*PA;
                    System.out.println("El costo de tu orden es de: $ " + TO);
                        TP = pago();
                        if(TP != "T"){
                        TOT = cargo(CA,TO); 
                        }
                    break; 
                case "C"://Cancelar Orden
                    System.out.println("\nUsted ha cancelado su orden.");
                    System.out.println("Agradecemos su preferencia.");
                    System.out.println("Vuelva pronto..."); 
                    break;
                default:
                    System.out.println("\nOpción no valida.");
                    System.out.println("Intenta de nuevo.\n");
                    break;  
                        
            } 
        
           
    }

    public static double cargo(double CA, double TO){
        double r;
        double c;

        System.out.println("El cobro total sin cargo: $ " + TO);
            c = CA * TO;
        System.out.println("Cargo del 5% sobre la compra: $ " + c);
            r = TO+c;
        System.out.println("El costo total de la compra es: $ " + r);
        System.out.println("Procesando...");
        System.out.println("*****Autorizado*****");
        System.out.println("Imprimiendo ticket");
        System.out.println("Entregando Orden...");
        System.out.println("Agradecemos su compra.");
        System.out.println("Excelente día."); 

        return r;
    }

    public static String pago(){
        Scanner s = new Scanner(System.in);
        String r;
        int nip;

        System.out.println("\n¿Cuál es tu forma de pago?");
        System.out.println("E = Efectivo / T = Tarjeta de Credito");
        do{
            r = s.next();

            switch(r){
                case "E"://Efectivo
                    System.out.println("Elegiste Efectivo");
                    System.out.println("Recibimos efectivo");
                    System.out.println("Entregando Orden...");
                    System.out.println("Agradecemos su compra.");
                    System.out.println("Excelente día.");
                    break;
            
                case "T"://Tarjeta de Credito 
                    System.out.println("Elegiste Tarjeta de Credito\n");
                    System.out.println("::::::: Anuncio :::::::");
                    System.out.println("Al pagar con Tarjeta de Credito se cobrara");
                    System.out.println("un cargo del 5% sobre la compra\n");
                    System.out.println("Ingresa Tarjeta de Credito");
                    System.out.println("Procesando...");
                    System.out.print("ingresa tu NIP de 4 digítos: ");
                        nip = s.nextInt(); 
                    break;
                      
                default:
                    System.out.println("Elegiste una opcion no valida.");       
                    System.out.println("Intenta de nuevo.");
                    break;
            }
        }while(r == "E" && r == "T");
        return r;
    }

    public static String menu(){
        Scanner s = new Scanner(System.in);
        String r;

        System.out.println("S = Hamburguesa Sencilla");
        System.out.println("D = Hamburguesa Doble");
        System.out.println("T = Hamburguesa Triple");
        System.out.println("C = Cancelar Orden");
        System.out.print("Ingresa la letra de tu elección: ");
        r = s.next();
        
        
        return r;
    }
}