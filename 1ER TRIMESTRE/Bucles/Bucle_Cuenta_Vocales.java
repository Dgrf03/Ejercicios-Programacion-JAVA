/************************************************************************       
 * Bucle_Caracteres.java
 * Programa que pregunta que pida introducir una letra y que cuente las vocales hasta que introduzca un 0 para salir.
 * Autor: Diego Ramos Fernández
 * Fecha: 08/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;

public class Bucle_Cuenta_Vocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorVocales = 0;
        char letra;

        while (true) {
            System.out.print("Introduce una letra (0 para salir): ");
            letra = scanner.nextLine().charAt(0);
            if (letra == '0') {
                break;
            }

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                contadorVocales++;
            }
        }
        System.out.println("Has introducido " + contadorVocales + " vocales.");
        scanner.close();
    }
}
//con un bucle do-while se haria asi:
/*
 * do {
            System.out.print("Introduce una letra (0 para salir): ");
            letra = scanner.nextLine().charAt(0);
            if (letra != '0') {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                    letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                    contadorVocales++;
                }
            }
        } while (letra != '0');
 */

