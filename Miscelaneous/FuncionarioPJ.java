public class FuncionarioPJ extends Funcionario {
    private final double percentualImposto;

    public FuncionarioPJ(String nome, double salarioBase, double percentualImposto) {
        super(nome, salarioBase);
        this.percentualImposto = percentualImposto;
    }

    @Override public double calcularPagamento() { return salarioBase * (1 - percentualImposto); }
}