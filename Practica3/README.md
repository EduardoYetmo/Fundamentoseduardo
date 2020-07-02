## Práctica 3
---
##### Resume
- En está práctica se aplicara el uso de diveras estructuras en la ejecución de programas ayudandonos a resolver diversos problemas que se presentan.

- Podremos utilizar las estructuras de manera conjunta ya que su uso dara solución a tareas.
---
##### Desarrollo
1. Se creó un nuevo directorio llamado Práctica 3 en donde se ira almacenando todos los ejercicios (se crea directorio ejercicios) y actividades.

2. Se realizaron los ejercicios en clase utilizando las estructuras vistas en clase. 

3. Las actividades se realizaron conforme lo aprendido en clase y completando con investigacion para la realizacion de estos, los cuales son los siguientes:
- **Act1:** Esta actividad se realizo con ayuda del ejercicio 4.2.3 donde consistia en capturar las calificaciones con escala de acuerdo a la UAM y dependiendo de la sumatoria de todas las calificaciones capturadas obtenemos el promedio del alumno.
Esta práctica se realizo con ayuda de la estructura **while** y **switch case**:
``` 
while(  !c.equals("FIN") ){
    switch(c){
        case "MB": suma += 10.0;
            break;
        case "B": suma += 8.0;
            break;
        case "S": suma += 6.0;
            break;
        case "NA": suma += 5.0;
            break;
        default: System.out.println("---Valor no valido---");
            contnv++;
    }       
    cont++; 
    System.out.print("Calificación:  ");
    c = sc.next();
}
cont = cont - contnv;
    
if(cont == 0){
    System.out.println("No escribiste nada");
}else{
    System.out.println("\nTu promedio es: " + suma/cont);
}
```
Tambien aplicamos lo que es un contador que es el que guarda los datos que se van ingresando por el usuario y esto ayudara a conocer el numero de datos totales para obtener un promedio junto con la sumatorio ya especificada en el **case** dependiendo la calificación y al finalizar poner la palabra **FIN** para cerrar el ciclo y pueda darte el resultado de la calificación.

- **Act2:** En esta actividad de igual manera se pedia calcular el promedio de datos ingresados por el usuario sin conocer el número de datos, para esto utilizamos un Scanner, while y un contador, que nos ayudarian a guardar, conocer y trabajar con los datos que el usuario capture haciendo la sumatorio de todos ellos y obteniendo asi el promedio de todos los datos capturados:
```
numero = sc.nextInt();
        
while( numero>=0){
    suma+=numero;
    cont++;
    numero = sc.nextInt();
}

prom = suma/cont;
```

- **Act3:** En esta actividad nos solicitaron pedirle al usuario 3 longitudes (reales) y que al final se pueda decir que puede formar un triángulo con ellas o no. Para ello se utilizo la estructura **if** donde se especificaba que caracteristicas tenian que tener las logitudes para que puedan formar un triángulo (Se forma un triángulo si la longitud de cualquiera de los tres lados es mayor a la suma de los dos restantes).
```
if(a >= b + c || a >= c + b){
    System.out.println("Es un triangulo");
            
    if(b >= c + a || b >= a + c){
        System.out.println("Es un triangulo");
    }
    if(c >= a + b || c >= b + a){
        System.out.println("Es un triangulo");
    }
}else{
    System.out.println("No es un triángulo");
}
```
- **Act4:** En este programa lo que se realizo fue identificar si el número ingresado por el usuario es un número primo o no lo es. Se utilizo la estructura for donde se pone como condición que el numero sea divisible entre 1 y entre si mismo y su modulo sea igual a cero, asi al ingresar el número el usuario sabra si es un número primo o no.
```
for(int i=1; i<=numero; i++){
    if((numero%i)==0){
        contador++;
    }
}
if(contador <= 2){
    System.out.println("El número " + numero + " es primo");
}else{
    System.out.println("El numero " + numero + " no es primo");
}
```

- **Act5:** En esta actividad de puso en práctica el número de Fibonacci imprimiendo la sucesón dependiendo el número que indique el usuario, tomando en cuenta que por definición **f(0) = 0** y **f(1) = 1**.
```
for(int i=1; i<=n; i++){
    System.out.println(a);
    c = a +b;
    a = b;
    b = c;
```

- **Act6:** En este programa se aplico algo similar al anterior utilizando la misma estructura pero cumpliendo las caracteristicas que nos pedian aplicando aqui el numero de Padovan y por definición **P(0) = 1**, **P(1) = 1** y **P(2) = 1**.

![Padovan](https://i.imgur.com/9Jn31xa.png)

---
##### Resultados

Los resultados de la práctica se cumplio conforme a los enunciados utilizando las estructuras que se vieron en clase y convinando los conocimientos que se tenian en prácticas anteriores, incluso investigando el uso de cada uno de las estructuras para conocer más el conocimiento de ellas y saber como aplicarlas. 

---
##### Discusión

A pesar de realizar todas las actividades se necesita la práctica de estas estructuras para un mejor manejo de ellas, ya que al hacerlas existieron muchas dudas de como era el funcionamiento de cada una, apesar del la investigación.

---
##### Conclusión

Esta práctica subio el nivel de las anteriores dificultando mas la realizacion de los programas esto ayuda a conocer más las herramientas que se tienen para resolver diversos problemas que nos propongan y encontrar una solución a dicha tarea.