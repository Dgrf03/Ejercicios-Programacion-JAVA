/************************************************************************       
 * EJ42_Mes.java
 * Programa que dado un número entero indique el mes del año que le corresponde: 1 - enero .. 12 - diciembre. El programa debe utilizar un switch.
 * Autor: Diego Ramos Fernández
 * Fecha: 10/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJ42_Mes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número de mes (1-12): ");
        int mes = scanner.nextInt();
        String nombreMes;

        switch (mes) {
            case 1 -> nombreMes = "Enero";
            case 2 -> nombreMes = "Febrero";
            case 3 -> nombreMes = "Marzo";
            case 4 -> nombreMes = "Abril";
            case 5 -> nombreMes = "Mayo";
            case 6 -> nombreMes = "Junio";
            case 7 -> nombreMes = "Julio";
            case 8 -> nombreMes = "Agosto";
            case 9 -> nombreMes = "Septiembre";
            case 10 -> nombreMes = "Octubre";
            case 11 -> nombreMes = "Noviembre";
            case 12 -> nombreMes = "Diciembre";
            default -> nombreMes = "Mes inválido. Por favor ingrese un número entre 1 y 12.";
        }

        System.out.println("El mes correspondiente es: " + nombreMes);
        scanner.close();
    }
}