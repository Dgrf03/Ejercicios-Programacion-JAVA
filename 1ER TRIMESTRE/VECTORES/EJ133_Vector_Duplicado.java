/************************************************************************       
 * EJ133_Vector_Duplicado.java
 * Este programa define usando funciones un vector y que identifique los elementos duplicados en el.
 * Autor: Diego Ramos Fernández
 * Fecha: 13/11/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJ133_Vector_Duplicado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño del vector: ");
        int n = scanner.nextInt();
        int[] vector = new int[n];
        mostrarVectorYDuplicados(vector, n);
        mostrarDuplicados(vector, n);
        scanner.close();
    }

    public static void mostrarVectorYDuplicados(int[] vector, int n) {
        // Rellenar el vector con números aleatorios entre 0 y 10
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 11);
        }
        // Mostrar el vector
        System.out.print("Vector: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
        // Función para identificar y mostrar los elementos duplicados
    }

    public static void mostrarDuplicados(int[] vector, int n) {
    System.out.println("Elementos duplicados: ");
    boolean encontradoDuplicado = false;
    for (int i = 0; i < n; i++) {
        // Comprobar si este número ya ha sido mostrado como duplicado antes
        boolean yaMostrado = false;
        for (int k = 0; k < i; k++) {
            if (vector[i] == vector[k]) {
                yaMostrado = true;
                break;
            }
        }
        if (yaMostrado) continue;
        // Buscar si hay algún duplicado del número actual
        for (int j = i + 1; j < n; j++) {
            if (vector[i] == vector[j]) {
                System.out.println("El número " + vector[i] + " está duplicado.");
                encontradoDuplicado = true;
                break;
            }
        }
    }
    if (!encontradoDuplicado) {
        System.out.print("No se encontraron elementos duplicados.");
    }
    System.out.println();
}

}