import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Ejercicio: Convertir cadenas de caracteres a minúscula con
 * programación funcional.
 *
 */
public class CadenasMinuscula {

    public static void main(String[] args) {

        Function<String, String> convertirAMinuscula = String::toUpperCase;

        List<String> cadenas = Arrays.asList("JAVA", "8", "ES", "TREMENDO!");

        cadenas.stream().map(convertirAMinuscula)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}