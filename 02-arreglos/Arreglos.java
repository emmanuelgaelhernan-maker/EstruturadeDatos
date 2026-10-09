public class Arreglos {

    private int[] vector;

    public Arreglos() {
        vector = new int[2];
    }

    public Arreglos(int tamanio) {
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

public class testVectores {
    public static void main(String[] args){
        VectorEntero v1=new VectorEntero();
        VectorEntero v2=new VectorEntero(4);

    }
}
package mx.edu.uttt.tda.vectores;

import javax.swing.*;

public class TestEmpleado {

    private static Empleado empt;

    public static void main(String[] args) {
        iniciar();
        imprimir();
    }

    public static void iniciar() {

        String numeroNomina = Solicitartexto(
                "numero de nomina");

        String nombre = Solicitartexto(
                "nombre completo");

        empt = new Empleado(
                numeroNomina,
                nombre,
                "Masculino",
                4000.0,
                true
        );
    }

    public static String Solicitartexto(String valor) {
        return JOptionPane.showInputDialog(
                "Introducir el " + valor
        );
    }

    public static void imprimir() {

        String saldo = "Datos del empleado:\n" +
                empt.toString() +
                "\nNumero de objetos creados: " +
                Empleado.getContadorEmpleados();

        JOptionPane.showMessageDialog(null, saldo);
    }
}
import javax.swing.JOptionPane;
public class Menu {
    public static String MenuPrincipal() {
        String opciones = "Estructura\n\n" +
                "1) arreglos\n" +
                "2) Listas\n" +
                "3) filas\n" +
                "4) colas\n" +
                "5) arboles\n" +
                "6) Salir\n" +
                "Selecciona una opcion: ";
        return JOptionPane.showInputDialog(opciones);
    }

    public static String arreglos() {
        String opciones = "Arreglos\n\n" +
                "1) vectores\n" +
                "2) matrices\n" +
                "3) regresar\n" +
                "Selecciona una opcion: ";
        return JOptionPane.showInputDialog(opciones);
    }

    public static String MenuVectores() {
        String opciones = "Vectores\n\n" +
                "1) Sumar elemento\n" +
                "2) Llenar vectores\n" +
                "3) Imprimir\n" +
                "4) Regresar\n" +
                "Selecciona una opcion: ";
        return JOptionPane.showInputDialog(opciones);
    }

    public static String MenuMatriz() {
        String opciones = "Matriz\n\n" +
                "1) Reservar asiento\n" +
                "2) Acumulado de ventas\n" +
                "3) Matriz identidad\n" +
                "4) Diagonal principal\n" +
                "5) Transposición\n" +
                "6) Regresar\n" +
                "Selecciona una opcion: ";
        return JOptionPane.showInputDialog(opciones);
    }

    public static String MenuListas() {
        String opciones = "Listas\n\n" +
                "1) Agregar elemento\n" +
                "2) Eliminar elemento\n" +
                "3) Buscar elemento\n" +
                "4) Imprimir lista\n" +
                "5) Regresar\n" +
                "Selecciona una opcion: ";
        return JOptionPane.showInputDialog(opciones);
    }

    public static String MenuFilas() {
        String opciones = "Filas\n\n" +
                "1) Agregar elemento\n" +
                "2) Eliminar elemento\n" +
                "3) Mostrar fila\n" +
                "4) Regresar\n" +
                "Selecciona una opcion: ";
        return JOptionPane.showInputDialog(opciones);
    }

    public static String MenuColas() {
        String opciones = "Colas\n\n" +
                "1) Insertar elemento\n" +
                "2) Eliminar elemento\n" +
                "3) Mostrar cola\n" +
                "4) Regresar\n" +
                "Selecciona una opcion: ";
        return JOptionPane.showInputDialog(opciones);
    }

    public static String MenuArboles() {
        String opciones = "Arboles\n\n" +
                "1) Insertar nodo\n" +
                "2) Eliminar nodo\n" +
                "3) Buscar nodo\n" +
                "4) Recorrido\n" +
                "5) Regresar\n" +
                "Selecciona una opcion: ";
        return JOptionPane.showInputDialog(opciones);
    }
  }

