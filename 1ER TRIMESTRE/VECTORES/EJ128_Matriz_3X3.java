/************************************************************************       
 * EJ128_Matriz_3X3.java
 * Este programa define una matriz de 3x3 y pone numeros del 1 al 9 dentro de ella.
 * Autor: Diego Ramos Fernández
 * Fecha: 03/11/2025
 * Curso: 1º DAM
 ************************************************************************/
public class EJ128_Matriz_3X3 {
    public static void main(String[] args) {
        final int FILAS = 3;
        final int COLUMNAS = 3;
        
        // Crear matriz vacía
        int[][] matriz = CrearMatrizEnteros(FILAS, COLUMNAS);
        
        // Imprimir matriz vacía
        System.out.println("Matriz vacía:");
        ImprimirMatriz(matriz);
        
        // Llenar la matriz con números del 1 al 9
        int numero = 1;
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matriz[i][j] = numero;
                numero++;
            }
        }
        
        // Imprimir matriz llena
        System.out.println("\nMatriz llena:");
        ImprimirMatriz(matriz);
        
        // Sumar 2 a cada elemento
        SumarDos(matriz);
        
        // Imprimir matriz después de sumar 2
        System.out.println("\nMatriz después de sumar 2:");
        ImprimirMatriz(matriz);
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
    
    // Sumar 2 a cada elemento
    public static void SumarDos(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] += 2;
            }
        }
    }
}
