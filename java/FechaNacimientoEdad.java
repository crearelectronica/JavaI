import java.util.Scanner;
public class FechaNacimientoEdad {
    public static void main(String[]args) {
        /*Escribir una aplicacion que pida el año actual y la fecha de nacimiento del usuario.
        Debe calcular su edad.*/
        int añoActual,añoDeNacimiento,edad;

        Scanner scanner=new Scanner(System.in);

        System.out.println("\n Ingrese Año Actual:");
        añoActual= scanner.nextInt();

        System.out.println("\n Ingrese Año de Nacimiento:");
        añoDeNacimiento= scanner.nextInt();

        edad = añoActual - añoDeNacimiento;

        System.out.println("\n Su edad es: "+edad+"años");
    }


}
