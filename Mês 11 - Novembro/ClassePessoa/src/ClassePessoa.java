public class ClassePessoa {

    private String nome;
    private ClasseEndereco endereco;

    public ClassePessoa(String nome, ClasseEndereco endereco) {
        setNome(nome);
        setEndereco(endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Erro, Nome Inválido");
        }
        this.nome = nome;
    }

    public ClasseEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(ClasseEndereco endereco) {
        if (endereco == null) {
            throw new IllegalArgumentException("Erro, Endereço Inválido");
        }
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + endereco;
    }
}