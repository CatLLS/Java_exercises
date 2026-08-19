public class Cachorro extends Animal{
    public String raca;

    public Cachorro(String nome, String cor, int numeroPatas, String raca){
        super(nome, cor, numeroPatas);
        this.raca=raca;
    }
    @Override
    public String toString(){
        return super.toString() + "\nRaça: " + this.raca;
    }
    //n precisa refazer a exibir dados assim
}