import java.util.Scanner;

public class VectorBusqueda {
    public static void main(String[] args) {
        int[] vector = new int[100];

        // Llenar el vector con valores aleatorios entre 0 y 1000
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * 1001); // Math.random da entre 0 y 1
        }

        System.out.println("Vector original:");
        imprimirVector(vector);

        // Ordenar el vector (algoritmo burbuja)
        burbuja(vector);
        System.out.println("\nVector ordenado:");
        imprimirVector(vector);

        // Solicitar número al usuario
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIntroduce un valor entre 0 y 1000: ");
        int valor = sc.nextInt();

        // Buscar el valor usando búsqueda binaria
        int posicion = busquedaBinaria(vector, valor);
        if (posicion == -1) {
            System.out.println("El valor NO está en el vector.");
        } else {
            System.out.println("El valor está en la posición: " + posicion);
        }
        sc.close();
    }

    // Algoritmo de burbuja
    public static void burbuja(int[] arr) {
        int n = arr.length;
        boolean intercambio;
        do {
            intercambio = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    intercambio = true;
                }
            }
            n--;
        } while (intercambio);
    }

    // Método para imprimir el vector
    public static void imprimirVector(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if ((i+1) % 20 == 0) System.out.println(); // Para que sea más legible
        }
        System.out.println();
    }

    // Algoritmo de búsqueda binaria
    public static int busquedaBinaria(int[] arr, int valor) {
        int izq = 0;
        int der = arr.length - 1;
        while (izq <= der) {
            int mitad = izq + (der - izq) / 2;
            if (arr[mitad] == valor) {
                return mitad;
            } else if (arr[mitad] < valor) {
                izq = mitad + 1;
            } else {
                der = mitad - 1;
            }
        }
        return -1; // Valor no encontrado
    }
}
