/************************************************************************       
 * EJ113_Potencia_Iterativa.java
 * Este programa calcula la potencia de un número de forma iterativa.
 * Autor: Diego Ramos Fernández
 * Fecha: 30/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJ112_Potencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        int base = scanner.nextInt();
        System.out.print("Introduce el exponente: ");
        int exponente = scanner.nextInt();
        long resultado = potencia(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es: " + resultado);
        scanner.close();
    }

    public static long potencia(int base, int exponente) {
        long resultado = 1;
        for (int i = 1; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
/************************************************************************       
 * EJ113_Potencia_Recursiva.java
 * Este programa calcula la potencia de un número de forma recursiva.
 * Autor: Diego Ramos Fernández
 * Fecha: 30/10/2025
 * Curso: 1º DAM
 ************************************************************************/
/*
import java.util.Scanner;
public class EJ112_Potencia_Recursiva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        int base = scanner.nextInt();
        System.out.print("Introduce el exponente: ");
        int exponente = scanner.nextInt();
        long resultado = potencia(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es: " + resultado);
        scanner.close();
    }

    public static long potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }
}
*/