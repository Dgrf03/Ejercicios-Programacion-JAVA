/*
 * CreaLibrosExcepcion.java
 * Este programa tiene que crear un fichero en forma de libro pidiendo titulo autor y editorial numero de paginas y si quiero escribir otro libro diferente.
 * Autor: Diego Ramos Fernández
 * Fecha: 15/01/2026
 * Curso: 1º DAM
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirLibrosExcepcion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        // IOException: puede ocurrir al abrir o escribir en el fichero.
        // Se captura para evitar que el programa termine de forma brusca.
        try (FileWriter escritor = new FileWriter("libros.txt", true)) {
            do {
                System.out.print("Introduce el título del libro: ");
                String titulo = scanner.nextLine();

                System.out.print("Introduce el autor del libro: ");
                String autor = scanner.nextLine();

                System.out.print("Introduce la editorial del libro: ");
                String editorial = scanner.nextLine();

                int paginas = 0;
                boolean correcto = false;
                do {
                    try {
                        System.out.print("Introduce el número de páginas del libro: ");
                        // NumberFormatException: se lanza si el texto no es un número entero.
                        paginas = Integer.parseInt(scanner.nextLine());
                        correcto = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Error: introduce un número entero para las páginas.");
                    }
                } while (!correcto);

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
            System.out.println("Error al trabajar con el fichero: " + e.getMessage());
        } finally {
            // finally: se ejecuta siempre; aquí se cierran recursos.
            scanner.close();
        }
    }
}
