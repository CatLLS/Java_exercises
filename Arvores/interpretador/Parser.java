package interpretador;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private final List<String> tokens;
    private int i;

    public Parser(String expressao) {
        this.tokens = tokenizar(expressao);
        this.i = 0;
    }

    // Separa a String em tokens válidos (números, operadores, parênteses)
    private List<String> tokenizar(String expressao) {
        List<String> listaTokens = new ArrayList<>();
        // Regex para capturar números decimais/inteiros ou operadores individuais
        Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+|[+\\-*/()]");
        Matcher matcher = pattern.matcher(expressao);
        
        while (matcher.find()) {
            listaTokens.add(matcher.group());
        }
        return listaTokens;
    }

    private String buf() {
        return (i < tokens.size()) ? tokens.get(i) : null;
    }

    private void avancar() {
        i++;
    }

    public NoExpressao analisar() {
        NoExpressao arvore = E();
        if (i < tokens.size()) {
            throw new RuntimeException("Erro sintático próximo ao token: " + buf());
        }
        return arvore;
    }

    // Regra E -> T ( ('+' | '-') T )*
    private NoExpressao E() {
        NoExpressao noEsquerdo = T();

        while (buf() != null && (buf().equals("+") || buf().equals("-"))) {
            char operador = buf().charAt(0);
            avancar();
            NoExpressao noDireito = T();
            noEsquerdo = new OperacaoBinaria(operador, noEsquerdo, noDireito);
        }
        return noEsquerdo;
    }

    // Regra T -> F ( ('*' | '/') F )*
    private NoExpressao T() {
        NoExpressao noEsquerdo = F();

        while (buf() != null && (buf().equals("*") || buf().equals("/"))) {
            char operador = buf().charAt(0);
            avancar();
            NoExpressao noDireito = F();
            noEsquerdo = new OperacaoBinaria(operador, noEsquerdo, noDireito);
        }
        return noEsquerdo;
    }

    // Regra F -> '(' E ')' | número
    private NoExpressao F() {
        String tokenAtual = buf();

        if ("(".equals(tokenAtual)) {
            avancar(); // Descarta '('
            NoExpressao no = E();
            if (!")".equals(buf())) {
                throw new RuntimeException("Erro: Parêntese de fechamento ')' esperado.");
            }
            avancar(); // Descarta ')'
            return no;
        } 
        
        if (tokenAtual != null && (tokenAtual.matches("\\d+\\.\\d+") || tokenAtual.matches("\\d+"))) {
            double valor = Double.parseDouble(tokenAtual);
            avancar();
            return new Numero(valor);
        }

        throw new RuntimeException("Token inesperado: " + tokenAtual);
    }
}
