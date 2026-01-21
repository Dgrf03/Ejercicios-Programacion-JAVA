/*
 * Nombre del programa: EJ30_Conversion_Numerica_A_Textual
 * Descripción: Este programa solicita al usuario que ingrese un número y luego lo convierte a su representación textual.
 * Nombre: Diego Ramos Fernández
 * Fecha: 02/10/2025
 */ 
import java.util.Scanner;

public class EJ30_Conversion_Numerica_A_Textual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] NumeroATexto = {// Array para convertir números a texto
            "cero", "uno", "dos", "tres", "cuatro",
            "cinco", "seis", "siete", "ocho", "nueve", "diez"
        };

        System.out.print("Introduce un número (0 a 10): ");
        int numero  = sc.nextInt();
        // Comprobar y convertir el número a texto
        if (numero >= 0 && numero <= 10) {
            System.out.println("El número en texto es: " + NumeroATexto[numero]);
        } else {
            System.out.println("Error: el número debe estar entre 0 y 10.");
        }

        sc.close();
    }
}
