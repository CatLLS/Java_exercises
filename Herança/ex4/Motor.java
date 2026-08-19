public class Motor{
    public int cilindradas;
    public int potencia;

    public Motor(int c, int p){
        this.cilindradas=c;
        this.potencia=p;
    }

    @Override
    public String toString(){
        return "Motor-Cilindradas: "+this.cilindradas+"\nMotor-Potência: "+this.potencia;
    }
    public void exibirDados(){
        System.out.println(this);
    }
}