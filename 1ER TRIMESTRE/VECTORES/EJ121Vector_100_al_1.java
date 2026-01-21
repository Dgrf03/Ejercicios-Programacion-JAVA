/************************************************************************       
 * EJ121_Vector_100_al_1.java
 * Este programa declara un vector de 100 elementos y los llena con valores del 100 al 1.
 * Autor: Diego Ramos Fernández
 * Fecha: 31/10/2025
 * Curso: 1º DAM
 ************************************************************************/
public class EJ121Vector_100_al_1 {
    public static void main(String[] args) {
        int[] vector1 = new int[100];
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = 100 - i;
            System.out.println("posición "+ (i+1) + "--> Valor: " + (vector1[i]-1));
        }
    }
}