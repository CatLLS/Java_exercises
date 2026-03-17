public class FilaCircular{
    //atributos
    private int tamanho;
    private static final TAMDEF = 100;
    private vetor[];
    private int front;
    private int rear;
    private int qtde;
    //inicializadores
    public FilaCircular(int tamanho){
        this.tamanho = tamanho;
        qtde = 0;
        front = 0;
        rear = 0;
        vetor = new int[tamanho];
    }
    public FilaCircular(){
        this(TAMDEF);
    }
    //métodos
    public boolean qIsEmpty(){
        return this.qtde== 0;
    }
    public boolean qIsFull(){
        return this.qtde==tamanho;
    }
    public void enQueue(int num) throws Exception{
        if (!qIsFull){
            //coloca no final
            vetor[rear++]=num;
            rear = rear % this.tamanho
            qtde++;
        }else{
            throw new Exception("Overflow - fila cheia");
        }
    }
    public int deQueue() throws Exception{
        //tira do começo
        if(!qIsEmpty){
            int temp;
            temp = vetor[front];
            front = ++front % this.tamanho;
            qtde --;
            return  temp;
        }else{
            throw new Exception("Underflow - fila vazia");
        }
    }
    public int front()throws Exception{
        return vetor[front];
    }
    public int rear(){
        return vetor[rear];
    }
    public int size(){
        return qtde;
    }

}