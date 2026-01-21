/************************************************************************       
 * Cuenta_Letras.java
 * Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0 al 9-9-9-9-9. Después añadirle una modificación para que en lugar de mostrar el número 3 lo cambie por la letra ‘E’. (5 bucles)
 * Autor: Diego Ramos Fernández
 * Fecha: 17/10/2025
 * Curso: 1º DAM
 ************************************************************************/
public class Contador5Num {
    public static void main(String[] args) {
        //int n1, n2, n3, n4, n5
       System.out.println("\nContador con '3' cambiado por 'E':");
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    for (int d = 0; d < 10; d++) {
                        for (int e = 0; e < 10; e++) {

                            // Mostramos cada número, cambiando el 3 por E con if
                            if (a == 3) {
                                System.out.print("E-");
                            } else {
                                System.out.print(a + "-");
                            }

                            if (b == 3) {
                                System.out.print("E-");
                            } else {
                                System.out.print(b + "-");
                            }

                            if (c == 3) {
                                System.out.print("E-");
                            } else {
                                System.out.print(c + "-");
                            }

                            if (d == 3) {
                                System.out.print("E-");
                            } else {
                                System.out.print(d + "-");
                            }

                            if (e == 3) {
                                System.out.print("E");
                            } else {
                                System.out.print(e);
                            }

                            System.out.println(); // Salto de línea
                        }
                    }
                }
            }
        }
    }
}