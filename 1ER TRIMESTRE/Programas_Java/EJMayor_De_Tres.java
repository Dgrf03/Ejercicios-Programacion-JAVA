import java.util.Scanner;   
public class EJMayor_De_Tres {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        if (num1 == num2 && num2 == num3) {
            System.out.println("Los números son iguales.");
        } else {
            int mayor = Math.max(num1, Math.max(num2, num3));
            System.out.println("El número mayor es: " + mayor);
        }
        scanner.close();
    }
}
