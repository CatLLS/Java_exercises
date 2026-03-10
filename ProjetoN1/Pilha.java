public class Pilha<T>{
    //atributos
    private int tamanho;
    private static final int TAMANHO_DEFAULT = 100;
    private int topoPilha;
    private T vetor[];
    //inicializadores
    public Pilha(int t){
        this.tamanho=t;
        vetor = (T[]) new Object[tamanho];
    }
    public Pilha(){
        this(TAMANHO_DEFAULT);
    }
    //métodos
    public boolean isEmpty(){
        return this.topoPilha == -1 ;
    }
    public boolean isFull(){
        return this.topoPilha==vetor.length -1 ;
    }
    public void push(T valor) throws Exception{
        if (!isFull()){
            this.vetor[++this.topoPilha] = valor;
        }else{
            throw new Exception("Overflow - Pilha Cheia");
        }
    }
    public T pop() throws Exception{
        if (!isEmpty()){
           return this.vetor[this.topoPilha--];
        }else{
            throw new Exception("Underflow - Pilha Vazia");
        }
    }
    public T top() throws Exception{
        if (!isEmpty()){
            return this.vetor[this.topoPilha];
        }else{
            throw new Exception("Underflow - Pilha Vazia");
        }
    }
    public int sizeElements(){
        return topoPilha+1;
    }

}