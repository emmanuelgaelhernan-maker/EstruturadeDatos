public class MatricesVectores {

    public static void imprimir(int[][] m) {

        int column = 0;
        int row = 0;

        while (row < m.length) {

            System.out.print("|");

            while (column < m[row].length) {

                System.out.print(m[row][column] + "|");

                column++;
            }

            System.out.println();

            row++;
            column = 0;
        }
    }
}