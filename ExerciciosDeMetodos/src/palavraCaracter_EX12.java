import java.util.Scanner;

public class palavraCaracter_EX12 {

        public static String VerificarPalavra(String palavra) {

            if (palavra.length() % 2 == 0) {
                return palavra.substring(0, 1);
            } else {
                return palavra.substring(1, 2);
            }
        }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("\nDigite uma palavra: ");
        String palavra = sc.next();

        System.out.println("\nCaractere retornado: " + VerificarPalavra(palavra));

        sc.close();
    }
}
