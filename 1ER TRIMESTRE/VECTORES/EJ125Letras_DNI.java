/************************************************************************       
 * EJ125_Letras_DNI.java
 * Este programa declara un vector de letras para que segun el DNI calcule que letra tiene.
 * Autor: Diego Ramos Fernández
 * Fecha: 31/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJ125Letras_DNI {
    public static void main(String[] args) {
        // Declaramos el vector de letras
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 
                            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 
                            'K', 'E'};
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca su DNI
        System.out.print("Introduce tu número de DNI (sin letra): ");
        int dni = scanner.nextInt();

        // Calculamos el índice para obtener la letra correspondiente
        int indice = dni % 23;

        // Obtenemos la letra del DNI
        char letraDNI = letrasDNI[indice];

        // Mostramos el resultado
        System.out.println("El DNI " + dni + " tiene la letra: " + letraDNI);
        // Cerramos el scanner
        scanner.close();
    }
}