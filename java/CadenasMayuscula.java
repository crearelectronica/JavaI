import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Ejercicio: Convertir cadenas de caracteres a mayúscula con
 * programación funcional.
 *
 */
public class CadenasMayuscula {

    public static void main(String[] args) {

        Function<String, String> convertirAMayuscula = String::toUpperCase;

        List<String> cadenas = Arrays.asList("Java", "8", "es", "tremendo!");

        cadenas.stream().map(convertirAMayuscula)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}