# Practica 1: 
____
#### Resumen:
- En esta primera práctica aplicamos el uso de Git Bash familiarizandonos con los diversos comandos que nos ayudaran a realizar tareas diversas, combinando el uso de los editores como Visual Studio Code, Atom, etc...
- Inclusive a crear diversos archivos de codigo compartiendo estos en GitHub para hacer uso de nuestros archivos en cualquier computadora.
- Por último realizamos dos proyectos, uno haciendo conversión de grados Celsius a grados Farenheite y el otro calculando el salario de un trabajador por las horas trabajadas por el mismo.
___
#### Desarrollo:
##### GradosGF
1. Primero se abre el programa Git Bash y nos ubicamos en el escritorio con el comando: 

![git](https://i.imgur.com/1YRSmMm.png)

```$ cd /Desktop/Fundamentoseduardo/Practica1/```

2. Se creara un directorio principal donde se guardaran todas las practicas que se realicen durante el trimestre llamado Fundamentoseduardo.
```$ mkdir Fundamentoseduardo```

![Carpeta](https://i.imgur.com/XnPgK6C.png)

3. Se ubicara en el directorio Fundamentoseduardoy se creara otro directorio llamado Practica1.
``` $ cd Fundamentoseduardo```
```$ mkdir Practica1```
![Practica](https://i.imgur.com/8RaV3wh.png)

4. Nos ubicaremos en el directorio Practica1 donde se creara un programa Java llamado GradosCF.java en el que haremos un codigo que transforme los grados °C a °F.
```$ cd Practica1```
```$ touch Grados.java```

5. Se abrira el editor de codigo Visual Studio Code con el siguiente comando:
```$ code . &``` 
![code](https://i.imgur.com/r3VxeY6.png) 
y se hará el codigo de conversión de grados.
```
public class GradosCF{
public static void main(String[] args){

  int C=60;
  int F;

  F = C * 9/5 + 32;

  System.out.println(F);
}
}
```
6. Se compilara el programa java en el shell con el siguiente comando:
``` $ javac GradosCF.java``` y se ejecutara el programa en el shell:  ```java GradosCF```.
.
7. Una vez que se haya ejecutado el programa nos dirijiremos a nuestra cuenta de GitHub donde crearemos un nuevo repositorio con el nombre de nuestro directorio principal que es Fundamentoseduardo.
![Repositorio](https://i.imgur.com/S4BqCkc.png "Damos clic en Create repository")

8. Una vez creado configuramos el local de git con nuestros datos de usuario:
```
$ git config --global user.name "EduardoYetmo"
$ git config --global user.email "eduardo.yetmo@gmail.com"
```

9. Iniciamos la configuracion del repositorio local asegurandonos estar dentro del directorio "Fundamentoseduardo".

```
$ echo "# FundamentosEduardo" >> README.md       
$ git init
$ echo "*.class" >> .gitignore
$ git add .
$ git commit -m "Primer Commit"
$ git remote add origin https://github.com/EduardoYetmo/FundamentosEduardo.git
$ git push -u origin master
```
9. Una vez terminado el codigo podremos actualizar el GitHub y apareceran los archivos antes creados.