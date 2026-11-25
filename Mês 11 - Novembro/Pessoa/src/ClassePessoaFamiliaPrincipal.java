import java.time.LocalDate;

public class ClassePessoaFamiliaPrincipal {
    public static void main(String[] args) {

        ClassePessoa p1 = new ClassePessoa("Lucas", LocalDate.of(2010,02,11));
        ClassePessoa p2 = new ClassePessoa("Hércules", LocalDate.of(2008,02,10));

        ClasseFamilia f1= new ClasseFamilia();

        f1.adicionarPessoa(p1);
        f1.adicionarPessoa(p2);

        System.out.println(f1.encontrarPessoaMaisVelha());

    }
}
