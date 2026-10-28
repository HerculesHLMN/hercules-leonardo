public class MaterialConstrucao {

    private String marca;
    private String modelo;
    private double preco;
    private int quantidadeEstoque;


    public MaterialConstrucao(String marca, String modelo, double preco, int quantidadeEstoque) {
        setMarca(marca);
        setModelo(modelo);
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Erro, Marca Inválida");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw  new IllegalArgumentException("Erro, Modelo Inválido!");
        }
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0 ) {
            throw  new IllegalArgumentException("Erro, Preço Inválido!");
        }
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque < 0) {
            throw new IllegalArgumentException("Erro, Quantidade Inválido");
        }

        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void adicionarEstoque(int adiciona) {
        if (adiciona <= 0) {
            throw new IllegalArgumentException("Erro, Quantidade Inválida!");

        }

        quantidadeEstoque += adiciona;
    }

    public void venderProdutos(int venda) {
        if (venda > quantidadeEstoque || venda <= 0) {
            throw new IllegalArgumentException("Erro, Quantia Informada Ultrapassa o Estoque!");
        }

       quantidadeEstoque -= venda;

    }

    @Override
    public String toString() {
        return "\nmarca = " + marca +
                "\nmodelo = " + modelo +
                "\npreco = " + preco +
                "\nquantidadeEstoque = " + quantidadeEstoque;
    }
}