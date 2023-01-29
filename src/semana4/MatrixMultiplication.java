package semana4;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir el tamaño de las matrices a y b al usuario
        System.out.println("Ingresa el tamaño de la matriz a (filas y columnas) ");
        int fila_a = scanner.nextInt();
        int columna_a = scanner.nextInt();
        System.out.println("Ingresa el tamaño de la matriz b (filas y columnas) ");
        int fila_b = scanner.nextInt();
        int columna_b = scanner.nextInt();
        // Verificar si las matrices se pueden multiplicar (número de columnas de a debe ser igual al número de filas de b)
        if (columna_a != fila_b) {
            System.out.println("Las matrices no se pueden multiplicar");
            return;
        }

        // Crear las matrices a y b y rellenarlas con valores ingresados por el usuario
        int[][] a = new int[fila_a][columna_a];
        int[][] b = new int[fila_b][columna_b];
        System.out.println("Ingresa los valores de la matriz a:");
        for (int i = 0; i < fila_a; i++) {
            for (int j = 0; j < columna_a; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ingresa los valores de la matriz b:");
        for (int i = 0; i < fila_b; i++) {
            for (int j = 0; j < columna_b; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        // Crear la matriz resultado y multiplicar las matrices a y b
        int[][] result = new int[fila_a][columna_b];
        for (int i = 0; i < fila_a; i++) {
            for (int j = 0; j < columna_b; j++) {
                for (int k = 0; k < columna_a; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Imprimir la matriz resultado
        System.out.println("Resultado:");
        for (int i = 0; i < fila_a; i++) {
            for (int j = 0; j < columna_b; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
