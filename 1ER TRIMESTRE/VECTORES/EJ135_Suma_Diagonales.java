/************************************************************************       
 * EJ134_Matriz_3x365.java
 * Este programa define usando funciones una matriz cuadrada y que calcule la suma de sus 2 diagonales.
 * Autor: Diego Ramos Fernández
 * Fecha: 13/11/2025
 * Curso: 1º DAM
 ************************************************************************/
public class EJ135_Suma_Diagonales {
    public static void main(String[] args) {
        final int DIMENSION = 3;

        int[][] matriz = new int[DIMENSION][DIMENSION];
        inicializarMatriz(matriz);
        mostrarMatriz(matriz);
        int sumaDiagonales = sumaDiagonales(matriz);
        System.out.println("La suma de las diagonales es: " + sumaDiagonales);
    }

    public static void inicializarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10); // Valores entre 0 y 9
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sumaDiagonales(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i]; // Diagonal principal
            suma += matriz[i][matriz.length - 1 - i]; // Diagonal secundaria
        }
        return suma;
    }
}
