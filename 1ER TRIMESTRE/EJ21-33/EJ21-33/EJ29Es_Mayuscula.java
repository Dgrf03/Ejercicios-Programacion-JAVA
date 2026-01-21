/*
 * Nombre del programa: EJ29Es_Mayuscula
 * Descripción: Este programa solicita al usuario que ingrese una letra y luego determina si es una letra mayúscula.
 * Nombre: Diego Ramos Fernández
 * Fecha: 02/10/2025
 */ 
import java.util.Scanner;
public class EJ29Es_Mayuscula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicitar al usuario que ingrese una letra
        System.out.print("Introduce una letra: ");
        char letra = sc.next().charAt(0);
        // Determinar si la letra es mayúscula
        if (letra >= 'A' && letra <= 'Z') {
            System.out.println("La letra " + letra + " es una letra mayúscula.");
        } else {
            System.out.println("La letra " + letra + " no es una letra mayúscula.");
        }
        sc.close();
    }
}