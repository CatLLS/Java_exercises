public class Torre{
    //atributos
    private int tamanho;
    private int topoDisco; //qtde de discos na torre
    private Pilha <Disco> pilhaDiscos;//eu posso fazer isso?
    //inicializadores
    public Torre(int t){
        this.tamanho = t;
        this.pilhaDiscos = new Pilha<Disco>(tamanho);
    }
    //métodos(discoPush->vai usar pilhas, discoPop, torreSize, )
}