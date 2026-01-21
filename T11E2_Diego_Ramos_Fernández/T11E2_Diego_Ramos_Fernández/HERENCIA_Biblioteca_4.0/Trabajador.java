/************************************************************************
 * Trabajador.java
 * Este programa define la clase trabajador.
 * Autor: Diego Ramos Fernández
 * Fecha: 03/11/2025
 * Curso: 1º DAM
 ************************************************************************/

public class Trabajador extends Persona {

    private String nss;
    private String ncc;

    public Trabajador() {
        super();
        this.nss = "";
        this.ncc = "";
    }

    public Trabajador(String nombre, String DNI, String direccion,
                      String nss, String ncc) {
        super(nombre, DNI, direccion);
        this.nss = nss;
        this.ncc = ncc;
    }

    public Trabajador(Trabajador t) {
        super(t);
        this.nss = t.nss;
        this.ncc = t.ncc;
    }

    public String getNss() { return nss; }
    public void setNss(String nss) { this.nss = nss; }

    public String getNcc() { return ncc; }
    public void setNcc(String ncc) { this.ncc = ncc; }

    @Override
    public String toString() {
        return super.toString() + "\nNº S.S.: " + this.nss + "\nC/C: " + this.ncc + "\nTrabajador";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() != this.getClass()) return false;
        Trabajador o = (Trabajador) obj;
        return this.getNombre().equals(o.getNombre()) && this.getDNI().equals(o.getDNI()) && this.getDireccion().equals(o.getDireccion()) && this.ncc.equals(o.ncc) && this.nss.equals(o.nss);
    }

    // Muestra los libros prestados a usuarios por este trabajador
    @Override
    public void consultarLibros(Biblioteca b) {
        System.out.println("\nLibros prestados por el trabajador " + getNombre() + ":");
        for (Prestamo p : b.getPrestamosDeTrabajador(this)) {
            System.out.println(p.getL());
        }
    }

    // Implementación de la interfaz Autenticable
    @Override
    public boolean autenticar(String mensaje) {
        System.out.println("Mensaje para el trabajador: " + mensaje);
        return true;
    }
}
