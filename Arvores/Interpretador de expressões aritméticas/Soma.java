public class Soma implements Expressao{
    private Expressao esq;
    private Expressao dir;

    public Soma(Expressao esq, Expressao dir){
        this.esq=esq;
        this.dir=dir;
    }
    public interpretar(){
        return esq.interpretar()+dir.interpretar();
    }

}