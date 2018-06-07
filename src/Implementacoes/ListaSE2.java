
package Implementacoes;

/*
 * @author Gean RC
 */

public class ListaSE2{
    private No cabeca;
    private int tamanho;
    public ListaSE2(){
        cabeca = null;
        tamanho = 0;
    }
    
    //verifica se a lista esta vazia
    public boolean vazia(){
        if(tamanho == 0)
            return true;
        else
            return false;
    }
    
    //obtem o tamanho da lista
    public int tamanho(){
        return tamanho;
//        No p = cabeca;
//        int cont = 0;
//        while(p != null){
//        p = p.getProx();
//        cont++;
//        }
//        return cont;
	}
    
    //obtem o i-esimo elemento de uma listal. retorna o valor
    public int elemento (int pos){
        No aux = cabeca;
        int cont = 1;
        if(vazia()){
            return -1; 
            // Consulta falhou 
        }
        if((pos < 1) || (pos > tamanho())){
            return -1; 
            // Posicao invalida 
        }
        // Percorre a lista do 1o elemento ate pos
        while(cont < pos){
        // modifica "aux" para apontar para o proximo elemento da lista 
        aux = aux.getProx();
        cont++;
        }
        return aux.getConteudo();
    }
    
    //retorna a posicao de um elemento pesquisado. 0 caso contrario
    public int posicao(int dado){
        int cont = 1;
        No aux;
        //Lista vazia
        if(vazia()){
            return -1;
        }
        //percorre a lista do inicio ao fim ate encontrar o elemento
        aux = cabeca;
        while(aux != null){
            //se encontrar o elemento, retorna a posicao
            if (aux.getConteudo() == dado){
                return cont;
            }            
            //modifica aux para apontar para o proximo elemento da lista
            aux = aux.getProx();
            cont++;
        }
        return -1;
    }

    //insere no em lista vazia
    private boolean insereInicioLista(int valor){
    // Aloca memoria para novo no 
    No novoNo = new No();
    // Insere novo elemento na cabeca da lista
    novoNo.setConteudo(valor);
    novoNo.setProx(cabeca);
    cabeca = novoNo;
    tamanho++;
    return true;
    }

    //insere no no meio da lista
    private boolean insereMeioLista(int pos, int dado){
        int cont = 1;
        // Aloca memoria para novo no
        No novoNo = new No();
        novoNo.setConteudo(dado);
        // Localiza a pos. onde sera inserido o novo no
        No aux = cabeca;
        while((cont < pos-1) && (aux != null)){
            aux = aux.getProx();
            cont++;
        }
        if(aux == null){  
        // pos. invalida
        return false;
        }
        // Insere novo elemento apos aux
        novoNo.setProx(aux.getProx());
        aux.setProx(novoNo);
        tamanho++;
        return true;
    }

    //insere no no fim da lista
    private boolean insereFimLista(int dado){
    // Aloca memoria para novo no
    No novoNo = new No();
    novoNo.setConteudo(dado);
    // Procura o final da lista
    No aux = this.cabeca;
    while(aux.getProx() != null){
        aux = aux.getProx();
    }
    novoNo.setProx(null);
    aux.setProx(novoNo);
    this.tamanho++;
    return true;
    }

    //insere um elemento em uma determinada posicao. retorna true ou false
    public boolean insere(int pos, int dado){
        if((vazia()) && (pos != 1)){
            return false; 
            //lista vazia ou invalida
        }
        //insercao no inicio da lista ou vazia
        if(pos == 1){
            return insereInicioLista(dado);
        }
        //insercao no fim da list
        else if(pos == tamanho+1){
            return insereFimLista(dado);
        }
        //insercao no meio da lista
        else{
            return insereMeioLista(pos, dado);
        }
    }
    
    //remove elemento do inicio da lista
    private int removeInicioLista(){
        No p = cabeca;
        // Dado recebe o dado removido
        int dado = p.getConteudo();
        // Retira o 1o elemento da lista (p)
        cabeca = p.getProx();
        tamanho--;
        // Sugere ao garbage collector que libere a memoria
        p = null;
        return dado;
    }
    
    //remove elemento no meio da lista
    private int removeNaLista(int pos){
        No atual = null, antecessor = null;
        int dado = -1;
        int cont = 1;
        //localiza o no que sera removido
        atual = cabeca;
        while((cont < pos) && (atual != null)){
            antecessor = atual;
            atual = atual.getProx();
            cont++;
        }
        if(atual == null){ 
            //pos. invalida
            return -1;
        }
        //retira o elemento da lista
        dado = atual.getConteudo();
        antecessor.setProx(atual.getProx());
        tamanho--;
        //sugere ao garbage collector que libere a memoria
        atual = null;
        return dado;
    }

    //remove um elemento de uma determinada posicao. -1 se invalida
    public int remove(int pos){
        // Lista vazia 
        if(vazia()){
            return -1;
        }
        //remocao do elemento da cabeca da lista
        if(pos == 1){
            return removeInicioLista();
        }
        //remocao em outro lugar da lista
        else{
            return removeNaLista(pos);
        }
    }
}