/*
 * Nombre del programa: EJ27_Numero_Igual_A_Otros
 * Descripción: Este programa solicita al usuario que ingrese un número y luego determina si es igual a otro(s) número(s).
 * Nombre: Diego Ramos Fernández
 * Fecha: 02/10/2025
 */ 
import java.util.Scanner;
 public class EJ27_Numero_Igual_A_Otros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicitar al usuario que ingrese un número
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        // Determinar si el número es igual a 10, 20 o 30
        if (num == 10) {
            System.out.println("El número " + num + " es igual a 10.");
        } 
        if (num == 20) {
            System.out.println("El número " + num + " es igual a 20.");
        } 
        if (num == 30) {
            System.out.println("El número " + num + " es igual a 30.");
        } 
        if (num != 10 && num != 20 && num != 30) {
            System.out.println("El número " + num + " no es igual a 10, 20 ni 30.");
        }
        sc.close();
    }
    
}
