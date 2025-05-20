# Actividad 2 - Ordenar trabajadores por edad

## Descripción

Este proyecto consiste en implementar una jerarquía de trabajadores (`Trabajador`, `Empleado` y `Directivo`) y ordenarlos por edad de forma **descendente**.

Se trabaja con:
- Herencia
- Clases abstractas
- Interfaz `Comparable`
- Polimorfismo
- Listas (`ArrayList`) y ordenación con `Collections.sort()`

## Tecnologías

- Lenguaje: Java 17
- IDE: IntelliJ IDEA Ultimate
- Control de versiones: Git + GitHub

## Ejemplo de uso

```java
List<Trabajador> lista = new ArrayList<>();
lista.add(new Empleado(...));
lista.add(new Directivo(...));
Collections.sort(lista); // Ordena por edad
