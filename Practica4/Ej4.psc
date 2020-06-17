Proceso Ej4
	Definir i,acumulador,num Como Entero;
	Definir r Como Real;
	acumulador <- 0;
	Para i<-1 Hasta 10 Hacer
		Leer num;
		acumulador <- acumulador+num;
	FinPara
	r <- acumulador / 10;
	Escribir 'Promedio = ',r;
FinProceso
