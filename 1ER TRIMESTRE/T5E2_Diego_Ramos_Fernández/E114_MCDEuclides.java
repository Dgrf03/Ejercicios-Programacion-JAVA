import java.util.Scanner;

public class E114_MCDEuclides {
    public static void main(String[] args) {
        // Crear el escáner para leer números del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el primer número
        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();
        
        // Pedir el segundo número
        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();
        
        // Calcular el MCD usando el método recursivo
        int resultado = calcularMCD(numero1, numero2);
        
        // Mostrar el resultado
        System.out.println("El MCD de " + numero1 + " y " + numero2 + " es: " + resultado);
        
        scanner.close();
    }
    
    // Método recursivo para calcular el MCD con el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {
        // Si b es 0, el MCD es a
        if (b == 0) {
            return a;
        }
        
        // Si no, llamamos de nuevo al método con b y el resto de a/b
        return calcularMCD(b, a % b);
    }
}