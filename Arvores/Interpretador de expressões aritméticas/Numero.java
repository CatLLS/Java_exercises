public class Numero implements Expressao{
    private int valor;
    public Numero(int valor){
        this.valor=valor;
    }
    public int interpretar(){
        return valor;
    }
}