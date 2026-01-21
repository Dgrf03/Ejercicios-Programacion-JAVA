/*
 * CreaFichero.java
 * Este programa lee desde teclado información sobre el usuario y lo guarda en un fichero en binario, el fichero se llama Ej2_Fichero.bin .
 * Autor: Diego Ramos Fernández
 * Fecha: 13/01/2026
 * Curso: 1º DAM
 */

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ej2_FicheroBinario { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (DataOutputStream dataOut =
                     new DataOutputStream(new FileOutputStream("Ej2_Fichero.bin"))) {

            System.out.print("Introduce una frase: ");
            String frase = scanner.nextLine();
            dataOut.writeUTF(frase);
            System.out.println("Datos guardados en el fichero binario con éxito.");

        } catch (IOException e) {
            System.out.println("Error al crear el fichero binario: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}