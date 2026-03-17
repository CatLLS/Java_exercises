import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception{
        java.util.Scanner entrada = new Scanner(System.in);

        FilaCircular filaPar = new FilaCircular(30);
        FilaCircular filaImpar = new FilaCircular(30);
        Pilha pilha = new Pilha(30);

        int num;
        do{
            System.out.print("Número: ");
            num = entrada.nextInt();
            if (num !=0){
                if (num % 2 == 0){
                    filaPar.enQueue(num);
                }else{
                    filaImpar.enQueue(num);
                }

            }
        }while(num != 0);


        boolean vezImpar = true;
        Integer valor;
        while(!filaImpar.qIsEmpty() || !filaPar.qIsEmpty()){

           if (vezImpar && !filaImpar.qIsEmpty()) 
            valor = filaImpar.deQueue();
           else if (!filaPar.qIsEmpty())
            valor = filaPar.deQueue();
        
           if(valor>0){
            pilha.push(valor);
           }else{
            if(!pilha.isEmpty()){
                pilha.pop();
            }
           }
           vezImpar = !vezImpar;
        }

        entrada.close()
    }
}