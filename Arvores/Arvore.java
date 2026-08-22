public class Arvore { 
    public NoBinario pai;

    public Arvore() { 
        pai = null; 
    } 

    public void inserirNo(int data) { 
        NoBinario temp = new NoBinario(data); 
        if (pai == null) { // Primeira inserção
            pai = temp; 
        } else { 
            onde(pai, temp); 
        } 
    } 

    private void onde(NoBinario paiAtual, NoBinario insercao) { 
        // Correção: Comparando os valores inteiros 'data' dos nós
        if (insercao.data <= paiAtual.data) { 
            if (paiAtual.esquerda == null) { 
                paiAtual.esquerda = insercao; 
            } else { 
                onde(paiAtual.esquerda, insercao); 
            } 
        } else { 
            if (paiAtual.direita == null) { 
                paiAtual.direita = insercao; 
            } else { 
                onde(paiAtual.direita, insercao); 
            } 
        } 
    } 

    public NoBinario busca(int data){
        return encontre(pai, data);
    }
    private NoBinario encontre(NoBinario temp, int data){
        if(temp == null){
            return null;
        }
        if(data == temp.data) return temp;
        if(data < temp.data) return encontre(temp.esquerda, data);
        
        return encontre(temp.direita, data);
    }

       public void percorrerPreOrdem(NoBinario raiz){
        if(raiz != null){
            System.out.print(raiz.data + " "); // Imprime o dado numérico (com espaço)
            percorrerPreOrdem(raiz.esquerda); 
            percorrerPreOrdem(raiz.direita);  
        }
    }
    
    public void percorrerInOrdem(NoBinario raiz){
        if(raiz != null){
            percorrerInOrdem(raiz.esquerda);   
            System.out.print(raiz.data + " "); 
            percorrerInOrdem(raiz.direita);    
        }
    }
    
    public void percorrerPosOrdem(NoBinario raiz){
        if(raiz != null){
            percorrerPosOrdem(raiz.esquerda);  
            percorrerPosOrdem(raiz.direita);  
            System.out.print(raiz.data + " "); 
        }
    }


}