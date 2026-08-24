import java.util.Scanner;

public class numeroLimite_EX10 {

    public static String verificarLimite(int numero, int minimo, int maximo) {

        if (numero >= minimo && numero <= maximo) {
            return numero + " está nos limites";
        } else {
            return numero + " não está nos limites";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o limite mínimo: ");
        int minimo = sc.nextInt();

        System.out.print("Digite o limite máximo: ");
        int maximo = sc.nextInt();

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("\n" + verificarLimite(numero, minimo, maximo));

        sc.close();
    }
}