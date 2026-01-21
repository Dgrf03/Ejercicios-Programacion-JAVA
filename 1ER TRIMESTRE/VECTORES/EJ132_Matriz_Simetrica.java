/************************************************************************       
 * EJ132_Matriz_Simetrica.java
 * Este programa define usando funciones una matriz cuadrada simétrica de un numero dado de números entre el 1 y el 9.
 * Autor: Diego Ramos Fernández
 * Fecha: 13/11/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJ132_Matriz_Simetrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño de la matriz cuadrada: ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        rellenarMatrizSimetrica(matriz, n);
        mostrarMatriz(matriz, n);
        sc.close();
    }

    public static void rellenarMatrizSimetrica(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int valor = (int) (Math.random() * 9) + 1;// Números entre 1 y 9
                matriz[i][j] = valor;
                matriz[j][i] = valor; // Simetría
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz, int n) {
        System.out.println("Matriz simétrica:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}