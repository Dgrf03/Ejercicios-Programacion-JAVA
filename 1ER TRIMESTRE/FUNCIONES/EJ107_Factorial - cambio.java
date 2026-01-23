/************************************************************************       
 * EJ107_Factorial.java
 * Este programa calcula el factorial de un número entero con funciones. Aqui añado el cambio.
 * Autor: Diego Ramos Fernández
 * Fecha: 24/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJ107_Factorial {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero para calcular su factorial: ");
        int numero = sc.nextInt();
        long resultado = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
        sc.close();
    }

    public static long calcularFactorial(int numero) {
        if (numero < 0) {
            System.out.println("El factorial no AQUI ESTA EL CAMBIO.");
            return -1;
        }
        long factorial = 1;
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}