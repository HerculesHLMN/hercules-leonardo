public class classePrincipal {
    public static void main(String[] args) {

        classeVeiculos v1 = new classeVeiculos();
        classeVeiculos v2 = new classeVeiculos();

        v1.marca = "Chevrolet";
        v1.modelo = "Omega";
        v1.placa = "AAA1AA11";
        v1.ano = 1994;
        v1.preco = 60000;

        v2.marca = "Volkswagen";
        v2.modelo = "Gol";
        v2.placa = "BBB2BB22";
        v2.ano = 2003;
        v2.preco = 30000;


        System.out.println("\n" + v1.marca + " " + v1.modelo);
        System.out.println("Placa: " + v1.placa + "\n" + "Ano: " + v1.ano + "\n" + "Preço: " + "R$" + v1.preco);

        System.out.println("\n" + v2.marca + " " + v2.modelo);
        System.out.println("Placa: " + v2.placa + "\n" + "Ano: " + v2.ano + "\n" + "Preço: " + "R$" + v2    .preco);

    }
}
