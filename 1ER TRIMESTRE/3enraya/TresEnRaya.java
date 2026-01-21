import java.util.Scanner;

public class TresEnRaya {
    // Símbolos de los jugadores
    private final char JUGADOR1 = 'X';
    private final char JUGADOR2 = 'O';
    private final char VACIO = '-';
    
    // Tablero del juego
    private char[][] tablero;
    // true = JUGADOR1, false = JUGADOR2
    private boolean turno;
    
    // Constructor
    public TresEnRaya() {
        tablero = new char[3][3];
        inicializarTablero();
        turno = true; // Empieza el jugador 1
    }
    
    // Inicializa el tablero vacío
    private void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = VACIO;
            }
        }
    }
    
    // Muestra el tablero en consola
    public void mostrarTablero() {
        System.out.println("\n  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Coloca una ficha en el tablero
    public boolean colocarFicha(int fila, int columna) {
        // Verifica que la posición sea válida
        if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
            System.out.println("Posición fuera del tablero");
            return false;
        }
        
        // Verifica que la casilla esté vacía
        if (tablero[fila][columna] != VACIO) {
            System.out.println("Casilla ocupada");
            return false;
        }
        
        // Coloca la ficha del jugador actual
        char jugador = turno ? JUGADOR1 : JUGADOR2;
        tablero[fila][columna] = jugador;
        return true;
    }
    
    // Verifica si hay un ganador
    public boolean hayGanador() {
        char jugador = turno ? JUGADOR1 : JUGADOR2;
        
        // Verifica filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && 
                tablero[i][1] == jugador && 
                tablero[i][2] == jugador) {
                return true;
            }
        }
        
        // Verifica columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == jugador && 
                tablero[1][j] == jugador && 
                tablero[2][j] == jugador) {
                return true;
            }
        }
        
        // Verifica diagonal principal
        if (tablero[0][0] == jugador && 
            tablero[1][1] == jugador && 
            tablero[2][2] == jugador) {
            return true;
        }
        
        // Verifica diagonal secundaria
        if (tablero[0][2] == jugador && 
            tablero[1][1] == jugador && 
            tablero[2][0] == jugador) {
            return true;
        }
        
        return false;
    }
    
    // Verifica si hay empate
    public boolean hayEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == VACIO) {
                    return false;
                }
            }
        }
        return true;
    }
    
    // Cambia el turno
    public void cambiarTurno() {
        turno = !turno;
    }
    
    // Devuelve el jugador actual
    public char getJugadorActual() {
        return turno ? JUGADOR1 : JUGADOR2;
    }
    
    // Método principal para jugar
    public void jugar() {
        Scanner sc = new Scanner(System.in);
        boolean juegoTerminado = false;
        
        System.out.println("=== JUEGO DE 3 EN RAYA ===");
        System.out.println("Jugador 1: X");
        System.out.println("Jugador 2: O");
        
        while (!juegoTerminado) {
            mostrarTablero();
            System.out.println("Turno del jugador: " + getJugadorActual());
            System.out.print("Introduce fila (1-3): ");
            int fila = sc.nextInt() - 1;
            System.out.print("Introduce columna (1-3): ");
            int columna = sc.nextInt() - 1;
            
            // Intenta colocar la ficha
            if (colocarFicha(fila, columna)) {
                // Verifica si hay ganador
                if (hayGanador()) {
                    mostrarTablero();
                    System.out.println("¡El jugador " + getJugadorActual() + " ha ganado!");
                    juegoTerminado = true;
                }
                // Verifica si hay empate
                else if (hayEmpate()) {
                    mostrarTablero();
                    System.out.println("¡Empate!");
                    juegoTerminado = true;
                }
                // Si no, cambia de turno
                else {
                    cambiarTurno();
                }
            }
        }
        
        sc.close();
    }
    
    // Método main para ejecutar el juego
    public static void main(String[] args) {
        TresEnRaya juego = new TresEnRaya();
        juego.jugar();
    }
}
