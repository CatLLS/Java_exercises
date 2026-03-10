public class PilhaGeral<T>{
    //atributos
    private static final int TAMANHO_DEFAULT = 100;
    private int topoPilha;
    private T vetor[];
    //construtores
    public PilhaGeral(int tamanho){
        this.vetor = (T[]) new Object[tamanho]; //wrappers->usar Integer ao invés de int ao chamar T
        this.topoPilha=-1;
    }
    //métodos
    //sizeElements
    public boolean isEmpty(){
        return topoPilha == -1;
    }
    public boolean isFull(){
        return topoPilha== vetor.length -1;
    }
    public void push(T elemento) throws Exception{
        if (!this.isFull())
            this.vetor[++this.topoPilha] = elemento;
        else
            throw new Exception("Overflow - Pilha cheia");
    }
    public T pop() throws Exception{
        if(!this.isEmpty())
            return this.vetor[this.topoPilha--];
        else
            throw new Exception("Underflow, Pilha vazia");
    }
    public T top() throws Exception{
        if (!this.isEmpty())
            return this.vetor[topoPilha];
        else
            throw new Exception("Underflow, pilha vazia");
    }
    public int sizeElements(){
        return topoPilha+1;
    }

}