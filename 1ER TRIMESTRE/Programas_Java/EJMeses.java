/************************************************************************       
 * EJMeses.java
 * Este programa muestra el mes y la estación correspondiente a un número introducido por teclado.
 * Autor: Diego Ramos Fernández
 * Fecha: 03/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class EJMeses {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 12: ");
        int numero = scanner.nextInt();
        String mes;
        switch (numero) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
            default:
                mes = "Número inválido. Por favor, ingrese un número entre 1 y 12.";
        }
        System.out.println(mes);
        scanner.close();
    }
}
