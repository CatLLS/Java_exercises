public class Moto extends Veiculo {
    public Moto(String placa, String marca) { super(placa, marca); }
    @Override public void mover() { System.out.println("Moto " + marca + " ziguezagueando com agilidade."); }
}