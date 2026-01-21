import java.util.Scanner;
/************************************************************************       
 * E15_Saludo.java
 * Este programa muestra como realizar entradas por teclado.
 * Autor: Diego Ramos Fernández
 * Fecha: 26/09/2025
 * Curso: 1º DAM
 ************************************************************************/
//Imprimimos nombre, apellido, segundo apellido y edad por teclado.
 public class E15_Saludo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
       Scanner scanner = new Scanner(System.in);
         // Pedir al usuario que introduzca su nombre
         System.out.print("Por favor, introduce tu nombre: ");
         String nombre = scanner.nextLine();
         System.out.print("Por favor, introduce tu  primer apellido: ");
         String apellido = scanner.nextLine();
         System.out.print("Por favor, introduce tu segundo apellido: ");
         String segundoApellido = scanner.nextLine();
         System.out.println("Hola " + nombre + " " + apellido + " " + segundoApellido + "!");
         // Pedir al usuario que introduzca su edad
         System.out.print("Por favor, introduce tu edad: ");
         int edad = scanner.nextInt();
         System.out.println("Tienes " + edad + " años.");
         // Cerrar el scanner
         scanner.close();    
    }
}