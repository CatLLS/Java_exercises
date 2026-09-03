public class TecnicoMecanico implements Tecnico {
    private final String nome;

    public TecnicoMecanico(String nome) { this.nome = nome; }
    @Override public boolean estaHabilitadoPara(Equipamento equipamento) { return equipamento.getIdentificacao().startsWith("MEC"); }
    @Override public String getNome() { return nome; }
}