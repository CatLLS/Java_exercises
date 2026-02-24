/*importa tudo aqui em cima! */
import java.util.Scanner;



/*criando uma nova classe, é uma classe com o mesmo nome do arquivo */
public class Saudacao{
    public static void main(String[] args){
        /*Classes podem ser instanciadas como objetos, importando-as, criando um novo objeto */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine(); /*tipo, nomen valor; netx line lê tudo até o \n */
        /*next = ler o próximo string/int/etc, é um método da classe scanner a qual nosso objeto pertence */

        System.out.println("olá, "+nome+"!");/*não pode separar string por vírgula, mas pode concatenar com + */

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Nome: "+nome+"\nIdade: "+idade);
        /*ouuu: */
        System.out.printf("Nome: %s \nIdade: %d\n", nome, idade);

    }

}