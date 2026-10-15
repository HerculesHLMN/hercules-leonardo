import java.util.ArrayList;
import java.util.List;

public class SistemaAlunosArrayList {

    private List<Aluno> aluno;

    public SistemaAlunosArrayList() {
        aluno = new ArrayList<Aluno>();
    }

    public void adicionarAlunos(Aluno a) {
        aluno.add(a);
    }




}
