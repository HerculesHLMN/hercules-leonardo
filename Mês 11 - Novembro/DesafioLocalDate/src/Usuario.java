import java.time.LocalDate;
import java.time.Period;

public class Usuario {

    private LocalDate dataNascimento;

    public Usuario(LocalDate dataNascimento) {
        setDataNascimento(dataNascimento);
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

    public boolean determinarMaiorIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears() >= 18;

    }

    @Override
    public String toString() {
        return "Data de Nascimento: " + dataNascimento;

    }
}
