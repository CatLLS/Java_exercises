public class ImovelNovo extends Imovel {
    public double adicional;

    public ImovelNovo(String e, double p, double a){
        super(e,p);
        this.adicional=a;
    }
    public double calcular_preco(){
        return preco+adicional;
    }
}