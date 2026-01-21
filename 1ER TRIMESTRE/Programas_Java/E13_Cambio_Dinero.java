/************************************************************************       
 * E13_Cambio_Dinero.java
 * Este programa debe, dada una cantidad de dinero, dividirlo en billetes de 50, 20, 10, 5 y monedas de 2 y 1€ (no hay céntimos).
 * Autor: Diego Ramos Fernández
 * Fecha: 26/09/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class E13_Cambio_Dinero{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir al usuario que introduzca la cantidad de dinero
        System.out.print("Introduce la cantidad de dinero en euros: ");
        int cantidad = scanner.nextInt();
        int original = cantidad; // Guardamos la cantidad original para mostrarla al final

        int billetes50 = cantidad / 50;
        cantidad %= 50;

        int billetes20 = cantidad / 20;
        cantidad %= 20;

        int billetes10 = cantidad / 10;
        cantidad %= 10;

        int billetes5 = cantidad / 5;
        cantidad %= 5;

        int monedas2 = cantidad / 2;
        cantidad %= 2;

        int monedas1 = cantidad; // Lo que queda son monedas de 1€

        System.out.println("Desglose de " + original + " euros:");
        System.out.println("Billetes de 50€: " + billetes50);
        System.out.println("Billetes de 20€: " + billetes20);
        System.out.println("Billetes de 10€: " + billetes10);
        System.out.println("Billetes de 5€: " + billetes5);
        System.out.println("Monedas de 2€: " + monedas2);
        System.out.println("Monedas de 1€: " + monedas1);
        // Cerrar el scanner  
        scanner.close();    
    }
}