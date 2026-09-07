package interpretador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Exemplo fixo ou entrada do usuário
        System.out.println("Digite uma expressão matemática (ex: 3 + (4 * 5) - 2 / 2):");
        String entrada = scanner.nextLine();
        
        try {
            // 1. Instancia o gerador da árvore passando a expressão
            Parser parser = new Parser(entrada);
            
            // 2. Transforma a entrada do usuário em uma árvore (AST)
            NoExpressao arvoreGerada = parser.analisar();
            
            // 3. Executa a árvore usando o método interpretar
            double resultado = arvoreGerada.interpretar();
            
            System.out.println("Resultado final: " + resultado);
            
        } catch (Exception e) {
            System.err.println("Erro ao processar expressão: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
