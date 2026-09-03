public class ContaBancaria {
    private final String titular;
    private double saldo;

    public ContaBancaria(String titular) { this.titular = titular; }

    public void depositar(double valor) {
        validarValor(valor);
        saldo += valor;
    }

    public boolean sacar(double valor) {
        validarValor(valor);
        if (valor > saldo) return false;
        saldo -= valor;
        return true;
    }

    public double consultarSaldo() { return saldo; }
    public String getTitular() { return titular; }

    private void validarValor(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("O valor deve ser maior que zero.");
    }
}