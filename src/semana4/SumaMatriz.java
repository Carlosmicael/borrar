package semana4;

public class SumaMatriz {
    public static void main(String[] args) {
        int a[][]= {
                {1,2,3},
                {4,0,7},
                {1,6,5}
        };
        int b[][]= {
                {0,1,3},
                {9,3,7},
                {1,9,5}
        };
        int filas = a.length;
        int cols = a[0].length;
        int c[][] = new int[filas][cols];
        //suma de matrizes a + b = c
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols ; col++) {
                c[fila][col]=a[fila][col] + b[fila][col];
    }
}
        //mostrar los elementos de la matriz c
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols ; col++) {
                System.out.print(c[fila][col] + "\t");
            }
            System.out.println("\t");
        }
    }
}
