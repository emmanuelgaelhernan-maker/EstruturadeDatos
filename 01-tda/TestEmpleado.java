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