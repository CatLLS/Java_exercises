class Livro:
    def __init__(self, titulo, autor):
        self.__titulo = titulo
        self.__autor = autor
        self.__disponivel = True

    @property
    def titulo(self):
        return self.__titulo

    @property
    def autor(self):
        return self.__autor

    def emprestar(self):
        if not self.__disponivel:
            return False
        self.__disponivel = False
        return True

    def devolver(self):
        self.__disponivel = True