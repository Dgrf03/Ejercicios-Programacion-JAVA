public class Main {

    public static void main(String[] args) {

        Biblioteca b = new Biblioteca();

        Usuario u1 = new Usuario("Diego", "20957147F", "Burriana", "Ramos Fernández", 21);
        Usuario u2 = new Usuario("Ana", "22222222B", "Castellón", "López", 19);

        Trabajador t1 = new Trabajador("Ruben", "12345678A", "C/ Debajo de un puente 23", "98765432109876", "ES01 1234 1234 1234 1234 1234");

        Libro l1 = new Libro("El Quijote", "Cervantes", "123456", 3);
        Libro l2 = new Libro("La Regenta", "Leopoldo Alas", "654321", 2);

        // Crear préstamos y añadirlos a la biblioteca
        Prestamo pr1 = new Prestamo(l1, u1, t1, "05/12/2025");
        Prestamo pr2 = new Prestamo(l2, u2, t1, "06/12/2025");

        b.añadirPrestamo(pr1);
        b.añadirPrestamo(pr2);

        // Consultas según el método abstracto
        u1.consultarLibros(b); // libros prestados a Diego
        u2.consultarLibros(b); // libros prestados a Ana
        t1.consultarLibros(b); // libros gestionados por Ruben

        // Pruebas de la interfaz Autenticable
        u1.autenticar("Acceso al área de usuario");
        t1.autenticar("Validación de credenciales del trabajador");
    }
}
