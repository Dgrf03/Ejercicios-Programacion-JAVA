import java.util.Scanner;
public class EJVocal {
    //Ver si una letra es vocal o no
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, introduce una letra: ");
        char letra = scanner.next().charAt(0);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("La letra " + letra + " es una vocal.");
        } else {
            System.out.println("La letra " + letra + " no es una vocal.");
        }
        scanner.close();
    }
}
