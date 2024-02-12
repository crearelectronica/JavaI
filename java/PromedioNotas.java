/**
 * Ejercicio: Calcular el promedio de una nota
 *
 */
import java.util.Arrays;

public class PromedioNotas {

    public static void main (String[] args){

        double [] valores = {8, 9.5, 8, 10, 6, 7.8};

        double suma = calcularSuma(valores);
        double promedio = calcularPromedio(valores);

        System.out.println("La suma de los valores del arreglo es: " + suma);
        System.out.println("El promedio de los valores del arreglo es: " + promedio);


    }

    public static double calcularSuma(double[] valores) {
        double suma = 0.0;
        for (int i = 0; i < valores.length; i++) {
            suma += valores[i];
        }
        return suma;
    }

    public static double calcularPromedio(double[] valores) {
        double suma = calcularSuma(valores);
        double promedio = suma / valores.length;
        return promedio;
    }

}