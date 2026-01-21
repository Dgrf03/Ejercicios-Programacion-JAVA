/************************************************************************       
 * Cuenta_Letras.java
 * Programa que imprima un número por teclado y diga si es primo o no.
 * Autor: Diego Ramos Fernández
 * Fecha: 17/10/2025
 * Curso: 1º DAM
 ************************************************************************/
/* 
import java.util.Scanner;
public class Es_Primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        boolean esPrimo = true;

        if (numero < 2) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
        scanner.close();
    }
}
*/
//imprimir los primos del 1 al 1000000.
public class Es_Primo {
    public static void main(String[] args) {

        for (int i = 2; i <= 1000000; i++) { // comenzamos desde 2, el primer primo
            boolean esPrimo = true;

            // comprobamos si i tiene divisores
            for (int j = 2; j * j <= i; j++) { // solo hasta raíz cuadrada
                if (i % j == 0) {
                    esPrimo = false;
                    break; // ya no es primo
                }
            }

            if (esPrimo) {
                System.out.print(i + ", ");
            }
        }
    }
}

 