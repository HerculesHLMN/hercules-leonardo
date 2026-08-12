import java.text.DecimalFormat;
import java.util.Scanner;

public class atletasAlturaMedia_EX04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int atleta = 1;
        double alturaMaior = 0;
        double somaAlturaAtleta = 0;
        double alturaMenor = 10;
        int atletaMaior = 0;
        int atletaMenor = 0;
        int repetidor = 0;
        double altura;
        double mediaAltura;

        while (atleta != 0) {
            System.out.println("\nInforme a inscrição do atleta: ");
                atleta = sc.nextInt();

            if (atleta != 0) {
                repetidor++;
                System.out.println("Informe a altura do Atleta: ");
                altura = sc.nextDouble();
                somaAlturaAtleta = somaAlturaAtleta + altura;

                if (altura > alturaMaior) {
                    alturaMaior = altura;
                    atletaMaior = atleta;

                } else if (altura < alturaMenor) {
                    alturaMenor = altura;
                    atletaMenor = atleta;
                }
            }
        }

        mediaAltura = somaAlturaAtleta / repetidor;
        System.out.println("\nAtleta mais Alto: " + atletaMaior + "\nAltura: " + df.format(alturaMaior));
        System.out.println("Atleta mais Baixo: " + atletaMenor+ " \nAltura: " + df.format(alturaMenor));
        System.out.println("\nMédia das alturas dos atletas: " + df.format(mediaAltura));

        sc.close();
    }
}