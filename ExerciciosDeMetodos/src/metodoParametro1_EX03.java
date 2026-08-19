import java.util.Scanner;

public class metodoParametro1_EX03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("\nInforme um valor: ");
        int valor = sc.nextInt();

        imprimirValores(valor);

        sc.close();
    }

        public static void imprimirValores(int numeros) {
            for (int i=0; i<20; i++) {
                System.out.printf(numeros + i + " ");

            }

    }
}