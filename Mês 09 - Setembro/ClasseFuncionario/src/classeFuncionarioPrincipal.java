public class classeFuncionarioPrincipal {
    public static void main(String[] args) {

        classeFuncionario f1 = new classeFuncionario();

        f1.identificacao = "151";
        f1.nomeFuncionario = "Ronaldo";
        f1.sobrenome = "Nazário";
        f1.salarioMensal = 1600;

        System.out.println(f1.calcularSalarioAnual());
        System.out.println(f1.obterNomeCompleto());
        f1.modificarSalario(5);
        System.out.println("\nSalário aumentado: \n" + f1.salarioMensal);

    }
}
