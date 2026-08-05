import java.text.DecimalFormat;
import java.util.Scanner;

public class comissaoVendas_EX02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("\nInforme o nome do vendedor: ");
        String nomeVendedor = sc.next();

        System.out.println("Informe o salário fixo do vendedor: ");
        double salarioVendedor = sc.nextDouble();

        System.out.println("Informe o total de vendas efetuadas por ele no mês: ");
        double vendasMes = sc.nextDouble();;

        double comissao = (vendasMes * 0.15) + vendasMes;
        double salFinal = comissao + salarioVendedor;

        System.out.printf("\nSalário final com comissão: R$ " + df.format(salFinal));
        System.out.println();

        sc.close();

    }
}
