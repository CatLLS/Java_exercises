from tecnico import Tecnico


class TecnicoEletricista(Tecnico):
    def __init__(self, nome):
        self.nome = nome

    def esta_habilitado_para(self, equipamento):
        return equipamento.identificacao.startswith("ELE")