/************************************************************************       
 * EJ39_Estaciones.java
 * Programa que programa que un número de mes e indique la estación del año que le corresponde. Ej: los meses 3, 4 y 5 deben devolver primavera, 6, 7 y 8 mostrarán verano", etc.  El programa debe utilizar un switch.
 * Autor: Diego Ramos Fernández
 * Fecha: 10/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJ39_Estaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número de mes (1-12): ");
        int mes = scanner.nextInt();
        String estacion;
        switch (mes) {
            case 12, 1, 2 -> estacion = "Invierno";
            case 3, 4, 5 -> estacion = "Primavera";
            case 6, 7, 8 -> estacion = "Verano";
            case 9, 10, 11 -> estacion = "Otoño";
            default -> estacion = "Mes inválido. Por favor ingrese un número entre 1 y 12.";
        }
        System.out.println("La estación correspondiente es: " + estacion);
        scanner.close();    
    }
}