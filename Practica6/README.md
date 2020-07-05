## Práctica 6
---
##### Resumen
- En esta práctica se aplicaran todos los conocimientos adquiridos en estos dos parciales.

- Utilizando tanto programacion en java como en pseudocódigo y diagrama de flujo, tratando de sincronizar ambos y sea lo mas parecido el uno al otro.

---

##### Desarrollo

En esta práctica nos presentan algunos problemas tipoo examen para la práctica de todo lo aprendido en las clases.

1.- El primer problema que nos presentan es el calcular el área respectiva de un terreno.

![Terreno](https://i.imgur.com/2jEuEWS.png)

Se corta la figura en dos partes en un triángulo y un rectángulo. Ingresando las longitudes A, B y C tomando en cuenta que no puede ser mayor la longitud C que A. 
Una vez ingresando las longitudes se calcula el área de las dos figuras y se suman para obtener el área total de todo el terreno y finalmente el ususario escribe el precio por metro cuadrado y se multiplica por el área total para obtener el precio total.

![P1](https://i.imgur.com/6YLM2tv.png)

El programa tiene nombre de **P1.java, PNG y PSC.**

2.- El problema dos no pide crear un programa donde el usuario va a un restaurante de hamburguesas llamado **El náufrago satisfecho** donde venden tres tipos de hamburguesa:
- **Hamburguesa sencilla  con un costo de  $ 20.00.**
- **Hamburguesa doble con un costo de $ 25.00.**
- **Hamburguesa triple con un costo de $ 28.00.**

El usuario elige un tipo de hamburguesas agregando una cantidad y repitiendo los datos con su respectivo precio. En la forma de pago hay dos opciones una en efectivo y otra con tarjeta de crédito donde se hace un cargo del 5% sobre la compra y al meter tus datos te hace el cobro total. 

![hamburg](https://i.imgur.com/dWekQkR.png)

En este código se utilizaron 3 metodos uno como menu que te muestra las opciones que hay eligiendo una, la otra es la forma de pago dando las dos opciones de efectivo o tarjeta de credito ejecutando sus respectivas instrucciones y por último el cargo donde que piden dons varibles la del cargo y el total de la orden y realiza sus respectiva operacion para darte el total de la compra.

Todo eso unido a una estructura **switch case** dependiendo la opción que elijas.
El programa tiene nombre de **P2.java, .PNG y .PSC.**

3.- En el problema 3 nos piden aumetar el credito del servicio de tarjetas de crédito, dependiendo el tipo de tarjeta que maneje el usuario se aumentara el crédito.
Se utilizo las estructuras **do-while y switch case** dependiendo la opcion elegida se aplicara el el aumento. También se le pide al usuario que agregue su limite de credito actual para hacer el ajuste necesario esto aplicando un método llamado credito que nos ayuda a realizar las operaciones indicadas para el aumento de crédito.

![Banco](https://i.imgur.com/Evp6osm.png)

El programa tiene nombre de **P3.java, .PNG y .PSC.**

4.- El problema 4 nos pide determinar cuánto ahorrarpa una persona en un año, si al final de cada mes deposita variables cantidades de dinero. Un problema sencillo ya que se utilizo la estructura **for** donde esta forma estara contando cada mes ingresando un contador a los datos de depositos que se agregan cada mes y sumando una a una al momento de ingresarla.

El programa tiene nombre de **P4.java, .PNG y .PSC.**

![Ahorro](https://i.imgur.com/Xq8N1ln.png)

5.- Para el problema 5 nos pide hacer un corte de caja de un empleado en la tienda **Tiki Taka** para esto nos piden organizarlas por:
- **Ventas mayores a $ 1000.**
- **Ventas mayores a S 500 pero menores o iguales a $ 1000.**
- **Ventas iguales o menores a $ 500.**
Se aplico las estructuras de **for e if** el primero para ir identificando el número de ventas que tuvo el empleado e ir capturando la cantidad de las ventas, donde el if se encargara de ir separando las cantidades conforme a la organizacion que nos pidieron y por último llevar un contador para que haga la sumatoria de todas las ventas totales.

El programa tiene nombre de **P5.java, .PNG y .PSC.**

![Ventas](https://i.imgur.com/VY8hgyT.png)

6.- El problema 6 nos ayudamos con la practica 5 al realizar una calculadora teniendo las operaciones principales y solo se agregaran otras operaciones. Las cuales fueron factorial, combinaciones de k elementos de un grupo en n y exponencial.
Esta práctica se realizo con un **do-while y un switch case** indicando un número para cada operación en este caso son 5, 6 y 7.
Las tres operaciones se realizaron con sus respecticas formulas:
- **Factorial:** Se utilizo un for para calcular el factorial de un número. Se ingresa el número y al entrar en el ciclo for se multiplica primero empezando por 1 * 1 despues 1 * 2, 1 * n hasta llegar al numero ingresaro y todos los resultados se multiplican entre si y asi obtenemossu factorial.

    ![Factorial](https://i.imgur.com/FlwgVhY.png)

- **Combinación:** En la combinacion se utilizo una formula que es **C(n,k)=(n!)/(k!(n-k!))**, ya que utilizamos factorial podemos utilizar el método antes realizado aplicando **factorial(n,K)** nosotros dando **n y k** para obtener un resultado.

    ![Combinación](https://i.imgur.com/Xs6udor.png)

- **Exponencial:** En la exponencial tambien se realizo mediante una formular (e^x=(x^i)/i!) pero a comparacion de la anterior este resultado que nos da es una aproximación a un resultado real ya que al hacer una comparación con otros resultados puede que cambie un poco.

    ![Exponencial](https://i.imgur.com/SOKRuun.png)

El programa tiene nombre de **P6.java, .PNG y .PSC.**

---

##### Resultado

Al realizar esta práctica se aplicaron las condiciones que nos pedian aplicando todos los temas que hemos visto hasta ahora. Se comprendieron más el manejo de las estructuras y de los métodos al ir ordenando todo para su proceso de cada problema y tratamos de facilitarlo mas y no complicarlo.

---

##### Discusión

Alguno de los problemas que se tuvieron fue que al realizar los programas tanto en java como en PSeint es que muchas veces no coincidian o por una u otra cosa minima se tenia que cambiar el código para obtener el mismo resultado.

Tambien en algunos casos al meter las condiciones en las estructuras para aplicar una iteración el programa no ejecutaba lo que le indicabas y tenias que cerrar el programa o incluso borrar y reescribir el código posiblemente sea error del alumno pero ocurrio más de una vez, pero conforme la práctica se ira acostumbrando a resolver este tipo de errores o incluso investigar y preguntar al profesor.

---

##### Conclusión

La práctica ayudo mucho a resolver pequeñas dudas que se tenia con las estructuras, métodos y el programa PSeint ya que al ir realizando cada una no solo se hicieron por cumplir si no que se fue entendiendo paso por paso e ir analizando que proceso tiene cada código, incluso los digramas de flujo y el pseudocódigo ayudaron mucho a entenderlos y ver paso a paso como se va ejecutando y cumpliendo con el objetivo de cada problema.

Al final comprendimos que se nos facilita en algunas cosas el usar estas herramientas que incluso nos ayudaran a simplificar los códigos y asi resolver el problema.