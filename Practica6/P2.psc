SubProceso menu()
	Escribir 'S = Hamburguesa Sencilla';
	Escribir 'D = Hamburguesa Doble';
	Escribir 'T = Hamburguesa Triple';
	Escribir 'C = Cancelar Orden';
	Escribir 'Ingresa la letra de tu elección: ';
FinSubProceso

SubProceso r = pago()
	Definir r Como Caracter;
	Definir nip Como Entero;
	Escribir '¿Cuál es tu forma de pago?';
	Escribir 'E = Efectivo / T = Tarjeta de Credito';
	Repetir
		Leer r;
		Segun r  Hacer
			'E':
				Escribir 'Elegiste Efectivo';
				Escribir 'Recibimos Efectivo';
				Escribir 'Entregando Orden.';
				Escribir 'Agradecemos su compra.';
				Escribir 'Excelente Día.';
			'T':
				Escribir 'Elegiste Tarjeta de Credito';
				Escribir '::::::: Anuncio :::::::';
				Escribir 'Al pagar con Tarjeta de Credito se cobrara';
				Escribir 'un cargo del 5% sobre la compra.';
				Escribir 'Procesando...';
				Escribir 'Ingresa tu NIP de 4 digítos: ';
				Leer nip;
			De Otro Modo:
				Escribir 'Elegiste una opción no valida';
				Escribir 'Intenta de nuevo.';
		FinSegun
	Hasta Que r='E' O r='T'
FinSubProceso

SubProceso r = cargo(CA,TO)
	Definir r,c Como Real;
	Escribir 'El cobro total sin cargo: $ ',TO;
	c <- CA*TO;
	Escribir 'El cargo del 5% es de: $ ',c;
	r <- TO+c;
	Escribir 'El costo total de la compra es: $ ',r;
	Escribir 'Procesando...';
	Escribir '***** Autorizado *****';
	Escribir 'Imprimiendo ticket.';
	Escribir 'Entregando Orden.';
	Escribir 'Agradecemos su compra.';
	Escribir 'Excelente Día.';
FinSubProceso

Proceso P2
	Definir TI,TP Como Caracter;
	Definir PA,TO,TOT,CA Como Real;
	Definir N Como Entero;
	CA <- 0.05;
	Escribir '***** En Náufrago Satisfecho *****';
	Escribir 'Ofrece las siguientes Hamburguesas';
	Repetir
		menu();
		Leer TI;
		Segun TI  Hacer
			'S':
				PA <- 20.0;
				Escribir 'Elegiste la Hamburguesa Sencilla';
				Escribir 'El corto de la Hamburguesa Sencilla es de $ ',PA;
				Escribir 'Indica el número de Hamburguesas: ';
				Leer N;
				Escribir 'Tu orden es de ',N,' Hamburguesas Sencillas';
				TO <- N*PA;
				Escribir 'El costo de tu orden es de: $ ',TO;
				TP <- pago();
				Si TP='T' Entonces
					TOT <- cargo(CA,TO);
				FinSi
			'D':
				PA <- 25.0;
				Escribir 'Elegiste la Hamburguesa Doble';
				Escribir 'El costo de la Hamburguesa doble es de $ ',PA;
				Escribir 'Indica el número de Hamburguesas:';
				Leer N;
				Escribir 'Tu orden es de ',N,' Hamburguesas Doble';
				TO <- N*PA;
				Escribir 'El costo de tu orden es de: $ ',TO;
				TP <- pago();
				Si TP='T' Entonces
					TOT <- cargo(CA,TO);
				FinSi
			'T':
				PA <- 28.0;
				Escribir 'Elegiste la Hamburguesa Triple';
				Escribir 'El costo de la Hamburguesa Triple es de $ ',PA;
				Escribir 'Indica el número de Hamburguesas: ';
				Leer N;
				Escribir 'Tu orde es de ',N,' Hamburguesas Triple';
				TO <- N*PA;
				Escribir 'El costo de tu orden es de: $ ',TO;
				TP <- pago();
				Si TP='T' Entonces
					TOT <- cargo(CA,TO);
				FinSi
			'C':
				Escribir 'Usted ha cancelado su orden.';
				Escribir 'Agradecemos su preferencia.';
				Escribir 'Vuelva Pronto';
			De Otro Modo:
				Escribir 'Opción no valida';
				Escribir 'Intente de nuevo./n';
		FinSegun
	Hasta Que TI='S' O TI='D' O TI='T' O TI='C'
FinProceso
