public class AlunoPrincipal {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Rafael", 21, "123", "Programação", 8);
        Aluno a2 = new Aluno("João", 17, "132", "Elétrica", 7);
        Aluno a3 = new Aluno("Júlia", 19, "231", "Textil", 6);
        Aluno a4 = new Aluno("Maria", 22, "321", "Administração", 10);

        SistemaAlunosArrayList instituição = new SistemaAlunosArrayList();

        instituição.adicionarAlunos(a1);
        instituição.adicionarAlunos(a2);
        instituição.adicionarAlunos(a3);
        instituição.adicionarAlunos(a4);

        System.out.println(instituição.obterAlunoPorCursoIdadeMedia("Elétrica", 17, 7));
        System.out.println(instituição.obterAlunoPorMatricula("321"));

    }
}
