/************************************************************************       
 * Agenda.java
 * Programa que define una clase agenda.
 * Autor: Diego Ramos Fernández
 * Fecha: 11/11/2025
 * Curso: 1º DAM
 ************************************************************************/
public class Agenda {
    private Consulta[] lista;
    private String fecha;

    //Constructor por defecto
    public Agenda(){
        //lista = null;
        lista = new Consulta[0];
        fecha ="01/01/2025";
    }
    // COnstructor con parámetors
    public Agenda(Consulta[] a, String f){
        this.lista = a;
        this.fecha = f;
    }
    //Constructor copia
    public Agenda(Agenda a){
        this.lista = a.lista;
        this.fecha = a.fecha;
    }
    //Setters y Getters
    public void setLista(Consulta[] lista) {this.lista = lista;}
    public Consulta[] getLista() {return lista;}

    public void setFecha(String fecha) {this.fecha = fecha;}
    public String getFecha() {return fecha;}

    //ToString
    @Override
    public String toString() {
        String salida = "";
        salida += "\n\nAgenda del dia "+ this.fecha + "\n";
        for (int i = 0; i < this.lista.length; i++){
            if (this.lista[i] != null);
                //salida += i + "" + this.lista[i].toString();    // ERROR EN ESTA LINEA
                salida += "\n"+ i + "" + this.lista[i];
        }
        return salida;
    }
    //Equals

    public static void main(String[] args) {
        // Crear un objeto de la clase Perro
        Perro p1 = new Perro();
        Perro p2 = new Perro();

        // Asignar valores a los atributos
        //Puedo pero no debería acceder directamente a los atributos privados
        p1.setNombre("Max");
        
        p1.setRaza("Border Collie");
        p1.setEdad(64); //Años caninos
        p1.setColor("negro");

        p2.setNombre("Vicky");
        p2.setRaza("Pomerania");
        p2.setEdad(18); //Años caninos
        p2.setColor("blanco");

        Perro p3 = new Perro("Sanxe", "PSOE", 53, "rojo");
        Perro p4 = new Perro("Sanxe", "PSOE", 53, "rojo");
        Veterinario v1 = new Veterinario();
        
        v1.setNombre("Lorena Bogordo");
        v1.setNif("12345678Z");
        v1.setCuenta("1234567890");
        v1.setTurno('t');
        v1.setDespacho(21);

        Veterinario v2 = new Veterinario ("Lola Montero", "87654321A", "888555333", 't', 4);
        Consulta c1 = new Consulta(v1, p1 , "01/01/2025", "9:00", 30);
        Consulta c2 = new Consulta(v2, p2 , "01/01/2025", "10:00", 20);
        Consulta c3 = new Consulta(v1, p3 , "01/01/2025", "11:00", 15); 
        Consulta c4 = new Consulta(v2, p4 , "01/01/2025", "12:00", 25);
        Consulta [] lista= new Consulta[8];
        lista[0]= c1;
        lista[2]= c2;
        lista[3]= c3;
        lista[6]= c4;
        Agenda agenda1 = new Agenda (lista, "01/01/2025");
        System.out.println(agenda1);
    }
}
