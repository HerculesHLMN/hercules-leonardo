public class classeCirculoPrincipal {
    public static void main(String[] args) {

        classeCirculo c1 = new classeCirculo();
        classeCirculo c2 = new classeCirculo();
        classeCirculo c3 = new classeCirculo();
        classeCirculo c4 = new classeCirculo();

        c1.raio = 1;
        c2.raio = 5;
        c3.raio = 4;
        c4.raio = 2.5;

        System.out.println("\n" + "Área: " + c4.calcularArea());

    }
}
