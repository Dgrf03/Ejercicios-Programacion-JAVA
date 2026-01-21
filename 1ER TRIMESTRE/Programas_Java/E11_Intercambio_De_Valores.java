import java.util.Scanner;

/************************************************************************       
 * E11_Intercambio_De_Valores.java
 * Este programa debe intercambiar el valor de dos variables.Ejemplo: Si X = 1 e Y = 2, al finalizar el programa los valores deben ser X = 2 e Y = 1. 
 * Autor: Diego Ramos Fernández
 * Fecha: 26/09/2025
 * Curso: 1º DAM
 ************************************************************************/
public class E11_Intercambio_De_Valores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declaración de variables
        int x;
        int y;

        System.out.print("Por favor, introduce el valor de x: ");
        x = scanner.nextInt();
        System.out.print("Por favor, introduce el valor de y: ");
        y = scanner.nextInt();

        System.out.println("Antes del intercambio:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Intercambio de valores usando una variable temporal
        int temp = x; // Guardamos el valor de x en una variable temporal
        x = y; // Asignamos el valor de y a x
        y = temp; // Asignamos el valor guardado en temp (valor original de x) a y

        System.out.println("Después del intercambio:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        //Cierro el scanner
        scanner.close();
    }
}
