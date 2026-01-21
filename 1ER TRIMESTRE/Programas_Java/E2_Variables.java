import java.util.Scanner;

public class  E2_Variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pido que me introduzca un numero entero
        System.out.print("Por favor, introduce un número entero: ");
        int numero = scanner.nextInt();
        System.out.println("El número introducido es: " + numero);
        
        System.out.println("El número introducido más 2 es: " + (numero + 2));
        //Pido que me itroduzca el valor de una variable byte, short, long, double, float, boolean, char y String
        System.out.print("Por favor, introduce un valor para la variable byte 1: ");
        byte b1 = scanner.nextByte();
        System.out.print("Por favor, introduce un valor para la variable byte 2: ");
        byte b2 = scanner.nextByte();
        System.out.print("Por favor, introduce un valor para la variable byte 3: ");
        byte b3 = scanner.nextByte();   
        System.out.println(b1);
        System.out.println(b2); 
        System.out.println(b3);
        System.out.print("Por favor, introduce un valor para la variable short 1: ");
        short s1 = scanner.nextShort();
        System.out.print("Por favor, introduce un valor para la variable short 2: ");
        short s2 = scanner.nextShort();
        System.out.println(s1);
        System.out.println(s2);
        System.out.print("Por favor, introduce un valor para la variable long 1: ");
        long l1 = scanner.nextLong();
        System.out.print("Por favor, introduce un valor para la variable long 2: ");
        long l2 = scanner.nextLong();
        System.out.println(l1);
        System.out.println(l2);
        System.out.print("Por favor, introduce un valor para la variable double 1: ");
        double d1 = scanner.nextDouble();
        System.out.print("Por favor, introduce un valor para la variable double 2: ");
        double d2 = scanner.nextDouble();
        double d3 = 2.5e3; // 2.5 por 10 a la 3
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.print("Por favor, introduce un valor para la variable float 1: ");
        float f1 = scanner.nextFloat();
        System.out.println(f1);
        System.out.print("Por favor, introduce un valor para la variable boolean 1: ");
        boolean bool1 = scanner.nextBoolean();
        System.out.print("Por favor, introduce un valor para la variable boolean 2: ");
        boolean bool2 = scanner.nextBoolean();
        System.out.println(bool1);
        System.out.println(bool2);
        System.out.print("Por favor, introduce un valor para la variable char 1: ");
        char c1 = scanner.next().charAt(0);
        System.out.print("Por favor, introduce un valor para la variable char 2: ");
        char c2 = scanner.next().charAt(0);
        System.out.println(c1);
        System.out.println(c2);
        System.out.print("Por favor, introduce un valor para la variable String 1: ");
        String str1 = scanner.next();
        System.out.print("Por favor, introduce un valor para la variable String 2: ");
        String str2 = scanner.next();
        System.out.println(str1);
        System.out.println(str2);
        //Cierro el scanner
        scanner.close();
        System.out.println("Me gusta el bocata de tortilla de patata con jamón serrano.");
    }
}
