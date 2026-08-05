import java.text.DecimalFormat;
import java.util.Scanner;

public class MatriculaFuncionario_EX01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("\nInforme a matrícula do funcionário: ");
        String matriculaFuncionario = sc.next();

        System.out.println("Informe o nome do funcionário: ");
        String nomeFuncionaro = sc.next();

        System.out.println("Informe sua quantidade de horas trabalhadas na semana: ");
        int quantHoras = sc.nextInt();

        System.out.println("Informe o valor recebido por hora: ");
        double valHoraTrabalhada = sc.nextDouble();

        double salMensal = (valHoraTrabalhada * quantHoras) * 4;

        System.out.println("\nMatrícula do funcionário: " + matriculaFuncionario);
        System.out.println("Nome do funcionário: " + nomeFuncionaro);
        System.out.printf("Salário final do funcionário: R$ " + df.format(salMensal));
        System.out.println();

        sc.close();

    }
}
