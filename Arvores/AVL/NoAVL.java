public class NoAVL{
    public int h;
    public int dado;
    public int bal;//balanceamento 1=filho dir -1=filho esq , 0=sem filho
    NoAVL esq;
    NoAVL dir;

    public NoAVL(int dado){
        this.dado=dado;
        this.h=0;
        this.bal=0;
        this.esq=null;
        this.dir=null;
    }
}