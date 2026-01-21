/*
 * Persona.java
 * Este programa define la clase persona.
 * Autor: Diego Ramos Fernández
 * Fecha: 03/11/2025
 * Curso: 1º DAM
*/

public abstract class Persona implements Autenticable {

    private String nombre;
    private String DNI;
    private String direccion;

    public Persona() {
        this.nombre = "";
        this.DNI = "";
        this.direccion = "";
    }

    public Persona(String nombre, String DNI, String direccion) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.direccion = direccion;
    }

    public Persona(Persona p) {
        this.nombre = p.nombre;
        this.DNI = p.DNI;
        this.direccion = p.direccion;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDNI() { return DNI; }
    public void setDNI(String dNI) { DNI = dNI; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    // Método abstracto a implementar en Usuario y Trabajador
    public abstract void consultarLibros(Biblioteca b);

    // Método de la interfaz (se implementa en las subclases)
    @Override
    public abstract boolean autenticar(String mensaje);

    @Override
    public String toString() {
        return "\nPersona:" + "\nNombre: " + nombre + "\nDNI: " + DNI + "\nDirección: " + direccion + "\nPersona";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() != this.getClass()) return false;
        Persona o = (Persona) obj;
        return this.nombre.equals(o.nombre) && this.DNI.equals(o.DNI) && this.direccion.equals(o.direccion);
    }
}
