import java.util.Scanner;

public class E115_InvertirCadena {
    public static void main(String[] args) {
        // Crear el escáner para leer texto del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir la cadena de texto
        System.out.print("Introduce una cadena de texto: ");
        String cadena = scanner.nextLine();
        
        // Invertir la cadena
        String cadenaInvertida = invertirCadena(cadena);
        
        // Mostrar el resultado
        System.out.println("Cadena invertida: " + cadenaInvertida);
        
        scanner.close();
    }
    
    // Método para invertir la cadena
    public static String invertirCadena(String texto) {
        String resultado = "";
        
        // Recorrer la cadena desde el final hasta el principio
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado = resultado + texto.charAt(i);
        }
        
        return resultado;
    }
}