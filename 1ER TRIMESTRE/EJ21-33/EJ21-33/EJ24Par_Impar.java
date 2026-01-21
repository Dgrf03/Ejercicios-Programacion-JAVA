/*
 * Nombre del programa: EJ24Par_Impar
 * Descripción: Este programa solicita al usuario que ingrese un número y luego determina si es par o impar.
 * Nombre: Diego Ramos Fernández
 * Fecha: 02/10/2025
 */ 
import java.util.Scanner;
public class EJ24Par_Impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicitar al usuario que ingrese un número
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        // Determinar si el número es par o impar
        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par.");
        } else {
            System.out.println("El número " + num + " es impar.");
        }
        
        sc.close();
    }
}