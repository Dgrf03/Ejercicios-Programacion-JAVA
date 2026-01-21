/************************************************************************       
 * EJ122_Vector_Abecedario.java
 * Este programa declara un vector de chars y los llena con letras de la 'A' a la 'Z'.
 * Autor: Diego Ramos Fernández
 * Fecha: 31/10/2025
 * Curso: 1º DAM
 ************************************************************************/
public class EJ122Vector_Abecedario {
    public static void main(String[] args) {
        char[] vector1 = new char[26];
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (char)('A' + i);
            System.out.println("posición "+ (i+1) + "--> Valor: " + vector1[i]);
        }
    }
}
