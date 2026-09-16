import java.util.Scanner;

public class NumerosPertoBase_EX05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();

        int[] valor = new int[3];

        for (int i = 0; i < valor.length; i++) {
            System.out.printf("Informe o %dº valor para BASE: ", i + 1);
            valor[i] = sc.nextInt();
        }

        sc.close();
        comparaValor(valor[0], valor[1], valor[2]);

    }

    public static void comparaValor(int base, int v2, int v3) {
        int comparaV1 = (base - v2);
        int comparaV2 = (base - v3);

        if (comparaV1 < comparaV2) {
            System.out.println("\nO segundo valor está mais próximo da base: " + v2);

        } else if (comparaV2 < comparaV1) {
            System.out.println("\nO terceiro valor está mais próximo da base: " +v3);

        } else {
            System.out.println("\nOs dois valores estão igualmente próximos da base");
        }
    }
}