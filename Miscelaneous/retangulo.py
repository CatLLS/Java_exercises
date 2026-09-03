from dataclasses import dataclass


@dataclass
class Retangulo:
    largura: float
    altura: float

    def calcular_area(self):
        return self.largura * self.altura

    def calcular_perimetro(self):
        return 2 * (self.largura + self.altura)