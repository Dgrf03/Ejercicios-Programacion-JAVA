/************************************************************************       
 * Cliente.java
 * Este programa define la clase cliente.
 * Autor: Diego Ramos Fernández
 * Fecha: 03/11/2025
 * Curso: 1º DAM
 ************************************************************************/
public class Cliente extends Persona {
    private String ns; //Número del socio
    private String ntc; //Número tarjeta crédito

    public Cliente(){
        /*this.nombre = "";     //Esto no funciona por que los hemos puesto como "private" en la clase padre.
        this.DNI = "";
        this.direccion = "";*/
        
        /*  //Opción 1
            setNombre("");
            setDNI("");
            setDireccion("");
            this.ns = "";
            this.ntc = "";
        */

        //Opción 2
        super(); // Llamo al constructor de la clase padre
        this.ns = "";
        this.ntc = "";
    }
    
    public Cliente (String nombre, String DNI, String direccion, String ns, String ntc){
        super(nombre , DNI, direccion); // Llamo al constructor de la clase padre
        this.ns = ns;
        this.ntc = ntc;
    }

    public Cliente (Cliente c){
        super(c);
        this.ns = c.ns;
        this.ntc = c. ntc;
    }
    
    public String getNs() {
        return ns;
    }
    public void setNs(String ns) {
        this.ns = ns;
    }

    public String getNtc() {
        return ntc;
    }
    public void setNtc(String ntc) {
        this.ntc = ntc;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Nº Socio: " + this.ns + "\nNº Tarjete de crédito " + this.ntc + "\nCliente";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() != this.getClass()) return false;
        
        Cliente o = (Cliente) obj;
        return (this.getNombre().equals(o.getNombre()) && this.getDNI().equals(o.getDNI()) && this.getDireccion().equals(o.getDireccion()) && this.ntc.equals(o.ntc) && this.ns.equals(o.ns));
    }

    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNombre("Diego");
        c1.setDNI("20957147F");
        c1.setDireccion("Burriana");
        c1.setNtc("1234 5678 9012 3456");
        c1.setNs("69");

        Cliente c2 = new Cliente("Ruben", "12345678A", "C/ Debajo de un puente 23", "69", "1234 5678 9012 3456");
        System.out.println(c2);

        Cliente c3 = new Cliente(c2);
        System.out.println(c3);

        System.out.println("¿c2 y c3 son iguales? " + c2.equals(c3)); //Si
        System.out.println("¿c1 y c3 son iguales? " + c1.equals(c3)); //Si

        System.out.println("¿c2 y c2 son iguales? " + c2.equals(c2)); //Si
        c3.setDireccion(null);
        System.out.println("¿c2 y c3 son iguales? " + c2.equals(c3)); //Si
        
    }

}
