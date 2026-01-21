/************************************************************************       
 * Libro.java
 * Este programa define la clase libro.
 * Autor: Diego Ramos Fernández
 * Fecha: 03/11/2025
 * Curso: 1º DAM
 ************************************************************************/
public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private int ejemplares;

    // Constructor por defecto
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.isbn = "";
        this.ejemplares = 0;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, String isbn, int ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.ejemplares = ejemplares;
    }

    // Constructor de copia
    public Libro(Libro l) {
        this.titulo = l.titulo;
        this.autor = l.autor;
        this.isbn = l.isbn;
        this.ejemplares = l.ejemplares;
    }

    // Getters y Setters
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getEjemplares() {
        return ejemplares;
    }
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    // ToString
    @Override
    public String toString() {
        return "\nNombre del título: " + this.titulo +
               "\nNombre del autor: " + this.autor +
               "\nISBN: " + this.isbn +
               "\nNº de ejemplares: " + this.ejemplares;
    }

    // Equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() != this.getClass()) return false;

        Libro l = (Libro) obj;
        return this.titulo.equals(l.titulo)
            && this.autor.equals(l.autor)
            && this.isbn.equals(l.isbn)
            && this.ejemplares == l.ejemplares;
    }
}

