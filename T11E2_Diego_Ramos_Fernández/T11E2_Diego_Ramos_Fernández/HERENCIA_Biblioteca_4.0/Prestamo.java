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
    private Trabajador t; // trabajador que realiza el préstamo
    private String fecha;

    public Prestamo() {
        this.l = new Libro();
        this.u = new Usuario();
        this.t = null;
        this.fecha = "";
    }

    public Prestamo(Libro l, Usuario u, Trabajador t, String fecha) {
        this.l = l;
        this.u = u;
        this.t = t;
        this.fecha = fecha;
    }

    public Prestamo(Prestamo p) {
        this.l = p.l;
        this.u = p.u;
        this.t = p.t;
        this.fecha = p.fecha;
    }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public Libro getL() { return l; }
    public void setL(Libro l) { this.l = l; }

    public Usuario getU() { return u; }
    public void setU(Usuario u) { this.u = u; }

    public Trabajador getT() { return t; }
    public void setT(Trabajador t) { this.t = t; }

    @Override
    public String toString() {
        return "\n\nPréstamo:\n===========\n" + this.l.toString() + this.u.toString() + (t != null ? t.toString() : "\nSin trabajador asignado") + "\nFecha: " + this.fecha;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() != this.getClass()) return false;
        Prestamo p = (Prestamo) obj;
        boolean mismoTrabajador = (this.t == null && p.t == null) || (this.t != null && this.t.equals(p.t));
        return this.l.equals(p.l) && this.u.equals(p.u) && mismoTrabajador && this.fecha.equals(p.fecha);
    }
}
