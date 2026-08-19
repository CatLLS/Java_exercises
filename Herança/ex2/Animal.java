public class Animal{
    public String nome;
    public String cor;
    public int numeroPatas;

    public Animal(String nome, String cor, int n){
        this.nome = nome;
        this.cor= cor;
        this.numeroPatas=n;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + "\nCor: "+ this.cor + "\nNumero de Patas: " + this.numeroPatas;
    }
    public void exibir_dados(){
        System.out.println(this); 
    }
}