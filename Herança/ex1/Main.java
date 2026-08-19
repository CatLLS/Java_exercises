public class Main{
    public static void main(String[]args){
        Pessoa pessoa1 = new Pessoa(1, "Nome da Pessoa");
        PessoaJuridica p_juridica = new PessoaJuridica(2, "Nome da Pessoa Juridica",
        "1111111111");
        PessoaFisica p_fisica = new PessoaFisica(3, "Nome da Pessoa Fisica",
        "222222222", "333333333");
        System.out.printf("Id: %d\n", pessoa1.identificador);
        System.out.println("Nome: " + pessoa1.nome);
        System.out.printf("Id: %d\n", p_juridica.identificador);
        System.out.println("Nome: " + p_juridica.nome);
        System.out.println("CNPJ: " + p_juridica.cnpj);
        System.out.printf("Id: %d\n", p_fisica.identificador);
        System.out.println("Nome: " + p_fisica.nome);
        System.out.println("RG: " + p_fisica.rg);
        System.out.println("CPF: " + p_fisica.cpf);
    }
}