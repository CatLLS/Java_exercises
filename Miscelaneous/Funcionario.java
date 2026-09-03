public class Funcionario {
    protected final String nome;
    protected final double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularPagamento() { return salarioBase; }
}