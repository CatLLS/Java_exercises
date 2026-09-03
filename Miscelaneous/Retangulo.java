public class Retangulo {
    private final double largura;
    private final double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() { return largura * altura; }
    public double calcularPerimetro() { return 2 * (largura + altura); }
}