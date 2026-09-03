public class Produto {
    private final String nome;
    private final double preco;
    private final int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirResumo() {
        System.out.printf("Produto: %s | R$ %.2f | estoque: %d%n", nome, preco, quantidadeEmEstoque);
    }
}