import java.util.Scanner;

/************************************************************************       
 * E6_Valores_Con_if.java
 * Este programa muestra como utilizar la estructura if y else.
 * Autor: Diego Ramos Fernández
 * Fecha: 24/09/2025
 * Curso: 1º DAM
 ************************************************************************/


public class E6_Valores_Con_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pido valores de x
        System.out.print("Por favor, introduce el valor de x: ");
        int x = scanner.nextInt();
        System.out.println("El valor de x es: " + x);
        // Primer if para comprobar si el número es mayor o igual que 100
        if (x >= 100) {
            System.out.println("El número " + x + " es mayor o igual que 100.");
        }

        // Segundo if para comprobar si el número es par
        if (x % 2 == 0) {
            System.out.println("El número " + x + " es par.");
        } else {
            System.out.println("El número " + x + " es impar.");
        }
        // Tercer if para comprobar si el número es positivo, negativo o cero
        if (x > 0) {
            System.out.println("El número " + x + " es positivo.");
        } else if (x < 0) {
            System.out.println("El número " + x + " es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        //Cierro el scanner
        scanner.close();
    }
}
