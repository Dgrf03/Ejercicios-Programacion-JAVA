/************************************************************************       
 * E17_Calculo_IVA.java
 * Este programa calcula el IVA de un precio introducido por teclado.
 * Autor: Diego Ramos Fernández
 * Fecha: 26/09/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;

public class E17_Calculo_IVA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir al usuario que introduzca el precio sin IVA
        System.out.print("Introduce el precio sin IVA: ");
        double precioSinIVA = scanner.nextDouble();
        // Calcular el IVA (21%)
        double iva = precioSinIVA * 0.21;
        // Calcular el precio con IVA
        double precioConIVA = precioSinIVA + iva;
        // Mostrar los resultados
        System.out.printf("El IVA es: %.2f%n", iva);
        System.out.printf("El precio con IVA es: %.2f%n", precioConIVA);
        // Cerrar el scanner
        scanner.close();
    }
}