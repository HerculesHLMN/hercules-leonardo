public class classeCanetaCadernoPrincipal {
    public static void main(String[] args) {

        classeCanetaCaderno produto1 = new classeCanetaCaderno();
        classeCanetaCaderno produto2 = new classeCanetaCaderno();
        classeCanetaCaderno produto3 = new classeCanetaCaderno();

        produto1.nome = "Caderno";
        produto1.descricao = "Caderno em espiral tamanho médio";
        produto1.precoUnitario = 4.50;
        produto1.desconto = 15;

        produto2.nome = "Caneta ESF";
        produto2.descricao = "Caneta esferográfica 5mm";
        produto2.precoUnitario = 1.20;
        produto2.desconto = 2;

        produto3.nome = "Esquadro";
        produto3.descricao = "Esquadro de acrílico 20 cm";
        produto3.precoUnitario = 2.35;
        produto3.desconto = 10;

        System.out.println("\n" + "Produto: " + produto1.nome + "\n" + "Descrição: " + produto1.descricao);
        System.out.println("Preço R$: " + produto1.precoUnitario + "\n" + "Desconto R$: " + produto1.desconto);

        System.out.println("\n" + "Produto: " + produto2.nome + "\n" + "Descrição: " + produto2.descricao);
        System.out.println("Preço R$: " + produto2.precoUnitario + "\n" + "Desconto R$: " + produto2.desconto);

        System.out.println("\n" + "Produto: " + produto3.nome + "\n" + "Descrição: " + produto3.descricao);
        System.out.println("Preço R$: " + produto3.precoUnitario + "\n" + "Desconto R$: " + produto3.desconto);

    }
}
