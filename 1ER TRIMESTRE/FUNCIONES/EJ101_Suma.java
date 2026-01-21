/************************************************************************       
 * EJ101_Suma.java
 * Programa que realiza la suma de dos números.
 * Autor: Diego Ramos Fernández
 * Fecha: 23/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJ101_Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa el primer número: ");
        int x = scanner.nextInt();
        System.out.print("Por favor, ingresa el segundo número: ");
        int y = scanner.nextInt();
        int resultado = suma(x, y);
        System.out.println("La suma es: " + resultado);
        scanner.close();
    }

    public static int suma(int x, int y){
        return x + y;
    }
    /*
     * public static int suma (int a , int b){
     *     int resultado =  a + b;
     *     return resultado; 
     * }
     */
}
