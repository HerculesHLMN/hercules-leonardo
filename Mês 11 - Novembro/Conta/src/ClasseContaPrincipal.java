import java.text.DecimalFormat;

public class ClasseContaPrincipal {
    public static void main(String[] args) {

        ClasseConta c1 = new ClasseConta("Lucas", 600);
        ClasseConta c2 = new ClasseConta("João", 250);

        DecimalFormat df = new DecimalFormat("0.00");


        c1.realizarDeposito(60);
        System.out.println("\nDepósito Realizado!" + c1);

        c2.realizarSaque(50);
        System.out.println("\nSaque Realizado!" +c2);

        c1.realizarTransferencia(c2, 15);
        System.out.println("\nSaldo Após Transferência: " + c1);
        System.out.println("\nSaldo Após Transferência: " + c2);

        System.out.println("\nResultado do Investimento: R$ " + df.format(c2.realizarInvestimento(50, 11)));

    }
}
