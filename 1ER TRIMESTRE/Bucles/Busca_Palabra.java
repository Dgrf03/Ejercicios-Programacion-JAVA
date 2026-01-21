/************************************************************************       
 * Busca_Palabra.java
 * Programa que pida un texto y una palabra y que diga si la palabra está dentro de ese texto.
 * Autor: Diego Ramos Fernández
 * Fecha: 20/10/2025
 * Curso: 1º DAM
 ************************************************************************/
import java.util.Scanner;
public class Busca_Palabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que introduzca un texto
        System.out.println("Introduce un texto:");
        String texto = scanner.nextLine();
        
        // Pedir al usuario que introduzca una palabra
        System.out.println("Introduce una palabra a buscar en el texto:");
        String palabra = scanner.nextLine();

        // Comprobar si la palabra está en el texto y que cuente las veces que aparece
        int contador = 0;
        for (int i = 0; i < texto.length(); i++){
            if (texto.charAt(i) == palabra.charAt(0)){
                boolean ok = true;
                for (int j = 1; j < palabra.length(); j++){
                    if (texto.charAt(i + j) != palabra.charAt(j)){
                        ok = false;
                        System.out.println("La palabra \"" + palabra + "\" no está dentro del texto.");
                        break;
                    }
                }   
                if (ok){
                    /*
                    System.out.println("La palabra \"" + palabra + "\" está dentro del texto.");
                    System.out.println("Aparece en la posición: " + i);
                    */
                    contador++;
                }
                    
            }
        }
        System.out.println("La palabra \"" + palabra + "\" aparece " + contador + " veces en el texto.");
        scanner.close();
    }
}
