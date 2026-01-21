/************************************************************************       
 * EJ100_Saludo.java
 * Programa que imprime un saludo personalizado.
 * Autor: Diego Ramos Fernández
 * Fecha: 23/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;

public class EJ100_Saludo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        //Llamo a la función saludo
        saludo(nombre);
        saludo("Diego Delegado");
        saludo("Efren");
        saludo("1");
        scanner.close();
    }
    public static void saludo(String  nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }
}