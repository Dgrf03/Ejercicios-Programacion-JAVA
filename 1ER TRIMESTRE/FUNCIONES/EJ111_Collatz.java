/************************************************************************       
 * EJ111_Collatz_Recursivo.java
 * Este programa implementa la conjetura de Collatz usando funciones y método recursivo.
 * Autor: Diego Ramos Fernández
 * Fecha: 27/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJ111_Collatz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();
        System.out.println("La secuencia de Collatz para " + numero + " es:");
        collatz(numero);
        scanner.close();
    }
    

    public static void collatz(int n) {
        if (n == 1) {
            System.out.print(n);
        } else {
            System.out.print(n + ", ");
            if (n % 2 == 0) {
                collatz(n / 2);
            } else {
                collatz(3 * n + 1);
            }
        }
    }
}
/*
 * /************************************************************************       
 * EJ112_Collatz_Iterativo.java
 * Este programa implementa la conjetura de Collatz usando funciones y método iterativo.
 * Autor: Diego Ramos Fernández
 * Fecha: 27/10/2025
 * Curso: 1º DAM
 ************************************************************************/
/*
import java.util.Scanner;
public class EJ112_Collatz_Iterativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();
        System.out.println("La secuencia de Collatz para " + numero + " es:");
        collatz(numero);
        scanner.close();
    }
    

    public static void collatz(int n) {
        while (n != 1) {
            System.out.print(n + ", ");
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        System.out.print(n); // Imprime el último número (1)
    }
}
 */