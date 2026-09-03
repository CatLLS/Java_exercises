from veiculo import Veiculo


class Moto(Veiculo):
    def mover(self):
        print(f"Moto {self.marca} ziguezagueando com agilidade.")