/************************************************************************       
 * EJ41_Dia_Semana.java
 * Programa que dado un número entero indique el día de la semana que le corresponde: 1 - lunes .. 7 - domingo. El programa debe utilizar un switch.
 * Autor: Diego Ramos Fernández
 * Fecha: 10/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJ41_Dia_Semana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 7: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número no válido.");
        }
        sc.close();
    }
}