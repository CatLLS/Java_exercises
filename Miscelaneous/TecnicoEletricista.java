public class TecnicoEletricista implements Tecnico {
    private final String nome;

    public TecnicoEletricista(String nome) { this.nome = nome; }
    @Override public boolean estaHabilitadoPara(Equipamento equipamento) { return equipamento.getIdentificacao().startsWith("ELE"); }
    @Override public String getNome() { return nome; }
}