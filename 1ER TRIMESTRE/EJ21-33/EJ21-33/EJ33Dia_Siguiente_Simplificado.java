/*
 * Nombre del programa: EJ33Dia_Siguiente_Simplificado.java
 * Descripción: Este programa Dado el día, mes y año, de una fecha correcta, mostrar la fecha del día siguiente. Suponer que todos los meses tienen 30 días. No se pueden utilizar datos de tipo fecha ni funciones de la API, hay que hacer la lógica a mano.
 * Nombre: Diego Ramos Fernández
 * Fecha: 02/10/2025
 */ 
import java.util.Scanner;
public class EJ33Dia_Siguiente_Simplificado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el día, mes y año
        System.out.print("Ingrese el día (1-30): ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();

        // Validar la fecha ingresada
        if (dia < 1 || dia > 30 || mes < 1 || mes > 12) {
            System.out.println("Fecha incorrecta. Asegúrese de que el día esté entre 1 y 30 y el mes entre 1 y 12.");
        } else {
            // Calcular la fecha del día siguiente
            dia++;
            if (dia > 30) {
                dia = 1;
                mes++;
                if (mes > 12) {
                    mes = 1;
                    año++;
                }
            }
            // Mostrar la fecha del día siguiente
            System.out.printf("La fecha del día siguiente es: %02d/%02d/%d%n", dia, mes, año);
        }
        scanner.close();
    }
}