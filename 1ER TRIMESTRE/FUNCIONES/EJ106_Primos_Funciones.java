/************************************************************************       
 * EJ106_Primos_Funciones.java
 * Este programa encuentra y muestra todos los números primos hasta 1,000,000.
 * Autor: Diego Ramos Fernández
 * Fecha: 24/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJ106_Primos_Funciones {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Números primos hasta 1,000,000:");
        for (int i = 1; i <= 1000000; i++) {
            if (esPrimo(i)) {
                System.out.print(i + ", ");
            }
        }
        sc.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}