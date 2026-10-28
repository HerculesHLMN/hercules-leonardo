public class MaterialConstrucaoPrincipal {
    public static void main(String[] args) {

        MaterialConstrucao m1 = new MaterialConstrucao("Tijucon", "Argamassa", 14.90, 10);
        MaterialConstrucao m2 = new MaterialConstrucao("Coral", "Tinta Acrílica", 109.90, 5);
        MaterialConstrucao m3 = new MaterialConstrucao("Tigre", "Cano PVC", 26.32, 20);
        MaterialConstrucao m4 = new MaterialConstrucao("Coral", "Tinta Emborrachada", 300, 8);

        m1.venderProdutos(6);
        System.out.println(m1);

        MaterialConstrucaoArrayList l1 = new MaterialConstrucaoArrayList();

        l1.adicionarMateriais(m1);
        l1.adicionarMateriais(m2);
        l1.adicionarMateriais(m3);
        l1.adicionarMateriais(m4);

        System.out.println(l1.materialConstrucaoMaisCaro("Coral"));
        System.out.println(l1.buscarEstoque(108, 300, "Coral"));


    }

}
