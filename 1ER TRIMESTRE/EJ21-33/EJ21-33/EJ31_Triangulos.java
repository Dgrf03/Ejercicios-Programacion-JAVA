/*
 * Nombre del programa: EJ31_Triangulos
 * Descripción: Realice un programa que lea de la entrada estandar la longitud de los tres lados de un triangulo y muestre en la salida estandar que tipo de triángulo es, de acuerdo con la siguiente casuística—a denota la longitud del lado mas largo y b y c denotan la longitud de los otros dos lados:
 * Nombre: Diego Ramos Fernández
 * Fecha: 02/10/2025
 */ 
import java.util.Scanner;
public class EJ31_Triangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Leer la longitud de los tres lados
        System.out.print("Introduce la longitud del lado a: ");
        double a = sc.nextDouble();
        System.out.print("Introduce la longitud del lado b: ");
        double b = sc.nextDouble();
        System.out.print("Introduce la longitud del lado c: ");
        double c = sc.nextDouble();

        /*Si a ≥ b + c, no se trata de un triangulo
        Si a2 = b2 + c2, es un triangulo rectángulo
        Si a2 < b2 + c2, es un triangulo acutángulo
        Si a2 > b2 + c2, es un triangulo obtusángulo*/

        // Determinar el tipo de triángulo
        if (a >= b + c) {
            System.out.println("No se trata de un triángulo.");
        } else if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
            System.out.println("Es un triángulo rectángulo.");
        } else if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
            System.out.println("Es un triángulo acutángulo.");
        } else {
            System.out.println("Es un triángulo obtusángulo.");
        }
        /*tambien se podria hacer con ifs
        if (a >= b + c) {
            System.out.println("No se trata de un triángulo.");
        } else {
            if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("Es un triángulo rectángulo.");
            } else {
                if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
                    System.out.println("Es un triángulo acutángulo.");
                } else {
                    System.out.println("Es un triángulo obtusángulo.");
                }
            }
        }*/
        sc.close();
    }
}
