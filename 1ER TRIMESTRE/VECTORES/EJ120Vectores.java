/************************************************************************       
 * EJ120_Vectores.java
 * Este programa declara un vector de 10 elementos, muestra sus valores iniciales,
 * Autor: Diego Ramos Fernández
 * Fecha: 31/10/2025
 * Curso: 1º DAM
 ************************************************************************/
public class EJ120Vectores {
    public static void main(String[] args) {
        int[] vector1 = new int[10];
    

        for (int i = 0; i < vector1.length; i++) {
            System.out.println("posición "+ (i+1) + "- Valor: " + vector1[i]);
        }
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = i+1;
            System.out.println("posición "+ (i+1) + "- Valor: " + vector1[i]);
        }
    }
}
