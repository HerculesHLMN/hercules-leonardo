public class Veiculo {

    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private double preco;

    public Veiculo(String marca, String modelo, String placa, int ano, double preco) {
       setMarca(marca);
       setModelo(modelo);
       setPlaca(placa);
       setAno(ano);
       setPreco(preco);

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Erro, Marca Inválida!");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Erro, Modelo Inválido!");
        }
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("Erro, Placa Inválida!");
        }
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 0) {
            throw new IllegalArgumentException("Erro, Ano Inválido!");
        }
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Erro, Preço Inválido!");
        }
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Placa: " + placa + "\n" +
                "Ano: " + ano + "\n" +
                "Preço: R$" + preco;
    }
}
