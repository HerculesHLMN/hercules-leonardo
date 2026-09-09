public class classeMercadoMetodoConstrutorPrincipal {
    public static void main(String[] args) {

        classeMercadoMetodoConstrutor unidadeJoinville = new classeMercadoMetodoConstrutor
                ("Angeloni", 620, 1.75, 480, 1.45);
        classeMercadoMetodoConstrutor unidadeBlumenau = new classeMercadoMetodoConstrutor
                ("Giassi", 660, 1.68, 525, 1.37);
        classeMercadoMetodoConstrutor unidadeFlorianopolis = new classeMercadoMetodoConstrutor
                ("Cooper", 420, 1.7, 630, 1.4);

        classeMercadoMetodoConstrutor mercados[] = {unidadeJoinville, unidadeBlumenau, unidadeFlorianopolis};

        double maiorReceitaMacas = 0; // Qual mercado teve a maior receita de maças
        classeMercadoMetodoConstrutor mercadoMaiorReceitaMacas = null;

        for (int i = 0; i < mercados.length; i++) {
            if (mercados[i].calcularReceitaMacas() > maiorReceitaMacas) {
                maiorReceitaMacas = mercados[i].calcularReceitaMacas();
                mercadoMaiorReceitaMacas = mercados[i];
            }
        }

        double menorReceitaLaranjas = Double.MAX_VALUE; // Qual mercado teve a menor receita de maças;
        classeMercadoMetodoConstrutor mercadoMenorReceitaLaranjas = null;

        for (int i = 0; i < mercados.length; i++) {
            if (mercados[i].calcularReceitaLaranjas() < menorReceitaLaranjas) {
                menorReceitaLaranjas = mercados[i].calcularReceitaLaranjas();
                mercadoMenorReceitaLaranjas = mercados[i];
            }
        }

        double segundaMaiorReceitaTotal = 0; // Qual mercado teve a segunda maior receita total
        classeMercadoMetodoConstrutor mercadoSegundaMaiorReceitaTotal = null;

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