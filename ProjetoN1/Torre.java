public class Torre{
    //atributos
    private int qtdeDiscos; //qtde de discos na torre
    private Pilha <Disco> pilhaDiscos;
    //inicializadores
    public Torre(int t){
        this.qtdeDiscos = t;
        this.pilhaDiscos = new Pilha<Disco>(t);
    }
    //métodos(discoPush->vai usar pilhas, discoPop, qtdeDiscos, )
    public int quantosDiscos(){
        return qtdeDiscos;
    }
    public void pushTorre(){
            this.pilhaDiscos.push()
    }
}