import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Pessoa ===");
        new Pessoa("Ana", 20).apresentar();
        new Pessoa("Bruno", 35).apresentar();

        System.out.println("\n=== Produto ===");
        new Produto("Caderno", 24.90, 10).exibirResumo();
        new Produto("Caneta", 3.50, 50).exibirResumo();
        new Produto("Mochila", 120, 4).exibirResumo();

        System.out.println("\n=== Retangulo ===");
        Retangulo primeiro = new Retangulo(3, 4);
        Retangulo segundo = new Retangulo(5, 6);
        System.out.printf("Areas: %.1f e %.1f | perimetros: %.1f e %.1f%n", primeiro.calcularArea(), segundo.calcularArea(), primeiro.calcularPerimetro(), segundo.calcularPerimetro());

        System.out.println("\n=== Aluno ===");
        System.out.println(new Aluno("Carlos", "A01", 8.5).resumo());
        System.out.println(new Aluno("Diana", "A02", 5.5).resumo());

        System.out.println("\n=== Conta bancaria ===");
        ContaBancaria conta = new ContaBancaria("Eva");
        conta.depositar(1000);
        System.out.println("Saque de 250 aceito: " + conta.sacar(250));
        System.out.println("Saque de 900 aceito: " + conta.sacar(900));
        System.out.printf("Saldo de %s: R$ %.2f%n", conta.getTitular(), conta.consultarSaldo());

        System.out.println("\n=== Biblioteca ===");
        Livro livro = new Livro("POO na pratica", "Equipe Java");
        Emprestimo emprestimo = new Emprestimo(livro, "Felipe");
        emprestimo.exibirResumo();
        try {
            new Emprestimo(livro, "Gabi");
        } catch (IllegalStateException erro) {
            System.out.println(erro.getMessage());
        }
        emprestimo.devolver();

        System.out.println("\n=== Veiculos ===");
        List<Veiculo> veiculos = List.of(new Carro("ABC-1234", "Ford"), new Moto("XYZ-5678", "Honda"));
        veiculos.forEach(Veiculo::mover);

        System.out.println("\n=== Funcionarios ===");
        List<Funcionario> funcionarios = List.of(new FuncionarioCLT("Helena", 3000, 500), new FuncionarioPJ("Igor", 5000, 0.15));
        funcionarios.forEach(funcionario -> System.out.printf("Pagamento: R$ %.2f%n", funcionario.calcularPagamento()));

        System.out.println("\n=== Notificacoes ===");
        List<Notificacao> notificacoes = List.of(new NotificacaoEmail(), new NotificacaoSMS(), new NotificacaoPush());
        notificacoes.forEach(notificacao -> notificacao.enviar("Manutencao concluida."));

        System.out.println("\n=== Ordem de manutencao ===");
        OrdemManutencao ordem = new OrdemManutencao(new Equipamento("ELE-001"), Prioridade.ALTA);
        ordem.atribuir(new TecnicoEletricista("Joao"));
        ordem.iniciarExecucao();
        ordem.adicionarEvidencia(new Evidencia("Foto do painel reparado."));
        ordem.encerrar("Substituicao do componente concluida.");
        System.out.println(ordem.resumo());
    }
}