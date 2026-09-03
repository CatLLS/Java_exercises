public class Carro extends Veiculo {
    public Carro(String placa, String marca) { super(placa, marca); }
    @Override public void mover() { System.out.println("Carro " + marca + " acelerando pelas quatro rodas."); }
}