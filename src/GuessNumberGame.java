import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        // Generar número aleatorio
        Random rand = new Random();
        int numberToGuess = rand.nextInt(9) + 1; // Número entre 1 y 9

        // Crear matriz para mostrar al usuario
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Iniciar tiempo limite para el juego
        long startTime = System.currentTimeMillis();
        long endTime = startTime + (15 * 1000); // 60 segundos

        // Iniciar contador de intentos
        int attempts = 0;

        // Iniciar bucle de juego
        Scanner sc = new Scanner(System.in);
        while (System.currentTimeMillis() < endTime) {
            // Mostrar matriz al usuario
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            // Pedir entrada del usuario
            System.out.print("Elije un número de la matriz: ");
            int userGuess = sc.nextInt();

            // Verificar si el usuario adivinó el número
            if (userGuess == numberToGuess) {
                System.out.println("¡Felicidades, has adivinado el número!");
                System.out.println("Número de intentos: " + attempts);
                break;
            } else {
                // Dar pista al usuario
                if (userGuess < numberToGuess) {
                    System.out.println("El número es más grande.");
                } else {
                    System.out.println("El número es más pequeño.");
                }
                attempts++;
            }
        }

        // Verificar si el usuario ganó o perdió
        if (System.currentTimeMillis() >= endTime) {
            System.out.println("¡Lo siento, se te acabó el tiempo!");
            System.out.println("El número correcto era: " + numberToGuess);
        }
    }
}