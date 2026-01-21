/************************************************************************       
 * Bucle_Mayus_Minus.java
 * Programa que cuenta las letras mayúsculas y minúsculas introducidas por el usuario.
 * Autor: Diego Ramos Fernández
 * Fecha: 07/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class Bucle_Mayus_Minus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorMayus = 0;
        int contadorMinus = 0;
        int contadorOtros = 0;
        char letra;

        while (true) {
            System.out.print("Introduce una letra (0 para salir): ");
            letra = scanner.nextLine().charAt(0);
            if (letra == '0') {
                break;
            }

            if (Character.isUpperCase(letra)) {
                contadorMayus++;
            } else if (Character.isLowerCase(letra)) {
                contadorMinus++;
            } 
            else {
                contadorOtros++;
                System.out.println("No has introducido una letra válida.");
            }

        }
        System.out.println("Has introducido " + contadorMayus + " letras mayúsculas y " + contadorMinus + " letras minúsculas y " + contadorOtros + " otros caracteres.");
        scanner.close();
    }
}

//con un bucle do-while se haria asi:
/* 
    do {
            System.out.print("Introduce una letra (0 para salir): ");
            letra = scanner.nextLine().charAt(0);
            if (letra != '0') {
                if (Character.isUpperCase(letra)) {
                    contadorMayus++;
                } else if (Character.isLowerCase(letra)) {
                    contadorMinus++;
                }
            }
        } while (letra != '0');

        System.out.println("Has introducido " + contadorMayus + " letras mayúsculas y " + contadorMinus + " letras minúsculas.");
        scanner.close();
 */

/*
 * //con codigo ASCII seria asi:
 * do {
            System.out.print("Introduce una letra (0 para salir): ");
            letra = scanner.nextLine().charAt(0);
            if (letra != '0') {
                if (letra >= 'A'//65 && letra <= 'Z'//90) {
                    contadorMayus++;
                } else if (letra >= 'a'//97 && letra <= 'z'//122) {
                    contadorMinus++;
                }
            }
        } while (letra != '0');

        System.out.println("Has introducido " + contadorMayus + " letras mayúsculas y " + contadorMinus + " letras minúsculas.");
        scanner.close();
 */
 
