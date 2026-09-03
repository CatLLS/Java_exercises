import java.time.LocalDate;

public class Emprestimo {
    private final Livro livro;
    private final String aluno;
    private final LocalDate dataRetirada;

    public Emprestimo(Livro livro, String aluno) {
        if (!livro.emprestar()) throw new IllegalStateException("Livro indisponivel para emprestimo.");
        this.livro = livro;
        this.aluno = aluno;
        this.dataRetirada = LocalDate.now();
    }

    public void devolver() { livro.devolver(); }

    public void exibirResumo() {
        System.out.println("Emprestimo: " + livro.getTitulo() + " (" + livro.getAutor() + ") para " + aluno + " em " + dataRetirada);
    }
}