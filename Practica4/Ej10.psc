Proceso Ej10
	Definir a,b,m Como Entero;
	Escribir 'Escribe los números para obtener MCD';
	Repetir
		Leer a;
		Leer b;
	Hasta Que (a>0 Y b>0)
	m <- a MOD b;
	Mientras m<>0 Hacer
		a <- b;
		b <- m;
		m <- a MOD b;
	FinMientras
	Escribir 'MCD = ',b;
FinProceso
