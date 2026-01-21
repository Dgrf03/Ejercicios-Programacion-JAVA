/************************************************************************       
 * E14_Cálculo_Resistencia.java
 * Este programa debe calcular el valor de la resistencia equivalente en paralelo de otras dos resistencias previamente informadas. Req=(R1*R2)/(R1+R2)
 * Autor: Diego Ramos Fernández
 * Fecha: 25/09/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class E14_Cálculo_Resistencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir al usuario que introduzca los valores de las resistencias
        System.out.print("Introduce el valor de la primera resistencia (R1) en ohmios: ");
        double R1 = scanner.nextDouble();
        System.out.print("Introduce el valor de la segunda resistencia (R2) en ohmios: ");
        double R2 = scanner.nextDouble();

        // Cálculo de la resistencia equivalente en paralelo
        double Req = (R1 * R2) / (R1 + R2);

        System.out.println("La resistencia equivalente en paralelo de " + R1 + " y " + R2 + " es: " + Req + " ohmios.");
        scanner.close();
    }
}