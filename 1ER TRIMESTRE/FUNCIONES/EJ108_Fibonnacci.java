/************************************************************************       
 * EJ108_Fibonnacci.java
 * Este programa calcula la serie de Fibonacci hasta un número entero dado usando funciones.
 * Autor: Diego Ramos Fernández
 * Fecha: 24/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJ108_Fibonnacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero para calcular la serie de Fibonacci: ");
        int numero = sc.nextInt();
        System.out.println("La serie de Fibonacci hasta " + numero + " es: ");
        for (int i = 0; i < numero; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
        sc.close();
    }

    public static long calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }
}
