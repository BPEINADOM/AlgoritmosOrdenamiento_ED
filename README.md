
# Algoritmos de Ordenamiento - Clasificación de ventas con Quick Sort


Este proyecto corresponde a la Actividad individual de la Unidad 2, el cual implementa el algoritmo de ordenamiento QuickSort en Java para clasificar un conjunto de datos con diferentes criterios.

El ejercicio asignado corresponde al numero 16, que trata de una clasificacion de ventas con dos criterios diferentes, el valor de venta y la fecha de realizacion. Cada venta se representa mediante un objeto que contiene el numero de factura, la fecha, el nombre del cliente y el valor total.


## Tecnologias Utilizadas

- Java 21
- Maven
- JUnit 5
- Git y Github

## Arquitectura

El proyecto esta organizado siguiendo una aproximacion a la arquitectura hexagonal:

- **Domain**: contiene el modelo Venta, que representa la informacion de cada registro.

- **Application**: contiene el puerto OrdenadorVentas y el servicio ClasificarVentasService, encargado de coordinar la clasificacion.

- **Infrastructure**: contiene la implementacion del algoritmo de ordenamiento Quick Sort.

## Ejecucion del proyecto

Clonar el repositorio

```bash
  git clone hhttps://github.com/BPEINADOM/AlgoritmosOrdenamiento_ED.git
```

Entrar en el directorio del proyecto

```bash
  cd clasificacionventas/src
```

Compilar el proyecto y ejecutar pruebas unitarias

```bash
  mvn clean test
```

Ejecutar la clase principal Main.java para visualizar los resultados de la clasificacion

```bash
  javac Main.java
  java Main
```


