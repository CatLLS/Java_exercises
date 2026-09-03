public class Veiculo {
    protected final String placa;
    protected final String marca;

    public Veiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    public void mover() { System.out.println("Veiculo em movimento."); }
}