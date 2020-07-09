package P8.calculadora;

public class Procesador {
	
	public Complejo sumar(Complejo c1, Complejo c2) {
		Complejo c = new Complejo();
		double re,im;
		
		re = c1.getReal() + c2.getReal(); //(a+c)
		im = c1.getImag() + c2.getImag(); //(b+d)
		
		c.setReal(re);
		c.setImag(im);
		
		return c;
	}
	
	public Complejo restar(Complejo c1, Complejo c2) {
		Complejo c = new Complejo();
		double re, im;
		
		re = c1.getReal() - c2.getReal(); //(a-c)
		im = c1.getImag() - c2.getImag(); //(b-d)
		
		c.setReal(re);
		c.setImag(im);
		
		return c;
	}
	
	public Complejo multiplicar(Complejo c1, Complejo c2) {
		Complejo c = new Complejo();
		double re, im;
		
		re = (c1.getReal()*c2.getReal())-(c1.getImag()*c2.getImag()); //(a*c - bd)
		im = (c1.getReal()*c2.getImag())+(c1.getImag()*c2.getReal()); //(a*d + bc)
		
		c.setReal(re);
		c.setImag(im);
		
		return c;
	}

	public Complejo dividir(Complejo c1, Complejo c2) {
		Complejo c= new Complejo();
		double re, im;
		
		re = ((c1.getReal()*c2.getReal())+(c1.getImag()*c2.getImag()))/(Math.pow(c2.getReal(), 2)+Math.pow(c2.getImag(), 2));
		im = ((c1.getImag()*c2.getReal())-(c1.getReal()*c2.getImag()))/(Math.pow(c2.getReal(), 2)+Math.pow(c2.getImag(), 2));
		
		c.setReal(re);
		c.setImag(im);
		
		return c;
	}
}
