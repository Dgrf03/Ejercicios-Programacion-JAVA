

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LeerLibros {

    public static void main(String[] args) {
        ArrayList<Libro> listaLibros = new ArrayList<>();

        File fichero = new File("libros.txt");

        try (Scanner sc = new Scanner(fichero)) {

            while (sc.hasNextLine()) {
                // Línea 1: "Título: xxx"
                if (!sc.hasNextLine()) break;
                String lineaTitulo = sc.nextLine();
                String titulo = lineaTitulo.replace("Título: ", "");

                // Línea 2: "Autor: xxx"
                if (!sc.hasNextLine()) break;
                String lineaAutor = sc.nextLine();
                String autor = lineaAutor.replace("Autor: ", "");

                // Línea 3: "Editorial: xxx"
                if (!sc.hasNextLine()) break;
                String lineaEditorial = sc.nextLine();
                String editorial = lineaEditorial.replace("Editorial: ", "");

                // Línea 4: "Número de páginas: xxx"
                if (!sc.hasNextLine()) break;
                String lineaPaginas = sc.nextLine();
                String paginasStr = lineaPaginas.replace("Número de páginas: ", "");
                int paginas = Integer.parseInt(paginasStr);

                // Línea 5: "------------------------------"
                if (sc.hasNextLine()) {
                    sc.nextLine(); // Consumir la línea de separador
                }

                // Crear el objeto Libro y añadirlo a la lista
                Libro libro = new Libro(titulo, autor, editorial, paginas);
                listaLibros.add(libro);
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el fichero: " + e.getMessage());
        }

        // Mostrar los libros leídos
        System.out.println("Libros leídos del fichero:");
        for (Libro libro : listaLibros) {
            System.out.println(libro);
        }
    }
}
