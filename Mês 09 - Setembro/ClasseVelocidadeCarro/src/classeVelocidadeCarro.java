public class classeVelocidadeCarro {

    private double velocidade;

    public void acelerar(double aceleracao) {
        if (aceleracao < 0 || aceleracao >= 20) {
            throw new  IllegalArgumentException("Erro, Aceleração Inválida!");
        }
        setVelocidade(velocidade + aceleracao);
    }

    public void reduzir(double reducao) {
        if (reducao < 0 || reducao >= 30) {
            throw new IllegalArgumentException("Erro, Redução Inválida!");
        }
        setVelocidade(velocidade - reducao);
    }

    public classeVelocidadeCarro(double velocidade) {
        setVelocidade(velocidade);
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        if (velocidade < 0) {
            throw  new IllegalArgumentException("Erro, Velocidade Inválida!");
        }
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "classeVelocidadeCarro{" +
                "velocidade=" + velocidade +
                '}';
    }
}