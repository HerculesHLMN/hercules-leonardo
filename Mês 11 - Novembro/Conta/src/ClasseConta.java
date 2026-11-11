public class ClasseConta {

    private String nomeTitular;
    private double saldo;

    public ClasseConta(String nomeTitular, double saldo) {
        setNomeTitular(nomeTitular);
        setSaldo(saldo);
    }

    public void realizarSaque (double saque) {
        if (saque <= 0 || saque > saldo) {
            throw new IllegalArgumentException("Erro, Valor de Saque Inválido ou Insuficiente!");
        }
        saldo -= saque;
    }

    public void realizarDeposito(double deposito) {
        if (deposito <= 0) {
            throw new IllegalArgumentException("Erro, Valor de Depósito Inválido!");
        }
        saldo += deposito;
    }

    public void realizarTransferencia(ClasseConta destinatario, double valor) {
        if (valor <= 0 || destinatario == null || valor > saldo) {
            throw new IllegalArgumentException("Erro, Transferência Inválida!");
        }
        saldo -= valor;
        destinatario.saldo += valor;
    }

    public double realizarInvestimento(double valor, int mesesInvestidos) {
        double resultado = Math.pow(1.01, mesesInvestidos);
        resultado = valor * resultado;
        setSaldo(saldo + resultado);
        return resultado;

    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        if (nomeTitular == null || nomeTitular.isBlank()) {
            throw new IllegalArgumentException("Erro, Nome Inválido");

        }
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\nNome: " + nomeTitular +
                "\nSaldo: R$ " + saldo;
    }
}