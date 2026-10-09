
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

