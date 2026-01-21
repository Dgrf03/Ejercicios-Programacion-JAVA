/************************************************************************       
 * Cuenta_Letras.java
 * Programa que cuenta el número de letras en una cadena de texto dado un texto.
 * Autor: Diego Ramos Fernández
 * Fecha: 16/10/2025
 * Curso: 1º DAM
 ************************************************************************/

/*
import java.util.Scanner;
public class Cuenta_Letras {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isLetter(texto.charAt(i))) {
                contador++;
            }
        }
        System.out.println("El número de letras en la cadena es: " + contador);
        scanner.close();
    }
}
*/
/************************************************************************       
 * Cuenta_Letras.java
 * Programa que cuenta el número de palabras en una cadena de texto dado un texto.
 * Autor: Diego Ramos Fernández
 * Fecha: 16/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class Cuenta_Letras {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();
        int contador = 0;
        boolean enPalabra = false;
        for (int i =0; i < texto.length(); i++){
            if (Character.isLetter(texto.charAt(i))){
                if (!enPalabra){
                    contador++;
                    enPalabra = true;
                }
            } else {
                enPalabra = false;
            }
        }
        System.out.println("El número de palabras en la cadena es: " + contador);
        scanner.close();
    }
}