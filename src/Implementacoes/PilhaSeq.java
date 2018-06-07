
package Implementacoes;

/*
 * @author Gean RC
 */

public class PilhaSeq{
    private int dados[];
    // vetor que contem os dados da lista
    private int topo; 
    private int tamMax;
    
    public PilhaSeq(){
        tamMax = 100;
        dados = new int[tamMax];
        topo = -1;
    }
    
    public PilhaSeq(int n){
        tamMax = n;
        dados = new int[tamMax];
        topo = -1;
    }
    
    //verifica se a pilha esta vazia
    public boolean vazia(){
        if(topo == -1)
            return true;
        else 
            return false;
    }
    
    //verifica se a pilha esta cheia
    public boolean cheia(){
        if (topo == (tamMax-1))
            return true;
        else
            return false;
    }
    
    //Obtem o tamanho da pilha
    public int tamanho(){
        return topo+1;
    }
    
    //consulta o elemento do topo da pilha. -1 se vazia se nao o valor do topo
    public int top(){
        if(vazia())
            return -1;
            // pilha vazia
            return dados[topo];
    }
    
    //insere um elemento no topo da pilha. retorna false se cheia se nao true
    public boolean push(int valor){
        if (cheia())
            return false;
            // erro pilha cheia
            topo++;
            dados[topo] = valor;
            return true;
    } 
    
    //retira o elemento do topo da pilha
    public int pop(){
        if (vazia()) 
            return -1;
            // Pilha vazia
            int valor = dados[topo];
            topo--; 
            return valor;
    }
}
