
package Implementacoes;

/*
 * @author Gean RC
 */

public class ListaSeqGen<T>{
    private T dados[]; 
    // Vetor que contem os dados da lista 
    private int nElementos;
    private int tamMax;
    
    public ListaSeqGen(){
        tamMax = 100;
        nElementos = 0;
        dados = (T[]) new Object[tamMax];
    }
    
    public ListaSeqGen(int n){
        tamMax = n;
        nElementos = 0;
        dados = (T[]) new Object[tamMax];
    }

    //verifica se a lista esta vazia
    public boolean vazia(){
        if(nElementos == 0 )
            return true;
        else
            return false;
    }
    
    //verifica se a lista esta cheia
    public boolean cheia(){
        if(nElementos == tamMax)
            return true;
        else
            return false;
    }
    
    //obtem o tamanho da lista
    public int tamanho(){
        return nElementos;
    }
    
    //obtem o i-esimo elemento de uma lista. -1 se posicao invalida
    public T elemento(int pos){
        //se posicao estiver fora dos limites <= 0 ou > tamanho da lista
        if((pos > nElementos) || (pos <= 0))
            return null;
        return dados[pos-1];
    }
    
    //retorna a posicao de um elemento pesquisado. -1 caso nao seja encontrado
    public int posicao(T valor){
        //procura elemento um a um se o dado esta na lista. retorna posicao
        for(int i = 0; i < nElementos; i++){
            if(dados[i].equals(valor)){
                return (i + 1);
            }
        }
        return -1;
    }
    
    //retorna a posicao de um elemento pesquisado. -1 caso noa seja encontrado
    public int posicao(T valor, int desloc){
        //Procura elemento um a um se o dado esta na lista. retorna posicao
        for(int i = desloc+1; i < nElementos; i++){
            if(dados[i].equals(valor)){
                return (i + 1);
            }
        }
        return -1;
    }
    
    //insere um elemento em um determinada posicao. false se lista cheia ou invalida
    public boolean insere(int pos, T dado){
        //verifica se a lista esta cheia ou se a posicao e valida
        if(cheia() || (pos > nElementos+1) || (pos <=0)){
            return false;
        }        
        // desloca os elementos um posicao a direita
        for(int i = nElementos; i >= pos; i--){
            dados[i] = dados[i-1];
        }
        //insere o dado na posicao correta
        dados[pos - 1] = dado;
        //incrementa o numero de elementos na lista
        nElementos++;
        return true;
    }
    
    //Remove um elemento de uma determinada posicao. -1 se falhar
    public T remove(int pos){
        T dado;
        //verifica se a posicao e valida
        if((pos > nElementos) || (pos < 1 ))
            return null;
        //armazena o dado a ser removido na variavel dado
        dado = dados[pos-1];
        //desloca todos os elementos apos pos uma a esquerda
        for(int i = pos - 1; i < nElementos - 1; i++){
            dados[i] = dados[i+1];
        }
        //decrementa o numero de elementos na lista
        nElementos--;
        return dado;
    }
}
