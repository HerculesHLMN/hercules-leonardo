import java.util.ArrayList;
import java.util.List;

public class SistemaAlunosArrayList {

    private List<Aluno> alunos;

    public SistemaAlunosArrayList() {
        alunos = new ArrayList<Aluno>();
    }

    public void adicionarAlunos(Aluno a) {
        alunos.add(a);
    }

    public List<Aluno> obterAlunoPorCursoIdadeMedia(String curso, int idade, double media) {
        List<Aluno> alunoPesquisa = new ArrayList<>();

        for(Aluno a : alunos) {
            if (a.getCurso().equals(curso) && a.getIdade() >= idade && a.getMediaFinal() >= media) {
                alunoPesquisa.add(a);
            }
        }

        return alunoPesquisa;
    }

    public Aluno obterAlunoPorMatricula(String matricula) {

        for (Aluno a : alunos) {
            if (a.getMatricula().equals(matricula)) {
                return a;
            }
        }

        return null;
    }


}
