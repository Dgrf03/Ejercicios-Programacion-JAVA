/************************************************************************       
 * Usuario.java
 * Este programa define la clase usuario.
 * Autor: Diego Ramos Fernández
 * Fecha: 03/11/2025
 * Curso: 1º DAM
 ************************************************************************/
public class Usuario extends Persona {

    private String apellido;
    private int edad;

    // Constructor por defecto
    public Usuario() {
        super();
        this.apellido = "";
        this.edad = 0;
    }

    // Constructor con parámetros
    public Usuario(String nombre, String DNI, String direccion, String apellido, int edad) {
        super(nombre, DNI, direccion);
        this.apellido = apellido;
        this.edad = edad;
    }

    // Constructor de copia
    public Usuario(Usuario u) {
        super(u.getNombre(), u.getDNI(), u.getDireccion());
        this.apellido = u.apellido;
        this.edad = u.edad;
    }

    // Getters y Setters
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString() + "\nApellido del usuario: " + this.apellido + "\nEdad: " + this.edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;  // compara parte Persona
        Usuario u = (Usuario) obj;
        return this.apellido.equals(u.apellido) && this.edad == u.edad;
    }
}