public class imprimir{

public static  void imprimir(int n){
if (n== 0)
return;
System.out.println("Entrada " + n);
imprimir(n-1);
System.out.println("saliendo" + n);
 }

public static void main(String[] args){
imprimir (3);
}
}