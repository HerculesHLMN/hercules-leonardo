public class Exemplo {

    public static double somarNumeros(int num1, int num2) {
        double soma = num1 + num2;
        return soma;
        // retorna num1 + num 2
    }

    public static void main(String[] args) {
        double soma = somarNumeros(10, 2);
        System.out.println();
        System.out.println(soma);
        System.out.println(somarNumeros(5, 4));
    }
}
