public class PessoaFisica extends Pessoa{
    public String rg;
    public String cpf;

    public PessoaFisica(int id, String nome, String rg, String cpf){
        super(id,nome);
        this.rg=rg;
        this.cpf=cpf;
    }
}