/*
 * Nombre del programa: EJ33Dia_Siguiente_Completo.java
 * Descripción: Igual que el anterior pero con los meses con los días correctos. Igual que en el anterior. no se pueden utilizar datos de tipo fecha ni funciones de la API, hay que hacer la lógica a mano. Usando switch y con años bisiestos.
 * Nombre: Diego Ramos Fernández
 * Fecha: 03/10/2025
 */ 
import java.util.Scanner;
public class EJ33Dia_Siguiente_Completo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el día, mes y año
        System.out.print("Ingrese el día (1-31): ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();

        // Validar la fecha ingresada
        boolean fechaValida = true;
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (dia < 1 || dia > 31) fechaValida = false;
                break;
            case 4: case 6: case 9: case 11:
                if (dia < 1 || dia > 30) fechaValida = false;
                break;
            case 2:
                boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
                if (esBisiesto && dia > 29) fechaValida = false;
                if (!esBisiesto && dia > 28) fechaValida = false;
                break;
            default:
                fechaValida = false;
        }

        if (!fechaValida) {
            System.out.println("Fecha incorrecta. Asegúrese de que el día y el mes sean válidos.");
        } else {
            // Calcular la fecha del día siguiente
            dia++;
            switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12:
                    if (dia > 31) {
                        dia = 1;
                        mes++;
                    }
                    break;
                case 4, 6, 9, 11:
                    if (dia > 30) {
                        dia = 1;
                        mes++;
                    }
                    break;
                case 2:
                    boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
                    if (esBisiesto && dia > 29) {
                        dia = 1;
                        mes++;
                    } else if (!esBisiesto && dia > 28) {
                        dia = 1;
                        mes++;
                    }
                    break;
            }
            if (mes > 12) {
                mes = 1;
                año++;
            }
            // Mostrar la fecha del día siguiente
            System.out.printf("La fecha del día siguiente es: %02d/%02d/%d%n", dia, mes, año);
        }
        scanner.close();
    }
}



