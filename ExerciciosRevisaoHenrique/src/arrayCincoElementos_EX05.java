import java.util.Scanner;

public class arrayCincoElementos_EX05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[3];
        double valorMaior = 0;
        double valorMenor = 0;
        double media = 0;
        double somaArray = 0;

        System.out.println();

        for (int i = 0; i< vetor.length; i++) {
            System.out.println("Informe um número: ");
            vetor[i] = sc.nextInt();

        }

        for (int i = 0; i < vetor.length;i++) {
            somaArray = somaArray + vetor[i];

            if(i == 0) {
                valorMaior = vetor[i];
                valorMenor = vetor[i];
            }

            if(vetor[i] > valorMaior) {
                valorMaior = vetor[i];

            } else if (vetor[i] < valorMenor) {
                valorMenor = vetor[i];
            }
        }

        media = somaArray / vetor.length;
        System.out.println("\nMaior vetor: " + valorMaior);
        System.out.println("Menor vetor: " + valorMenor);
        System.out.println("Media vetores: " + media);

        sc.close();
    }
}