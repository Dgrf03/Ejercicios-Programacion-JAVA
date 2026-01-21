/************************************************************************       
 * EJ102_Suma3.java
 * Programa que sume tres números utilizando una función.
 * Autor: Diego Ramos Fernández
 * Fecha: 23/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJ102_Suma3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa el primer número: ");
        int x = scanner.nextInt();
        System.out.print("Por favor, ingresa el segundo número: ");
        int y = scanner.nextInt();
        System.out.print("Por favor, ingresa el tercer número: ");
        int z = scanner.nextInt();
        int resultado = suma(x, y, z);
        System.out.println("La suma es: " + resultado);
        scanner.close();
    }

    public static int suma(int x, int y, int z) {
        return x + y + z;
    }
}
