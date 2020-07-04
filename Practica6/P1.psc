SubProceso r = long(A,C)
	Definir r Como Entero;
	Repetir
		Escribir 'La longitud de C es mayor que A';
		Escribir 'Ingresa otro valor de C: ';
		Leer C;
	Hasta Que A>=C
	r <- C;
FinSubProceso

Proceso P1
	Definir A,B,C Como Real;
	Definir areat,arear,area Como Real;
	Definir comp,precio,total Como Real;
	Escribir 'Ingrese las longitudes del terreno: ';
	Escribir 'Longitud A: ';
	Leer A;
	Escribir 'Longitud B: ';
	Leer B;
	Escribir 'Longitud C:';
	Leer C;
	comp <- long(A,C);
	Escribir A;
	Escribir B;
	Escribir comp;
	areat <- (A-comp)*B/2;
	arear <- B*comp;
	area <- areat+arear;
	Escribir 'el área total del terreno es: ',area,' u^2';
	Escribir 'Ingrese el precio por m^2: ';
	Leer precio;
	total <- area*precio;
	Escribir 'El precio total por el tereno es: $ ',total;
FinProceso
