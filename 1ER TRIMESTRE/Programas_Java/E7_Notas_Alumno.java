import java.util.Scanner;

/************************************************************************       
 * E7_Notas_Alumno.java
 * Este programa evalúa la nota de un alumno.
 * Autor: Diego Ramos Fernández
 * Fecha: 24/09/2025
 * Curso: 1º DAM
 ************************************************************************/

public class E7_Notas_Alumno
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //programa para ver si un alumno segun su nota ha suspendido, ha aprobado, ha sacado un notable, ha sacado un sobresaliente o ha sacado un matricula de honor
        //pido por consola la nota del alumno
        System.out.print("Por favor, introduce la nota del alumno: ");
        double nota = scanner.nextDouble();
        System.out.println("La nota del alumno es: " + nota);
        //compruebo la nota del alumno y muestro el resultado por consola

        if (nota < 5) {
            System.out.println("El alumno ha suspendido.");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("El alumno ha aprobado.");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("El alumno ha sacado un notable.");
        } else if (nota >= 9 && nota < 10) {
            System.out.println("El alumno ha sacado un sobresaliente.");
        } else if (nota == 10) {
            System.out.println("El alumno ha sacado un matrícula de honor.");
        }
        //Cierro el scanner
        scanner.close();
    }
}