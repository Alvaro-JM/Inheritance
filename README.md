# Herencia-Inheritance
Proyecto para entender de forma sencilla la herencia en programación.  
Nos muestra de manera simple y con objetos fáciles de visualizar cómo funciona la herencia. 
Concretamente este proyecto está realizado en JAVA pero se puede extrapolar a más lenguajes, la herencia simple no es exclusiva de Java.  

## Jerarquía

Para la jerarquía de clases y la herencia usa **formas geométricas**.  

---

Toda figura hereda de la clase **Shape** (Figura). El primer paso en la herencia es dividirla entre **TwoDimensionalShape** (Figuras de dos dimensiones) y **ThreeDimensionalShape**  y (Figuras de tres dimensiones). 
Estas tres clases son abstractas, haciendo que las figuras que heredan de las mismas sobreescriban los métodos básicos que tienen. 

---

De *TwoDimensionalShape* heredan **Circle** (Círculo), **Triangle** (Triángulo) y **Rectangle** (Rectángulo). Las tres clases heredan 3 métodos de las clases superiores (imprimir el objeto, obtener área y  obtener perímetro) e implementan cada una sus propios métodos. Tanto la clase *Círculo* como la clase *Triángulo* necesitan de puntos (de la clase **Point**) para formarse.

---

De *ThreeDimensionalShape* heredan **Sphere** (Esfera), **Cube** (Cubo), **Cone** (Cono), y **Cylinder** y ocurre exactamente lo mismo, de las clases superiores heredan 3 métodos (imprimir objeto, obtener área superficial y obtener volumen) e implementan sus propios métodos cada una. 

---
La clase **Point** (Punto) no forma parte de la propia jerarquía. Se trata de un objeto que necesitan las clases Circle y Triangle para formarse. El círculo necesita un punto central y el triángulo necesita de tres puntos.  

---

![](/pics/jerarquia.png)

### Aplicación
La clase principal **ShapeApp** nos muestra un ejemplo de cómo se crean los objetos, cómo hace uso de los métodos de cada uno de ellos y cómo imprime los resusltados en un archivo.
Para que funcione correctamente debemos darle un archivo como argumento al main en el momento de ejecutarlo. 
En caso de querer modificar los atributos de los objetos, o bien la salida, se deberá hacer modificando el código de ShapeApp a través de un editor de texto o de un IDE.
  
  
---  


## Descargar y Ejecutar
Para descargar la aplicación pinchar en el botón **Code** del proyecto y **Download Zip**  

![](/pics/descarga.png)  

Una vez descargado se pueden eliminar todos los archivos de documentación e imágenes. Es decir, los únicos archivos que harán falta para ejecutar la aplicación son aquellos que están en la carpeta **Classes**.

### Compilar
Para hacer funcionar la aplicación por consola (**cmd**) primero debemos asegurarnos de tener java instalado.
Una vez instalado, en consola nos situamos en la carpeta donde se encuentran los archivos java del proyecto y escribimos:
~~~
javac Shape.java
javac TwoDimensionalShape.java
javac ThreeDimensionalShape.java
javac Point.java
javac Circle.java
javac Triangle.java
javac Rectangle.java
javac Sphere.java
javac Cube.java
javac Cone.java
javac Cylinder.java
javac ShapeApp.java
~~~

### Ejecutar
Una vez compilados los archivos ya podemos ejecutarlo. Debemos recordar que este proyecto debe recibir un archivo de texto como argumento para imprimir la salida del programa, por ejemplo:
~~~
java ShapeApp archivo.txt
~~~
Con esto se generará el archivo `archivo.txt` en la carpeta del proyecto, y podemos observar todo lo que se ha imprimido.

---

Este proyecto ha sido creado a partir de las clases obtenidas por Pratik Patel en [inheritance](https://github.com/gati3363/inheritance) a las que se les han realizado diversos cambios. 
