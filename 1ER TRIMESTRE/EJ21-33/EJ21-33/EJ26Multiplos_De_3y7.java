/*
 * Nombre del programa: EJ26Multiplos_De_3y7
 * Descripción: Este programa solicita al usuario que ingrese un número y luego determina si es múltiplo de 3 o 7.
 * Nombre: Diego Ramos Fernández
 * Fecha: 02/10/2025
 */ 
import java.util.Scanner;
public class EJ26Multiplos_De_3y7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicitar al usuario que ingrese un número
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        // Determinar si el número es múltiplo de 3 o 7
        if (num % 3 == 0 && num % 7 == 0) {
            System.out.println("El número " + num + " es múltiplo de 3 y 7.");
        } else if (num % 3 == 0) {
            System.out.println("El número " + num + " es múltiplo de 3.");
        } else if (num % 7 == 0) {
            System.out.println("El número " + num + " es múltiplo de 7.");
        } else {
            System.out.println("El número " + num + " no es múltiplo de 3 ni de 7.");
        }
        sc.close();
    }
}
