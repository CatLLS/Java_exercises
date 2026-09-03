public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        // 1. Inserção de dados
        System.out.println("=== Inserindo Elementos ===");
        arvore.inserirNo(50);
        arvore.inserirNo(30);
        arvore.inserirNo(70);
        arvore.inserirNo(20);
        arvore.inserirNo(40);
        System.out.println("Elementos inseridos: 50, 30, 70, 20, 40\n");

        /*
                   50
                30      70
            20    40
        */

        System.out.println("Arvore possui: "+ arvore.contaNos() +" nós.");
        System.out.println("E "+ arvore.contaFolhas() +" folhas \nE "+arvore.contaInternos() +" internos.\n Com altura ="+ arvore.altura());
        arvore.percorrePorNivel();

        // 2. Teste dos Caminhamentos (Exibições)
        // Passamos 'arvore.pai' como argumento que é a raiz da árvore
        System.out.println("=== Caminhamento Pré-Ordem ===");
        arvore.percorrerPreOrdem(arvore.pai); 

        System.out.println("\n=== Caminhamento In-Ordem ===");
        arvore.percorrerInOrdem(arvore.pai); 

        System.out.println("\n=== Caminhamento Pós-Ordem ===");
        arvore.percorrerPosOrdem(arvore.pai); 

        // 3. Teste da Busca
        System.out.println("\n=== Testando a Busca ===");
        int valorSucesso = 40;
        int valorFalha = 99;

        // Teste de caso existente
        NoBinario busca1 = arvore.busca(valorSucesso);
        if (busca1 != null) {
            System.out.println("Sucesso: Nó com valor " + valorSucesso + " foi localizado!");
        } else {
            System.out.println("Erro: Não encontrou o " + valorSucesso);
        }

        // Teste de caso inexistente
        NoBinario busca2 = arvore.busca(valorFalha);
        if (busca2 != null) {
            System.out.println("Erro: Encontrou um nó que não deveria existir.");
        } else {
            System.out.println("Sucesso: Nó com valor " + valorFalha + " não existe na árvore (Retornou null).");
        }
    }
}
