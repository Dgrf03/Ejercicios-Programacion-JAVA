/*
 * Nombre del programa: EJ28Es_Vocal
 * Descripción: Este programa solicita al usuario que ingrese una letra y luego determina si es una vocal.
 * Nombre: Diego Ramos Fernández
 * Fecha: 02/10/2025
 */ 
import java.util.Scanner;
public class EJ28Es_Vocal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicitar al usuario que ingrese una letra
        System.out.print("Introduce una letra: ");
        char letra = sc.next().charAt(0);
        // Determinar si la letra es una vocal
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
            letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("La letra " + letra + " es una vocal.");
        } else {
            System.out.println("La letra " + letra + " no es una vocal.");
        }
        sc.close();
    }
}
