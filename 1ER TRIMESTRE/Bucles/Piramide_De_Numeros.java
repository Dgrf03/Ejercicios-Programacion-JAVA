/************************************************************************       
 * Piramide_De_Numeros.java
 * Programa que imprime una pirámide de números, en cada fila se imprime un número más que en la anterior y siempre el mismo número.
 * Autor: Diego Ramos Fernández
 * Fecha: 21/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class Piramide_De_Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de niveles de la pirámide: ");
        int niveles = scanner.nextInt();

        for (int i = 1; i <= niveles; i++) {
            // Imprimir espacios en blanco
            for (int j = 1; j <= niveles - i; j++) {
                System.out.print(" ");
            }
            // Imprimir números
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}


