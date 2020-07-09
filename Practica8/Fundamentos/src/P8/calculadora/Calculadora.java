package P8.calculadora;

public class Calculadora {
	
	Pantalla p;
	Teclado t;
	Procesador proc;
	
	public Calculadora() {
		this.p = new Pantalla();
		this.t = new Teclado();
		this.proc = new Procesador();
	}
	
	public void on() {
		Complejo c1,c2,cr;
		String op;
		System.out.println("Encendiendo Calculadora...");
		
		do {
		System.out.println("\nElige una operacion: ");
		System.out.println("(+)Sumar");
		System.out.println("(-)Restar");
		System.out.println("(*)Multiplicar");
		System.out.println("(/)Dividir");
		System.out.println("(off)Apagar\n");
		
		op = t.capturaOper();
		
		switch(op) {
		case "+": 
				c1 = t.capturaComplejo();
				c2 = t.capturaComplejo();
				cr = proc.sumar(c1, c2);
				p.imprimirComplejo(cr);
			break;
		case "-": 
				c1 = t.capturaComplejo();
				c2 = t.capturaComplejo();
				cr = proc.restar(c1, c2);
				p.imprimirComplejo(cr);
			break;
		case "*": 
				c1 = t.capturaComplejo();
				c2 = t.capturaComplejo();
				cr = proc.multiplicar(c1, c2);
				p.imprimirComplejo(cr);
			break;
		case "/": 
				c1 = t.capturaComplejo();
				c2 = t.capturaComplejo();
				cr = proc.dividir(c1, c2);
				p.imprimirComplejo(cr);	
			break;
		case "off": 
				System.out.println("Apagando calculadora ...");
			break;
		default: System.out.println("Opción no valida");	
		}
		}while(!op.equals("off"));
	}
}
