from abc import ABC, abstractmethod


class Tecnico(ABC):
    @abstractmethod
    def esta_habilitado_para(self, equipamento):
        pass