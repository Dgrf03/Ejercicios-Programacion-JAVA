/************************************************************************       
 * EJ109_Palindromo.java
 * Este programa verifica si una frase es un palíndromo usando funciones.
 * Autor: Diego Ramos Fernández
 * Fecha: 27/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;

public class EJ109_Palindromo {

    // Función para convertir letras mayúsculas a minúsculas manualmente
    public static char aMinuscula(char c) {
        if(c >= 'A' && c <= 'Z') {
            return (char)(c + ('a' - 'A'));
        }
        return c;
    }

    // Función para verificar si un carácter es alfanumérico
    public static boolean esAlfanumerico(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }

    // Función para verificar si una frase es palíndroma
    public static boolean esPalindromo(String frase) {
        int izquierda = 0;
        int derecha = frase.length() - 1;

        while (izquierda < derecha) {
            // Avanzar izquierda si no es alfanumérico
            while (izquierda < derecha && !esAlfanumerico(frase.charAt(izquierda))) {
                izquierda++;
            }
            // Retroceder derecha si no es alfanumérico
            while (derecha > izquierda && !esAlfanumerico(frase.charAt(derecha))) {
                derecha--;
            }

            if (aMinuscula(frase.charAt(izquierda)) != aMinuscula(frase.charAt(derecha))) {
                return false;
            }

            izquierda++;
            derecha--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        if (esPalindromo(frase)) {
            System.out.println("La frase es palíndroma.");
        } else {
            System.out.println("La frase no es palíndroma.");
        }
        scanner.close();
    }
}
//con bucle for:
/*
    public static boolean esPalindromo(String frase) {
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();
        if (comprobarPalindromo(frase)) {
            System.out.println("La frase es palíndroma.");
        } else {
            System.out.println("La frase no es palíndroma.");
        }
    public static boolean comprobarPalindromo(String frase) {
        for (int i = 0; i < frase.length() / 2; i++) {
            if (aMinuscula(frase.charAt(i)) != aMinuscula(frase.charAt(frase.length() - 1 - i))) {
                return false;
            }
            while (derecha > izquierda && !esAlfanumerico(frase.charAt(derecha))) {
                derecha--;
            }

            if (aMinuscula(frase.charAt(izquierda)) != aMinuscula(frase.charAt(derecha))) {
                return false;
            }

            izquierda++;
            derecha--;
        }
        return true;
    }
*/

