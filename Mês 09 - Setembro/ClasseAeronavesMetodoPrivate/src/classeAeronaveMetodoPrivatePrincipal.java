public class classeAeronaveMetodoPrivatePrincipal {

    public static void main(String[] args) {

        classeAeronaveMetodoPrivate boeing737 = new  classeAeronaveMetodoPrivate("Boeing 737", 189, 946, 26020, 45.0);
        classeAeronaveMetodoPrivate airbusA320 = new  classeAeronaveMetodoPrivate("Airbus A320", 180, 871, 24210, 44.0);
        classeAeronaveMetodoPrivate boeing777 = new  classeAeronaveMetodoPrivate("Boeing 777", -550, 945, 181280, 160.0);
        classeAeronaveMetodoPrivate embraerE195 = new  classeAeronaveMetodoPrivate("Embraer E195", 146, 871, 21900, 35.0);

        classeAeronaveMetodoPrivate[] avioes = {boeing737, airbusA320, boeing777, embraerE195};

        classeAeronaveMetodoPrivate maiorCapacidadePassageiros = avioes[0];

        for (int i = 1; i < avioes.length; i++) {
            if (avioes[i].getCapacidadePassageiros()> maiorCapacidadePassageiros.getCapacidadePassageiros()) {
                maiorCapacidadePassageiros = avioes[i];

            }
        }

        classeAeronaveMetodoPrivate maiorTempo = avioes[0];

        for (int i = 1; i < avioes.length; i++) {
            if (avioes[i].calcularTempoVoo() > maiorTempo.calcularTempoVoo()) {
                maiorTempo = avioes[i];

            }
        }

        classeAeronaveMetodoPrivate maiorDistancia = avioes[0];

        for (int i = 1; i < avioes.length; i++) {
            if (avioes[i].calcularDistanciaMaxima() > maiorDistancia.calcularDistanciaMaxima()) {
                maiorDistancia = avioes[i];

            }
        }

        System.out.println("\nAeronave com Maior Capacidade de Passageiros: " + maiorCapacidadePassageiros.getModeloAviao());
        System.out.println("Capacidade de Passageiros: " + maiorCapacidadePassageiros.getCapacidadePassageiros());
        System.out.println("\nAeronave que Fica mais Tempo no Ar: " + maiorTempo.getModeloAviao());
        System.out.println("Tempo Máximo de Voo: " + maiorTempo.calcularTempoVoo() + " Minutos");
        System.out.println("\nAeronave que Voa mais Longe: " + maiorDistancia.getModeloAviao());
        System.out.println("Distância Máxima: " + maiorDistancia.calcularDistanciaMaxima() + " Km");

    }
}
