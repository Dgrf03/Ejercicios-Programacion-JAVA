/************************************************************************       
 * Prestamo.java
 * Este programa define la clase prestamo.
 * Autor: Diego Ramos Fernández
 * Fecha: 05/12/2025
 * Curso: 1º DAM
 ************************************************************************/
public class Prestamo{
    private Libro l;
    private Usuario u;
    private String fecha;
    

    public Prestamo(){
          //Opción 1
            this.l = new Libro();
            this.u = new Usuario();
            this.fecha = "";
        
    }
    
    public Prestamo (Libro l, Usuario u, String fecha) {
        this.l = l;
        this.u = u;
        this.fecha = fecha;
    }

    public Prestamo (Prestamo p){
        this.l = p.l;
        this.u = p.u;
        this.fecha = p.fecha;
    }

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

    //Métodos comunes
    @Override
    public String toString() {
        return  "\n\nPréstamo:\n===========\n" + this.l.toString() + this.u.toString() + "\nFecha: " + this.fecha;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;//Comparo con nulo
        if (obj == this) return true;//Comparo si es el propio objeto
        if (obj.getClass() != this.getClass()) return false;//Comparo si son de diferente clase
        //Llegados aqui, se puede afirmar que el objeto pasado por parámetro es de tipo Libro
        Prestamo p = (Prestamo) obj;
        return(this.l.equals(p.l)) && (this.u.equals(p.u)) && (this.fecha.equals(p.fecha));
    }
    public static void main(String[] args) {
        Libro l = new Libro("El Quijote","Cervantes","123456",3);
        System.out.println(l.toString());
        Usuario u = new Usuario("Diego","Ramos","12345678A",21);
        Prestamo p = new Prestamo(l,u,"05/12/2025");
        System.out.println(p.toString());
    }
}