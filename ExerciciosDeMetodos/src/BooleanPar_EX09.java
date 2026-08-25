import java.util.Scanner;

public class BooleanPar_EX09 {

    public static boolean verificarPar(int numero) {

        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite um número: ");
        int numero = sc.nextInt();

        System.out.println("\nÉ par? " + verificarPar(numero));

        sc.close();
    }
}