public class Caminhao extends Veiculo{
    public float comprimento;

    public Caminhao(int ano, int preco, Motor motor, float comp ){
        super(ano, preco, motor);
        this.comprimento=comp;
    }

    @Override
    public String toString(){
        return super.toString()+"\nComprimento: "+this.comprimento;
    }//n precisa de alterar o metodo mae
}