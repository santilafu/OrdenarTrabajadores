/**
 * Subclase de Trabajador que representa a un empleado normal con antigüedad.
 */
public class Empleado extends Trabajador {
    // Atributo específico de empleado
    private int antigüedad;

    // Constructor: llama primero al constructor de Trabajador y luego añade antigüedad
    public Empleado(String nombre, String apellidos, double sueldoMensual, String departamento, int edad, int antigüedad) {
        super(nombre, apellidos, sueldoMensual, departamento, edad); // llamamos al constructor de Trabajador
        this.antigüedad = antigüedad; // añadimos lo propio de Empleado
    }

    // Implementamos el método abstracto del padre
    @Override
    public double calcularSueldoMensual() {
        // Aumentamos el sueldo base en función de los años de antigüedad
        return sueldoMensual + (antigüedad * 20);
    }

    // Redefinimos el toString para incluir la antigüedad
    @Override
    public String toString() {
        return super.toString() + " - Empleado con " + antigüedad + " años de antigüedad";
    }
}
