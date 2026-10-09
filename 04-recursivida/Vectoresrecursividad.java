public class Vectoresrecursividad {
    public static void main (String [] args){
        int [] vector = {10,20,30,40,50};
        //metodo de interatarivo
        imprimirCiclo1(vector);
        imprimirCiclo2(vector);
        imprimirRecursivo1(0,vector);
        imprimirRecursivo2(vector.length-1,vector);

    }
    public static void imprimirCiclo1(int[] cilclo1) {
        for (int i = 0; i < cilclo1.length; i++) {
            System.out.println(cilclo1[i] + "|");
        }
    }
    public static void imprimirCiclo2(int [] cilco2){
        for (int i = 0; i < cilco2.length ; i --){
            System.out.println(cilco2[i] + "|");
        }
    }
    public static void imprimirRecursivo1(int posion, int[] vector) {
        if (posion == vector.length) {
            return;
        }
        System.out.println(vector[posion] + "|");
        imprimirRecursivo1(posion + 1, vector);
    }
    public static void imprimirRecursivo2(int posion, int[] vector) {
        if (posion < 0) {
            return;
        }
        System.out.println(vector[posion] + "|");
        imprimirRecursivo2(posion - 1, vector);
    }
}