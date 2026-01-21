/************************************************************************       
 * EJ110_Texto_Invertido.java
 * Este programa invierte el texto de una frase usando funciones.
 * Autor: Diego Ramos Fernández
 * Fecha: 27/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJ110_Texto_Invertido {

    // Función para invertir el texto de una frase
    public static String invertirTexto(String frase) {
        String textoInvertido = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            textoInvertido += frase.charAt(i);
        }
        return textoInvertido;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();
    
        String resultado = invertirTexto(frase);
        System.out.println("Texto invertido: " + resultado);
        scanner.close();
    }
}