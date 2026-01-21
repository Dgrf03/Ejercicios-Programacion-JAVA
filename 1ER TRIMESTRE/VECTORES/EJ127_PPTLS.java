/************************************************************************       
 * EJ127_PPTLS.java
 * Este programa simula un juego de piedra, papel, tijera, lagarto o Spock.
 * Autor: Diego Ramos Fernández
 * Fecha: 03/11/2025
 * Curso: 1º DAM
 ************************************************************************/
public class EJ127_PPTLS {
    public static void main(String[] args) {
        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
        int jugador1 = (int)(Math.random() * 5);
        int jugador2 = (int)(Math.random() * 5);

        System.out.println("Jugador 1: " + opciones[jugador1]);
        System.out.println("Jugador 2: " + opciones[jugador2]);

        if (jugador1 == jugador2) {
            System.out.println("Empate!");
        } else if ((jugador1 == 0 && (jugador2 == 2 || jugador2 == 3)) || // Piedra gana a Tijera y Lagarto
                   (jugador1 == 1 && (jugador2 == 0 || jugador2 == 4)) || // Papel gana a Piedra y Spock
                   (jugador1 == 2 && (jugador2 == 1 || jugador2 == 3)) || // Tijera gana a Papel y Lagarto
                   (jugador1 == 3 && (jugador2 == 1 || jugador2 == 4)) || // Lagarto gana a Papel y Spock
                   (jugador1 == 4 && (jugador2 == 0 || jugador2 == 2))) { // Spock gana a Piedra y Tijera
            System.out.println("Jugador 1 gana!");
        } else {
            System.out.println("Jugador 2 gana!");
        }
    }
    
}
