public class classeAeronaveMetodoPrivate {

    private String modeloAviao;
    private int capacidadePassageiros;
    private int velocidadeMaxima;
    private int capacidadeCombustivel;
    private double queimaCombustivelMin;

    public classeAeronaveMetodoPrivate(String modeloAviao, int capacidadePassageiros,
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

    public String getModeloAviao() {
        return modeloAviao;
    }

    public void setModeloAviao(String modeloAviao) {
        this.modeloAviao = modeloAviao;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(int capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public double getQueimaCombustivelMin() {
        return queimaCombustivelMin;
    }

    public void setQueimaCombustivelMin(double queimaCombustivelMin) {
        this.queimaCombustivelMin = queimaCombustivelMin;
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