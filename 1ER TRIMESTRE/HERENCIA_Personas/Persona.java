/************************************************************************       
 * Persona.java
 * Este programa define la clase persona.
 * Autor: Diego Ramos Fernández
 * Fecha: 03/11/2025
 * Curso: 1º DAM
 ************************************************************************/
public class Persona {
    private String nombre; //Al estar "private" no se puede pasar a las clases hijas
    private String DNI;
    private String direccion;

    //Constructor por defecto.
    public Persona(){
        this.nombre = "";
        this.DNI = "";
        this.direccion = "";
    }

    //Constructor con parámetros.
    public Persona (String nombre, String DNI, String direccion){
        this.nombre = nombre;
        this.DNI = DNI;
        this.direccion = direccion;
    }
    
    //Constructor de copia.
    public Persona (Persona p){
        this.nombre = p.nombre;
        this.DNI = p.DNI;
        this.direccion = p.direccion;
    }

    //Getters y Setters.
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //To String
    @Override
    public String toString() {
        return "\nPersona:\nNombre: " + nombre + "\nDNI: " + DNI + "\nDirección; " + direccion + "\nPersona";
    }

    //Equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() != this.getClass()) return false;
        
        Persona o = (Persona) obj;
        return (this.nombre.equals(o.nombre) && this.DNI.equals(o.DNI) && this.direccion.equals(o.direccion));
    }

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("Diego Ramos Fernández");
        p1.setDNI("20957147F");
        p1.setDireccion("Burriana");
        System.out.println(p1);

        Persona p2 = new Persona("Pedro sanxe", "12345678R", "Madrid");
        System.out.println(p2);

        Persona p3 = new Persona(p2);

        System.out.println("¿p2 y p3 son iguales?" + p2.equals(p3));//SI
        System.out.println("¿p1 y p3 son iguales?" + p1.equals(p3));//NO

    }
}
