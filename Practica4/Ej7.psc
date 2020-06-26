Proceso sin_titulo
	Definir cont Como Entero;
	Definir pares,impares Como Entero;
	Definir num Como Entero;
	pares <- 0;
	impares <- 0;
	cont <- 0;
	Escribir 'Ingresa los números: ';
	Mientras cont<10 Hacer
		Leer num;
		Si num MOD 2=0 Entonces
			pares <- pares+1;
		SiNo
			impares <- impares+1;
		FinSi
		cont <- cont+1;
	FinMientras
	Escribir 'Pares: ',pares;
	Escribir 'Impares: ',impares;
FinProceso
