/************************************************************************       
 * EJ134_Matriz_3x365.java
 * Este programa define usando funciones una matriz de 3 filas y 365 columnas qu contenga valores de 3 termómetros de hornos de azulejera de entre 700 y 900 grados durante 365 dias, luego calcula la media para cada horno y el máximo y mínimo de temperatura durante el año de cada horno, la media del horno 1 entresemana y en findesemana, y decir si la media de febrero es mayor a la de mayo.
 * Autor: Diego Ramos Fernández
 * Fecha: 13/11/2025
 * Curso: 1º DAM
 ************************************************************************/
public class EJ134_Matriz_3x365 {
    public static void main(String[] args) {
        final int HORNOS = 3;
        final int DIAS = 365;

        int[][] temperaturas = new int[HORNOS][DIAS];
        inicializarMatriz(temperaturas);
        mostrarMatriz(temperaturas);
        compararFebreroMayo(temperaturas);
        int mediaH1 = mediaAnualHorno(temperaturas, 1);
        int mediaH2 = mediaAnualHorno(temperaturas, 2);
        int mediaH3 = mediaAnualHorno(temperaturas, 3);
        System.out.println("Media anual Horno 1: " + mediaH1);
        System.out.println("Media anual Horno 2: " + mediaH2);
        System.out.println("Media anual Horno 3: " + mediaH3);

        int mediaEntreSemanaH1 = mediaSemanaHorno(temperaturas, 1, 'E');
        int mediaFinDeSemanaH1 = mediaSemanaHorno(temperaturas, 1, 'F');
        System.out.println("Media entre semana Horno 1: " + mediaEntreSemanaH1);
        System.out.println("Media fin de semana Horno 1: " + mediaFinDeSemanaH1);

        int mediaEntreSemanaH2 = mediaSemanaHorno(temperaturas, 2, 'E');
        int mediaFinDeSemanaH2 = mediaSemanaHorno(temperaturas, 2, 'F');
        System.out.println("Media entre semana Horno 2: " + mediaEntreSemanaH2);
        System.out.println("Media fin de semana Horno 2: " + mediaFinDeSemanaH2);

        int mediaEntreSemanaH3 = mediaSemanaHorno(temperaturas, 3, 'E');
        int mediaFinDeSemanaH3 = mediaSemanaHorno(temperaturas, 3, 'F');
        System.out.println("Media entre semana Horno 3: " + mediaEntreSemanaH3);
        System.out.println("Media fin de semana Horno 3: " + mediaFinDeSemanaH3);
    }

    public static int mediaSemanaHorno( int[][] m, int f, char p){
        f--; // Me pasan el número de horno como 1, 2 y 3 no como 0, 1 y 2
        if (f >= m.length) return 0;
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < m[f].length; i++) {
            // Días entre semana: lunes (0) a viernes (4), sábado (5) y domingo (6)
            if (p == 'E' && (i % 7 != 5 && i % 7 != 6)) {
                suma += m[f][i];
                contador++;
            } else if (p == 'F' && (i % 7 == 5 || i % 7 == 6)) {
                suma += m[f][i];
                contador++;
            }
        }
        return (suma / contador);
    }


    public static int mediaAnualHorno(int[][] m, int f) {
        f--; // Me pasan el número de horno como 1, 2 y 3 no como 0, 1 y 2
        if (f >= m.length) return 0;
        int suma = 0;
        for (int i = 0; i < m[f].length; i++) {
            suma += m[f][i];
        }
        return (suma / m[f].length);
    }

    public static void inicializarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (Math.random() * 201 + 701);
            }
        }
    }

    public static void mostrarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print("Horno " + (i + 1) + ": ");
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void compararFebreroMayo(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int sumaFebrero = 0;
            int sumaMayo = 0;

            // Febrero: días 31 a 59 (28 días)
            for (int j = 31; j < 59; j++) {
                sumaFebrero += m[i][j];
            }
            double mediaFebrero = (double) sumaFebrero / 28;

            // Mayo: días 120 a 150 (31 días)
            for (int j = 120; j < 151; j++) {
                sumaMayo += m[i][j];
            }
            double mediaMayo = (double) sumaMayo / 31;

            if (mediaFebrero > mediaMayo) {
                System.out.println("La media de febrero del Horno " + (i + 1) + " es mayor que la de mayo.");
            } else if (mediaFebrero < mediaMayo) {
                System.out.println("La media de mayo del Horno " + (i + 1) + " es mayor que la de febrero.");
            } else {
                System.out.println("La media de febrero y mayo del Horno " + (i + 1) + " son iguales.");
            }
        }
    }
}

