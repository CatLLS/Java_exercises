public class Carro extends Veiculo{
    public String cor;
    public String modelo;

    public Carro(int ano, int preco, Motor motor, String cor, String modelo){
        super(ano, preco, motor);
        this.cor=cor;
        this.modelo=modelo;
    }

    @Override
    public String toString(){
        return super.toString()+"\nCor: "+this.cor+"\nModelo: "+this.modelo ; 
    }
}