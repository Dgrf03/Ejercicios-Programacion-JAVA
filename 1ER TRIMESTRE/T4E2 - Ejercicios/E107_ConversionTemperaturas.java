import java.util.Scanner;

public class E107_ConversionTemperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcion;
        do {
            System.out.println("\n*** Conversor de temperaturas ***");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Celsius a Kelvin");
            System.out.println("4. Kelvin a Celsius");
            System.out.println("s. Salir");
            System.out.print("Elige opción: ");
            opcion = sc.next().charAt(0);
            
            if (opcion == '1') {
                System.out.print("Introduce grados Celsius: ");
                double c = sc.nextDouble();
                double f = c * 9 / 5 + 32;
                System.out.println(c + " °C = " + f + " °F");
            } else if (opcion == '2') {
                System.out.print("Introduce grados Fahrenheit: ");
                double fa = sc.nextDouble();
                double ce = (fa - 32) * 5 / 9;
                System.out.println(fa + " °F = " + ce + " °C");
            } else if (opcion == '3') {
                System.out.print("Introduce grados Celsius: ");
                double c = sc.nextDouble();
                double k = c + 273.15;
                System.out.println(c + " °C = " + k + " K");
            } else if (opcion == '4') {
                System.out.print("Introduce grados Kelvin: ");
                double k = sc.nextDouble();
                double c = k - 273.15;
                System.out.println(k + " K = " + c + " °C");
            } else if (opcion != 's' && opcion != 'S') {
                System.out.println("Opción no válida. Intenta otra vez.");
            }
            sc.nextLine();
        } while (opcion != 's' && opcion != 'S');
        sc.close();
        System.out.println("Programa finalizado.");
    }
}
