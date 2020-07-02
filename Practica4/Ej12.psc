Proceso Ej12
	Definir n,suma,i Como Entero;
	Definir nump,np Como Entero;
	suma <- 0;
	n <- 1;
	np <- 0;
	Escribir 'Imprime los primeros números perfectos';
	Mientras np<5 Hacer
		Para i<-1 Hasta n Hacer
			Si n MOD i=0 Entonces
				suma <- suma+i;
			FinSi
		FinPara
		Si suma<>n Entonces
			np <- np+1;
			nump <- nump + suma;
			suma <- 0;
		SiNo
			suma <- 0;
			Escribir n,' no es perfecto';
		FinSi
	FinMientras
	Escribir 'No. Perfecto: ',nump;
FinProceso
