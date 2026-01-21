import java.util.Scanner;

/************************************************************************       
 * E5_Ecuación_2º_grado.java
 * Este programa realiza la ecuación de segundo grado.
 * Autor: Diego Ramos Fernández
 * Fecha: 23/09/2025
 * Curso: 1º DAM
 ************************************************************************/

 public class E5_Ecuación_2º_grado {
     public static void main(String[] args) {
         // Declaración de variables
            Scanner scanner = new Scanner(System.in);
            double a;
            double b;
            double c;  
            double discriminante;
            double raiz1;
            double raiz2;
            //Pido los valores de a, b y c
            System.out.print("Por favor, introduce el valor de a: ");
            a = scanner.nextDouble();
            System.out.print("Por favor, introduce el valor de b: ");
            b = scanner.nextDouble();
            System.out.print("Por favor, introduce el valor de c: ");
            c = scanner.nextDouble();
            // Calculo del discriminante
            discriminante = b * b - 4 * a * c;
            // Compruebo el valor del discriminante
            if (discriminante > 0) {
                // Dos soluciones reales y distintas
                raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("La ecuación tiene dos soluciones reales y distintas:");
                System.out.println("Raíz 1: " + raiz1);
                System.out.println("Raíz 2: " + raiz2);
            } else if (discriminante == 0) {
                // Una solución real
                raiz1 = -b / (2 * a);
                System.out.println("La ecuación tiene una solución real:");
                System.out.println("Raíz: " + raiz1);
            } else {
                // No hay soluciones reales
                System.out.println("La ecuación no tiene soluciones reales.");
            }
            //Cierro el scanner
            scanner.close();
     }
 }