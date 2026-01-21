public class Main {

    public static void main(String[] args) {

        // Persona
        Persona p1 = new Persona("Juan Pérez", "11111111A", "Valencia");
        System.out.println(p1);

        // Usuario 
        Usuario u1 = new Usuario("Diego", "20957147F", "Burriana", "Ramos Fernández", 21);
        System.out.println(u1);

        // Libro
        Libro l1 = new Libro("El Quijote", "Cervantes", "123456", 3);
        System.out.println(l1);

        // Préstamo
        Prestamo pr1 = new Prestamo(l1, u1, "05/12/2025");
        System.out.println(pr1);

        // Trabajador
        Trabajador t1 = new Trabajador("Ruben", "12345678A", "C/ Debajo de un puente 23", "98765432109876", "ES01 1234 1234 1234 1234 1234");
        System.out.println(t1);

        // Comparaciones con equals
        Usuario u2 = new Usuario(u1);     // copia
        System.out.println("¿u1 y u2 son iguales? " + u1.equals(u2));

        Libro l2 = new Libro(l1);        // copia
        System.out.println("¿l1 y l2 son iguales? " + l1.equals(l2));

        Prestamo pr2 = new Prestamo(pr1);
        System.out.println("¿pr1 y pr2 son iguales? " + pr1.equals(pr2));
    }
}
