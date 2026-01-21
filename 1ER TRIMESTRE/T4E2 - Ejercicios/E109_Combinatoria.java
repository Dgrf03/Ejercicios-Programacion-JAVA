import java.util.Scanner;

public class E109_Combinatoria {
    
    // Función factorial iterativa
    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n*** COMBINATORIA ***");
            System.out.println("1. Combinaciones sin repetición (C)");
            System.out.println("2. Variaciones sin repetición (V)");
            System.out.println("3. Permutaciones sin repetición (P)");
            System.out.println("4. Combinaciones con repetición (CR)");
            System.out.println("5. Variaciones con repetición (VR)");
            System.out.println("6. Ver explicaciones");
            System.out.println("0. Salir");
            System.out.print("Elige opción: ");
            opcion = sc.nextInt();
            
            if (opcion == 1) {
                // C(n,r) = n! / (r! * (n-r)!)
                System.out.print("n (total): ");
                int n = sc.nextInt();
                System.out.print("r (tomar): ");
                int r = sc.nextInt();
                
                long resultado = factorial(n) / (factorial(r) * factorial(n - r));
                System.out.println("Resultado: " + resultado);
                
            } else if (opcion == 2) {
                // V(n,r) = n! / (n-r)!
                System.out.print("n (total): ");
                int n = sc.nextInt();
                System.out.print("r (tomar): ");
                int r = sc.nextInt();
                
                long resultado = factorial(n) / factorial(n - r);
                System.out.println("Resultado: " + resultado);
                
            } else if (opcion == 3) {
                // P(n) = n!
                System.out.print("n (total): ");
                int n = sc.nextInt();
                
                long resultado = factorial(n);
                System.out.println("Resultado: " + resultado);
                
            } else if (opcion == 4) {
                // CR(n,r) = (n+r-1)! / (r! * (n-1)!)
                System.out.print("n (total): ");
                int n = sc.nextInt();
                System.out.print("r (tomar): ");
                int r = sc.nextInt();
                
                long resultado = factorial(n + r - 1) / (factorial(r) * factorial(n - 1));
                System.out.println("Resultado: " + resultado);
                
            } else if (opcion == 5) {
                // VR(n,r) = n^r
                System.out.print("n (total): ");
                int n = sc.nextInt();
                System.out.print("r (tomar): ");
                int r = sc.nextInt();
                
                long resultado = 1;
                for (int i = 0; i < r; i++) {
                    resultado = resultado * n;
                }
                System.out.println("Resultado: " + resultado);
                
            } else if (opcion == 6) {
                System.out.println("\n--- EXPLICACIONES ---");
                System.out.println("1. Combinaciones (C): No importa el orden, no se repite");
                System.out.println("   Ejemplo: Elegir 2 de 5 personas = 10 formas");
                System.out.println("2. Variaciones (V): Sí importa el orden, no se repite");
                System.out.println("   Ejemplo: Dar oro y plata a 6 atletas = 30 formas");
                System.out.println("3. Permutaciones (P): Ordenar todos los elementos");
                System.out.println("   Ejemplo: Ordenar 4 libros = 24 formas");
                System.out.println("4. Combinaciones con repetición (CR): No importa orden, se repite");
                System.out.println("   Ejemplo: Elegir 3 caramelos de 5 sabores = 35 formas");
                System.out.println("5. Variaciones con repetición (VR): Sí importa orden, se repite");
                System.out.println("   Ejemplo: Números de 3 cifras con {1,2,5,8} = 64");
                
            } else if (opcion != 0) {
                System.out.println("Opción no válida");
            }
            
        } while (opcion != 0);
        
        sc.close();
        System.out.println("Fin del programa");
    }
}
