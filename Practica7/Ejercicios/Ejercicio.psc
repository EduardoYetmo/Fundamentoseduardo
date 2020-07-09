Proceso sin_titulo
	Definir arr, arr2,arr3 Como Entero;
	Definir i,fil,col,pla Como Entero;
	
	Dimension arr[10];
	Dimension arr2[2,3];
	Dimension arr3[3,3,3];
	
	Para i<-0 Hasta 9 Hacer
		arr[i] <- i;
	FinPara
	
	Para fil<-0 Hasta 1 Hacer
		Para col<-0 Hasta 2 Hacer
			arr2[fil,col] <- 0;
		FinPara
		
	FinPara
	
	Para fil<-0 Hasta 1 Hacer
		Para col<-0 Hasta 2 Hacer
			para pla<-0 Hasta 2 Hacer
				arr3[fil,col,pla] <- 0;
			FinPara
		FinPara
	FinPara
	
FinProceso
