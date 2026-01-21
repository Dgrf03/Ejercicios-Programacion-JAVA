//un programa que pida dos numeros por teclado y muestre todos los numeros comprendidos entre ellos según como lo pidan será ascendiente o descendente con bucle for.
import java.util.Scanner;
public class EJ_Muestra_Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("¿Quieres mostrar los números en orden ascendente (1) o descendente (2)? ");
        int orden = scanner.nextInt();

        if (orden == 1) {
            // Mostrar en orden ascendente
            for (int i = num1 + 1; i < num2; i++) {
                System.out.println(i);
            }
        } else if (orden == 2) {
            // Mostrar en orden descendente
            for (int i = num2 - 1; i > num1; i--) {
                System.out.println(i);
            }
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}