import java.text.DecimalFormat;
import java.util.Scanner;

public class primaveraVeraoOutonoInverno_EX01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("\nInforme a estação do ano: ");
        int estacao = sc.nextInt();

        switch (estacao) {

            case 1:
                imprimirPrimavera();
                break;

            case 2:
                imprimirVerao();
                break;

            case 3:
                imprimirOutono();
                break;

            case 4:
                imprimirInverno();
                break;

            default:
                System.out.println("Opção Inválida!");
                break;
        }

        sc.close();
    }

    public static void imprimirPrimavera() {
        System.out.println("\nÉ primavera\nEstação das flores.");
    }

    public static void imprimirVerao() {
        System.out.println("\nÉ verão\nE o tempo está quente.");
    }

    public static void imprimirOutono() {
        System.out.println("\nÉ Outono\nE as folhas caem.");
    }

    public static void imprimirInverno() {
        System.out.println("\nÉ inverno\nE está frio.");


    }
}


