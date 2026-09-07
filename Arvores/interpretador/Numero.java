package interpretador;

public class Numero implements NoExpressao {
    private final double valor;

    public Numero(double valor) {
        this.valor = valor;
    }

    @Override
    public double interpretar() {
        return this.valor;
    }
}