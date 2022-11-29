import java.util.Scanner;

public class Asterisco_final {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero que usted desea: ");
        int n = teclado.nextInt();
        int a = 1;
        int b = 1;
        int acomulador = 1;
        String a1 = "*";
        String b1 = "*";
        int acomulador1 = 1;
        System.out.println("El total de la serie Asterisco es: ");
        while ( acomulador  <= n){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
            acomulador = acomulador + 1;
        }
        System.out.println("El total de la serie Asterisco es: ");
        while (acomulador1  <= n){
            System.out.println(a1);
            String c1 = a1 + b1;
            a1 = b1;
            b1 = c1;
            acomulador1 = acomulador + 1;
        }
    }
}