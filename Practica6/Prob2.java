import java.util.Scanner; 
public class Prob2{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String ti;
        int n,tp,nip,cont;
        double pa,to,tot;
        double ca = 1.05;

        System.out.println("\n*****El Náufrago satisfecho*****\n");
        System.out.println("Ofrece las siguientes hamburguesas:");
        System.out.println("S = Hamburguesa Sencilla");
        System.out.println("D = Hamburguesa Doble");
        System.out.println("T = Hamburguesa Triple");
        System.out.println("C = Cancelar");
        ti = sc.next();
        
        switch(ti){
            case "S": pa = 20.0;
                System.out.println("Elegiste la hamburguesa sencillar");
                System.out.println("Indica el número de hamburguesas: ");
                    n = sc.nextInt();
                System.out.println("Tu orden es de " + n + " hamburguesas sencillas");
                    to = n*pa;
                System.out.println("El costo de orden es de: " + to);
                System.out.println("\n¿Cuál es tu forma de pago?");
                System.out.println("1 = Efectivo / 2 = Tarjeta de Credito");
                    tp = sc.nextInt();

                if(tp == 2){
                    System.out.println("Elegiste tarjeta de credito");
                    System.out.println("Ingresa tu tarjeta");
                    System.out.println("Ingresa tu NIP");
                        nip = sc.nextInt();
                    System.out.println("Al pagar con TC se cobra un cargo de 5% sobre la compra");
                    System.out.println("Procesando...");
                    System.out.println("El costo sin cargo es de: " + to);
                        tot = to * ca;
                    System.out.println("El costo total es: " + tot);
                    System.out.println("Gracias por su compra");
                        break;    
                }else{
                    System.out.println("Gracias por su compra");
        }

            case "D": pa = 25.0;
                System.out.println("Elegiste la hamburguesa sencillar");
                System.out.println("Indica el número de hamburguesas: ");
                    n = sc.nextInt();
                System.out.println("Tu orden es de " + n + " hamburguesas sencillas");
                    to = n*pa;
                System.out.println("El costo de orden es de: " + to);
                System.out.println("\n¿Cuál es tu forma de pago?");
                System.out.println("1 = Efectivo / 2 = Tarjeta de Credito");
                    tp = sc.nextInt();

                if(tp == 2){
                    System.out.println("Elegiste tarjeta de credito");
                    System.out.println("Ingresa tu tarjeta");
                    System.out.println("Ingresa tu NIP");
                        nip = sc.nextInt();
                    System.out.println("Al pagar con TC se cobra un cargo de 5% sobre la compra");
                    System.out.println("Procesando...");
                    System.out.println("El costo sin cargo es de: " + to);
                        tot = to * ca;
                    System.out.println("El costo total es: " + tot);
                    System.out.println("Gracias por su compra");
                        break;    
                }else{
                    System.out.println("Gracias por su compra");
        }
        
            case "T": pa = 28.0;
            System.out.println("Elegiste la hamburguesa sencillar");
            System.out.println("Indica el número de hamburguesas: ");
                n = sc.nextInt();
            System.out.println("Tu orden es de " + n + " hamburguesas sencillas");
                to = n*pa;
            System.out.println("El costo de orden es de: " + to);
            System.out.println("\n¿Cuál es tu forma de pago?");
            System.out.println("1 = Efectivo / 2 = Tarjeta de Credito");
                tp = sc.nextInt();

            if(tp == 2){
                System.out.println("Elegiste tarjeta de credito");
                System.out.println("Ingresa tu tarjeta");
                System.out.println("Ingresa tu NIP");
                    nip = sc.nextInt();
                System.out.println("Al pagar con TC se cobra un cargo de 5% sobre la compra");
                System.out.println("Procesando...");
                System.out.println("El costo sin cargo es de: " + to);
                    tot = to * ca;
                System.out.println("El costo total es: " + tot);
                System.out.println("Gracias por su compra");
                    break;    
            }else{
                System.out.println("Gracias por su compra");
    }


        }

    }
}
    
