import java.text.DecimalFormat;
import java.util.Scanner;

public class classificadorIMC_EX03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("\nInforme seu altura: ");
        double altura = sc.nextDouble();

        System.out.println("Informe seu peso: ");
        double peso = sc.nextDouble();

        double imc = peso / Math.pow(altura,2);

        if (imc < 18.5) {
            System.out.println("\nIMC: " + df.format(imc) + "\nClassificação: Magreza");

        } else if (imc < 24.9) {
            System.out.println("\nIMC: " + df.format(imc) + "\nClassificação: Saúdavel");

        } else if (imc < 29.9) {
            System.out.println("\nIMC: " + df.format(imc) + "\nClassificação: Sobrepeso");
        }
        else if (imc < 34.9) {
            System.out.println("\nIMC: " + df.format(imc) + "\nClassificação: Obesidade Grau I");
        }
        else if (imc < 39.9) {
            System.out.println("\nIMC: " + df.format(imc) + "\nClassificação: Obesidade Grau II (Severa)");
        }
        else{
            System.out.println("\nIMC: " + df.format(imc) + "\nClassificação: Obesidade Grau III (Morbida)");
        }

        sc.close();

    }
}
