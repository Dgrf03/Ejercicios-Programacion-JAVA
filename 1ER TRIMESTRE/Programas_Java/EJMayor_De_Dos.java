import java.util.Scanner;
public class EJMayor_De_Dos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        if (num1 == num2) {
            System.out.println("Los números son iguales.");
        } else {
            int mayor = (num1 > num2) ? num1 : num2;
            System.out.println("El número mayor es: " + mayor);

            // System.out.println("El número mayor es: " + ((num1 > num2) ? num1 : num2));
        }
        scanner.close();
    }
}
