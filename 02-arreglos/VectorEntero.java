public class VectorEntero {

    private int[] vector;

    public VectorEntero() {
        vector = new int[2];
    }

    public VectorEntero(int tamanio) {
        if (validarTamanio(tamanio)) {
            vector = new int[tamanio];
        } else {
            vector = new int[2];
        }
    }

    public boolean validarTamanio(int tamanio) {
        return tamanio > 1;
    }

    public int obtenerTamanio() {
        return vector.length;
    }

    public int[] obtenerVector() {
        return vector;
    }

    private int[] copiarVector(int v) {
        int[] copiarVector = new int[this.obtenerTamanio()];
        int i = 0;

        for (int valor : this.vector) {
            copiarVector[i] = valor;
            i++;
        }

        return copiarVector;
    }

    // Regresa el número de pares
    public int contarPares() {
        int pares = 0;

        for (int valor : vector) {
            if (valor % 2 == 0) {
                pares++;
            }
        }

        return pares;
    }

    // Regresa el número de impares
    public int contarImpares() {
        int impares = 0;

        for (int valor : vector) {
            if (valor % 2 != 0) {
                impares++;
            }
        }

        return impares;
    }

    // Obtiene el número mayor del arreglo
    public int numeroMayor() {
        int mayor = vector[0];

        for (int valor : vector) {
            if (valor > mayor) {
                mayor = valor;
            }
        }

        return mayor;
    }

    // Suma los valores de dos vectores
    public int sumarVector(int[] vector) {
        int suma = 0;

        for (int valor : vector) {
            suma = suma + valor;
        }

        return suma;
    }

    // Suma dos vectores
    public int[] sumarVector2(int[] vector) {

        if (this.vector.length != vector.length) {
            return null;
        }

        int[] vectorsuma = new int[vector.length];

        for (int i = 0; i < vector.length; i++) {
            vectorsuma[i] = this.vector[i] + vector[i];
        }

        return vectorsuma;
    }

    // Agregar un valor al vector
    public void agregar(int posicion, int valor) {
        if (posicion >= 0 && posicion < vector.length) {
            vector[posicion] = valor;
        }
    }

    // Imprimir vector
    public String imprimir() {
        String resultado = "";

        for (int valor : vector) {
            resultado = resultado + valor + " ";
        }

        return resultado;
    }

    // Regresa un vector con los números pares
    public int[] mostrarPares() {

        int cantidad = contarPares();
        int[] pares = new int[cantidad];

        int posicion = 0;

        for (int valor : vector) {
            if (valor % 2 == 0) {
                pares[posicion] = valor;
                posicion++;
            }
        }

        return pares;
    }

    // Regresa un vector con los números impares
    public int[] mostrarImpares() {

        int cantidad = contarImpares();
        int[] impares = new int[cantidad];

        int posicion = 0;

        for (int valor : vector) {
            if (valor % 2 != 0) {
                impares[posicion] = valor;
                posicion++;
            }
        }

        return impares;
    }
}