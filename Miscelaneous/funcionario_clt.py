from funcionario import Funcionario


class FuncionarioCLT(Funcionario):
    def __init__(self, nome, salario_base, beneficio):
        super().__init__(nome, salario_base)
        self.beneficio = beneficio

    def calcular_pagamento(self):
        return self.salario_base + self.beneficio