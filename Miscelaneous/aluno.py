from dataclasses import dataclass


@dataclass
class Aluno:
    nome: str
    matricula: str
    nota_final: float

    def foi_aprovado(self):
        return self.nota_final >= 6.0

    def resumo(self):
        return f"{self.nome} ({self.matricula}): {self.foi_aprovado()}"