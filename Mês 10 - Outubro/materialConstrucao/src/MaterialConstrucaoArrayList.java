import java.util.ArrayList;
import java.util.List;

public class MaterialConstrucaoArrayList {

    private List<MaterialConstrucao> materiaisConstrucao;

    public MaterialConstrucaoArrayList() {
        materiaisConstrucao = new ArrayList<MaterialConstrucao>();

    }

    public void adicionarMateriais(MaterialConstrucao m) {
        materiaisConstrucao.add(m);
    }

    public MaterialConstrucao materialConstrucaoMaisCaro(String marca) {
        MaterialConstrucao materialConstrucaoMaisCaro = null;
        double precoMaior = Double.MIN_VALUE;

        for (MaterialConstrucao m : materiaisConstrucao) {
            if (marca.equals(m.getMarca()) && m.getPreco() > precoMaior) {
                materialConstrucaoMaisCaro = m;
                precoMaior = m.getPreco();
            }
        }

        return materialConstrucaoMaisCaro;
    }

    public List<MaterialConstrucao> buscarEstoque(double precoInicial, double precoFinal, String marca) {
        List<MaterialConstrucao> buscarEstoque = new ArrayList<>();

        for (MaterialConstrucao m : materiaisConstrucao) {
            if (marca.equals(m.getMarca()) && m.getPreco() >= precoInicial && m.getPreco() <= precoFinal) {
                buscarEstoque.add(m);
            }
        }

        return buscarEstoque;
    }
}