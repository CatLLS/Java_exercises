public class Aluno {
    private final String nome;
    private final String matricula;
    private final double notaFinal;

    public Aluno(String nome, String matricula, double notaFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

    public boolean foiAprovado() { return notaFinal >= 6.0; }
    public String resumo() { return nome + " (" + matricula + "): " + foiAprovado(); }
}