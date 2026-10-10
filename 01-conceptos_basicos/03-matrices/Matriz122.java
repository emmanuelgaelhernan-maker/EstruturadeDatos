
public class Matriz122 {

    public static void main(String[] args) {

        int[][] m = {
                {3, 3, 9},
                {3, 3, 10}
        };

        // Imprimir con for
        for (int row = 0; row < m.length; row++) {

            System.out.print("|");

            for (int columna = 0; columna < m[row].length; columna++) {

                System.out.print(m[row][columna] + "|");
            }

            System.out.println();
        }
    }
}