import java.util.Scanner; 

public class Main{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String input= scanner.nextLine(); 
    do{
        
        input= scanner.nextLine(); 
    }while(input!="fim");
    
    }

/*
    algoritmo de gerar arvore

    void E(){
        T()
        while( buf[i] == '+'||buf[i]=='-'){
            cria_operador(buf[i]);
            E();
        }
    }
    void T(){
        F()
        while(buf[i]=='*'||buf[i]='/'){
            cria_operador(buf[i])
            T()
        }
    }
    void F(){
        if(buf[i]=='('){
            avança()//n colocar na arvore os parenteses
            E()
            avança()
        }else{
            cria_No('num');
        }

    }

    */


}