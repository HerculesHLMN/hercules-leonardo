public class classeMercadoPrincipal {
    public static void main(String[] args) {

        classeMercado unidadeJoinville = new classeMercado();
        classeMercado unidadeBlumenau = new classeMercado();
        classeMercado unidadeFlorianopolis = new classeMercado();

        unidadeJoinville.nomeMercado = "Angeloni";
        unidadeJoinville.macasVendidas = 620;
        unidadeJoinville.precoMaca = 1.75;
        unidadeJoinville.laranjasVendidas = 480;
        unidadeJoinville.precoLaranja = 1.45;

        unidadeBlumenau.nomeMercado = "Giassi";
        unidadeBlumenau.macasVendidas = 660;
        unidadeBlumenau.precoMaca = 1.68;
        unidadeBlumenau.laranjasVendidas = 525;
        unidadeBlumenau.precoLaranja = 1.37;

        unidadeFlorianopolis.nomeMercado = "Cooper";
        unidadeFlorianopolis.macasVendidas = 420;
        unidadeFlorianopolis.precoMaca = 1.7;
        unidadeFlorianopolis.laranjasVendidas = 630;
        unidadeFlorianopolis.precoLaranja = 1.4;

        System.out.println("\n" + unidadeJoinville.nomeMercado + " vendeu " + unidadeJoinville.macasVendidas + " maças a R$ " + unidadeJoinville.precoMaca);
        System.out.println(unidadeJoinville.nomeMercado + " vendeu " + unidadeJoinville.laranjasVendidas + " laranjas a R$ " + unidadeJoinville.precoLaranja);

        System.out.println("\n" + unidadeBlumenau.nomeMercado + " vendeu " + unidadeBlumenau.macasVendidas + " maças a R$ " + unidadeBlumenau.precoMaca);
        System.out.println(unidadeBlumenau.nomeMercado + " vendeu " + unidadeBlumenau.laranjasVendidas + " laranjas a R$ " + unidadeBlumenau.precoLaranja);

        System.out.println("\n" + unidadeFlorianopolis.nomeMercado + " vendeu " + unidadeJoinville.macasVendidas + " maças a R$ " + unidadeJoinville.precoMaca);
        System.out.println(unidadeFlorianopolis.nomeMercado + " vendeu " + unidadeFlorianopolis.laranjasVendidas + " laranjas a R$ " + unidadeFlorianopolis.precoLaranja);

    }
}