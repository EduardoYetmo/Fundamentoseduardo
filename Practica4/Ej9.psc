Proceso Ej9
	Definir n,cont,num Como Entero;
	Definir ma,me Como Entero;
	ma <- 0;
	me <- 1000;
	Escribir 'Escribe el número de datos: ';
	Leer n;
	cont <- n;
	Repetir
		Leer num;
		Si num > ma Entonces
			ma <- num;
		FinSi
		Si num < me Entonces
			me <- num;
		FinSi
		cont <- cont-1;
	Hasta Que cont=0
	Escribir 'Mayor = ',ma;
	Escribir 'Menor= ',me;
FinProceso
