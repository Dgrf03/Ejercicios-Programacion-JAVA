import java.util.Scanner;
//Ver si un número es multiplo de 7 pero no de 13 o viceversa o si es multiplo de ambos
public class EJMultiplo13y7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, introduce un número entero: ");
        int numero = scanner.nextInt();
        if (numero % 13 == 0 && numero % 7 == 0) {
            System.out.println("El número " + numero + " es múltiplo de 13 y 7.");
        } else if (numero % 13 == 0 || numero % 7 == 0) {
            System.out.println("El número " + numero + " es múltiplo de 13 o 7, pero no te voy a decir de cual.");
        } else if (numero % 13 != 0 && numero % 7 != 0) {
            System.out.println("El número " + numero + " no es múltiplo de 13 ni de 7.");
        }
        scanner.close();
    }
}