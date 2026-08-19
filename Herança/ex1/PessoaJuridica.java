public class PessoaJuridica extends Pessoa{
    public String cnpj;
    public PessoaJuridica(int id, String nome, String cnpj){
        super(id,nome);
        this.cnpj = cnpj;
    }
}