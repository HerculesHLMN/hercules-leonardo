import java.text.DecimalFormat;
import java.util.Scanner;

public class matrizColunas_EX06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int[][] matriz = {
                {210, 3, 399900},
                {160, 3, 329900},
                {240, 3, 369000},
                {141, 2, 232000},
                {300, 4, 539900},
                {198, 4, 299900},
                {153, 3, 314900},
                {142, 3, 199000},
                {138, 3, 212000},
                {149, 3, 242500},
                {194, 4, 240000},
                {200, 3, 347000},
                {189, 3, 330000},
                {447, 5, 699900},
                {126, 3, 259900}
        };

        double somaPrecos = 0;
        double mediaPrecos = 0;
        int menorCasa = 0;
        int maiorQuartos = 0;
        int menorQuartos = 0;
        int tamanhoMaiorQuartos = 0;
        int tamanhoMenorQuartos = 0;
        double somaTamanhos = 0;
        int quantidadeCasas = 0;
        double mediaTamanhos = 0;


        for (int i = 0; i < matriz.length; i++) {
            somaPrecos = somaPrecos + matriz[i][2];
        }

        mediaPrecos = somaPrecos / matriz.length;
        menorCasa = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] < menorCasa) {
                menorCasa = matriz[i][0];
            }
        }

        maiorQuartos = matriz[0][1];
        menorQuartos = matriz[0][1];

        for (int i = 0; i < matriz.length; i++) {

            if (matriz[i][1] > maiorQuartos) {
                maiorQuartos = matriz[i][1];
                tamanhoMaiorQuartos = matriz[i][0];
            }

            if (matriz[i][1] < menorQuartos) {
                menorQuartos = matriz[i][1];
                tamanhoMenorQuartos = matriz[i][0];
            }
        }

        int diferenca = tamanhoMaiorQuartos - tamanhoMenorQuartos;

        for (int i = 0; i < matriz.length; i++) {

            if (matriz[i][2] > 300000) {
                somaTamanhos = somaTamanhos + matriz[i][0];
                quantidadeCasas++;
            }
        }

        mediaTamanhos = somaTamanhos / quantidadeCasas;

        System.out.println("\nMedia dos precos: R$ " + df.format(mediaPrecos));
        System.out.println("Tamanho da menor casa: " + menorCasa + "m²");
        System.out.println("Diferenca de tamanho: " + diferenca + "m²");
        System.out.println("Media do tamanho das casas acima de 300.000: " + df.format(mediaTamanhos) + "m²");
    }
}
