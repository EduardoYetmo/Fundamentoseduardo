Proceso sin_titulo
	Definir num,n,cont,suma,acum,i Como Entero;
	Definir r Como Real;
	Escribir 'Ingresa la cantidad de datos: ';
	Leer num;
	acum <- 0;
	Para i<-1 Hasta num Hacer
		Escribir 'Ingrese el dato ',i;
		Leer n;
		acum <- acum+n;
	FinPara
	r <- acum/num;
	Escribir 'El promedio es: ',r;
FinProceso
