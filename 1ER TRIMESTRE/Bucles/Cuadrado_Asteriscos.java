/************************************************************************       
 * Cuadrado_Asteriscos.java
 * Programa que imprime un cuadrado de asteriscos.
 * Autor: Diego Ramos Fernández
 * Fecha: 21/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class Cuadrado_Asteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño del cuadrado: ");
        int tamaño = scanner.nextInt();

        for (int i = 1; i <= tamaño; i++) {
            for (int j = 1; j <= tamaño; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
