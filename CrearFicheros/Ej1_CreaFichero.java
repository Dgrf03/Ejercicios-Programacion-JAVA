/*
 * CreaFichero.java
 * Este programa tiene que crear un fichero en forma de libro pidiendo titulo autor y editorial numero de paginas y si quiero escribir otro libro diferente.
 * Autor: Diego Ramos Fernández
 * Fecha: 09/01/2026
 * Curso: 1º DAM
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej1_CreaFichero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        try (FileWriter escritor = new FileWriter("libros.txt", true)) {
            do {
                System.out.print("Introduce el título del libro: ");
                String titulo = scanner.nextLine();

                System.out.print("Introduce el autor del libro: ");
                String autor = scanner.nextLine();

                System.out.print("Introduce la editorial del libro: ");
                String editorial = scanner.nextLine();

                System.out.print("Introduce el número de páginas del libro: ");
                int paginas = Integer.parseInt(scanner.nextLine());

                escritor.write("Título: " + titulo + "\n");
                escritor.write("Autor: " + autor + "\n");
                escritor.write("Editorial: " + editorial + "\n");
                escritor.write("Número de páginas: " + paginas + "\n");
                escritor.write("------------------------------\n");

                System.out.print("¿Quieres añadir otro libro? (s/n): ");
                continuar = scanner.nextLine();
            } while (continuar.equalsIgnoreCase("s"));

            System.out.println("Fichero creado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}   