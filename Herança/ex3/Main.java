public class Main{
    public static void main(String[]args){
        Imovel imovel = new Imovel("Rua Silva, 123", 300000.0);
        ImovelNovo imovel_novo = new ImovelNovo("Rua Joaquim, 999", 250000.0, 20000.0);ImovelVelho imovel_velho = new ImovelVelho("Av. Brasil, 777", 500000.0,
        35000.0);System.out.println(imovel.endereco);
        System.out.println("Pre¸co: %f", imovel.preco);
        System.out.println(imovel_novo.endereco);
        System.out.println("Pre¸co: %f", imovel_novo.preco);
        System.out.println("Pre¸co atual: %f", imovel_novo.calcular_preco());
        System.out.println(imovel_velho.endereco);
        System.out.println("Pre¸co: %f", imovel_velho.preco);
        System.out.println("Pre¸co atual: %f", imovel_velho.calcular_preco());
    }
}