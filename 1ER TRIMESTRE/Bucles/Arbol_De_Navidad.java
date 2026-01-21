/************************************************************************       
 * Arbol_De_Navidad.java
 * Programa que imprime un árbol de Navidad con asteriscos.
 * Autor: Diego Ramos Fernández
 * Fecha: 21/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class Arbol_De_Navidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de niveles del árbol: ");
        int niveles = scanner.nextInt();

        for (int i = 1; i <= niveles; i++) {
            // Imprimir espacios en blanco
            for (int j = 1; j <= niveles - i; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
            //imprimir el tronco del árbol
            for (int j = 1; j <= niveles - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        scanner.close();
    }
}



