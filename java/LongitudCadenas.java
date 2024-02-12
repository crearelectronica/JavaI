import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Ejercicio: Calcular la longitud por cadena de caracteres de una lista.
 *
 */
public class LongitudCadenas {

    public static void main(String[] args) {

        Function<String, Integer> contadorCaracteres = String::length;

        List<String> cadenas = Arrays.asList("Java", "8", "es", "tremendo!");

        List<Integer> conteoLongitudCadenas = cadenas.stream()
                .map(contadorCaracteres).collect(Collectors.toList());

        conteoLongitudCadenas.forEach(System.out::println);
    }
}