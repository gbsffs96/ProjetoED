
package Implementacoes;

/*
 * @author Gean RC
 */

public class ListaSeq {
    private int dados[]; 
    // Vetor que contem os dados da lista 
    private int nElementos;
    private int tamMax;
    
    public ListaSeq(){
        tamMax = 100;
        nElementos = 0;
        dados = new int[tamMax];
    }
    
    public ListaSeq(int n){
        tamMax = n;
        nElementos = 0;
        dados = new int[tamMax];
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
    
    //obtem o i-esimo elemento de uma lista
    public int elemento(int pos){
        //se posicao setiver fora do limete <=0 ou >0
        if ((pos > nElementos) || (pos <= 0))
            return -1;
        return dados[pos-1];
    }
    
    //retorna a posicao de um elemento pesquisado. -1 se nao encontrar
    public int posicao(int valor){
        //procura elemento um a um e retorna a sua posicao
        for (int i = 0; i < nElementos; i++){
            if (dados[i] == valor){
                return (i + 1);
            }
        }
        return -1;
    }
    
    //retorna a posicao de um elemento pesquisado. -1 se nao encontrar
    public int posicao(int valor, int desloc){
        //procura elemento um a um se encontrar retorna posicao
        for(int i = desloc+1; i < nElementos; i++){
            if (dados[i] == valor){
                return (i + 1);
            }
        }
        return -1;
    }
    
    //insere um elemento em uma determinada posicao. retorna true ou false
    public boolean insere(int pos, int dado){
        //verifica se a lista esta cheia ou se posicao e valida
        if(cheia() || (pos > nElementos+1) || (pos <=0)){
            return false;
        }
        //desloca os elementos uma posicao a direita
        for(int i = nElementos; i >= pos; i--){
            dados[i] = dados[i-1];
        }
        //insere o dado na posicao correta
        dados[pos - 1] = dado;
        //incrementa o numero de elementos na lista
        nElementos++;
        return true;
    }
    
    //remove um elemento de uma determinada posicao. retorna o valo ou -1
    public int remove(int pos){
        int dado;
        //verifica se posicao e valida
        if((pos > nElementos) || (pos < 1 ))
            return -1;
        //armazena o dado a ser removido na variavel dado
        dado = dados[pos-1];
        //desloca os elementos uma posicao a esquerda
        for (int i = pos - 1; i < nElementos - 1; i++){
            dados[i] = dados[i+1];
        }
        //decrementa o numero de elementos na lista
        nElementos--;
        return dado;
    }
}
