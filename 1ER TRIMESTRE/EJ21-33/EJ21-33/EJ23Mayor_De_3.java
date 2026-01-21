/*
 * Nombre del programa: EJ23Mayor_De_3
 * Descripción: Este programa solicita al usuario que ingrese tres números y luego determina cuál de
 * ellos es mayor. Si todos los números son iguales, informa al usuario.
 * Nombre: Diego Ramos Fernández
 * Fecha: 02/10/2025
 */ 
import java.util.Scanner;
public class EJ23Mayor_De_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicitar al usuario que ingrese tres números
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        
        System.out.print("Introduce el tercer número: ");
        int num3 = sc.nextInt();
        
        // Comparar los números y mostrar cuál es mayor
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("El número mayor es: " + num3);
        }
        
        // Verificar si todos los números son iguales
        if (num1 == num2 && num2 == num3) {
            System.out.println("Todos los números son iguales.");
        }
        
        sc.close();
    }
}