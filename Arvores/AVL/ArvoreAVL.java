public class ArvoreAVL{
    NoAVL raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }
    //fazer algorítmo de chacar se é avl tbm!
    //inclusão em arvores (com balanço só nessa semana)
    //armazenar o balanço! e ir olhando recursivamente para na volta arrumar o balanço
    public void insereComBalanco(int valor){
        insereComBalanco(raiz, valor);
    }
    public NoAVL insereComBalanco(NoAVL p, int valor){
        if(p==null){//primeira inserção, raiz
            p=new NoAVL(valor);
        }else if(valor < p.dado){//esquerda
            p.esq = insere(p.esq,valor);//é aqui que na recursão a gnt volta e reparenta os p's que foram girados
            switch(p.bal){
                case 1: p.bal = 0; break;
                case 0: p.bal = -1; break;
                case -1: p = caso1Bal(p); break;
            }
        }else if(valor > p.dado){//direita
            p.dir = insere(p.dir, valor);
            switch(p.bal){
                case -1: p.bal=0; break;
                case 0: p.bal=1; break;
                case 1: p = caso2Bal(p); break;
            }
        }
        return p;
    }
    caso1Bal(NoAVL p){//p é o desequilibrado, u é seu filho esq e v o filho direiro de u -> (p=des, u=p.esq, v=u.dir)
        NoAVL u,v;
        u = p.esq;
        //caso 1.1: RD(rotacao direita)
        if (u.bal == -1){// u.esq.h > u.dir.h
            p.esq = u.dir;
            u.dir = p;
            p.bal = 0;
            p=u;//para reparentar u como nova raiz desta sub-árvore
        }else{//caso 1.2: u.esq.h < u.dir.h (RDD)
            v = u.dir;

            u.dir = v.esq;
            p.esq=v.dir;
            v.esq=u;
            v.dir=p;
            if(v.bal == -1)//se v tinha mais filhos esq
                p.bal=1;//p, que herdou à esquerda seus filhos dir fica com + p/ direita
            else p.bal=0; //se não, p é balanceado

            if(v.bal == 1)//se v tinha mais filhos dir
                u.bal = -1; //u, que herdou os esquerdos de v fica com + p/esquerda
            else u.bal = 0;
            
            p = v;//para reparentar
        }
        p.bal = 0;//nova raiz tudo certo
        return p;
    }
    caso2Bal(NoAVL p){
        NoAVL z,y;
        z=p.dir;
        //caso 2.1 RE
        if(z.bal == 1){
            p.dir = z.esq;
            z.esq=p;
            p.bal =0;
            p=z;
        }else{//caso 2.2 RDD
            y=z.esq;
            z.esq=y.dir;
            p.dir=y.esq;
            y.esq=p;
            y.dir=z;

            if(y.bal ==1)
                p.bal= -1;
            else p.bal=0;

            if(y.bal == -1)
                z.bal = 1;
            else z.bal = 0;
            p=y;
        }
        p.bal=0;
        return p;
    }
    
    public void removeComBalanco(int valor){
        removeComBalanco(raiz, valor);
    }
    public NoAVL removeComBalanco(NoAVL raiz, int valor){
        //remove normalmente
        



        //depois checa:
        //Remocao na subarvore esquerda: soma-se uma unidade de balanco(p). Se o valor aumentar para 2, o nó estará desregulado
        //Remo¸c˜ao na sub´arvore direita: subtrai-se uma unidade a balanco(p). O n´o p ficar´a desregulado, nesse caso, se balan¸co(v) diminuir para -2.
    
    }
    //public insereComAltura(){}
}