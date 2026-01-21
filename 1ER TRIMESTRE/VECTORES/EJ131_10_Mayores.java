/************************************************************************       
 * EJ131_10_Mayores.java
 * Este programa define un vector de 1000 posiciones, que inicie en 0 hasta el 100, y que luego saque los 10 numeros mayores oredenados.
 * Autor: Diego Ramos Fernández
 * Fecha: 13/11/2025
 * Curso: 1º DAM
 ************************************************************************/
public class EJ131_10_Mayores {
    public static void main(String[] args) {
        int[] vector = new int[1000];
        int[] mayores = new int[10];
        // Inicializamos el array de mayores con -1
        for (int i = 0; i < mayores.length; i++) {
            mayores[i] = -1;
        }

        // Rellenar el vector con números aleatorios entre 0 y 100
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 101);
        }

        // Buscar los 10 mayores sin ordenar
        for (int i = 0; i < vector.length; i++) {
            int num = vector[i];
            // Comprobamos si es mayor que el menor de los 10 guardados
            for (int j = 0; j < mayores.length; j++) {
                if (num > mayores[j]) {
                    // Desplazar hacia abajo para insertar el nuevo número
                    for (int k = mayores.length - 1; k > j; k--) {
                        mayores[k] = mayores[k-1];
                    }
                    mayores[j] = num;
                    break;
                }
            }
        }

        // Mostrar los 10 números mayores
        System.out.println("Los 10 números mayores son:");
        for (int i = 0; i < mayores.length; i++) {
            System.out.println(mayores[i]);
        }
    }
}
/*
import java.util.Arrays;

public class EJ131_10_Mayores {
    public static void main(String[] args) {
        int[] vector = new int[1000];

        // Rellenar el vector con números aleatorios entre 0 y 100
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 101);
        }

        // Ordenar el vector de menor a mayor
        Arrays.sort(vector);

        // Mostrar los 10 números mayores de mayor a menor
        System.out.println("Los 10 números mayores son:");
        for (int i = vector.length - 1; i >= vector.length - 10; i--) {
            System.out.println(vector[i]);
        }
    }
}
*/
