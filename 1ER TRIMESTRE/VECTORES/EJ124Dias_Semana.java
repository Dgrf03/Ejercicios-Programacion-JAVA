/************************************************************************       
 * EJ124_Dias_Semana.java
 * Este programa declara un vector de los dias de la semana segun la posicion.
 * Autor: Diego Ramos Fernández
 * Fecha: 31/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJ124Dias_Semana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 7: ");
        int dia = scanner.nextInt();
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        if (dia >= 1 && dia <= 7) {
            System.out.println("El día " + dia + " es: " + dias[dia - 1]);
        } else {
            System.out.println("Número inválido. Por favor, introduce un número del 1 al 7.");
        }
        scanner.close();
    }
}
