import java.util.Scanner;

/************************************************************************       
 * E12_Conversion_Kilometros_Millas.java
 * Este programa debe convertir una cantidad de km en sus millas equivalentes. 1 km = 0,621371 millas
 * Autor: Diego Ramos Fernández
 * Fecha: 26/09/2025
 * Curso: 1º DAM
 ************************************************************************/
public class E12_Conversion_Kilometros_Millas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir al usuario que introduzca la cantidad de kilómetros
        System.out.print("Introduce la cantidad de kilómetros: ");
        double km = scanner.nextDouble();
        double millas = km * 0.621371;
        System.out.println(km + " kilómetros son equivalentes a " + millas + " millas.");
        // Cerrar el scanner
        scanner.close();
    }
}