import java.util.ArrayList;
import java.util.List;

public class RetanguloArrayList {

    private List<Retangulo> retangulo;

    public RetanguloArrayList() {
        retangulo = new ArrayList<Retangulo>();

    }

    public void adicionarRetangulo(Retangulo r) {
        retangulo.add(r);
    }

    public Retangulo obterRetanguloMaiorArea() {
        double maiorArea = Double.MIN_VALUE;
        Retangulo maiorAreaRetangulo = null;

        for (Retangulo r : retangulo) {
            if (r.obterMaiorArea() > maiorArea) {
                maiorArea = r.obterMaiorArea();
                maiorAreaRetangulo = r;
            }
        }
        return maiorAreaRetangulo;

    }

    public Retangulo obterRetanguloMaiorPerimetro() {
        double maiorPerimetro = Double.MIN_VALUE;
        Retangulo maiorPerimetroRetangulo = null;

        for (Retangulo r : retangulo) {
            if (r.obterMaiorPerimetro() > maiorPerimetro) {
                maiorPerimetro = r.obterMaiorPerimetro();
                maiorPerimetroRetangulo = r;
            }
        }
        return maiorPerimetroRetangulo;
    }
}