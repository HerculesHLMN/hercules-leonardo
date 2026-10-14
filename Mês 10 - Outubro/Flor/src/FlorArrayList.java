import java.util.ArrayList;
import java.util.List;

public class FlorArrayList {

    private List<Flor> flor;

    public FlorArrayList() {
        flor = new ArrayList<Flor>();
    }

    public void adicionarFlor(Flor f) {
        flor.add(f);
    }

    public List<Flor> obterFloresCliente(String nomeCliente) {
        List<Flor> floresCliente = new ArrayList<Flor>();

        for (Flor f : flor) {
            if (f.getNomeCliente().equalsIgnoreCase(nomeCliente)) {
                floresCliente.add(f);
            }
        }

        return floresCliente;
    }
}