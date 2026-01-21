/************************************************************************       
 * EJ126_Dado.java
 * Este programa simula el lanzamiento de un dado 100 veces y que muestre todos los resultados y luego los agrupe y que de la media.
 * Autor: Diego Ramos Fernández
 * Fecha: 03/11/2025
 * Curso: 1º DAM
 ************************************************************************/
public class EJ126_Dado {
    public static void main(String[] args) {
        // Declaramos un array para contar las apariciones de cada cara del dado
        int[] caras = new int[6];
        int totalLanzamientos = 100;
        int sumaResultados = 0;
        // Simulamos el lanzamiento del dado 100 veces
        for (int i = 0; i < totalLanzamientos; i++) {
            int resultado = (int)(Math.random() * 6) + 1; // Genera un número entre 1 y 6
            System.out.println("Lanzamiento " + (i + 1) + ": " + resultado);
            caras[resultado - 1]++; // Incrementa el contador para la cara correspondiente
            sumaResultados += resultado; // Suma el resultado para calcular la media
        }

        // Mostramos los resultados
        System.out.println("Resultados de los lanzamientos del dado:");
        for (int i = 0; i < caras.length; i++) {
            System.out.println("Cara " + (i + 1) + ": " + caras[i] + " veces");
        }

        // Calculamos y mostramos la media
        double media = (double)sumaResultados / totalLanzamientos;
        System.out.printf("La media de los resultados es: %.2f%n", media);
    }
}