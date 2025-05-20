import java.util.Objects;

/**
 * Clase abstracta que representa a un trabajador.
 */
public abstract class Trabajador implements Comparable<Trabajador> {
    protected String nombre;
    protected String apellidos;
    protected double sueldoMensual;
    protected String departamento;
    protected int edad;

    public Trabajador(String nombre, String apellidos, double sueldoMensual, String departamento, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldoMensual = sueldoMensual;
        this.departamento = departamento;
        this.edad = edad;
    }

    public abstract double calcularSueldoMensual();

    // Comparamos trabajadores por edad de forma DESCENDENTE
    @Override
    public int compareTo(Trabajador otro) {
        return Integer.compare(otro.edad, this.edad);
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " (" + departamento + ") - Edad: " + edad;
    }
}
