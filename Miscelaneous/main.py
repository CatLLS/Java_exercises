from aluno import Aluno
from carro import Carro
from conta_bancaria import ContaBancaria
from equipamento import Equipamento
from emprestimo import Emprestimo
from evidencia import Evidencia
from estado_ordem import EstadoOrdem
from funcionario_clt import FuncionarioCLT
from funcionario_pj import FuncionarioPJ
from livro import Livro
from moto import Moto
from notificacao_email import NotificacaoEmail
from notificacao_push import NotificacaoPush
from notificacao_sms import NotificacaoSMS
from ordem_manutencao import OrdemManutencao
from pessoa import Pessoa
from prioridade import Prioridade
from produto import Produto
from retangulo import Retangulo
from tecnico_eletricista import TecnicoEletricista


def main():
    print("=== Pessoa ===")
    Pessoa("Ana", 20).apresentar()
    Pessoa("Bruno", 35).apresentar()

    print("\n=== Produto ===")
    for produto in (Produto("Caderno", 24.90, 10), Produto("Caneta", 3.50, 50), Produto("Mochila", 120, 4)):
        produto.exibir_resumo()

    print("\n=== Retangulo ===")
    retangulos = (Retangulo(3, 4), Retangulo(5, 6))
    print("Areas:", [retangulo.calcular_area() for retangulo in retangulos])
    print("Perimetros:", [retangulo.calcular_perimetro() for retangulo in retangulos])

    print("\n=== Aluno ===")
    for aluno in (Aluno("Carlos", "A01", 8.5), Aluno("Diana", "A02", 5.5)):
        print(aluno.resumo())

    print("\n=== Conta bancaria ===")
    conta = ContaBancaria("Eva")
    conta.depositar(1000)
    print("Saque de 250 aceito:", conta.sacar(250))
    print("Saque de 900 aceito:", conta.sacar(900))
    print(f"Saldo de {conta.titular}: R$ {conta.consultar_saldo():.2f}")

    print("\n=== Biblioteca ===")
    livro = Livro("POO na pratica", "Equipe Python")
    emprestimo = Emprestimo(livro, "Felipe")
    emprestimo.exibir_resumo()
    try:
        Emprestimo(livro, "Gabi")
    except ValueError as erro:
        print(erro)
    emprestimo.devolver()

    print("\n=== Veiculos ===")
    for veiculo in (Carro("ABC-1234", "Ford"), Moto("XYZ-5678", "Honda")):
        veiculo.mover()

    print("\n=== Funcionarios ===")
    for funcionario in (FuncionarioCLT("Helena", 3000, 500), FuncionarioPJ("Igor", 5000, 0.15)):
        print(f"Pagamento: R$ {funcionario.calcular_pagamento():.2f}")

    print("\n=== Notificacoes ===")
    notificacoes = (NotificacaoEmail(), NotificacaoSMS(), NotificacaoPush())
    for notificacao in notificacoes:
        notificacao.enviar("Manutencao concluida.")

    print("\n=== Ordem de manutencao ===")
    ordem = OrdemManutencao(Equipamento("ELE-001"), Prioridade.ALTA)
    ordem.atribuir(TecnicoEletricista("Joao"))
    ordem.iniciar_execucao()
    ordem.adicionar_evidencia(Evidencia("Foto do painel reparado."))
    ordem.encerrar("Substituicao do componente concluida.")
    print(ordem.resumo())


if __name__ == "__main__":
    main()