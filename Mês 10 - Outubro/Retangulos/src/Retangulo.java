public class Retangulo {

    private double altura;
    private double base;

    public Retangulo(double altura, double base) {
        setAltura(altura);
        setBase(base);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("Erro, Altura Inválida!");
        }
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base < 0) {
            throw new IllegalArgumentException("Erro, Base Inválida!");
        }
        this.base = base;
    }

    public double obterMaiorArea() {
       return base * altura ;
    }

    public double obterMaiorPerimetro(){
        return (altura+base)*2;
    }

    @Override
    public String toString() {
        return "\nRetangulo: " +
                "\nAltura=" + altura +
                "\nBase=" + base;

    }
}
