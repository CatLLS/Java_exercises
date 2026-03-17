public class Torre{
    //atributos
    private int qtdeDiscos; //qtde de discos na torre
    private Pilha <Disco> pilhaDiscos;//eu posso fazer isso?
    //inicializadores
    public Torre(int t){
        this.qtdeDiscos = t;
        this.pilhaDiscos = new Pilha<Disco>(t);
    }
    //métodos(discoPush->vai usar pilhas, discoPop, qtdeDiscos, )
    public int quantosDiscos(){
        return qtdeDiscos;
    }
    public void preencherTorre(){
        for (int i=1; i<=t; i++){ 
            this.pilhaDiscos.push()
        }
    }
}