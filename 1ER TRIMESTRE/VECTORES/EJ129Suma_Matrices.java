/************************************************************************       
 * EJ129_Suma_Matrices.java
 * Este programa define dos matrices de 3X3 y las suma.
 * Autor: Diego Ramos Fernández
 * Fecha: 03/11/2025
 * Curso: 1º DAM
 ************************************************************************/
public class EJ129Suma_Matrices {
    public static void main(String[] args) {
        final int FILAS = 3;
        final int COLUMNAS = 3;
        
        // Crear dos matrices y llenarlas con números del 1 al 9
        int[][] matriz1 = CrearMatrizEnteros(FILAS, COLUMNAS);
        int[][] matriz2 = CrearMatrizEnteros(FILAS, COLUMNAS);
        
        int numero = 1;
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matriz1[i][j] = numero;
                matriz2[i][j] = numero;
                numero++;
            }
        }
        
        // Imprimir las dos matrices
        System.out.println("Matriz 1:");
        ImprimirMatriz(matriz1);
        
        System.out.println("\nMatriz 2:");
        ImprimirMatriz(matriz2);
        
        // Sumar las dos matrices
        int[][] matrizSuma = SumarMatrices(matriz1, matriz2);
        
        // Imprimir la matriz resultante
        System.out.println("\nMatriz Suma:");
        ImprimirMatriz(matrizSuma);
    }

    // Crear matriz de enteros vacía
    public static int[][] CrearMatrizEnteros(int filas, int columnas) {
        int[][] nuevaMatriz = new int[filas][columnas];
        return nuevaMatriz;
    }

    // Imprimir matriz
    public static void ImprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    // Sumar dos matrices
    public static int[][] SumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }
}
