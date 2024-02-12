     import java.util.Scanner;

    public class celciusFahrenheit {
        public static void main(String[] args) {
            double gradoF = 0;
            double gradoC = 0;
            int opcion = 0;
            System.out.println("Escribe 1 si quieres pasar de °C a °F o escribe 2 si quieres pasar de °F a °C");
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();

            if(opcion == 1) {
                System.out.println("Cuantos °C quieres convertir a °F:");
                gradoC = scanner.nextDouble();
                gradoF = (gradoC*9/5) + 32;
                System.out.println(gradoC + " °C equivale a " + gradoF + " °F");
            }else if(opcion == 2) {
                System.out.println("Cuantos °F quieres convertir a °C:");
                gradoF = scanner.nextDouble();
                gradoC = ((gradoF - 32)*5/9);
                System.out.println(gradoF + " °F equivale a " + gradoC + " °C");
            }
        }
    }

