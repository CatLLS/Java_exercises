import java.util.LinkedList;
import java.util.Queue;


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
    public int contaNos(){
        return contaNos(pai);
    }
    private int contaNos(NoBinario atual){
        if(atual == null) return 0;
        return contaNos(atual.esquerda)+contaNos(atual.direita)+1; //raiz
    }

    public int contaFolhas(){
        return contaFolhas(pai);
    }
    private int contaFolhas(NoBinario atual){
        if (atual == null) return 0;
        if (atual.direita == null && atual.esquerda == null){
            return 1;
        }
        return contaFolhas(atual.direita)+contaFolhas(atual.esquerda);
    }

    public int contaInternos(){
        return contaInternos(pai);
    }
    private int contaInternos(NoBinario atual){
        if(atual == null) return 0;
        if(atual.direita == null && atual.esquerda == null) {
            return 0;
        }else{
            return contaInternos(atual.direita)+contaInternos(atual.esquerda)+1;
        }
    }

    //Escrever um algoritmo para percorrer a árvore binária por nível
    public void percorrePorNivel(){
        System.out.print(pai.data+ "\n"); //raiz

        while()
    }
    public void percorrePorNivel(NoBinario atual){
        if() return;
        Queue<NoBinario> fila = new LinkedList<>();

        fila.queue(atual);

       if(atual.esquerda != null) System.out.print(atual.esquerda.data+ " ");
       if(atual.direita != null) System.out.print(atual.direita.data+ " \n");

       percorrePorNivel(atual.esquerda);
       percorrePorNivel(atual.direita);
    }

    import java.util.LinkedList;
import java.util.Queue;

public class ArvoreBinaria {
    NoBinario pai; // Sua raiz

    // Primeiro método (Inicia a jornada a partir da raiz)
    public void percorrePorNivel() {
        if (pai == null) return;
         Queue<NoBinario> fila = new LinkedList<>();
         fila.add(atual);
        // Apenas repassa a raiz para o método principal que faz o trabalho
        percorrePorNivel(pai);
         while (!fila.isEmpty()) {
            NoBinario noVisitado = fila.poll();
            System.out.print(noVisitado.data + " ");
            if (noVisitado.esquerda != null) {
                fila.add(noVisitado.esquerda);
            }
            if (noVisitado.direita != null) {
                fila.add(noVisitado.direita);
            }
        }
        System.out.println(); 
    }

       
    }
}




    public int altura(){
       return altura(pai);
    }
    private int altura(NoBinario atual){
        if(atual == null) return 0;
        return 1+ Math.max(altura(atual.esquerda), altura(atual.direita));
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