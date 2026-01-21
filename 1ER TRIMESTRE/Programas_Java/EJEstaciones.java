/************************************************************************       
 * EJEstaciones.java
 * Este programa muestra la estación correspondiente a un mes introducido por teclado.
 * Autor: Diego Ramos Fernández
 * Fecha: 03/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJEstaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 12: ");
        int numero = scanner.nextInt();
        String estacion;
        switch (numero) {
            case 12, 1, 2: estacion = "Invierno"; break;
            case 3, 4, 5: estacion = "Primavera"; break;
            case 6, 7, 8: estacion = "Verano"; break;
            case 9, 10, 11: estacion = "Otoño"; break;
            default: estacion = "Número inválido. Por favor, ingrese un número entre 1 y 12.";
        }
        System.out.println(estacion);
        scanner.close();
    }
}
