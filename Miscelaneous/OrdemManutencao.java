import java.util.ArrayList;
import java.util.List;

public class OrdemManutencao {
    private EstadoOrdem estado = EstadoOrdem.ABERTA;
    private final Prioridade prioridade;
    private final Equipamento equipamento;
    private Tecnico tecnico;
    private final List<Evidencia> evidencias = new ArrayList<>();
    private String justificativaEncerramento;

    public OrdemManutencao(Equipamento equipamento, Prioridade prioridade) {
        this.equipamento = equipamento;
        this.prioridade = prioridade;
    }

    public void atribuir(Tecnico tecnico) {
        exigirNaoEncerrada();
        if (!tecnico.estaHabilitadoPara(equipamento)) throw new IllegalArgumentException("Tecnico nao habilitado para o equipamento.");
        this.tecnico = tecnico;
        estado = EstadoOrdem.ATRIBUIDA;
    }

    public void iniciarExecucao() {
        exigirNaoEncerrada();
        if (tecnico == null) throw new IllegalStateException("A ordem precisa de um tecnico.");
        estado = EstadoOrdem.EM_EXECUCAO;
    }

    public void adicionarEvidencia(Evidencia evidencia) {
        exigirNaoEncerrada();
        evidencias.add(evidencia);
    }

    public void encerrar(String justificativa) {
        exigirNaoEncerrada();
        if (evidencias.isEmpty()) throw new IllegalStateException("Inclua ao menos uma evidencia.");
        if (justificativa == null || justificativa.isBlank()) throw new IllegalArgumentException("A justificativa e obrigatoria.");
        justificativaEncerramento = justificativa;
        estado = EstadoOrdem.ENCERRADA;
    }

    public String resumo() {
        return "Prioridade: " + prioridade + " | estado: " + estado + " | justificativa: " + justificativaEncerramento;
    }

    private void exigirNaoEncerrada() {
        if (estado == EstadoOrdem.ENCERRADA) throw new IllegalStateException("Ordem encerrada nao pode ser alterada.");
    }
}