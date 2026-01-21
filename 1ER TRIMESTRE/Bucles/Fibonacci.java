/************************************************************************       
 * Fibonacci.java
 * Programa que calcule la secuencia de 
 * Autor: Diego Ramos Fernández
 * Fecha: 13/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos números de la secuencia Fibonacci deseas generar? ");
        int n = scanner.nextInt();

        int a = 0, b = 1;

       
        if (n < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            System.out.println("\nSecuencia de Fibonacci:");
            for (int i = 0; i < n; i++) {
                 System.out.print(a + ", ");
                int siguiente = a + b;
                a = b;
                b = siguiente;
                
            }
            scanner.close();
        }
    }
}
