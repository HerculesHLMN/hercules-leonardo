import java.text.DecimalFormat;
import java.util.Scanner;

public class vetorMaiorMenorMedia_EX04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();

        int[] vetor = new int[3];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Informe o %dº valor para 'BASE': ", i + 1);
            vetor[i] = sc.nextInt();
        }

        maior(vetor);
        menor(vetor);
        media(vetor);

        sc.close();
    }

    public static void maior(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.println("\nMaior elemento: " + maior);
    }

    public static void menor(int[] vetor) {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("Menor elemento: " + menor);
    }

    public static void media(int[] vetor) {

        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = (double) soma / vetor.length;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Média dos valores: " + df.format(media));

    }
}