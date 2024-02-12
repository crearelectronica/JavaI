import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero entero ");
        int x;
        x = scanner.nextInt();
        System.out.println("Escribe otro numero entero ");
        int y;
        y = scanner.nextInt();

        // + - * /;
        System.out.println("El resultado de una suma es "+(x+y));

        System.out.println("El resultado de una resta es "+(x-y));

        System.out.println("El resultado de una multiplicacion es "+(x*y));

        System.out.println("El resultado de una division es "+(x/y));

    }
}