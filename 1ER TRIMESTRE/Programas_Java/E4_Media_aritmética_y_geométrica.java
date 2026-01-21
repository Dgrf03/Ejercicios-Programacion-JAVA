import java.util.Scanner;

/************************************************************************       
 * E4_Media_aritmética_y_geométrica.java
 * Este programa realiza la media aritmética y la media geométrica.
 * Autor: Diego Ramos Fernández
 * Fecha: 23/09/2025
 * Curso: 1º DAM
 ************************************************************************/


public class  E4_Media_aritmética_y_geométrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaración de variables
        double numero1;
        double numero2;
        double mediaAritmetica;
        double mediaGeometrica;
        
        // Asignación de valores a las variables
        //Pido valores de numero1 y numero2
        System.out.print("Por favor, introduce el valor de numero1: ");
        numero1 = scanner.nextDouble();
        System.out.print("Por favor, introduce el valor de numero2: ");
        numero2 = scanner.nextDouble();
        // Cálculo de la media aritmética
        mediaAritmetica = (numero1 + numero2) / 2;
        
        // Cálculo de la media geométrica
        mediaGeometrica = Math.sqrt(numero1 * numero2);
        
        // Mostrar
        System.out.println("La media aritmética de " + numero1 + " y " + numero2 + " es: " + mediaAritmetica);
        System.out.println("La media geométrica de " + numero1 + " y " + numero2 + " es: " + mediaGeometrica);
        //Cierro el scanner
        scanner.close();
    }
}