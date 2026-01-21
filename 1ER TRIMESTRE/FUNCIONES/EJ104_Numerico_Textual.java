/************************************************************************       
 * EJ104_Numerico_Textual.java
 * Programa que convierte un número en su representación textual utilizando una función.
 * Autor: Diego Ramos Fernández
 * Fecha: 21/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJ104_Numerico_Textual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número del 0 al 10: ");
        int numero = scanner.nextInt();
        String texto = convertirANumeroTexto(numero);
        System.out.println("Tu puntuación es: " + texto);
        scanner.close();
    }

    public static String convertirANumeroTexto(int numero) {
        switch (numero) {
            case 0,1,2,3,4:
                return "Suspendido";
            case 5,6:
                return "Aprobado";
            case 7,8:
                return "Notable";
            case 9:
                return "Sobresaliente";
            case 10:
                return "Excelente";
            default:
                return "Número fuera de rango";
        }
    }
}

