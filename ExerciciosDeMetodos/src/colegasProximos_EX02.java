import java.util.Scanner;

public class colegasProximos_EX02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("\nInforme o nome de seu colega: ");
        String nome = sc.next();

        if (nome.equalsIgnoreCase("Daniele")) {
            imprimirDani();

        } else if (nome.equalsIgnoreCase("Lucas")) {
            imprimirLucas();

        } else if (nome.equalsIgnoreCase("Rafael")) {
            imprimirRafa();

        }

        sc.close();
    }

        public static void imprimirDani() {
            System.out.println("\nO nome dela é Daniele");
            System.out.println("Ela tem 37 anos");
            System.out.println("Ela é estudante de desenvolvimento de sistemas");
        }

        public static void imprimirLucas() {
            System.out.println("\nO nome dele é Lucas");
            System.out.println("Ele tem 16 anos");
            System.out.println("Ele é estudante de desenvolvimento de sistemas");
        }

        public static void imprimirRafa() {
            System.out.println("\nO nome dele é Rafael");
            System.out.println("Ele tem 21 anos");
            System.out.println("Ele é estudante de desenvolvimento de sistemas");
        }
}
