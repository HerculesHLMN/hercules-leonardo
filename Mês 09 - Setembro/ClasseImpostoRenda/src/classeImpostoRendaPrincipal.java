public class classeImpostoRendaPrincipal {
    public static void main(String[] args) {

        classeImpostoRenda lucas = new classeImpostoRenda("Lucas", "11245672667", "SC", 45000);
        classeImpostoRenda joao = new classeImpostoRenda("Joâo", "87477238415", "ES", 21000);
        classeImpostoRenda augusto = new classeImpostoRenda("Augusto", "95246723535", "MA", 14500);
        classeImpostoRenda lara = new classeImpostoRenda("Lara", "77943256789", "RS", 65000);
        classeImpostoRenda rafael = new classeImpostoRenda("Rafael", "24518983924", "SC", 1200);

        classeImpostoRenda[] contribuintes = {lucas, joao, augusto, lara, rafael};



        double maiorImposto = 0;
        classeImpostoRenda contribuinteMaiorImposto = null;

        for (int i = 0; i < contribuintes.length; i++) {
            if (contribuintes[i].calcularImposto() > maiorImposto) {
                maiorImposto = contribuintes[i].calcularImposto();
                contribuinteMaiorImposto = contribuintes[i];

            }
        }

        System.out.println("\nContribuinte com Maior Imposto: " + contribuinteMaiorImposto.getNome());

        double totalImposto = 0;
        for (int i = 0; i < contribuintes.length; i++) {
            totalImposto += contribuintes[i].calcularImposto();

        }

        System.out.println("\nTotal de IR Pago por Todos os Contribuintes: R$ " + totalImposto);

    }
}
