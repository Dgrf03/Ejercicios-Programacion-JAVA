/************************************************************************       
 * BucleWhile.java
 * Programa que cuenta del 10000 al 1 y sacar los múltiplos de 7.
 * Autor: Diego Ramos Fernández
 * Fecha: 07/10/2025
 * Curso: 1º DAM
 ************************************************************************/
public class BucleWhile {
    public static void main(String[] args) {
        int contador = 10000; // Inicialización del contador , aqui se pone desde donde quieres que empiece a contar

        while (contador >= 1) { // Condición del bucle, aqui se pone hasta donde quieres que cuente
            if (contador % 7 == 0) { // Comprobar si es múltiplo de 7
                System.out.print(contador + ", "); // Imprimir el valor del contador
            }
            contador--; // Decrementar el contador en 1, para incrementar se usa "contador++"
        }
    }
}