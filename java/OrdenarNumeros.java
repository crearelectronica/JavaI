import java.util.Scanner;

public class OrdenarNumeros{
    public static void main(String args[]){

        int n1 = 0, n2 = 0, n3 = 0;

        Scanner entrada = new Scanner (System.in);

        System.out.println("Este programa te ordena los números de mayor a menor");
        System.out.println("");

        System.out.println("Inserte el primer número: ");
        n1 = entrada.nextInt();

        System.out.println("Inserte el segundo número: ");
        n2 = entrada.nextInt();

        System.out.println("Inserte el tercer número: ");
        n3 = entrada.nextInt();

        if((n1 > n2) && (n2 > n3)){
            System.out.println("El orden correcto es " + n1 + " " + n2 + " " + n3);
        } else if((n1 > n3) && (n3 > n2)){
            System.out.println("El orden correcto es " + n1 + " " + n3 + " " + n2);
        } else if ((n2 > n1) && (n1 > n3)){
            System.out.println("El orden correcto es " + n2 + " " + n1 + " " + n3);
        } else if ((n2 > n3) && (n3 > n1)){
            System.out.println("El orden correcto es " + n2 + " " + n3 + " " + n1);
        } else if((n3 > n2) && (n2 > n1)){
            System.out.println("El orden correcto es " + n3 + " " + n2 + " " + n1);
        } else{
            System.out.println("El orden correcto es " + n3 + " " + n1 + " " + n2);
        }
    }
}