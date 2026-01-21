//numeros entre 500 uy 0 que sean múltiplos de 11 y 7



public class Multiplos_11y7 {
    public static void main(String[] args) {
        System.out.println("Números entre 500 y 0 que son múltiplos de 11 y 7:");
        for (int i = 500; i >= 0; i--) {
            if (i % 11 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
