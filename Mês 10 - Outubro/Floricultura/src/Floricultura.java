public class Floricultura {

    private String nomeFlor;
    private double precoFlor;
    private String nomeCliente;

    public Floricultura(String nomeFlor, double precoFlor, String nomeCliente) {
        setNomeFlor(nomeFlor);
        setPrecoFlor(precoFlor);
        setNomeCliente(nomeCliente);
    }

    public String getNomeFlor() {
        return nomeFlor;
    }

    public void setNomeFlor(String nomeFlor) {
        this.nomeFlor = nomeFlor;
    }

    public double getPrecoFlor() {
        return precoFlor;
    }

    public void setPrecoFlor(double precoFlor) {
        this.precoFlor = precoFlor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "Floricultura{" +
                "nomeFlor='" + nomeFlor + '\'' +
                ", precoFlor=" + precoFlor +
                ", nomeCliente='" + nomeCliente + '\'' +
                '}';
    }
}
