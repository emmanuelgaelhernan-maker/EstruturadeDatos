
import javax.swing.*;

public class App {
    public static void main(String[] args) {
        inciar();
    }

    //iniciar


    private static void inciar() {

        String opcion;
        do {
            opcion= Menu.MenuPrincipal();
            switch (opcion){
            case "1":
                 JOptionPane.showMessageDialog(null, "ArreglosMenu");
             break;
        case "2":
             JOptionPane.showMessageDialog(null,"Listas");
             break;
        case "3":
             JOptionPane.showMessageDialog(null,
                     " filas");
        case "4":
             JOptionPane.showMessageDialog(null,"colas");
             break;
        case "5":
            JOptionPane.showMessageDialog(null,"Arboles");
             break;
                case "6":
            JOptionPane.showMessageDialog(null,"Recursividad");
                case "7":
                    JOptionPane.showMessageDialog(null,"Salir");
                    break;
        case "0":
             return;
        default :
                  JOptionPane.showMessageDialog(null,"opcion no validad");
        }
    }while(true);
        }
}
