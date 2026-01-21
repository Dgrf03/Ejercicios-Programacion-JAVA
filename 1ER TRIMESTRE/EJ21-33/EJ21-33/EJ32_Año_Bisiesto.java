/*
 * Nombre del programa: EJ32_Año_Bisiesto
 * Descripción: Este programa solicita al usuario que ingrese un año y luego determina si es un año bisiesto.
 * Nombre: Diego Ramos Fernández
 * Fecha: 02/10/2025
 */ 
import java.util.Scanner;

public class EJ32_Año_Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un año: ");
        int año = sc.nextInt();

        // Proposiciones lógicas
        boolean p = (año % 4 == 0);    // divisible por 4
        boolean q = (año % 100 == 0);  // divisible por 100
        boolean r = (año % 400 == 0);  // divisible por 400

        // Fórmula lógica: (p ∧ ¬q) ∨ r
        boolean esBisiesto = (p && !q) || r;

        if (esBisiesto) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " NO es un año bisiesto.");
        }

        sc.close();
    }
}

