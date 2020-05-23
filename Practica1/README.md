# Practica1
---
### Resumen
- En está primera práctica aplicamos el uso de Git Bash, familiarizandonos con los diversos comandos que nos ayudaran a realizar diversas tareas, combinando el uso de los editores de codigo (Visual Studio Code, Atom Sublime Text, etc...).
-Aprendimos a crear diversos archivos utilizando el Shell, tambien nos ayuda a manipular estos dependiendo la actividad que se desee hacer.
-Veremos el programa GitHub que nos ayuda a compartir nuestros diversos directorios ya sea compartiendo al público o ser especifico quien puede verlos.
---
## Desarrollo:
#### GradosCF

1. Primero se abre el programa Git Bash (Shell), al iniciar nos manda al directorio inicial de sistema. Escribiremos el siguiente comando para que nos redireccione al Escritorio:

    ![git](https://i.imgur.com/D8XdjQK.png)

    ```$ cd Desktop```

###### **Nota: En los codigos escritos en el desarrollo se agregara el simbolo "$" no es necesario ponerlo ya que el shell lo pone automaticamente**

2. Una vez ubicandonos en el Escritorio crearemos un nuevo directorio llamado Fundamentoseduardo que nos servira para guardar todas las practicas que se realizaran en el trimestre. Y lo crearemos con el siguiente comando:

    ```$ mkdir Fundamentoseduardo```

    ![Carpeta](https://i.imgur.com/XnPgK6C.png)

3. Una vez creado el directorio principal nos ubicaremos en el para poder trabajar y ya ubicandonos ahí crearemos un nuevo directorio con el nombre de Practica1.

    ``` $ cd Fundamentoseduardo```

    ```$ mkdir Practica1```

    ![Practica](https://i.imgur.com/8RaV3wh.png)

4. Nos direccionaremos al directorio de Practica1 donde crearemos un programa java llamado GradosCF.java en el que haremos un codigo que transforme los grados °C a °F.

    ```$ cd Practica1```

    ```$ touch GradosCF.java```

5. Se abrira el editor de codigo Visual Studio Code con el siguiente comando:

    ```$ code . &```

    ![code](https://i.imgur.com/r3VxeY6.png) 

y se hará el código de conversión de grados.

```
public class GradosCF{
public static void main(String[] args){

    int C=60;
    int F;

    F = C * 9/5 + 32;

    System.out.println(F + " °F");
}
}
```

6. Se compilara el programa java en el shell con el siguiente comando: ```$ java GradosCF.java```y se ejecutara el programa en el shell: ```java GradosCF``` con los datos configurados en el programa nos debe de dar un resultado de 140 °F.

7. Una vez que se haya ejecutado el programa nos dirijimos a nuestra cuenta de GitHub donde crearemos un nuevo repositorio con el nombre de nuestro directorio principal que es Fundamentoseduardo.

![Repositorio](https://i.imgur.com/S4BqCkc.png "Damos clic en Create repository")

8. Una vez creado configuramos el local de git con nuestros datos de usuario del GitHub:

    ```
    $ git config --global user.name "EduardoYetmo"
    $ git config --global user.email eduardo.yetmo@gmail.com
    ```

9. Iniciamos la configuración del repositorio local asegurandonos estar dentro del directorio Fundamentoseduardo.

    ```
    $ echo "# FundamentosEduardo" >> README.md       
    $ git init
    $ echo "*.class" >> .gitignore
    $ git add .
    $ git commit -m "Primer Commit"
    $ git remote add origin https://github.com/EduardoYetmo/FundamentosEduardo.git
    $ git push -u origin master
    ```

10. Una vez terminado los comandos podremos acualizar la pagina del GitHub y apareceran todos los archivos que se encuentran en Fundamentoseduardo.

    ![info](https://i.imgur.com/VvVZ9SV.png)

**Nota: al actualizar alguno de los datos que este en el directorio Fundamentoseduardose tiene que aplicar los siguientes comandos para actualizar tambien el GitHub**

    ``` 
    $ git status
    $ git add .
    $ git commit -m "Se agrego el README de P1"
    $ git push
    ```
---
#### Salario Día por Hora

1. Se hará un programa que obtenga el salario de un trabajador, según el número de horas que haya trabajado.

2. Nos ubicaremos en el directorio Fundamentoseduardo/Practica1:

    ```cd /desktop/Fundamentoseduardo/Practica1/```

3. Crearemos un programa java llamado SalarioDH.java donde harémos un código que nos permita hacer el enunciado abriendo el editor de codigo.

    ```
    $ touch SalarioDH.java
    $ code . &
    ```

4. Crearemos el codigo con las caracteristicas correspondientes:

   ```
   public class SalarioDH{
    public static void main (final String[] args){

        int Sueldoxhr=30;
        int Hrxdia=8;
        int dias=15;
        int Salario;

        Salario = Sueldoxhr * Hrxdia * dias;

        System.out.println("El salario que gana un trabajador por quincena es:");
        System.out.println("$"+Salario);
    }
    }
    ```

5. Se compilara el programa java en el shell con el siguiente comando: ```$ java SalarioHD.java```y se ejecutara el programa en el shell: ```java SalarioHD``` con los datos configurados en el programa nos debe de dar un resultado de $ 3600.

6. Al aplicar estos cambios en el directorio Practica 1 tendremos que guardar todos los cambios para que se almacenen en el repositorio en GitHub.
---
## Cuestionario

-  **¿Que comando de git se utilizan para clonar un repositorio a su computadora local?
¿Cómo se utilíza?**
R= El comando para clonar un repositorio es: ```git clone https://github.com/EduardoYetmo/Fundamentoseduardo.git```
Y nos sirve para copiar o clonar el repositorio qu esta almacenado en el GitHub y poder modificarlo en otra computadora ajena a la que lo creo esto con la finalidad de que puedas tener a dispocisión el proyecto o incluso compartirlo con alguien mas que pueda agregar algo.
- **Explique para qu´e sirve y como se usa el comando ”git pull”**
R= 

- **9. ¿Que pasa si está colaborando en un proyecto con otra persona, ambos clonan el
repositorio de github y ambos actualizan el mismo archivo, su colaborador hace un
push y le dice a usted que haga un pull?**
R=

---
## Resultados

Con esta práctica nos pudimos observar los diferente comando que existen para el manejo de Git Bash que nos facilitan el manejor de diferentes tareas que se puede realizar y es más directo tambien conocemos e identificamos la nomeclatura que hay tanto de codificadores como codigo.

Cabe mencionar que conocimos diversas plataformas de trabajo que incluyen muchas herramientas que puede facilitar el proyecto que se realiza y nos intuye a investigar más en como podemos utilizar estas.

Conforme al código se realizo los enunciados de una manera simple al conocimiento que se tiene en programación cumpliendo con lo que se pedía. En el primero se realizo un programa que hiciera una conversión de temperaturas usando la cantidad de 60 °C y su conversion es de 140 °F.

En el segundo enunciado nos pedían que obtuvieramos el salario de un trabajador por horas tomando como variables el suelo por hora, días y horas por día tomando asi un resultado final de $3600.

Por último el GitHub es una herramienta que es de mucha utilidad ya que puedes compartir tus proyectos con demas usuarios o incluso para tu propia utilidad.

---

## Discusión

Esta práctica es muy útil ya que a pesar de que muchos de nosotros nos estamos iniciando se nos facilito el realizar este trabajo aunque es sencillo son las bases que nos llevaran a realizar proyectos mas grandes y complejos, tambien es importante irnos familiarizando con la variedad de software que nos ayudan a realizar con mayor facilidad nuestro trabajo y saber utilizalos.

---
## Conclusión

Como conclusion se llevo acabo la práctica de la manera en que se indico tratando de investigar mas herramientas para mejorar el trabajo a realizar, con el objetivo de conocer mas el software de Git Bash, Git Hub, Visual Studio Code y como herramienta del editor de codigo Markdown.
Tambien nos damos a la tarea de investigar mas su herramientas y usos que se le pueden dar practicando y ayudandonos a ser mas habiles con estos y con los comandos que debemos aplicar.

       