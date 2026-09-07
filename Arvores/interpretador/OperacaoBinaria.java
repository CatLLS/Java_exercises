package interpretador;

public class OperacaoBinaria implements NoExpressao {
    private final char operador;
    private final NoExpressao esquerda;
    private final NoExpressao direita;

    public OperacaoBinaria(char operador, NoExpressao esquerda, NoExpressao direita) {
        this.operador = operador;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double interpretar() {
        double esqVal = esquerda.interpretar();
        double dirVal = direita.interpretar();

        switch (operador) {
            case '+': return esqVal + dirVal;
            case '-': return esqVal - dirVal;
            case '*': return esqVal * dirVal;
            case '/': 
                if (dirVal == 0) {
                    throw new ArithmeticException("Erro: Divisão por zero!");
                }
                return esqVal / dirVal;
            default:
                throw new IllegalArgumentException("Operador desconhecido: " + operador);
        }
    }
}
