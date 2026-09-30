public class classeVelocidadeCarroPrincipal {
    public static void main(String[] args) {

        classeVelocidadeCarro c1 = new classeVelocidadeCarro(50);

        System.out.println("\nVelocidade: " + c1.getVelocidade());

        c1.acelerar(10);
        System.out.println("Velocidade Pós Aceleração: " + c1.getVelocidade());

        c1.reduzir(15);
        System.out.println("Velocidade Pós Redução: " + c1.getVelocidade());

    }
}