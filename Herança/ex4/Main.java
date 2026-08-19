public class Main{
    public static void main(String[]args){
        Motor motor1 = new Motor(1000, 500);
Motor motor2 = new Motor(8000, 900);
Carro carro = new Carro(2010, 20000, motor1, "branca", "gol");
Caminhao caminhao = new Caminhao(2015, 80000, motor2, 10);
carro.exibirDados(); caminhao.exibirDados(); // imprime os valores de todos os atributos do carro
// imprime os
    }
}