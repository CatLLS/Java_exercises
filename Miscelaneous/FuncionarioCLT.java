public class FuncionarioCLT extends Funcionario {
    private final double beneficio;

    public FuncionarioCLT(String nome, double salarioBase, double beneficio) {
        super(nome, salarioBase);
        this.beneficio = beneficio;
    }

    @Override public double calcularPagamento() { return salarioBase + beneficio; }
}