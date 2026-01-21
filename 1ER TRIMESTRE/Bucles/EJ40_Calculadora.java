import java.util.Scanner;

/************************************************************************       
 * EJ40_Calculadora.java
 * Programa que utiliza el bucle do-while para salir de la calculardora.
 * Autor: Diego Ramos Fernández
 * Fecha: 10/10/2025
 * Curso: 1º DAM
 ************************************************************************/


public class EJ40_Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacion;

        do {
            System.out.println("\n=== Calculadora que te cagas ===");
            System.out.println("Seleccione la operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Raíz cuadrada");
            System.out.println("6. Ecuación de segundo grado");
            System.out.println("7. Salir");
            System.out.print("Opción: ");

            operacion = scanner.nextInt();
            double resultado;

            switch (operacion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = scanner.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese un número para calcular su raíz cuadrada: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        resultado = Math.sqrt(num1);
                        System.out.println("Raíz cuadrada de " + num1 + " es: " + resultado);
                    } else {
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    }
                    break;
                case 6:
                    System.out.print("Ingrese el coeficiente a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Ingrese el coeficiente b: ");
                    double b = scanner.nextDouble();
                    System.out.print("Ingrese el coeficiente c: ");
                    double c = scanner.nextDouble();
                    double discriminante = b * b - 4 * a * c;
                    if (discriminante > 0) {
                        double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                        double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                        System.out.println("Las raíces son reales y diferentes:");
                        System.out.println("Raíz 1: " + raiz1);
                        System.out.println("Raíz 2: " + raiz2);
                    } else if (discriminante == 0) {
                        double raiz = -b / (2 * a);
                        System.out.println("Las raíces son reales e iguales:");
                        System.out.println("Raíz: " + raiz);
                    } else {
                        System.out.println("Las raíces son complejas y no reales.");
                    }
                    break;
                case 7:
                    System.out.println("Saliendo del programa... ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Operación inválida. Por favor, seleccione una opción del 1 al 7.");
            }

        } while (operacion != 7);

        scanner.close();
    }
}
