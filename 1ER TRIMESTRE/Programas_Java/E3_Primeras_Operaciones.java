import java.util.Scanner;

/************************************************************************       
 * E3_Primeras_Operaciones.java
 * Este programa realiza varias operaciones matemáticas básicas.
 * Autor: Diego Ramos Fernández
 * Fecha: 19/09/2025
 * Curso: 1º DAM
 ************************************************************************/


public class  E3_Primeras_Operaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pido los valores de a y b
        System.out.print("Por favor, introduce el valor de a: ");
        int a = scanner.nextInt();
        System.out.print("Por favor, introduce el valor de b: ");
        int b = scanner.nextInt();
        int suma = a + b; // Suma
        int resta = a - b; // Resta
        int multiplicacion = a * b; // Multiplicación
        int division = a / b; // División entera
        int modulo = a % b; // Operador módulo
        //Mostrar resultados
        System.out.println("Suma: " + suma); // Suma
        System.out.println("Resta: " + resta); // Resta
        System.out.println("Multiplicación: " + multiplicacion); // Multiplicación
        System.out.println("División: " + division); // División entera
        System.out.println("Módulo: " + modulo); // Módulo
        
        a++; // Incremento
        b--; // Decremento 
        int sumaPost = a + b; // Suma después del incremento/decremento
        System.out.println("Suma después del incremento/decremento: " + sumaPost);
        //Pido los valores de c, d, e y f
        System.out.print("Por favor, introduce el valor de c: ");
        int c = scanner.nextInt();
        System.out.print("Por favor, introduce el valor de d: ");
        int d = scanner.nextInt();
        System.out.print("Por favor, introduce el valor de e: ");
        int e = scanner.nextInt();
        System.out.print("Por favor, introduce el valor de f: ");
        int f = scanner.nextInt();
        //Calculo la media de c, d, e y f
        double media = (c + d + e + f) / 4.0;
        System.out.println("La media de " + c + ", " + d + ", " + e + " y " + f + " es: " + media);
        //Calcular el area de un cuadrado
        //Pido el valor del lado
        System.out.print("Por favor, introduce el valor del lado del cuadrado: ");
        int lado = scanner.nextInt();
        int areaCuadrado = lado * lado;
        System.out.println("El área de un cuadrado con lado " + lado + " es: " + areaCuadrado);
        //Calcular el area de un triangulo
        //Pido el valor de la base y la altura
        System.out.print("Por favor, introduce el valor de la base del triángulo: ");
        int base = scanner.nextInt();
        System.out.print("Por favor, introduce el valor de la altura del triángulo: ");
        int altura = scanner.nextInt();
        double areaTriangulo = (base * altura) / 2.0;
        System.out.println("El área de un triángulo con base " + base + " y altura " + altura + " es: " + areaTriangulo);
        
        //Si divido 23 entre 7, ¿cuál es el resultado, cociente y  el resto?
        //Pido los valores de dividendo y divisor
        System.out.print("Por favor, introduce el valor del dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.print("Por favor, introduce el valor del divisor: ");
        int divisor = scanner.nextInt();
        int cociente = dividendo / divisor;
        int resto = dividendo % divisor;
        double resultado = (double) dividendo / divisor; // Resultado de la división entera
        System.out.println("Dividiendo " + dividendo + " entre " + divisor + ":");
        System.out.println("Cociente: " + cociente);
        System.out.println("Resto: " + resto);
        System.out.println("Resultado: " + resultado);  
        //Ax +B=0
        System.out.print("Por favor, introduce el valor de A: ");
        int coeficienteA = scanner.nextInt();
        System.out.print("Por favor, introduce el valor de B: ");
        int coeficienteB = scanner.nextInt();
        //Resolviendo la ecuación
        double solucion = (double) -coeficienteB / coeficienteA;
        System.out.println("La solución de la ecuación " + coeficienteA + "x + " + coeficienteB + " = 0 es: " + solucion);

        //como elevar un numero a 7
        System.out.print("Por favor, introduce el valor del número a elevar: ");
        int numero = scanner.nextInt();
        int resultadoElevado = (int) Math.pow(numero, 7);
        System.out.println("El resultado de " + numero + " elevado a 7 es: " + resultadoElevado);

        //Volumen de una esfera
        System.out.print("Por favor, introduce el valor del radio de la esfera: ");
        double radio = scanner.nextDouble();
        double volumenEsfera = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        System.out.println("El volumen de una esfera con radio " + radio + " es: " + volumenEsfera);
        //Cierro el scanner
        scanner.close();

    }
}
