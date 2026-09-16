public class classeAeronaveMetodoPrivate {

    private String modeloAviao;
    private int capacidadePassageiros;
    private int velocidadeMaxima;
    private int capacidadeCombustivel;
    private double queimaCombustivelMin;

    public classeAeronaveMetodoPrivate(String modeloAviao, int capacidadePassageiros,
                                       int velocidadeMaxima, int capacidadeCombustivel, double queimaCombustivelMin) {

        setModeloAviao(modeloAviao);
        setCapacidadePassageiros(capacidadePassageiros);
        setVelocidadeMaxima(velocidadeMaxima);
        setCapacidadeCombustivel(capacidadeCombustivel);
        setQueimaCombustivelMin(queimaCombustivelMin);
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
        if (modeloAviao == null || modeloAviao.isBlank()) {
            System.out.println("Erro, Modelo de Aeronave Inválido!");
        } else {
            this.modeloAviao = modeloAviao;
        }
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        if (capacidadePassageiros < 0) {
            System.out.println("\nErro, Quantidade de Passageiros da Aeronave " + modeloAviao + " Inválida!");
        } else {
            this.capacidadePassageiros = capacidadePassageiros;
        }
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