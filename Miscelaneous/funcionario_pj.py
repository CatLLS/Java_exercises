from funcionario import Funcionario


class FuncionarioPJ(Funcionario):
    def __init__(self, nome, salario_base, percentual_imposto):
        super().__init__(nome, salario_base)
        self.percentual_imposto = percentual_imposto

    def calcular_pagamento(self):
        return self.salario_base * (1 - self.percentual_imposto)