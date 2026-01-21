import java.util.Scanner;
public class EJMayor_De_Cuatro {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        System.out.print("Ingrese el cuarto número: ");
        int num4 = scanner.nextInt();
        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("Los números son iguales.");
        } else {
            int mayor = Math.max(num1, Math.max(num2, Math.max(num3, num4)));
            System.out.println("El número mayor es: " + mayor);
        }
        scanner.close();
    }
}
