public class FlorPrincipal {

    public static void main(String[] args) {

        Flor f1 = new Flor("Rosa", 10.0, "João");
        Flor f2 = new Flor("Girassol", 15.0, "Maria");
        Flor f3 = new Flor("Tulipa", 12.0, "João");

        FlorArrayList l1 = new FlorArrayList();

        l1.adicionarFlor(f1);
        l1.adicionarFlor(f2);
        l1.adicionarFlor(f3);

        System.out.println(l1.obterFloresCliente("João"));
    }
}