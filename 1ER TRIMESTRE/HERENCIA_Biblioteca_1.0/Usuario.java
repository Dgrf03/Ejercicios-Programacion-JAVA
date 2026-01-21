/************************************************************************       
 * Usuario.java
 * Este programa define la clase usuario.
 * Autor: Diego Ramos Fernández
 * Fecha: 03/11/2025
 * Curso: 1º DAM
 ************************************************************************/
public class Usuario{
    private String nombre; //Nombre del titulo
    private String apellido; //Nombre del autor
    private String dni; //ISBN
    private int edad; //Número de ejemplares

    public Usuario(){
        /*this.nombre = "";     //Esto no funciona por que los hemos puesto como "private" en la clase padre.
        this.DNI = "";
        this.direccion = "";*/
        
          //Opción 1
            this.nombre = "";
            this.apellido = "";
            this.dni = "";
            this.edad = 0;
        
    }
    
    public Usuario (String nombre, String apellido, String dni, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public Usuario (Usuario u){
        this.nombre = u.nombre;
        this.apellido = u.apellido;
        this.dni = u.dni;
        this.edad = u.edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return  "\n Nombre del usuario: " + this.nombre + "\nApellido del usuario: " + this.apellido + "\nDNI: " + this.dni + "\nEdad: " + this.edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;//Comparo con nulo
        if (obj == this) return true;//Comparo si es el propio objeto
        if (obj.getClass() != this.getClass()) return false;//Comparo si son de diferente clase
        //Llegados aqui, se puede afirmar que el objeto pasado por parámetro es de tipo Libro
        Usuario u = (Usuario) obj;
        return(this.nombre.equals(u.nombre)) && (this.apellido.equals(u.apellido)) && (this.dni.equals(u.dni)) && (this.edad == u.edad);
    }
    public static void main(String[] args) {
    }
}