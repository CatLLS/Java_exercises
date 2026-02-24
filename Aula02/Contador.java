public class Contador{
    /*atributos:*/
    int valor;
    /*construtores:(usado para inicializar o objeto, se vc n colocar nada ele coloca um construtor default)*/
    /*deve ter o mesmo nome da classe, normalmente usamos para incializar vars*/
    public Contador(){
        valor = 0;
    }
    /* e métodos: */
    public void incrementa(){
        valor++;
    }
    public void zera(){
        valor = 0;
    }
    public int getValor(){
        return valor;
    }
}