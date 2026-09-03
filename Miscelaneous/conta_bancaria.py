class ContaBancaria:
    def __init__(self, titular):
        self.__titular = titular
        self.__saldo = 0.0

    def __validar_valor(self, valor):
        if valor <= 0:
            raise ValueError("O valor deve ser maior que zero.")

    def depositar(self, valor):
        self.__validar_valor(valor)
        self.__saldo += valor

    def sacar(self, valor):
        self.__validar_valor(valor)
        if valor > self.__saldo:
            return False
        self.__saldo -= valor
        return True

    def consultar_saldo(self):
        return self.__saldo

    @property
    def titular(self):
        return self.__titular