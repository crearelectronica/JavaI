import java.util.Scanner;

public class CalcularFactorial {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        //introducir un número entero >= 0 por teclado
        do {
            System.out.print("Introduce un numero entero >= 0: ");
            n = sc.nextInt();
        } while (n < 0);

        //calcula y mostrar el factorial del número n
        System.out.printf("%d! = %.0f %n", n, factorial(n));
    }

    //método Java para calcular el factorial de un número n
    //el método recibe el número n al que queremos calcular su factorial
    //el método calcula y devuelve el factorial de n
    public static double factorial(int n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

}