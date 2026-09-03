from veiculo import Veiculo


class Carro(Veiculo):
    def mover(self):
        print(f"Carro {self.marca} acelerando pelas quatro rodas.")