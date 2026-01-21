/************************************************************************       
 * Prestamo.java
 * Este programa define la clase prestamo.
 * Autor: Diego Ramos Fernández
 * Fecha: 05/12/2025
 * Curso: 1º DAM
 ************************************************************************/
public class Prestamo {
    private Libro l;
    private Usuario u;
    private String fecha;

    // Constructor por defecto
    public Prestamo() {
        this.l = new Libro();
        this.u = new Usuario();
        this.fecha = "";
    }

    // Constructor con parámetros
    public Prestamo(Libro l, Usuario u, String fecha) {
        this.l = l;
        this.u = u;
        this.fecha = fecha;
    }

    // Constructor de copia
    public Prestamo(Prestamo p) {
        this.l = p.l;
        this.u = p.u;
        this.fecha = p.fecha;
    }

    // Getters y Setters
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Libro getL() {
        return l;
    }
    public void setL(Libro l) {
        this.l = l;
    }

    public Usuario getU() {
        return u;
    }
    public void setU(Usuario u) {
        this.u = u;
    }

    @Override
    public String toString() {
        return "\n\nPréstamo:\n===========\n" + this.l.toString() + this.u.toString() + "\nFecha: " + this.fecha;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false; 
        if (obj == this) return true; 
        if (obj.getClass() != this.getClass()) return false; 

        Prestamo p = (Prestamo) obj;
        return this.l.equals(p.l) && this.u.equals(p.u) && this.fecha.equals(p.fecha);
    }
}
