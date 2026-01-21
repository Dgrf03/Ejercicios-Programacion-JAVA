/*
 * Nombre del programa: EJ25Multiplo_De_5
 * Descripción: Este programa solicita al usuario que ingrese un número y luego determina si es múltiplo de 5.
 * Nombre: Diego Ramos Fernández
 * Fecha: 02/10/2025
 */ 
import java.util.Scanner;
public class EJ25Multiplo_De_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicitar al usuario que ingrese un número
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        // Determinar si el número es múltiplo de 5
        if (num % 5 == 0) {
            System.out.println("El número " + num + " es múltiplo de 5.");
        } else {
            System.out.println("El número " + num + " no es múltiplo de 5.");
        }
        sc.close();
    }
}
