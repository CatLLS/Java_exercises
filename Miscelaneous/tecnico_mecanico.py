from tecnico import Tecnico


class TecnicoMecanico(Tecnico):
    def __init__(self, nome):
        self.nome = nome

    def esta_habilitado_para(self, equipamento):
        return equipamento.identificacao.startswith("MEC")