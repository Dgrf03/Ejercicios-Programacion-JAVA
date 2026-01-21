import java.util.Scanner;

public class E110_Potencia {
    public static void main(String[] args) {
        // Crear el escáner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir la base
        System.out.print("Introduce la base: ");
        int base = scanner.nextInt();
        
        // Pedir el exponente
        System.out.print("Introduce el exponente: ");
        int exponente = scanner.nextInt();
        
        // Calcular la potencia
        int resultado = calcularPotencia(base, exponente);
        
        // Mostrar el resultado
        System.out.println(base + " elevado a " + exponente + " es: " + resultado);
        
        scanner.close();
    }
    
    // Método para calcular la potencia
    public static int calcularPotencia(int base, int exponente) {
        int resultado = 1;
        
        // Multiplicar la base por sí misma tantas veces como indica el exponente
        for (int i = 0; i < exponente; i++) {
            resultado = resultado * base;
        }
        
        return resultado;
    }
}
