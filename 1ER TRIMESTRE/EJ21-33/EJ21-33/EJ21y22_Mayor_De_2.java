/*
 * Nombre del programa: EJ21y22_Mayor_De_2
 * Descripción: Este programa solicita al usuario que ingrese dos números y luego determina cuál de
 * ellos es mayor. Si ambos números son iguales, informa al usuario.
 * Nombre: Diego Ramos Fernández
 * Fecha: 02/10/2025
 */
import java.util.Scanner;
public class EJ21y22_Mayor_De_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicitar al usuario que ingrese dos números
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        // Comparar los números y mostrar cuál es mayor
        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("Ambos números son iguales.");// Si ambos números son iguales
        }
        
        sc.close();
    }
}