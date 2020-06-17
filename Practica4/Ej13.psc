Proceso Ej13
	Definir cal Como Caracter;
	Definir sum,cont,contNV Como Entero;
	Definir promedio Como Real;
	cal <- 'Y';
	sum <- 0;
	cont <- 0;
	contNV <- 0;
	Mientras cal<>'F' Hacer
		Leer cal;
		cont <- cont+1;
		Segun cal  Hacer
			'N':
				sum <- sum+5.0;
			'S':
				sum <- sum+6.0;
			'B':
				sum <- sum+8.0;
			'M':
				sum <- sum+10.0;
			De Otro Modo:
				Escribir 'No valido';
				contNV <- contNV+1;
		FinSegun
	FinMientras
	cont <- cont-contNV;
	promedio <- sum/cont;
	Escribir 'Promedio = ',promedio;
FinProceso
