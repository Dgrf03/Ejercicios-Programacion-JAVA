/************************************************************************       
 * Consulta.java
 * Programa que define una clase consulta.
 * Autor: Diego Ramos Fernández
 * Fecha: 11/11/2025
 * Curso: 1º DAM
 ************************************************************************/
public class Consulta {
    private Veterinario v;
    private Perro p;
    private String fecha;
    private String hora;
    private double precio;

    //Constructore nulo
    public Consulta(){
        this.v = null;
        this.p = null;
        this.fecha = "01/01/1900";
        this.hora = "00:00";
        this.precio = 100;
    }
    //Constructor por defecto
    public Consulta(Veterinario v, Perro p, String fecha, String hora, double precio){
        this.v = v;
        this.p = p;
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
    }
    //Constructor copia
    public Consulta(Consulta c){
        this.v = c.v;
        this.p = c.p;
        this.fecha = c.fecha;
        this.hora = c.hora;
        this.precio = c.precio;
    }

    //Setters y Getters
    public void setV(Veterinario v) {this.v = v;}
    public Veterinario getV() {return v;}

    public void setP(Perro p) {this.p = p;}
    public Perro getP() {return p;}

    public void setFecha(String fecha) {this.fecha = fecha;}
    public String getFecha() {return fecha;}

    public void setHora(String hora) {this.hora = hora;}
    public String getHora() {return hora;}

    public void setPrecio(double precio) {this.precio = precio;}
    public double getPrecio() {return precio;}

    //ToString
    @Override
    public String toString() {
        return "\n\nConsulta:\n ***********\n" + "\nVeterinario: " + this.v + "\nPerro: " + this.p + "\nFecha: " + this.fecha + "\nHora: " + this.hora + "\nPrecio: " + this.precio;
    }

    //Equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Consulta c = (Consulta) obj;

        return (c.v ==this.v && this.p == c.p && this.fecha == c.fecha && this.hora  == c.hora && this.precio == c.precio);
    }

    public static void main(String[] args) {
        Consulta c1 = new Consulta();
        Perro p = new Perro("Sanxe", "PSOE", 53, "rojo");
        Veterinario v = new Veterinario("Lola Montero", "87654321A", "888555333", 't', 4);
        Consulta c2 = new Consulta(v , p , "01/01/1900", "00:00", 100);
        System.out.println("Consulta 1: " + c1);
        System.out.println("Consulta 2: " + c2);
    }
}
