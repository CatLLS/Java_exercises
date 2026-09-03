from dataclasses import dataclass


@dataclass
class Produto:
    nome: str
    preco: float
    quantidade_em_estoque: int

    def exibir_resumo(self):
        print(f"Produto: {self.nome} | R$ {self.preco:.2f} | estoque: {self.quantidade_em_estoque}")