/************************************************************************       
 * EJ36_Precio_Hotel.java
 * Programa que calcula el precio de una estancia en un hotel.Programa que calcule el precio de una estancia de hotel.
 * Autor: Diego Ramos Fernández
 * Fecha: 10/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;

public class EJ36_Precio_Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Precios base
        final double PRECIO_AD = 130.0;  // Alojamiento y desayuno
        final double PRECIO_MP = 180.0;  // Media pensión
        final double PRECIO_PC = 230.0;  // Pensión completa

        // Extras
        final double PRECIO_PARKING = 10.0;
        final double PRECIO_VISITA = 35.0;
        final double PRECIO_CATA = 27.0;

        System.out.println("--- RESERVA DE HOTEL ---");

        System.out.print("Introduce número de personas: ");
        int personas = sc.nextInt();

        System.out.print("Introduce número de noches: ");
        int noches = sc.nextInt();

        System.out.println("Tipo de alojamiento:");
        System.out.println("1. AD (Alojamiento y desayuno) - 130€/noche");
        System.out.println("2. MP (Media pensión) - 180€/noche");
        System.out.println("3. PC (Pensión completa) - 230€/noche");
        System.out.print("Selecciona opción: ");
        int tipo = sc.nextInt();

        System.out.print("¿Deseas parking? (s/n): ");
        char opcParking = sc.next().toLowerCase().charAt(0);

        System.out.print("¿Deseas visita al centro histórico? (s/n): ");
        char opcVisita = sc.next().toLowerCase().charAt(0);

        System.out.print("¿Deseas cata de vinos? (s/n): ");
        char opcCata = sc.next().toLowerCase().charAt(0);

        // Cálculo de habitaciones necesarias
        int habitaciones = personas / 2;
        int resto = personas % 2;
        if (resto == 1) {
            habitaciones++; // si hay persona suelta, necesita habitación individual
        }

        // Precio base por noche según tipo
        double precioNoche = 0;
        if (tipo == 1) {
            precioNoche = PRECIO_AD;
        } else if (tipo == 2) {
            precioNoche = PRECIO_MP;
        } else if (tipo == 3) {
            precioNoche = PRECIO_PC;
        } else {
            System.out.println("Opción no válida. Se aplicará AD por defecto.");
            precioNoche = PRECIO_AD;
        }

        // Calcular importe habitaciones
        double totalHabitaciones;
        if (resto == 1) {
            // Una habitación individual con 35% de descuento
            totalHabitaciones = (habitaciones - 1) * precioNoche * noches
                    + (precioNoche * noches * 0.65);
        } else {
            totalHabitaciones = habitaciones * precioNoche * noches;
        }

        // Calcular extras
        double totalParking = 0;
        if (opcParking == 's') {
            totalParking = PRECIO_PARKING * noches;
        }

        double totalVisita = 0;
        if (opcVisita == 's') {
            totalVisita = PRECIO_VISITA * personas;
        }

        double totalCata = 0;
        if (opcCata == 's') {
            totalCata = PRECIO_CATA * personas;
        }

        // Total general
        double totalGeneral = totalHabitaciones + totalParking + totalVisita + totalCata;

        // Mostrar resumen
        System.out.println("\n--- RESUMEN DE LA RESERVA ---");
        System.out.println("Personas: " + personas);
        System.out.println("Noches: " + noches);
        System.out.println("Habitaciones necesarias: " + habitaciones);
        if (resto == 1)
            System.out.println("(1 habitación individual con 35% de descuento)");
        System.out.printf("Importe habitaciones: %.2f $\n", totalHabitaciones);
        if (opcParking == 's')
            System.out.printf("Parking: %.2f $\n", totalParking);
        if (opcVisita == 's')
            System.out.printf("Visita centro histórico: %.2f $\n", totalVisita);
        if (opcCata == 's')
            System.out.printf("Cata de vinos: %.2f $\n", totalCata);
        System.out.println("---------------------------------");
        System.out.printf("TOTAL A PAGAR: %.2f $\n", totalGeneral);

        sc.close();
    }
}
