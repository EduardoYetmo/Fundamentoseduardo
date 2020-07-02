Proceso Ej11
	Definir n,suma,i Como Entero;
	suma <- 0;
	Escribir 'Ingresa un número para saber si es un número perfecto: ';
	Leer n;
	Para i<-1 Hasta n Hacer
		Si n MOD i=0 Entonces
			suma <- suma+i;
		FinSi
	FinPara
	Si suma<>n Entonces
		Escribir n,' Es perfecto';
	SiNo
		Escribir n,' No es perfecto';
	FinSi
FinProceso
