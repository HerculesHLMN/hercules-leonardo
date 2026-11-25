import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClasseFamilia {

    private List<ClassePessoa> listaPessoas;

    public ClasseFamilia() {
        listaPessoas = new ArrayList<ClassePessoa>();
    }

    public void adicionarPessoa(ClassePessoa p) {
        listaPessoas.add(p);

    }

    public ClassePessoa encontrarPessoaMaisVelha() {

        LocalDate dataMaisVelha = LocalDate.now();
        ClassePessoa pessoaMaisVelha = null;

        for (ClassePessoa p : listaPessoas) {
            if (p.getDataNascimento().isBefore(dataMaisVelha)) {
                dataMaisVelha = p.getDataNascimento();
                pessoaMaisVelha = p;

            }
        }

            return pessoaMaisVelha;
    }
}
