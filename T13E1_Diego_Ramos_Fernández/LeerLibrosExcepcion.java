/*
 * LeerFichero.java
 * Autor: Diego Ramos Fernández
 * Fecha: 15/01/2026
 * Curso: 1º DAM
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LeerLibrosExcepcion {

    public static void main(String[] args) {
        ArrayList<Libro> listaLibros = new ArrayList<>();
        File fichero = new File("libros.txt");

        // FileNotFoundException: se produce si el fichero no existe o no es accesible.
        try (Scanner sc = new Scanner(fichero)) {

            while (sc.hasNextLine()) {

                if (!sc.hasNextLine()) break;
                String lineaTitulo = sc.nextLine();
                String titulo = lineaTitulo.replace("Título: ", "");

                if (!sc.hasNextLine()) break;
                String lineaAutor = sc.nextLine();
                String autor = lineaAutor.replace("Autor: ", "");

                if (!sc.hasNextLine()) break;
                String lineaEditorial = sc.nextLine();
                String editorial = lineaEditorial.replace("Editorial: ", "");

                if (!sc.hasNextLine()) break;
                String lineaPaginas = sc.nextLine();
                String paginasStr = lineaPaginas.replace("Número de páginas: ", "");

                int paginas;
                try {
                    // NumberFormatException: el valor de páginas en el fichero no es un entero válido.
                    paginas = Integer.parseInt(paginasStr);
                } catch (NumberFormatException e) {
                    System.out.println("Formato de páginas incorrecto para el libro \"" + titulo + "\". Se omite.");
                    if (sc.hasNextLine()) sc.nextLine(); // separador
                    continue;
                }

                if (sc.hasNextLine()) {
                    sc.nextLine(); // separador
                }

                Libro libro = new Libro(titulo, autor, editorial, paginas);
                listaLibros.add(libro);
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el fichero libros.txt. Ejecuta primero el programa de escritura.");
        }

        System.out.println("Libros leídos del fichero:");
        for (Libro libro : listaLibros) {
            System.out.println(libro);
        }
    }
}