public class ImovelVelho extends Imovel{
    public double desconto;

    public ImovelVelho(String e, double p, double d){
        super(e,p);
        this.desconto=d;
    }
    public double calcular_Preco(){
        return preco-desconto;
    }
}