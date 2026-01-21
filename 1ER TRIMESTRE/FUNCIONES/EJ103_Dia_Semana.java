/************************************************************************       
 * EJ103_Dia_Semana.java
 * Programa que imprime el día de la semana según un número dada una función.
 * Autor: Diego Ramos Fernández
 * Fecha: 21/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJ103_Dia_Semana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número del 1 al 7: ");
        int dia = scanner.nextInt();
        String nombreDia = obtenerNombreDia(dia);
        System.out.println("El día de la semana es: " + nombreDia);
        scanner.close();
    }

    public static String obtenerNombreDia(int dia) {
        switch (dia) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "Número inválido";
        }
    }
}
