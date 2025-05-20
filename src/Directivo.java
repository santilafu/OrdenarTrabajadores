/**
 * Subclase de Trabajador que representa a un directivo con bonus.
 */
public class Directivo extends Trabajador {
    // Atributo específico de directivo
    private double bonus;

    // Constructor: llama primero al constructor de Trabajador y luego añade el bonus
    public Directivo(String nombre, String apellidos, double sueldoMensual, String departamento, int edad, double bonus) {
        super(nombre, apellidos, sueldoMensual, departamento, edad); // constructor del padre
        this.bonus = bonus; // propio del directivo
    }

    // Implementación del método abstracto
    @Override
    public double calcularSueldoMensual() {
        // Suma el sueldo base más el bonus
        return sueldoMensual + bonus;
    }

    // Redefinimos toString para incluir el bonus
    @Override
    public String toString() {
        return super.toString() + " - Directivo con bonus de " + bonus + "€";
    }
}
