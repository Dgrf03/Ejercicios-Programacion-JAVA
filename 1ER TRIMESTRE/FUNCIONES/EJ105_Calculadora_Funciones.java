/************************************************************************       
 * EJ105_Calculadora_Funciones.java
 * Este programa realiza operaciones básicas de calculadora con funciones.
 * Autor: Diego Ramos Fernández
 * Fecha: 24/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJ105_Calculadora_Funciones {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Ingresa la operación (+, -, *, /, r, 2): ");
        char operacion = scanner.next().charAt(0);
        double resultado;
        switch (operacion) {
            case '+':
                resultado = sumar(num1, num2);
                break;
            case '-':
                resultado = restar(num1, num2);
                break;
            case '*':
                resultado = multiplicar(num1, num2);
                break;
            case '/':
                resultado = dividir(num1, num2);
                break;
            case 'r':
                resultado = raiz(num1);
                break;
            case '2':// ecuación segundo grado
                double a = num1;
                double b = num2;
                System.out.print("Ingresa el valor de c: ");
                double c = scanner.nextDouble();
                double discriminante = b * b - 4 * a * c;
                if (discriminante > 0) {
                    double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                    double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                    System.out.println("Las raíces son reales y diferentes: " + raiz1 + " y " + raiz2);
                } else if (discriminante == 0) {
                    double raiz = -b / (2 * a);
                    System.out.println("Las raíces son reales e iguales: " + raiz);
                } else {
                    System.out.println("Las raíces son complejas.");
                }
                scanner.close();
                return;
            default:
                System.out.println("Operación no válida.");
                scanner.close();
                return;
        }
        System.out.println("El resultado de " + num1 + " " + operacion + " " + num2 + " es: " + resultado);
        scanner.close();
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero no permitida.");
            return 0;
        }
    }
    public static double raiz(double a) {
        if (a >= 0) {
            return Math.sqrt(a);
        } else {
            System.out.println("Error: Raíz cuadrada de número negativo no permitida.");
            return 0;
        }
    }
    public static double ecuacionSegundoGrado(double a, double b, double c) {
        double discriminante = b * b - 4 * a * c;
        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces son reales y diferentes: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("Las raíces son reales e iguales: " + raiz);
        } else {
            System.out.println("Las raíces son complejas.");
        }
        return 0;
    }
}