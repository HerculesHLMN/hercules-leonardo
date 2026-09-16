public class classeMercadoMetodoConstrutor {

    String nomeMercado;
    int macasVendidas;
    double precoMaca;
    int laranjasVendidas;
    double precoLaranja;

    public classeMercadoMetodoConstrutor(String nomeMercado, int macasVendidas, double precoMaca, int laranjasVendidas, double precoLaranja) {
        this.nomeMercado = nomeMercado;
        this.macasVendidas = macasVendidas;
        this.precoMaca = precoMaca;
        this.laranjasVendidas = laranjasVendidas;
        this.precoLaranja = precoLaranja;
    }

    public double calcularReceitaMacas() {
        return macasVendidas * precoMaca;
    }

    public double calcularReceitaLaranjas() {
        return laranjasVendidas * precoLaranja;
    }

    public double calcularReceitaTotal() {
        return calcularReceitaMacas() + calcularReceitaLaranjas();


    }
}