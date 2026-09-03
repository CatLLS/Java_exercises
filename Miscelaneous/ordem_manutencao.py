from estado_ordem import EstadoOrdem


class OrdemManutencao:
    def __init__(self, equipamento, prioridade):
        self.__equipamento = equipamento
        self.__prioridade = prioridade
        self.__estado = EstadoOrdem.ABERTA
        self.__tecnico = None
        self.__evidencias = []
        self.__justificativa_encerramento = None

    def __exigir_nao_encerrada(self):
        if self.__estado is EstadoOrdem.ENCERRADA:
            raise RuntimeError("Ordem encerrada nao pode ser alterada.")

    def atribuir(self, tecnico):
        self.__exigir_nao_encerrada()
        if not tecnico.esta_habilitado_para(self.__equipamento):
            raise ValueError("Tecnico nao habilitado para o equipamento.")
        self.__tecnico = tecnico
        self.__estado = EstadoOrdem.ATRIBUIDA

    def iniciar_execucao(self):
        self.__exigir_nao_encerrada()
        if self.__tecnico is None:
            raise RuntimeError("A ordem precisa de um tecnico.")
        self.__estado = EstadoOrdem.EM_EXECUCAO

    def adicionar_evidencia(self, evidencia):
        self.__exigir_nao_encerrada()
        self.__evidencias.append(evidencia)

    def encerrar(self, justificativa):
        self.__exigir_nao_encerrada()
        if not self.__evidencias:
            raise RuntimeError("Inclua ao menos uma evidencia.")
        if not justificativa or not justificativa.strip():
            raise ValueError("A justificativa e obrigatoria.")
        self.__justificativa_encerramento = justificativa
        self.__estado = EstadoOrdem.ENCERRADA

    def resumo(self):
        return f"Prioridade: {self.__prioridade.name} | estado: {self.__estado.name} | justificativa: {self.__justificativa_encerramento}"