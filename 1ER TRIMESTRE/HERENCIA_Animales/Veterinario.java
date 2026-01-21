/************************************************************************       
 * Veterinario.java
 * Programa que define una clase veterinario.
 * Autor: Diego Ramos Fernández
 * Fecha: 18/11/2025
 * Curso: 1º DAM
 ************************************************************************/
public class Veterinario {
    private String nombre;
    private String nif;
    private String cuenta; // Cuenta corriente donde se le paga
    private char turno; // 'm' para mañanas y 't' para tardes
    private int despacho;

    public Veterinario(){
        this.nombre = "";
        this.nif = "";
        this.cuenta = "";
        this.turno = 'm';
        this.despacho = 1;
    }

    public Veterinario(String nombre, String nif, String cuenta, char turno, int despacho){
        this.nombre = nombre;
        this.nif = nif;
        this.cuenta = cuenta;
        this.turno = turno;
        this.despacho = despacho;
    }

    public Veterinario(Veterinario v){
        this.nombre = v.nombre;
        this.nif = v.nif;
        this.cuenta = v.cuenta;
        this.turno = v.turno;
        this.despacho = v.despacho;
    }

    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getNombre() {return nombre;}
    
    public void setNif(String nif) {this.nif = nif;}
    public String getNif() {return nif;}

    public void setCuenta(String cuenta) {this.cuenta = cuenta;}
    public String getCuenta() {return cuenta;}

    public void setTurno(char turno){
        if (turno != 'm'|| turno != 't'){
            this.turno = 'm';
        }else{
            this.turno = turno;
        }
    }
    public char getTurno() {return turno;}

    public void setDespacho(int despacho) {this.despacho = despacho;}
    public int getDespacho() {return despacho;}

    @Override
    public String toString(){
        return"\nVeterinario:\n\n\n--------------------\nNombre: \t" + this.nombre + "\nNIF: \t\t" + this.nif +"\nCuenta:\t\t" + this.cuenta + "\nTurno: \t\t" + (this.turno == 'm' ? "Mañana":"Tarde") + "\ndespacho: \t" + this.despacho;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if(this.getClass() !=obj.getClass()) return false;
        Veterinario v = (Veterinario) obj;
        return (this.nif == v.nif);
    }

    public static void main(String[] args){
        Veterinario v1 = new Veterinario();
        System.out.println("v1:"+ v1);
        
        v1.setNombre("Lorena Bogordo");
        v1.setNif("12345678Z");
        v1.setCuenta("1234567890");
        v1.setTurno('t');
        v1.setDespacho(21);

        System.out.println("V1: \n"+ v1);

        Veterinario v2 = new Veterinario ("Lola Montero", "87654321A", "888555333", 't', 4);
        System.out.println("V2: \n"+ v2);
        Veterinario v3 = new Veterinario(v2);
        System.out.println();
        if (v3.equals(v2)) System.out.println("V2 y V3 son iguales");
    }
}
