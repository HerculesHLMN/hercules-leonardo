public class ClassePrincipal {
    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("Honda", "Civic", "AAA1A11", 2010, 45000);
        Veiculo v2 = new Veiculo("Chevrolet", "Vectra", "BBB2B22", 2002, 33000);
        Veiculo v3 = new Veiculo("Fiat", "Uno", "CCC3C33", 2013, 15000);
        Veiculo v4 = new Veiculo("Hyundai", "I30", "DDD4D44", 2012, 40000);

        Concessionaria c1 = new Concessionaria();

        c1.adicionarVeiculo(v1);
        c1.adicionarVeiculo(v2);

        System.out.println("\n" + c1.obterVeiculoBarato());

        Concessionaria c2 = new Concessionaria();

        c2.adicionarVeiculo(v3);
        c2.adicionarVeiculo(v4);

        System.out.println("\n" + c2.obterVeiculoBarato());



    }
}
