/************************************************************************       
 * Perro.java
 * Programa que define una clase perro.
 * Autor: Diego Ramos Fernández
 * Fecha: 11/11/2025
 * Curso: 1º DAM
 ************************************************************************/

public class Perro {

    // Atributos
    private String nombre;
    private String raza;
    private int edad;
    private String color;
    // ...
    
    //Constructor nulo
    Perro() {
        this.nombre = "";
        this.raza = "";
        this.edad = 0;
        this.color = "";
    }
    //Constructor con parámetros (Por defecto)
    Perro(String nombre, String raza, int edad, String color){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
    }
    Perro(String nombre){
        this.nombre = nombre;
        this.raza = "";
        this.edad = 0;
        this.color = "";
    }

    //Constructor copia
    Perro(Perro p){
        this.nombre = p.nombre;
        this.raza = p.raza;
        this.edad = p.edad;
        this.color = p.color;
    }
    // Métodos setter y getter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getRaza() {
        return raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Perro\n-----\nNombre: " + this.nombre + ", \nRaza: " + this.raza + ", \nEdad: " + this.edad + " años, \nColor: " + this.color;
    }
    //@Override
    public boolean equals(Perro p) {
        return(this.raza==p.raza && this.nombre==p.nombre && this.edad==p.edad && this.color==p.color);
    }
    public static void main(String[] args) {
        // Crear un objeto de la clase Perro
        Perro p1 = new Perro();
        Perro p2 = new Perro();

        // Asignar valores a los atributos
        //Puedo pero no debería acceder directamente a los atributos privados
        p1.nombre = "Max";
        p1.raza = "Border Collie";
        p1.edad = 64; //Años caninos
        p1.color = "negro";

        p2.nombre = "Vicky";
        p2.raza = "Pomerania";
        p2.edad = 18; //Años caninos
        p2.color = "blanco";

        Perro p3 = new Perro("Sanxe", "PSOE", 53, "rojo");
        Perro p4 = new Perro("Sanxe", "PSOE", 53, "rojo");


        // Mostrar información del perro
        System.out.println("Perro 1:" + p1);
        System.out.println("Perro 2:" + p2);
        System.out.println("Perro 3:" + p3);

        System.out.println("Nombre: " + p1.nombre);
        System.out.println("Raza: " + p1.raza);
        System.out.println("Edad: " + p1.edad + " años");

        System.out.println("Nombre: " + p2.nombre);
        System.out.println("Raza: " + p2.raza);
        System.out.println("Edad: " + p2.edad + " años");
        System.out.println("Nombre: " + p3.nombre);
        System.out.println("Raza: " + p3.raza);
        System.out.println("Edad: " + p3.edad + " años");
        System.out.println("Color: " + p3.color);

        if(p3.equals(p4)){
            System.out.println("Los perros 3 y 4 son iguales.");
        } else {
            System.out.println("Los perros 3 y 4 son diferentes.");
        }
    }
}
