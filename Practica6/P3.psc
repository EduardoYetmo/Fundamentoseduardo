SubProceso r = menu()
	Definir r Como Entero;
	Escribir 'Opciones de servicio de tarjetas';
	Escribir '1.-Tarjeta tipo 1';
	Escribir '2.-Tarjeta tipo 2';
	Escribir '3.-Tarjeta tipo 3';
	Escribir '4.-Otra Tarjeta ';
	Escribir '5.-No manejo tarjetas.';
	Escribir 'Por favor indique que tipo de servicio maneja';
	Leer r;
FinSubProceso

SubProceso r = credito(AC)
	Definir r,n,LA Como Real;
	Escribir 'Ingrese el límite actual de crédito: ';
	Leer LA;
	Escribir 'Tu limite de credito es de $ ',LA;
	n <- LA*AC;
	Escribir 'El aumento de su credito es de: $ ',n;
	r <- LA+n;
	Escribir 'El nuevo límite de su crédito es de: $ ',r;
	Escribir 'Esperemos que disfrute de su credito.';
	Escribir 'Agradecemos su preferencia.';
FinSubProceso

Proceso P3
	Definir TT Como Entero;
	Definir AC,NC Como Real;
	Escribir '***** Bienvenido al Banco Pueblo Desconocido*****';
	Repetir
		TT <- menu();
		Segun TT  Hacer
			1:
				AC <- 0.25;
				Escribir 'Usted maneja la tarjeta tipo 1.';
				Escribir 'El incremento autorizado es del 25%.';
				NC <- credito(AC);
			2:
				AC <- 0.35;
				Escribir 'Usted maneja la tarjeta tipo 2.';
				Escribir 'El incremento autorizado es del 35%.';
				NC <- credito(AC);
			3:
				AC <- 0.40;
				Escribir 'Usted maneja la tarjeta tipo 3.';
				Escribir 'El incremento autorizado es del 40%.';
				NC <- credito(AC);
			4:
				AC <- 0.50;
				Escribir 'Usted maneja otra tarjeta.';
				Escribir 'El incremento autorizado es del 50%.';
				NC <- credito(AC);
			5:
				Escribir 'Usted no maneja ningun tipo de tarjetas.';
				Escribir 'Lo invitamos a tramitar alguna de nuestras tarjetas para que disfrute ';
				Escribir 'de los benefinicios que se le dan a nuestros clientes.';
				Escribir 'Puede acudir a nuestras sucursales para más información.';
				Escribir '---Gracias por su atención y preferencia---';
			De Otro Modo:
				Escribir 'Opción no valida.';
				Escribir 'Intenta de nuevo.';
		FinSegun
	Hasta Que TT<=5
FinProceso
