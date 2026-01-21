/************************************************************************       
 * EJ123_Vector_RandomNum_1y1000.java
 * Este programa declara un vector de 1000 elementos y los llena con números aleatorios del 1 al 1000 y poner cual es el mayor y el menor de los valores random creados.
 * Autor: Diego Ramos Fernández
 * Fecha: 31/10/2025
 * Curso: 1º DAM
 ************************************************************************/
public class EJ123Vector_RandomNum_1y1000 {
    public static void main(String[] args) {
        int[] vector1 = new int[1000];
        
        // Llenamos el array con números aleatorios
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (int)(Math.random() * 1001);
            System.out.println("posición "+ (i+1) + "--> Valor: " + vector1[i]);
        }
        
        // Inicializamos las variables
        int mayor = vector1[0];
        int menor = vector1[0];
        int posicionMayor = 0;
        int posicionMenor = 0;
        
        // Buscamos el mayor, el menor y sus posiciones
        for (int i = 1; i < vector1.length; i++) {
            if (vector1[i] > mayor) {
                mayor = vector1[i];
                posicionMayor = i;
            }
            if (vector1[i] < menor) {
                menor = vector1[i];
                posicionMenor = i;
            }
        }
        //Hacer la media de todos los numeros del array
        int suma = 0;
        for (int i = 0; i < vector1.length; i++) {
            suma += vector1[i];
        }
        double media = (double)suma / vector1.length;
        System.out.println("La media de los números es: " + media);
        // Mostramos los resultados
        System.out.println("El valor mayor es: " + mayor + " en la posición " + (posicionMayor + 1));
        System.out.println("El valor menor es: " + menor + " en la posición " + (posicionMenor + 1));
    }
}
