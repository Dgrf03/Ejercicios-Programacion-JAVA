import java.util.Scanner;

/************************************************************************       
 * E16_Ecuacion_2º_Grado.java
 * Programa que a partir de los coeficientes A, B y C, resuelve ecuaciones de 2º grado del tipo Ax2 + Bx + C = 0.
 * Autor: Diego Ramos Fernández
 * Fecha: 26/09/2025
 * Curso: 1º DAM
 ************************************************************************/
public class E16_Ecuacion_2º_Grado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir los coeficientes A, B y C
        System.out.print("Introduce el coeficiente A: ");
        double a = scanner.nextDouble();
        System.out.print("Introduce el coeficiente B: ");
        double b = scanner.nextDouble();
        System.out.print("Introduce el coeficiente C: ");
        double c = scanner.nextDouble();
        // Calcular el discriminante
        double discriminante = b * b - 4 * a * c;
        if (discriminante > 0) {
            // Dos soluciones reales
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminante == 0) {
            // Una solución real
            double x = -b / (2 * a);
            System.out.println("La solución es: x = " + x);
        } else {
            // No hay soluciones reales
            System.out.println("No hay soluciones reales.");
        }
        // Cerrar el scanner
        scanner.close();
    }
}