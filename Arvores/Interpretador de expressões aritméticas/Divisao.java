public class Divisao implements Expression{
    private Expressao esq;
    private Expressao dir;

    public Divisao(Expressao esq, Expressao dir){
        this.esq=esq;
        this.dir=dir;
    }
    public interpretar(){
        return esq.interpretar()/dir.interpretar();
    }
}