public class classeAeronavePrincipal {

    public static void main(String[] args) {

        classeAeronave boeing737 = new classeAeronave("Boeing 737", 189, 946, 26020, 45.0);
        classeAeronave airbusA320 = new classeAeronave("Airbus A320", 180, 871, 24210, 44.0);
        classeAeronave boeing777 = new classeAeronave("Boeing 777", 550, 945, 181280, 160.0);
        classeAeronave embraerE195 = new classeAeronave("Embraer E195", 146, 871, 21900, 35.0);

        classeAeronave[] avioes = {boeing737, airbusA320, boeing777, embraerE195};
        
        classeAeronave maiorCapacidadePassageiros = avioes[0];

        for (int i = 1; i < avioes.length; i++) {
            if (avioes[i].capacidadePassageiros > maiorCapacidadePassageiros.capacidadePassageiros) {
                maiorCapacidadePassageiros = avioes[i];

            }
        }

        classeAeronave maiorTempo = avioes[0];

        for (int i = 1; i < avioes.length; i++) {
            if (avioes[i].calcularTempoVoo() > maiorTempo.calcularTempoVoo()) {
                maiorTempo = avioes[i];

            }
        }

        classeAeronave maiorDistancia = avioes[0];

        for (int i = 1; i < avioes.length; i++) {
            if (avioes[i].calcularDistanciaMaxima() > maiorDistancia.calcularDistanciaMaxima()) {
                maiorDistancia = avioes[i];

            }
        }

        System.out.println("\nAeronave com Maior Capacidade de Passageiros: " + maiorCapacidadePassageiros.modeloAviao);
        System.out.println("Capacidade de Passageiros: " + maiorCapacidadePassageiros.capacidadePassageiros);
        System.out.println("\nAeronave que Fica mais Tempo no Ar: " + maiorTempo.modeloAviao);
        System.out.println("Tempo Máximo de Voo: " + maiorTempo.calcularTempoVoo() + " Minutos");
        System.out.println("\nAeronave que Voa mais Longe: " + maiorDistancia.modeloAviao);
        System.out.println("Distância Máxima: " + maiorDistancia.calcularDistanciaMaxima() + " Km");

    }
}
