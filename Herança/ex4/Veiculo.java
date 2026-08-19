public class Veiculo{
    public Motor motor;
    public int ano;
    public int preco;

    public Veiculo(int ano, int preco, Motor m){
        this.ano=ano;
        this.preco=preco;
        this.motor=m;
    }

    @Override
    public String toString(){
        return "Ano: "+this.ano+"\nPreço: "+this.preco+"\nMotor: "+this.motor;
    }

    public void exibirDados(){
        System.out.println(this);
    }

}