/*
 * Libro.java
 * Este programa define la clase libro.
 * Autor: Diego Ramos Fernández
 * Fecha: 15/01/2026
 * Curso: 1º DAM
*/
public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private int paginas;

    public Libro(String titulo, String autor, String editorial, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getEditorial() { return editorial; }
    public int getPaginas() { return paginas; }

    @Override
    public String toString() {
        return "Título: " + titulo +
               "\nAutor: " + autor +
               "\nEditorial: " + editorial +
               "\nNúmero de páginas: " + paginas +
               "\n------------------------------";
    }
}