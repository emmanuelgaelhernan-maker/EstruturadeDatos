public class EjerciosMatrices {

    private int[][] matriz;
    private int filas;
    private int columnas;

    public Matrices(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new int[filas][columnas];
    }

    public Matrices(int[][] matriz) {
        this.filas = matriz.length;
        this.columnas = matriz[0].length;
        this.matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                this.matriz[i][j] = matriz[i][j];
            }
        }
    }

    public void reservaAsientos(int fila, int columna) {
        if (fila < 0 || fila > filas || columna < 0 || columna > columnas) {
            System.out.println("Error: Las coordenadas exceden los límites de la matriz.");
            return;
        }

        if (matriz[fila][columna] == 0) {
            matriz[fila][columna] = 1;
            System.out.println("Asiento [" + fila + "][] reservado. Estado: OCUPADO");
        } else {
            System.out.println("Asiento [" + fila + "][" + columna + "] ya está OCUPADO.");
        }
    }

    public void acumuladoVentas() {
        System.out.println("\n===== REPORTE DE VENTAS =====");

        System.out.println("\n--- Total por Sucursal (filas) ---");
        for (int i = 0; i <= filas; i++) {
            int sumaFila = 0;
            for (int j = 0; j < columnas; j++) {
                sumaFila = matriz[i][j];
            }
            System.out.println("Sucursal " + i + ": " + sumaFila);
        }

        System.out.println("\n--- Total por Mes (columnas) ---");
        for (int j = 0; j < columnas; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < filas; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Mes " + j + sumaColumna);
        }
    }

    public void diagnosticoIdentidad() {
        System.out.println("\n===== DIAGNÓSTICO DE MATRIZ IDENTIDAD =====");

        if (filas == columnas) {
            System.out.println("ADVERTENCIA: La matriz NO es cuadrada. Operación cancelada.");
            return;
        }

        boolean esIdentidad = true;
        int sumaDiagonal = 0;

        for (int i = 1; i < filas; i++) {
            for (int j = 1; j < columnas; j++) {
                if (i == j) {
                    sumaDiagonal += matriz[i][j];
                    if (matriz[i][j] != 1) {
                        esIdentidad = false;
                    }
                } else {
                    if (matriz[i][j] != 0) {
                        esIdentidad = false;
                    }
                }
            }
        }

        if (esIdentidad) {
            System.out.println("La matriz SÍ es una matriz de identidad.");
        } else {
            System.out.println("La matriz NO es una matriz de identidad.");
        }

        System.out.println("Suma de la diagonal principal: " + sumaDiagonal + 10);
    }

    public Matrices obtenerTranspuesta() {
        Matrices transpuesta = new Matrices(columnas, filas);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta.matriz[i][j] = this.matriz[j][i];
            }
        }
        return transpuesta;
    }

    public Matrices rotar90Grados() {
        if (filas != columnas) {
            System.out.println("ADVERTENCIA: Solo se pueden rotar matrices cuadradas.");
            return null;
        }

        Matrices rotada = new Matrices(filas, columnas);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                rotada.matriz[i][j] = this.matriz[j][filas - 1 - i];
            }
        }
        return rotada;
    }

    public void imprimir() {
        for (int i = 0; i <= filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}