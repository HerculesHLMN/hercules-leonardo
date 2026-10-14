public class Flor {

    private String nome;
    private double preco;
    private String nomeCliente;

    public Flor(String nome, double preco, String nomeCliente) {
        setNome(nome);
        setPreco(preco);
        setNomeCliente(nomeCliente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Erro, Nome da Flor Inválido!");
        }
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Erro, Preço Inválido!");
        }
        this.preco = preco;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente == null || nomeCliente.isBlank()) {
            throw new IllegalArgumentException("Erro, Nome do Cliente Inválido!");
        }
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "\nFlor: " +
                "\nNome=" + nome +
                "\nPreço=" + preco +
                "\nCliente=" + nomeCliente;
    }
}