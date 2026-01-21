/************************************************************************       
 * Libro.java
 * Este programa define la clase libro.
 * Autor: Diego Ramos Fernández
 * Fecha: 03/11/2025
 * Curso: 1º DAM
 ************************************************************************/
public class Libro extends Persona {
    private String titulo; //Nombre del titulo
    private String autor; //Nombre del autor
    private String isbn; //ISBN
    private int ejemplares; //Número de ejemplares

    public Libro(){
        /*this.nombre = "";     //Esto no funciona por que los hemos puesto como "private" en la clase padre.
        this.DNI = "";
        this.direccion = "";*/
        
          //Opción 1
            this.titulo = "";
            this.autor = "";
            this.isbn = "";
            this.ejemplares = 0;
        
    }
    
    public Libro (String titulo, String autor, String isbn, int ejemplares){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.ejemplares = ejemplares;
    }

    public Libro (Libro l){
        this.titulo = l.titulo;
        this.autor = l.autor;
        this.isbn = l.isbn;
        this.ejemplares = l.ejemplares;
    }

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

    @Override
    public String toString() {
        return  "\n Nombre del Título: " + this.titulo + "\nNombre del autor: " + this.autor + "\nISBN: " + this.isbn + "\nNº de ejemplares: " + this.ejemplares;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;//Comparo con nulo
        if (obj == this) return true;//Comparo si es el propio objeto
        if (obj.getClass() != this.getClass()) return false;//Comparo si son de diferente clase
        //Llegados aqui, se puede afirmar que el objeto pasado por parámetro es de tipo Libro
        Libro l = (Libro) obj;
        return(this.titulo.equals(l.titulo)) && (this.autor.equals(l.autor)) && (this.isbn.equals(l.isbn)) && (this.ejemplares == l.ejemplares);

    }
}