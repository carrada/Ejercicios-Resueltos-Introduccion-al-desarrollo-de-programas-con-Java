
// 11.  Escribir un programa para que jueguen disparejos entre tres jugadores; uno de ellos es la computadora. 
//El juego consiste en que cada jugador lanza su moneda al aire y gana el jugador cuya cara visible de la moneda 
//sea distinta de la cara visible de cada una de las otras dos monedas.

import java.util.Scanner;
import java.util.Random;

public class Disparejos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 0 = Águila, 1 = Sol
        System.out.print("Jugador 1, elige (0 = Águila, 1 = Sol): ");
        int jugador1 = scanner.nextInt();

        System.out.print("Jugador 2, elige (0 = Águila, 1 = Sol): ");
        int jugador2 = scanner.nextInt();

        int computadora = random.nextInt(2);
        System.out.println("La computadora eligió: " + (computadora == 0 ? "Águila" : "Sol"));

        // Determinar el ganador
        if (jugador1 != jugador2 && jugador1 != computadora && jugador2 == computadora) {
            System.out.println("¡Gana el Jugador 1!");
        } else if (jugador2 != jugador1 && jugador2 != computadora && jugador1 == computadora) {
            System.out.println("¡Gana el Jugador 2!");
        } else if (computadora != jugador1 && computadora != jugador2 && jugador1 == jugador2) {
            System.out.println("¡Gana la Computadora!");
        } else {
            System.out.println("¡Nadie gana esta ronda!");
        }
    }
}