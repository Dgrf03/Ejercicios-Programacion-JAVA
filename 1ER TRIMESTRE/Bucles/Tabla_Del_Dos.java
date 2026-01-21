/************************************************************************       
 * Tabla_Del_Dos.java
 * Programa que imprime la tablas de multiplicar del dos hasta el número 10.
 * Autor: Diego Ramos Fernández
 * Fecha: 10/10/2025
 * Curso: 1º DAM
 ************************************************************************/
/*public class Tabla_Del_Dos {
    public static void main(String[] args) {
        int tabla = 2;
        for (int i = 0; i <= 20; i++)
        System.out.println( tabla + " x " + i +  " = " + (tabla * i));
    }
}
*/
/* 
//Que me lo pida por teclado
import java.util.Scanner;

public class Tabla_Del_Dos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Desde qué tabla quieres empezar? ");
        int inicio = sc.nextInt();

        System.out.print("¿Hasta qué tabla quieres mostrar? ");
        int fin = sc.nextInt();

        System.out.print("¿Hasta qué número multiplicar cada tabla? ");
        int limite = sc.nextInt();

        System.out.println("\n=== TABLAS DE MULTIPLICAR ===\n");

        // Encabezados
        for (int i = inicio; i <= fin; i++) {
            System.out.print("   Tabla del " + i + "\t");
        }
        System.out.println("\n");

        // Cuerpo de las tablas
        for (int j = 1; j <= limite; j++) {
            for (int i = inicio; i <= fin; i++) {
                int resultado = i * j;
                System.out.print(i + " x " + j + " = " + resultado + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
*/
import java.util.Scanner;

public class Tabla_Del_Dos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Desde qué tabla quieres empezar? ");
        int inicio = sc.nextInt();

        System.out.print("¿Hasta qué tabla quieres mostrar? ");
        int fin = sc.nextInt();

        System.out.print("¿Hasta qué número multiplicar cada tabla? ");
        int limite = sc.nextInt();

        System.out.println("\n=== TABLAS DE MULTIPLICAR EN MATRIZ ===\n");

        // Encabezado de columnas
        System.out.print("\t"); // espacio para la esquina superior izquierda
        for (int i = inicio; i <= fin; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        // Separador
        System.out.print("----");
        for (int i = inicio; i <= fin; i++) {
            System.out.print("--------");
        }
        System.out.println();

        // Filas de la matriz
        for (int j = 1; j <= limite; j++) {
            System.out.print(j + " |\t"); // encabezado de fila
            for (int i = inicio; i <= fin; i++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
