public class classeAeronave {

     String modeloAviao;
     int capacidadePassageiros;
     int velocidadeMaxima;
     int capacidadeCombustivel;
     double queimaCombustivelMin;

    public classeAeronave(String modeloAviao, int capacidadePassageiros,
                          int velocidadeMaxima, int capacidadeCombustivel, double queimaCombustivelMin) {

        this.modeloAviao = modeloAviao;
        this.capacidadePassageiros = capacidadePassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.queimaCombustivelMin = queimaCombustivelMin;
    }

    public double calcularTempoVoo() {
        return capacidadeCombustivel / queimaCombustivelMin;
    }

    public double calcularDistanciaMaxima() {
        return velocidadeMaxima * (calcularTempoVoo() / 60);
    }

    @Override
    public String toString() {
        return "classeAeronave{" +
                "modeloAviao='" + modeloAviao + '\'' +
                ", capacidadePassageiros=" + capacidadePassageiros +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", capacidadeCombustivel=" + capacidadeCombustivel +
                ", queimaCombustivelMin=" + queimaCombustivelMin +
                '}';
    }
}