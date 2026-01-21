/************************************************************************       
 * EJDias.java
 * Este programa muestra el día de la semana correspondiente a un número introducido por teclado.
 * Autor: Diego Ramos Fernández
 * Fecha: 03/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJDias {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 7: ");
        int numero = scanner.nextInt();
        String dia;
        switch (numero) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Número inválido. Por favor, ingrese un número entre 1 y 7.";
        }
        System.out.println(dia);
        scanner.close();
    }

    
}
