import java.util.Scanner;

public class E108_Factura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double baseImponible = 0;
        double totalIVA = 0;
        int numeroLinea = 1;
        char continuar;

        System.out.println("*** CREAR FACTURA ***\n");

        do {
            System.out.println("--- Línea " + numeroLinea + " ---");

            String producto = pedirNombreProducto(sc);
            int cantidad = pedirCantidad(sc);
            double precio = pedirPrecioUnidad(sc);
            int tipoIVA = pedirTipoIVA(sc);

            double subtotal = calcularSubtotal(cantidad, precio);
            double iva = calcularIVA(subtotal, tipoIVA);
            double totalLinea = subtotal + iva;

            mostrarLinea(producto, cantidad, precio, subtotal, iva, totalLinea);

            baseImponible += subtotal;
            totalIVA += iva;

            continuar = pedirContinuar(sc);
            numeroLinea++;

        } while (continuar == 's' || continuar == 'S');

        double importeTotal = baseImponible + totalIVA;
        mostrarFactura(baseImponible, totalIVA, importeTotal);

        sc.close();
    }

    // Funciones auxiliares

    static String pedirNombreProducto(Scanner sc) {
        System.out.print("Nombre del producto: ");
        return sc.nextLine();
    }

    static int pedirCantidad(Scanner sc) {
        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();
        sc.nextLine(); 
        return cantidad;
    }

    static double pedirPrecioUnidad(Scanner sc) {
        System.out.print("Precio unitario: ");
        double precio = sc.nextDouble();
        sc.nextLine(); 
        return precio;
    }

    static int pedirTipoIVA(Scanner sc) {
        System.out.println("Tipo de IVA:");
        System.out.println("1. Normal (21%)");
        System.out.println("2. Reducido (10%)");
        System.out.println("3. Superreducido (4%)");
        System.out.print("Elige opción: ");
        int tipo = sc.nextInt();
        sc.nextLine();
        return tipo;
    }

    static double calcularSubtotal(int cantidad, double precio) {
        return cantidad * precio;
    }

    static double calcularIVA(double subtotal, int tipoIVA) {
        if (tipoIVA == 1) {
            return subtotal * 0.21;
        } else if (tipoIVA == 2) {
            return subtotal * 0.10;
        } else if (tipoIVA == 3) {
            return subtotal * 0.04;
        } else {
            return 0;
        }
    }

    static void mostrarLinea(String producto, int cantidad, double precio, double subtotal, double iva, double totalLinea) {
        System.out.println("\nLínea añadida:");
        System.out.println(producto + " | Cantidad: " + cantidad + " | Precio: " + precio + " $");
        System.out.println("Subtotal: " + subtotal + " $ | IVA: " + iva + " $ | Total: " + totalLinea + " $\n");
    }

    static char pedirContinuar(Scanner sc) {
        System.out.print("¿Quieres añadir otra línea? (s/n): ");
        char resp = sc.next().charAt(0);
        sc.nextLine(); // Limpia salto de línea pendiente
        System.out.println();
        return resp;
    }

    static void mostrarFactura(double base, double iva, double total) {
        System.out.println("\n========================================");
        System.out.println("           FACTURA FINAL");
        System.out.println("========================================");
        System.out.println("Base imponible (sin IVA): " + base + " $");
        System.out.println("IVA total: " + iva + " $");
        System.out.println("----------------------------------------");
        System.out.println("IMPORTE TOTAL: " + total + " $");
        System.out.println("========================================");
    }
}
