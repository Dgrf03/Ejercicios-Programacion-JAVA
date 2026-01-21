import java.util.Scanner;

public class  E1_HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir al usuario que introduzca Hola Mundo
        System.out.print("Por favor, introduce Hola Mundo: ");
        String input = scanner.nextLine();
        if (input.equals("Hola Mundo")) {
            System.out.println("¡Hola Mundo!");
        } else {
            System.out.println("Entrada no válida.");
        }
        System.out.println("A mi me gusta el bocata de tortilla de patata con jamón serrano.");
        // Cerrar el scanner
        scanner.close();
    }
}
