package P8.calculadora;

import java.util.Scanner;

public class Teclado {
	
	Scanner sc = new Scanner(System.in);
	
	public String capturaOper() {
		String s;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Operador: ");
		s = sc.nextLine();
		
		return s;
	}
	
	public Complejo capturaComplejo() {
		Complejo c = new Complejo();
		double re;
		double im;
		
		System.out.print("rel: ");
		re = sc.nextDouble();
		
		System.out.print("img: ");
		im = sc.nextDouble();
		
		c.setReal(re);
		c.setImag(im);
	
	return c;

	}
}
