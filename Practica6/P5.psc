Proceso P5
	Definir num,A,B,C,i Como Entero;
	Definir N,CN,T1,T2,T3 Como Real;
	A <- 0;
	B <- 0;
	C <- 0;
	CN <- 0;
	T1 <- 0;
	T2 <- 0;
	T3 <- 0;
	Escribir '***** Tienda TIki Taka*****';
	Escribir 'Ingrese el número de ventas que se realizarón durante el día: ';
	Leer num;
	Para i<-1 Hasta num Hacer
		Escribir 'Ingrese la venta ',i,': $ ';
		Leer N;
		Si N>1000 Entonces
			A <- A+1;
			T1 <- T1+N;
		FinSi
		Si N>500 Y N<=1000 Entonces
			B <- B+1;
			T2 <- T2+N;
		FinSi
		Si N<=500 Entonces
			C <- C+1;
			T3 <- T3+N;
		FinSi
		CN <- CN+N;
	FinPara
	Escribir 'Ventas mayores a $ 1000: ',A,' ventas';
	Escribir 'El total de ventas mayores a $ 1000 son: $ ',T1;
	Escribir 'Ventas entre % 500 y $ 1000 son: $ ',B,' ventas';
	Escribir 'El total de ventas entre $ 500 y $ 1000 son: $ ',T2;
	Escribir 'Ventas Menores a $ 500: $ ',C,' ventas';
	Escribir 'El total de ventas menores a $ 500 son: $ ',T3;
	Escribir 'Las ventas totales fueron: $ ',CN;
FinProceso
