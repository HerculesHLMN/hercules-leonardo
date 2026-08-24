import java.util.Scanner;

public class vetorValores_EX11 {

    public static int maiorElemento(int[] vetor) {

        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    public static int menorElemento(int[] vetor) {

        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        return menor;
    }

    public static double calcularMedia(int[] vetor) {

        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = (double) soma / vetor.length;

        return media;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < vetor.length; i++) {

            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("\nMaior elemento: " + maiorElemento(vetor));
        System.out.println("Menor elemento: " + menorElemento(vetor));
        System.out.println("Média dos valores: " + calcularMedia(vetor));

        sc.close();
    }
}