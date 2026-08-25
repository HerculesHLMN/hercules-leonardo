import java.text.DecimalFormat;
import java.util.Scanner;

public class notasMedia_EX08 {

    public static double calcularMedia(double n1, double n2, double n3) {
        double media = (n1 + n2 + n3) / 3;

        if (n1 > 10 || n1 < 0 || n2 > 10 || n2 < 0 || n3 > 10 || n3 < 0 ) {
            return 0;
        }
        else {
            return media;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.printf("\nDigite a primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.printf("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        System.out.printf("Digite a terceira nota: ");
        double n3 = sc.nextDouble();

        System.out.println("\nA média é: " + df.format(calcularMedia(n1, n2, n3)));

        sc.close();
    }
}