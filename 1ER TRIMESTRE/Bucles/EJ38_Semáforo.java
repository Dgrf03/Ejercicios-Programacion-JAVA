/************************************************************************       
 * EJ38_Semáforo.java
 * Programa que utiliza el bucle do-while para salir de la calculardora.programa que pida un color (rojo/amarillo/verde) e indique la acción a realizar (parar/frenar/pasar). El programa debe utilizar un switch.
 * Autor: Diego Ramos Fernández
 * Fecha: 10/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJ38_Semáforo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String color;

        do {
            System.out.print("Introduce un color (rojo/amarillo/verde) o 'salir' para terminar: ");
            color = scanner.nextLine().toLowerCase();

            switch (color) {
                case "rojo" -> System.out.println("Acción: Parar");
                case "amarillo" -> System.out.println("Acción: Frenar");
                case "verde" -> System.out.println("Acción: Pasar");
                case "salir" -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Color no válido. Por favor, introduce rojo, amarillo, verde o salir.");
            }
        } while (!color.equals("salir"));

        scanner.close();
    }
}
