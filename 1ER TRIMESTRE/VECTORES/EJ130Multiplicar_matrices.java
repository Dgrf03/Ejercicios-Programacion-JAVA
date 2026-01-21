/************************************************************************       
 * EJ130Multiplicar_matrices.java
 * Este programa define dos matrices de manera aleatoria y las multiplica.
 * Autor: Diego Ramos Fernández
 * Fecha: 03/11/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJ130Multiplicar_matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas para la matriz 1: ");
        int filas1 = scanner.nextInt();
        System.out.print("Ingrese el número de columnas para la matriz 1: ");
        int columnas1 = scanner.nextInt();
        System.out.print("Ingrese el número de filas para la matriz 2: ");
        int filas2 = scanner.nextInt();
        System.out.print("Ingrese el número de columnas para la matriz 2: ");
        int columnas2 = scanner.nextInt();

        // Verifica que las matrices se puedan multiplicar
        if (columnas1 != filas2) {
            System.out.println("Error: El número de columnas de la matriz 1 debe ser igual al número de filas de la matriz 2.");
            scanner.close();
            return;
        }

        // Crear matrices y llenarlas de aleatorios
        int[][] matriz1 = crearMatrizAleatoria(filas1, columnas1);
        int[][] matriz2 = crearMatrizAleatoria(filas2, columnas2);

        // Imprimir matrices
        System.out.println("Matriz 1:");
        imprimirMatriz(matriz1);
        System.out.println("Matriz 2:");
        imprimirMatriz(matriz2);

        // Multiplicar matrices
        int[][] matrizProducto = multiplicarMatrices(matriz1, matriz2);

        // Imprimir resultado
        System.out.println("Matriz Producto:");
        imprimirMatriz(matrizProducto);

        scanner.close();
    }

    // Crea y rellena una matriz con aleatorios entre 1 y 9
    public static int[][] crearMatrizAleatoria(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int)(Math.random() * 9) + 1;
            }
        }
        return matriz;
    }

    // Imprime la matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Multiplica dos matrices
    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz2[0].length;
        int suma;
        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma = 0;
                for (int k = 0; k < matriz1[0].length; k++) {
                    suma += matriz1[i][k] * matriz2[k][j];
                }
                resultado[i][j] = suma;
            }
        }
        return resultado;
    }
}
