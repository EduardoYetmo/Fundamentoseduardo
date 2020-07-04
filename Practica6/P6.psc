SubProceso menu()
	Escribir '1.-Suma';
	Escribir '2.-Resta';
	Escribir '3.-Multiplicación';
	Escribir '4.-División';
	Escribir '5.-Factorial';
	Escribir '6.-Combinaciones de K elementos en un grupo de n';
	Escribir '7.-Exponencial';
	Escribir '8.-Salir';
FinSubProceso

SubProceso retorno = suma(a,b)
	Definir retorno Como Real;
	retorno <- a+b;
FinSubProceso

SubProceso retorno = resta(a,b)
	Definir retorno Como Real;
	retorno <- a-b;
FinSubProceso

SubProceso retorno = multiplicacion(a,b)
	Definir retorno Como Real;
	retorno <- a-b;
FinSubProceso

SubProceso retorno = division(a,b)
	Definir retorno Como Real;
	retorno <- a-b;
FinSubProceso

SubProceso r <- factorial(a)
	Definir i,r Como Real;
	r <- 1;
	Para i<-1 Hasta a Hacer
		r <- r*i;
	FinPara
FinSubProceso

SubProceso retorno = combinaciones(n,k)
	Definir retorno Como Real;
	Definir r Como Real;
	r <- 0;
	retorno <- factorial(n)/(factorial(k)*factorial(n-k));
FinSubProceso

SubProceso r <- exponencial(a)
	Definir retorno Como Real;
	Definir r,i Como Real;
	Definir n Como Entero;
	r <- 0;
	n <- 50;
	Para i<-1 Hasta n Hacer
		r <- ((a)^i)/factorial(i);
	FinPara
FinSubProceso

Proceso P6
	Definir op Como Entero;
	Definir a,b,r Como Real;
	Repetir
		Escribir '*****Calculadora*****';
		menu();
		Escribir 'Selecciona una opción';
		Leer op;
		Segun op  Hacer
			1:
				Escribir 'Ingrese los número para sumar:';
				Leer a;
				Leer b;
				r <- suma(a,b);
				Escribir r;
			2:
				Escribir 'Ingrese los número para restar:';
				Leer a;
				Leer b;
				r <- resta(a,b);
				Escribir r;
			3:
				Escribir 'Ingrese los números para multiplicar:';
				Leer a;
				Leer b;
				r <- multiplicacion(a,b);
				Escribir r;
			4:
				Escribir 'Ingrese los números para dividir:';
				Leer a;
				Leer b;
				r <- division(a,b);
				Escribir r;
			5:
				Escribir 'Ingrese el número para obtener su factorial:';
				Leer a;
				r <- factorial(a);
				Escribir r;
			6:
				Escribir 'Ingrese los números para obtener la combinacion:';
				Leer a;
				Leer b;
				r <- combinaciones(a,b);
				Escribir r;
			7:
				Escribir 'Ingrese un número para obtener su exponencial:';
				Leer a;
				r <- exponencial(a);
				Escribir r;
			8:
				Escribir 'Apagando Calculadora';
			De Otro Modo:
				Escribir '---Opción no valida---';
		FinSegun
	Hasta Que op<>9
FinProceso
