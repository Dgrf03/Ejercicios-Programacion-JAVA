public class Burbuja {
    public static void main(String[] args) {
        int[] vector = new int[101];
        // Rellenar el vector con valores del -50 al 50
        for (int i = 0; i < vector.length; i++) {
            vector[i] = -50 + i;
        }

        System.out.println("Vector sin ordenar:");
        imprimirVector(vector);
        
        // Ordenamos el vector usando el método burbuja
        burbuja(vector);

        System.out.println("\nVector ordenado:");
        imprimirVector(vector);
    }

    // Método para ordenar el vector usando burbuja
    public static void burbuja(int[] vector) {
        int n = vector.length;
        boolean intercambiado;
        do {
            intercambiado = false;
            for (int i = 0; i < n - 1; i++) {
                if (vector[i] > vector[i + 1]) {
                    int aux = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = aux;
                    intercambiado = true;
                }
            }
            n--;
        } while (intercambiado);
    }

    // Método para mostrar el vector en pantalla
    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}
