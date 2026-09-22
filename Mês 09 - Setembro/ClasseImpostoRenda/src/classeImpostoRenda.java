public class classeImpostoRenda {

    private String nome;
    private String cpf;
    private String uf;
    private double rendaAnual;
    private double rendaImposto;

    public double calcularAliquota() {
        if (rendaAnual < 4000) {
            return 0;

        } else if (rendaAnual <= 9000) {
            return 0.058;

        } else if (rendaAnual <= 25000) {
            return 0.15;

        } else if (rendaAnual <= 35000) {
            return 0.275;

        }

        return 0.3;
    }

    public double calcularImposto() {
        return  rendaAnual * calcularAliquota();
    }

    public classeImpostoRenda(String nome, String cpf, String uf, double rendaAnual) {
       setNome(nome);
       setCpf(cpf);
       setUf(uf);
       setRendaAtual(rendaAnual);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            System.out.println("\nErro, Nome Inválido!");
        } else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank() || cpf.length() != 11) {
            System.out.println("\nErro, CPF Inválido!");
        } else {
            this.cpf = cpf;
        }
    }

    public String getUf() {
        return uf.toUpperCase();
    }

    public void setUf(String uf) {
        if (uf == null || uf.isBlank() || uf.length() != 2) {
            System.out.println("\nErro, UF Inválido!");
        } else {
            this.uf = uf;
        }
    }

    public double getRendaAtual() {
        return rendaAnual;
    }

    public void setRendaAtual(double rendaAtual) {
        if (rendaAtual < 0) {
            System.out.println("\nErro, Renda Inválida!");
        } else {
            this.rendaAnual = rendaAtual;
        }
    }

    @Override
    public String toString() {
        return "classeImpostoRenda{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", uf='" + uf + '\'' +
                ", rendaAtual=" + rendaAnual +
                '}';

    }
}
