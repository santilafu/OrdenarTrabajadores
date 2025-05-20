import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista de trabajadores
        List<Trabajador> trabajadores = new ArrayList<>();

        // Añadimos varios empleados y directivos
        trabajadores.add(new Empleado("Lucía", "Pérez", 1200, "Ventas", 30, 5));
        trabajadores.add(new Directivo("Carlos", "Gómez", 2000, "Dirección", 45, 500));
        trabajadores.add(new Empleado("Mario", "López", 1300, "Marketing", 25, 2));
        trabajadores.add(new Directivo("Ana", "Martínez", 2500, "Dirección", 50, 800));

        // Ordenamos por edad descendente
        Collections.sort(trabajadores);

        // Mostramos los trabajadores ordenados
        System.out.println("Lista de trabajadores ordenada por edad (de mayor a menor):");
        for (Trabajador t : trabajadores) {
            System.out.println(t.toString() + " → Sueldo total: " + t.calcularSueldoMensual() + "€");
        }
    }
}
