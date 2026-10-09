public class Recursividad {

    public static void saludo1(int n) {
        if (n == 1) {
            System.out.println("hola mundo ");
        } else {
            System.out.println("hola mundo" + n);
            saludo1(n - 1);
        }
    }

    public static void saludo2(int n) {
        if (n != 1) {
            System.out.println("Hola saludo" + n);
            saludo2(n - 1);
        } else {
            System.out.println("hola saludo" + n);
        }
    }

    public static void saludo3(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("hola saludo" + n);
        saludo3(n - 1);
    }
}

