import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        java.util.Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a expressão com parênteses: ");
        String expressao = entrada.nextLine();
        try{
            boolean balanceado = true;
            PilhaGeral<Character> p1 = new PilhaGeral<Character>(expressao.length());
            for(int i=0; i<expressao.length(); i++){
                char e = expressao.charAt(i);
                if (e== '(' ){ p1.push(e); }

                else if (e== ')'){
                    if (p1.isEmpty()){
                        balanceado = false;
                        break;
                    }
                    p1.pop(); 
                }  
            }
            if (balanceado && p1.isEmpty())
                System.out.println("Está balanceado.");
            else
                System.out.println("Não está balanceado.");
        }catch (Exception e){
            System.out.printf("Erro: %s\n", e.getMessage());
        }

    }

}