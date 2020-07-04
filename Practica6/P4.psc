Proceso P4
	Definir M,CA,i Como Entero;
	Definir AH Como Real;
	M <- 0;
	AH <- 0;
	Para i<-1 Hasta 12 Hacer
		Escribir 'Ingresa el ahorro del mes ',i;
		Leer CA;
		AH <- AH+CA;
		M <- M+1;
		Escribir 'El ahorro por mes es: $ ',AH;
	FinPara
	Escribir 'El total del ahorro en un año es de: $ ',AH;
FinProceso
