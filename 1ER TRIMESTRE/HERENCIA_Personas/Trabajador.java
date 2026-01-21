/************************************************************************       
 * Persona.java
 * Este programa define la clase trabajador.
 * Autor: Diego Ramos Fernández
 * Fecha: 03/11/2025
 * Curso: 1º DAM
 ************************************************************************/
public class Trabajador extends Persona {
    private String nss; //Número de la seguridad social
    private String ncc; //Número cuenta corriente

    public Trabajador(){
        /*this.nombre = "";     //Esto no funciona por que los hemos puesto como "private" en la clase padre.
        this.DNI = "";
        this.direccion = "";*/
        
        /*  //Opción 1
            setNombre("");
            setDNI("");
            setDireccion("");
            this.nss = "";
            this.ncc = "";
        */

        //Opción 2
        super(); // Llamo al constructor de la clase padre
        this.nss = "";
        this.ncc = "";
    }
    
    public Trabajador (String nombre, String DNI, String direccion, String nss, String ncc){
        super(nombre , DNI, direccion); // Llamo al constructor de la clase padre
        this.nss = nss;
        this.ncc = ncc;
    }

    public Trabajador (Trabajador t){
        super(t);
        this.nss = t.nss;
        this.ncc = t. ncc;
    }
    
    public String getNss() {
        return nss;
    }
    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNcc() {
        return ncc;
    }
    public void setNcc(String ncc) {
        this.ncc = ncc;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Nº S.S.: " + this.nss + "\nC/C: " + this.ncc + "\nTrabajador";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() != this.getClass()) return false;
        
        Trabajador o = (Trabajador) obj;
        return (this.getNombre().equals(o.getNombre()) && this.getDNI().equals(o.getDNI()) && this.getDireccion().equals(o.getDireccion()) && this.ncc.equals(o.ncc) && this.nss.equals(o.nss));
    }

    public static void main(String[] args) {
        Trabajador t1 = new Trabajador();
        t1.setNombre("Diego");
        t1.setDNI("20957147F");
        t1.setDireccion("Burriana");
        t1.setNcc("ES00 1234 1234 1234 1234 1234");
        t1.setNss("12345678901234");

        Trabajador t2 = new Trabajador("Ruben", "12345678A", "C/ Debajo de un puente 23", "98765432109876", "ES01 1234 1234 1234 1234 1234");
        System.out.println(t2);

        Trabajador t3 = new Trabajador (t2);
        System.out.println(t3);

        System.out.println("¿t2 y t3 son iguales? " + t2.equals(t3)); //Si
        System.out.println("¿t1 y t3 son iguales? " + t1.equals(t3)); //Si

        System.out.println("¿t2 y t2 son iguales? " + t2.equals(t2)); //Si
        t3.setDireccion(null);
        System.out.println("¿t2 y t3 son iguales? " + t2.equals(t3)); //Si
        
    }

}
