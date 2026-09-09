public class classeFuncionario {

    String identificacao;
    String nomeFuncionario;
    String sobrenome;
    double salarioMensal;

    public double calcularSalarioAnual() {
        System.out.println("\nSalário Anual: ");
        return salarioMensal * 12;
    }

    public String obterNomeCompleto() {
        return "\nNome Completo: \n" + nomeFuncionario + " " + sobrenome;
    }

    public void modificarSalario (double percentualAumento) {
       double aumento = salarioMensal * percentualAumento / 100;
       double salarioFinal = salarioMensal + aumento;
       salarioMensal = salarioFinal;

    }
}
