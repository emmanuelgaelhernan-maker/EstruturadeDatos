public class Matrices {

    private int[][] m;

    public Matrices() {
        m = new int[2][2];
    }

    public Matrices(int fila, int columna) {
        if (validar(fila, columna)) {
            this.m = new int[fila][columna];
        } else {
            this.m = new int[2][2];
        }
    }

    private boolean validar(int fila, int columna) {
        boolean valido = true;

        if (fila <= 0 || columna <= 0) {
            valido = false;
        }

        return valido;
    }

    private boolean validarTamanios(int[][] m) {
        return this.m.length == m.length &&
                this.m[0].length == m[0].length;
    }

    public void llenar(int[][] m) {
        if (validarTamanios(m)) {

            for (int i = 0; i < this.m.length; i++) {
                for (int j = 0; j < this.m[0].length; j++) {
                    this.m[i][j] = m[i][j];
                }
            }

        } else {
            System.out.println("Las matrices no son del mismo tamaño");
        }
    }

    public void imprimir() {
        for (int fila[] : this.m) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public String obtenerTamanio() {
        return "Tamaño: (" + this.m.length + "," +
                this.m[0].length + ")";
    }

    public Matrices obtenerTranspuesta() {

        Matrices objMatriz = null;

        if (validarCuadrada()) {

            int[][] transpuesta =
                    new int[this.m.length][this.m.length];

            for (int i = 0; i < this.m.length; i++) {
                for (int j = 0; j < this.m[0].length; j++) {
                    transpuesta[j][i] = this.m[i][j];
                }
            }

            objMatriz = new Matrices(
                    this.m.length,
                    this.m[0].length
            );

            objMatriz.llenar(transpuesta);

        } else {
            System.out.println(
                    "Advertencia: la matriz no es cuadrada"
            );
        }

        return objMatriz;
    }

    private boolean validarCuadrada() {
        /*
         * En una matriz bidimensional:
         *
         * m.length -> número de filas
         * m[0].length -> número de columnas
         */

        return m.length == m[0].length;
    }
}







