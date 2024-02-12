import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Ejercicio: Crear un filtro para obtener objetos Strings que cumplan
 * una condición. En este caso detectar la palabra Java.
 *
 */
class FiltroCadenas {

    private FiltroCadenas() {
    }

    public static void main(String[] args) {

        List<String> palabra = Arrays.asList("Java");

        Predicate<String> iniciaConC = s -> s.startsWith("C");

        palabra.stream().filter(iniciaConC)
                .forEach(s -> System.out.println("Palabra: " + s));
    }

    public static FiltroCadenas createFiltroCadenas() {
        return new FiltroCadenas();
    }
}