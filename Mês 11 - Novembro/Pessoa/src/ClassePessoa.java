import java.time.LocalDate;

public class ClassePessoa {

    private String nome;
    private LocalDate dataNascimento;

    public ClassePessoa(String nome, LocalDate dataNascimento) {
        setNome(nome);
        setDataNascimento(dataNascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Erro, Nome Inválido!");
        }

        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento == null || dataNascimento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Erro, Data de Nascimento Inválida!");
        }

        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nData de Nascimento: " + dataNascimento;
    }
}
