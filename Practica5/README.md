## Práctica 5
---
##### Resume
- En está práctica iremos conociendo el uso de los métodos con un programa de calculadora.

- Tambien como es que podemos unirlos en las diferentes tareas que vamos implementando en nuestro programa.

---
##### Desarrollo

1.- Primero realizamos lo que es un menú, tomando en cuenta las operaciones que se llevaran a cabo en esta calculadora. 

![cal](https://i.imgur.com/PEK602P.png)

2.- Al seleccionar una opcion utilizamos un **switch case** para formar un ciclo dependiendo la elección del usuario es la operacion que se llevara acabo.

3.- En esta parte es donde se utilizo los metodos solicitando un operador para la operación que llevara acabo, después una variable de resultado sera igual a la operacion que fue solicitada y por ultimo un metodo de impresion que dara el resultado de la operacion solicitada
```
public static double solicitarOperador(){
        double x; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Operando = ");
        x = sc.nextDouble();
        return x;
    }
```

![suma](https://i.imgur.com/uSZix1i.png)

4.- Una vez imprimiendo el resultado enseguida te vuelve a ejecutar el menú dandote la opción de realizar otra operación diferente o incluso salir de la calculadora.

5.- En cada uno de las operaciones se llevo acabo un metodo diferente: 
```
 public static double suma(double x, double y){
        double r;
        r = x+y;
        return r;
    }

    public static double resta(double x, double y){
        double r;
        r = x-y;
        return r;
    }

    public static double multiplicacion(double x, double y){
        double r;
        r = x*y;
        return r;
    }

    public static double division(double x, double y){
        double r;
        r = x/y;
        return r;
    }

```

---
##### Resultados

La práctica se llevo a cabo con ayuda del profesor y terminando los detalles ayudando a aplicar los diferentes metodos que ibamos conociendo y al ir declarando varibles junto con estos para ser mas precisos a que tarea nos estamos refiriendo y que variables estan involucradas.

---
##### Discusión

Los métodos son algo confusos ya que al aplicarlos a diferentes tareas te pueden ayudar pero si no llevas un orden presiso de tus variables involucradas puedes perjudicar tu programa e incluso puede que no te salga, pero si llevas un ordes y tienes en claro que variables vas a utilizar te pueden facilitar la tarea que desees realizar.

---
##### Conclusión

Como conclusión podemos decir que los metodos son una herramienta practica para las diferentes tareas que hemos realizado durante el curso y podemos ir analizando tarea por tarea hasta llegar a nuestro objetivo.