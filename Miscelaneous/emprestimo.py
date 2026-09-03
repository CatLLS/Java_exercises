from datetime import date


class Emprestimo:
    def __init__(self, livro, aluno):
        if not livro.emprestar():
            raise ValueError("Livro indisponivel para emprestimo.")
        self.livro = livro
        self.aluno = aluno
        self.data_retirada = date.today()

    def devolver(self):
        self.livro.devolver()

    def exibir_resumo(self):
        print(f"Emprestimo: {self.livro.titulo} ({self.livro.autor}) para {self.aluno} em {self.data_retirada}")