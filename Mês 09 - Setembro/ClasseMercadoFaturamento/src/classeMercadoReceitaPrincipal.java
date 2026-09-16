public class classeMercadoReceitaPrincipal {
    public static void main(String[] args) {

        classeMercadoReceita unidadeJoinville = new classeMercadoReceita();
        classeMercadoReceita unidadeBlumenau = new classeMercadoReceita();
        classeMercadoReceita unidadeFlorianopolis = new classeMercadoReceita();

        unidadeJoinville.nomeMercado ="Angeloni";
        unidadeJoinville.macasVendidas = 620;
        unidadeJoinville.precoMaca = 1.75;
        unidadeJoinville.laranjasVendidas = 480;
        unidadeJoinville.precoLaranja = 1.45;

        unidadeBlumenau.nomeMercado ="Giassi";
        unidadeBlumenau.macasVendidas = 660;
        unidadeBlumenau.precoMaca = 1.68;
        unidadeBlumenau.laranjasVendidas = 525;
        unidadeBlumenau.precoLaranja = 1.37;

        unidadeFlorianopolis.nomeMercado ="Cooper";
        unidadeFlorianopolis.macasVendidas = 420;
        unidadeFlorianopolis.precoMaca = 1.7;
        unidadeFlorianopolis.laranjasVendidas = 630;
        unidadeFlorianopolis.precoLaranja = 1.4;

        classeMercadoReceita mercados[] = {unidadeJoinville, unidadeBlumenau, unidadeFlorianopolis};

        double maiorReceitaMacas = 0; // Qual mercado teve a maior receita de maças
        classeMercadoReceita mercadoMaiorReceitaMacas = null;

        for (int i = 0; i < mercados.length; i++) {
            if (mercados[i].calcularReceitaMacas() > maiorReceitaMacas) {
                maiorReceitaMacas = mercados[i].calcularReceitaMacas();
                mercadoMaiorReceitaMacas = mercados[i];
            }
        }

        double menorReceitaLaranjas = Double.MAX_VALUE; // Qual mercado teve a menor receita de maças;
        classeMercadoReceita mercadoMenorReceitaLaranjas = null;

        for (int i = 0; i < mercados.length; i++) {
            if (mercados[i].calcularReceitaLaranjas() < menorReceitaLaranjas) {
                menorReceitaLaranjas = mercados[i].calcularReceitaLaranjas();
                mercadoMenorReceitaLaranjas = mercados[i];
            }
        }

        double segundaMaiorReceitaTotal = 0; // Qual mercado teve a segunda maior receita total
        classeMercadoReceita mercadoSegundaMaiorReceitaTotal = null;

        double maiorReceitaTotal = 0;

        for (int i = 0; i < mercados.length; i++) {
            if (mercados[i].calcularReceitaTotal() > maiorReceitaTotal) {
                maiorReceitaTotal = mercados[i].calcularReceitaTotal();
            }
        }

        for (int i = 0; i < mercados.length; i++) {
            if (mercados[i].calcularReceitaTotal() > segundaMaiorReceitaTotal
                && mercados[i].calcularReceitaTotal() != maiorReceitaTotal) {

                segundaMaiorReceitaTotal = mercados[i].calcularReceitaTotal();
                mercadoSegundaMaiorReceitaTotal = mercados[i];
            }
        }

        double receitaGeralMacas = 0;
        double receitaGeralLaranjas = 0;

        for (int i = 0; i < mercados.length; i++) {
            receitaGeralMacas += mercados[i].calcularReceitaMacas();
            receitaGeralLaranjas = mercados[i].calcularReceitaMacas();
        }

        System.out.println("\nMercado que mais vendeu maças: " + mercadoMaiorReceitaMacas.nomeMercado);
        System.out.println("Receita: R$" + maiorReceitaMacas);

        System.out.println("\nMercado que menos vendeu laranjas: " + mercadoMenorReceitaLaranjas.nomeMercado);
        System.out.println("Receita: R$" + menorReceitaLaranjas);

        System.out.println("\nMercado com a segunda maior total: " + mercadoSegundaMaiorReceitaTotal.nomeMercado);

        if (receitaGeralMacas > receitaGeralLaranjas) {
            System.out.println("A franquia teve uma receita maior com maçãs");
        } else if (receitaGeralLaranjas > receitaGeralMacas) {
            System.out.println("A franquia teve uma receita maior com laranjas");
        } else {
            System.out.println("As receitas foram iguais");

        }
    }
}
