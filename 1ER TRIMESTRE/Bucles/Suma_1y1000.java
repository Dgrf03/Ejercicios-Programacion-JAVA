//sumar todos los números del 1 al 1000
public class Suma_1y1000 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 1000; i++) {
            suma += i;
        }
        System.out.println("La suma de los números del 1 al 1000 es: " + suma);
    }

}
