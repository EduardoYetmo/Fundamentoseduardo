# Practica1
---
###Resumen
- En está primera práctica aplicamos el uso de Git Bash, familiarizandonos con los diversos comandos que nos ayudaran a realizar diversas tareas, combinando el uso de los editores de codigo (Visual Studio Code, Atom Sublime Text, etc...).
-Aprendimos a crear diversos archivos utilizando el Shell, tambien nos ayuda a manipular estos dependiendo la actividad que se desee hacer.
-Veremos el programa GitHub que nos ayuda a compartir nuestros diversos directorios ya sea compartiendo al público o ser especifico quien puede verlos.
---
##Desarrollo:
####GradosCF

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

9.Iniciamos la configuración del repositorio local asegurandonos estar dentro del directorio Fundamentoseduardo.

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


