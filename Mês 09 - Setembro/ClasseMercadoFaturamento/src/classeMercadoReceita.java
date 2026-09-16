public class classeMercadoReceita {

    String nomeMercado;
    int macasVendidas;
    double precoMaca;
    int laranjasVendidas;
    double precoLaranja;

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
