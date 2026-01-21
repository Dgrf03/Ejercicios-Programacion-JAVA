import java.util.Scanner;
public class EJMultiplo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, introduce un número entero: ");
        int numero = scanner.nextInt();
        if (numero % 5 == 0) {
            System.out.println("El número " + numero + " es múltiplo de 5.");
        } else {
            System.out.println("El número " + numero + " no es múltiplo de 5.");
        }
        scanner.close();
    }
}
