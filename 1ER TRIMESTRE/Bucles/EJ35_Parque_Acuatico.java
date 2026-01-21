/************************************************************************       
 * EJ35_Parque_Acuatico.java
 * Programa que simula un parque acuático. Programa que calcule el precio de las entradas para un parque acuático.
 * Autor: Diego Ramos Fernández
 * Fecha: 10/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;

public class EJ35_Parque_Acuatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Precios base
        final double PRECIO_ADULTO_MEDIO = 25.0;
        final double PRECIO_ADULTO_COMPLETO = 40.0;
        final double PRECIO_NINO_MEDIO = 17.5;
        final double PRECIO_NINO_COMPLETO = 28.0;
        final double PRECIO_TUMBONA = 3.0;
        final double PRECIO_CONSIGNA = 1.0;

        System.out.println("--- RESERVA PARQUE ACUÁTICO ---");

        System.out.print("Introduce número de adultos: ");
        int adultos = sc.nextInt();

        System.out.print("Introduce número de niños: ");
        int ninos = sc.nextInt();

        System.out.println("Tipo de entrada:");
        System.out.println("1. Medio día");
        System.out.println("2. Día completo");
        System.out.print("Selecciona opción: ");
        int tipoEntrada = sc.nextInt();

        System.out.print("¿Cuántas tumbonas deseas? ");
        int tumbonas = sc.nextInt();

        System.out.print("¿Cuántas consignas deseas? ");
        int consignas = sc.nextInt();

        // Cálculo del importe según tipo de entrada
        double totalAdultos = 0, totalNinos = 0;

        if (tipoEntrada == 1) {
            totalAdultos = adultos * PRECIO_ADULTO_MEDIO;
            totalNinos = ninos * PRECIO_NINO_MEDIO;
        } else if (tipoEntrada == 2) {
            totalAdultos = adultos * PRECIO_ADULTO_COMPLETO;
            totalNinos = ninos * PRECIO_NINO_COMPLETO;
        } else {
            System.out.println("Opción no válida. Se aplicará medio día por defecto.");
            totalAdultos = adultos * PRECIO_ADULTO_MEDIO;
            totalNinos = ninos * PRECIO_NINO_MEDIO;
        }

        // Cálculo de extras
        double totalExtras = (tumbonas * PRECIO_TUMBONA) + (consignas * PRECIO_CONSIGNA);

        // Total general
        double total = totalAdultos + totalNinos + totalExtras;

        // Mostrar resumen
        System.out.println("\n--- RESUMEN DE LA RESERVA ---");
        System.out.println("Adultos: " + adultos + " -> " + totalAdultos + " €");
        System.out.println("Niños: " + ninos + " -> " + totalNinos + " €");
        System.out.println("Tumbonas: " + tumbonas + " -> " + (tumbonas * PRECIO_TUMBONA) + " €");
        System.out.println("Consignas: " + consignas + " -> " + (consignas * PRECIO_CONSIGNA) + " €");
        System.out.println("---------------------------------");
        System.out.println("TOTAL A PAGAR: " + total + " €");

        sc.close();
    }
}
