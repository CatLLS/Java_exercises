public class Pilha{
    //atributos
    private static final int TAMANHO_DEFAULT = 100; //contante(final) vale para todos(static)
    private int topoPilha; //a gnt n inicializa atributos! só no contrutor se tiver um
    private int elementos[];
    //construtor(es)
    public Pilha(int tamanho){
        this.elementos = new int[tamanho]; //this é tipo o self, se refere ao próprio objeto
        this.topoPilha = -1;//pilha vazia
    }
    public Pilha(){//caso vc n dê tamanho
        this(TAMANHO_DEFAULT); //ele chama o outro construtor e manda para ele o valor
    }
    //métodos
    public boolean isEmpty(){
        return topoPilha == -1;
        /*if (this.topoPilha == -1)
            return true;
        return false;*/
    }
    public boolean isFull(){
        return topoPilha == (elementos.length()-1);
    }
    public void push(int e) throws Exception{
        if(!this.isFull()){
            elementos[++topoPilha] = e;
        }
        else{
            //tratamento de excessão!
            throw new Exception("Overflow - Estouro de pilha");
        }
    }
    public int pop() throws Exception{
        if(!this.isEmpty()){
            return this.elementos[this.topoPilha--];
        }
        else{
            throw new Exception("Underflow - esvaziamento da pilha");
        }
    }
    public int topo() throws Exception{
        if(!this.isEmpty()){
            return this.elementos[topoPilha];
        } else{
            throw new Exception("Underflow - esvaziamento da pilha");
        }
    }
    public int sizeElements(){
        return topoPilha+1;
    }

}