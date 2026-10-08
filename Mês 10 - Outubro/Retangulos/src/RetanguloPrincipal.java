public class RetanguloPrincipal {
    public static void main(String[] args) {

        Retangulo r1 = new Retangulo(5, 4);
        Retangulo r2 = new Retangulo(18, 1);

        RetanguloArrayList l1 = new RetanguloArrayList();

        l1.adicionarRetangulo(r1);
        l1.adicionarRetangulo(r2);

        System.out.println(l1.obterRetanguloMaiorArea());
        System.out.println(l1.obterRetanguloMaiorPerimetro());



    }
}
