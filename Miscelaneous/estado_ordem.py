from enum import Enum, auto


class EstadoOrdem(Enum):
    ABERTA = auto()
    ATRIBUIDA = auto()
    EM_EXECUCAO = auto()
    ENCERRADA = auto()