
import javax.swing.*;

public class ArreglosMenu {

    private static int[] objVec;

    private static void inicializar() {
        int tamaño = 0;
        do {
            try {
                tamaño = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Introduce el tamaño del arreglo"));
                if (tamaño > 0) {
                    objVec = new int[tamaño];
                    return;
                } else {
                    JOptionPane.showMessageDialog(null, "El tamaño debe ser mayor a 0");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "El tamaño debe ser un número");
            }
        } while (true);
    }

    public static void mostrar() {
        String opcion;
        do {
            opcion = Menu.arreglos();
            switch (opcion) {
                case "1":
                    menuvectores();
                    break;
                case "2":
                    menuMatrizes();
                    break;
                case "0":
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (true);
    }

    public static int[] obtenervector() {
        if (objVec == null) {
            inicializar();
        }
        llenarVector(objVec);
        return objVec;
    }

    public static void llenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            do {
                try {
                    int valor = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Introduce el valor " + (i + 1)));
                    vector[i] = valor;
                    break;
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Debe ser un número");
                }
            } while (true);
        }
    }

    public static void menuvectores() {
        String opcion;
        inicializar();
        do {
            opcion = Menu.MenuVectores();
            switch (opcion) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Sumar elementos");

                    break;
                case "2":
                    obtenervector();
                    break;
                case "3":
                    if (objVec != null) {
                        StringBuilder sb = new StringBuilder("Contenido del vector:\n");
                        for (int i = 0; i < objVec.length; i++) {
                            sb.append("[").append(i).append("] = ").append(objVec[i]).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sb.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "El vector no está inicializado");
                    }
                    break;
                case "0":
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (true);
    }

    public static void menuMatrizes() {
        String opcion;
        do {
            opcion = Menu.arreglos();
            if (opcion.equals("0")) {
                return;
            }
        } while (true);
    }
}